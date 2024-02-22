/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mycompany.dominiobanco.Cuenta;

import conexion.IConexion;
import dto.CuentaNuevaDTO;
import excepciones.PersistenciaException;

/**
 * Esta clase representa un DAO para cuentas.
 * @author ID145
 */
public class CuentaDAO implements ICuentaDAO{

    final IConexion conexionDB;
    static final Logger logger = Logger.getLogger(ClienteDAO.class.getName());

    /**
     * Construye un nuevo objeto CuentaDAO con la conexión especificada.
     * @param conexion La conexión a la base de datos que se utilizará para interactuar con las cuentas.
     */
    public CuentaDAO(IConexion conexion) {
        this.conexionDB = conexion;
    }

    
    /**
     * Agrega una nueva cuenta a la base de datos.
     * @param cuentaNueva La cuenta que se agregará a la base de datos.
     * @return La cuenta que se agregó a la base de datos.
     * @throws PersistenciaException Si no se pudo agregar la cuenta a la base de datos.
     */
    @Override
    public Cuenta agregar(CuentaNuevaDTO cuentaNueva) throws PersistenciaException {
        String sentenciaSQL
                = """
                INSERT INTO cuentas(saldo, id_cliente)
                VALUES(?, ?);
            """;
        try (Connection conexion = this.conexionDB.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);) {
            comando.setInt(1, cuentaNueva.getSaldo());
            comando.setInt(2, cuentaNueva.getId_cliente());
            int numeroRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agrearon {0}", numeroRegistrosInsertados);
            ResultSet idsGenerados = comando.getGeneratedKeys();
            idsGenerados.next();
            Cuenta cuenta = new Cuenta(
                    idsGenerados.getInt(1),
                    cuentaNueva.getSaldo(),
                    cuentaNueva.getId_cliente(),
                    cuentaNueva.isEsta_activo()
            );
            return cuenta;
        } catch (SQLException ex) {
            logger.log(Level.INFO, "No se ha podido agregar la cuenta", ex);
            throw new PersistenciaException("No se pudo agregar la cuenta");
        }
    }

    /**
     * Consulta las cuentas de la base de datos.
     * @param Id_cuenta El identificador de la cuenta que se desea consultar.
     * @return La lista de cuentas que se consultó de la base de datos.
     * @throws PersistenciaException Si no se pudo consultar las cuentas de la base de datos.
     */
    @Override
    public List<Cuenta> consultar(int Id_cuenta) throws PersistenciaException {
        String sentenciaSQL
                = """
                SELECT * FROM cuentas
                WHERE id_cliente = ?;
            """;
        List<Cuenta> listaCuenta = new LinkedList<>();

        try (Connection conexion = this.conexionDB.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);) {
            comando.setInt(1, Id_cuenta);
            ResultSet resultados = comando.executeQuery();

            while (resultados.next()) {
                Cuenta cuenta = new Cuenta(
                        resultados.getInt("id"),
                        resultados.getString("fecha_apertura"),
                        resultados.getInt("numero"),
                        resultados.getFloat("saldo"),
                        resultados.getInt("id_cliente"),
                        resultados.getBoolean("activo")
                );
                listaCuenta.add(cuenta);
            }
            logger.log(Level.INFO, "Se consulataros {0} cuentas", listaCuenta.size());
            return listaCuenta;
        } catch (SQLException ex) {
            logger.log(Level.INFO, "No se ha podido encontrar las cuentas la cuenta", ex);
            throw new PersistenciaException("No se ha podido encontrar las cuentas la cuenta");
        }
    }

    /**
     * Consulta una cuenta de la base de datos.
     * @param Id_cuenta El identificador de la cuenta que se desea consultar.
     * @return La cuenta que se consultó de la base de datos.
     * @throws PersistenciaException Si no se pudo consultar la cuenta de la base de datos.
     */
    @Override
    public Cuenta consultarCuenta(int Id_cuenta) throws PersistenciaException {
        String sentenciaSQL
                = """
                SELECT id,fecha_apertura,numero,saldo,id_cliente,activo FROM cuentas
                WHERE numero = ?;
            """;
        try (Connection conexion = this.conexionDB.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);) {
            comando.setInt(1, Id_cuenta);
            ResultSet resultado = comando.executeQuery();

            Cuenta cuenta = null;
            if (resultado.next()) {
                cuenta = new Cuenta(
                        resultado.getInt("id"),
                        resultado.getString("fecha_apertura"),
                        resultado.getInt("numero"),
                        resultado.getFloat("saldo"),
                        resultado.getInt("id_cliente"),
                        resultado.getBoolean("activo")
                );
            }

            return cuenta;
        } catch (SQLException ex) {
            logger.log(Level.INFO, "No se ha podido encontrar la cuenta", ex);
            throw new PersistenciaException("No se ha podido encontrar la cuenta");
        }
    }

    /**
     * Cancela una cuenta de la base de datos.
     * @param ID El identificador de la cuenta que se desea cancelar.
     * @throws PersistenciaException Si no se pudo cancelar la cuenta en la base de datos.
     */
    @Override
    public void CancelarCuenta(int ID) throws PersistenciaException {
        String sentenciaSQL = """
            UPDATE cuentas 
            SET activo = false 
            WHERE id = ?;
        """;
    try (Connection conexion = this.conexionDB.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);) {
        comando.setInt(1, ID);
        comando.execute();
    } catch (SQLException ex) {
        logger.log(Level.INFO, "No se pudo cancelar la cuenta", ex);
        throw new PersistenciaException("No se pudo cancelar la cuenta");
    }
    }

    /**
     * Actualiza una cuenta de la base de datos.
     * @param ID El identificador de la cuenta que se desea actualizar.
     * @param cuentaNueva La cuenta que se utilizará para actualizar la cuenta en la base de datos.
     * @return La cuenta que se actualizó en la base de datos.
     * @throws PersistenciaException Si no se pudo actualizar la cuenta en la base de datos.
     */
    @Override
    public Cuenta actualizar(String ID, CuentaNuevaDTO cuentaNueva) throws PersistenciaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
    }

    /**
     * Consulta una cuenta de la base de datos.
     * @param id El identificador de la cuenta que se desea consultar.
     * @return La cuenta que se consultó de la base de datos.
     * @throws PersistenciaException Si no se pudo consultar la cuenta de la base de datos.
     */
    @Override
    public Cuenta consultarCuentaId(int id) throws PersistenciaException {
        String setenciaSQL
                = """
                SELECT id,fecha_apertura,numero,saldo,id_cliente,activo FROM cuentas
                WHERE numero = ?;
            """;
        try (Connection conexion = this.conexionDB.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(setenciaSQL, Statement.RETURN_GENERATED_KEYS);) {
            comando.setInt(1, id);
            ResultSet resultado = comando.executeQuery();

            Cuenta cuenta = null;
            if (resultado.next()) {
                cuenta = new Cuenta(
                        resultado.getInt("id"),
                        resultado.getString("fecha_apertura"),
                        resultado.getInt("numero"),
                        resultado.getFloat("saldo"),
                        resultado.getInt("id_cliente"),
                        resultado.getBoolean("activo")
                );
            }

            return cuenta;
        } catch (SQLException ex) {
            logger.log(Level.INFO, "No se ha podido encontrar la cuenta", ex);
            throw new PersistenciaException("No se ha podido encontrar la cuenta");
        }
    }

    /**
     * Actualiza el monto de una transacción en la base de datos.
     * @param emisor El emisor de la transacción.
     * @param numeroReceptor El número de la cuenta del receptor.
     * @param cantidad La cantidad que se utilizará para actualizar el monto de la transacción en la base de datos.
     * @throws PersistenciaException Si no se pudo actualizar el monto de la transacción en la base de datos.
     */
    @Override
    public void actualizarMontoTransaccion(Cuenta emisor, int numeroReceptor, float cantidad)
            throws PersistenciaException {
                try (Connection conexion = conexionDB.obtenerConexion()) {
                    conexion.setAutoCommit(false); // Deshabilitar el autocommit
                    if (emisor.getSaldo() > cantidad) {
                        conexion.rollback();
                    }
                    // Debitar el monto de la cuenta origen
                    String consultaDisminuir = "UPDATE cuentas SET saldo = saldo - ? WHERE id = ?";
                    try (PreparedStatement resultadoEmisor = conexion.prepareStatement(consultaDisminuir)) {
                        resultadoEmisor.setFloat(1, cantidad);
                        resultadoEmisor.setInt(2, emisor.getId_cuenta());
                        resultadoEmisor.executeUpdate();
                    }
        
                    // Acreditar el monto en la cuenta destino
                    String consultaAumentar = "UPDATE cuentas SET saldo = saldo + ? WHERE numero = ?";
                    try (PreparedStatement resultadoReceptor = conexion.prepareStatement(consultaAumentar)) {
                        resultadoReceptor.setFloat(1, cantidad);
                        resultadoReceptor.setInt(2, numeroReceptor);
                        resultadoReceptor.executeUpdate();
                    }
        
                    // Confirmar la transacción
                    conexion.commit();
        
                    System.out.println("Transferencia completada con éxito.");
                } catch (SQLException ex) {
                    System.err.println("Error en la transacción: " + ex.getMessage());
                }
    }

    /**
     * Actualiza el monto de una transacción en la base de datos.
     * @param emisor El emisor de la transacción.
     * @param cantidad La cantidad que se utilizará para actualizar el monto de la transacción en la base de datos.
     * @throws PersistenciaException Si no se pudo actualizar el monto de la transacción en la base de datos.
     */
    @Override
    public void retirarSinCuenta(Cuenta cuenta, float cantidad) throws PersistenciaException {
        try (Connection conexion = conexionDB.obtenerConexion()) {
            conexion.setAutoCommit(false); // Deshabilitar el autocommit
            if (cuenta.getSaldo() > cantidad) {
                conexion.rollback();
            }
            String sqlDebitar = "UPDATE cuentas SET saldo = saldo - ? WHERE id = ?";
            try (PreparedStatement resultadoEmisor = conexion.prepareStatement(sqlDebitar)) {
                resultadoEmisor.setFloat(1, cantidad);
                resultadoEmisor.setInt(2, cuenta.getId_cuenta());
                resultadoEmisor.executeUpdate();
            }
            // Confirmar la transacción
            conexion.commit();

        } catch (SQLException ex) {
            System.err.println("Error en la transacción: " + ex.getMessage());
        }
    }
    
}
