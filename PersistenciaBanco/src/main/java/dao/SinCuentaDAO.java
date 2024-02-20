/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mycompany.dominiobanco.SinCuenta;

import conexion.IConexion;
import dto.SinCuentaNuevaDTO;
import excepciones.PersistenciaException;

/**
 * Esta clase representa un DAO para movimientos sin cuenta.
 * 
 * @author ID145
 */
public class SinCuentaDAO implements ISinCuentaDAO {

    final IConexion conexionDB;
    static final Logger logger = Logger.getLogger(SinCuentaDAO.class.getName());

    /**
     * Construye un nuevo objeto SinCuentaDAO con la conexión especificada.
     *
     * @param conexion La conexión a la base de datos que se utilizará para
     *                 interactuar con las cuentas.
     */
    public SinCuentaDAO(IConexion conexion) {
        this.conexionDB = conexion;
    }

    /**
     * Agrega un nuevo movimiento sin cuenta a la base de datos.
     * 
     * @param sinCuentaNueva El movimiento sin cuenta que se agregará a la base de
     *                       datos.
     * @return El movimiento sin cuenta que se agregó a la base de datos.
     * @throws PersistenciaException Si no se pudo agregar el movimiento sin cuenta
     *                               a la base de datos.
     */
    @Override
    public SinCuenta agregar(SinCuentaNuevaDTO sinCuentaNueva) throws PersistenciaException {
        String sentenciaSQL = """
                    INSERT INTO SinCuenta(id_transaccion, estado)
                    VALUES(?, ?);
                """;
        try (Connection conexion = this.conexionDB.obtenerConexion();
                PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);) {

            // Inicio stored procedure
            comando.setInt(1, sinCuentaNueva.getId_transaccion());
            comando.setString(2, sinCuentaNueva.getEstado());

            int numeroRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agrearon {0}", numeroRegistrosInsertados);
            SinCuenta sinCuenta = new SinCuenta(
                    sinCuentaNueva.getId_transaccion(),
                    sinCuentaNueva.getEstado(),
                    this.consultar(sinCuentaNueva.getId_transaccion()).getFolio(),
                    this.consultar(sinCuentaNueva.getId_transaccion()).getContrasena());

            return sinCuenta;
        } catch (SQLException ex) {
            logger.log(Level.INFO, "No se ha podido agregar la transferencia", ex);
            throw new PersistenciaException("No se pudo agregar la transferencia");
        }
    }

    /**
     * Consulta un movimiento sin cuenta en la base de datos.
     * 
     * @param id_transaccion El identificador del movimiento sin cuenta que se desea
     *                       consultar.
     * @return El movimiento sin cuenta que se consultó.
     * @throws PersistenciaException Si no se pudo consultar el movimiento sin
     *                               cuenta en la base de datos.
     */
    @Override
    public SinCuenta consultar(int id_transaccion) throws PersistenciaException {
        String sentenciaSQL = """
                SELECT folio,contrasena FROM SinCuenta WHERE id_transaccion=?;
                """;

        try (
                Connection conexion = this.conexionDB.obtenerConexion();
                PreparedStatement comando = conexion.prepareStatement(
                        sentenciaSQL);) {
            comando.setInt(1, id_transaccion);
            ResultSet resultado = comando.executeQuery();

            SinCuenta sinCuenta = null;
            if (resultado.next()) {
                sinCuenta = new SinCuenta();
                sinCuenta.setContrasena(resultado.getString("contrasena"));
                sinCuenta.setFolio(resultado.getInt("folio"));
            }
            return sinCuenta;
        } catch (SQLException ex) {
            logger.log(Level.INFO, "No se pudo obtener la cuenta", ex);
            throw new PersistenciaException("No se ha encontrado la cuenta");

        }
    }

    /**
     * Consulta un movimiento sin cuenta en la base de datos.
     * 
     * @param folio      El identificador del movimiento sin cuenta que se desea
     *                   consultar.
     * @param contrasena La contraseña del movimiento sin cuenta que se desea
     *                   consultar.
     * @return El movimiento sin cuenta que se consultó.
     * @throws PersistenciaException Si no se pudo consultar el movimiento sin
     *                               cuenta en la base de datos.
     */
    @Override
    public SinCuenta consultarSinCuenta(int folio, String contrasena) throws PersistenciaException {
        String sentenciaSQL = """
                SELECT * FROM SinCuenta WHERE folio=? and contrasena =?;
                """;

        try (
                Connection conexion = this.conexionDB.obtenerConexion();
                PreparedStatement comando = conexion.prepareStatement(
                        sentenciaSQL);) {

            // Inicio stored procedure
            CallableStatement callableStatement = conexion.prepareCall("{call ActualizarEstadoTransaccion(?,?)}");
            callableStatement.setInt(1, folio);
            callableStatement.setString(2, contrasena);
            callableStatement.execute();
            callableStatement.close();

            // Fin storedProcedure
            comando.setInt(1, folio);
            comando.setString(2, contrasena);
            ResultSet resultado = comando.executeQuery();

            SinCuenta sinCuenta = null;
            if (resultado.next()) {
                sinCuenta = new SinCuenta();
                sinCuenta.setId_transaccion(resultado.getInt("id_transaccion"));
                sinCuenta.setContrasena(resultado.getString("contrasena"));
                sinCuenta.setFolio(resultado.getInt("folio"));
                sinCuenta.setEstado(resultado.getString("estado"));
            }
            return sinCuenta;
        } catch (SQLException ex) {
            logger.log(Level.INFO, "No se pudo obtener la cuenta", ex);
            throw new PersistenciaException("No se ha encontrado la cuenta");

        }
    }

}
