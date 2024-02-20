/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mycompany.dominiobanco.Domicilio;

import conexion.IConexion;
import dto.DomicilioNuevoDTO;
import excepciones.PersistenciaException;

/**
 *
 * @author ID145
 */
public class DomicilioDAO implements IDomicilioDAO {
    final IConexion conexionDB;
    static final Logger logger = Logger.getLogger(DomicilioDAO.class.getName());

    /**
     * Constructor que recibe la conexion a la base de datos
     * 
     * @param conexionDB conexion a la base de datos
     */
    public DomicilioDAO(IConexion conexionDB) {
        this.conexionDB = conexionDB;
    }

    /**
     * Agrega un domicilio a la base de datos
     * 
     * @param domicilioNuevo domicilio a agregar
     * @return el domicilio agregado
     * @throws PersistenciaException si no se pudo agregar el domicilio
     */
    @Override
    public Domicilio agregar(DomicilioNuevoDTO domicilioNuevo) throws PersistenciaException {
        String sentenciaSQL = """
                    INSERT INTO domicilios(calle,numero_exterior,numero_interior,codigo_postal,colonia,id_cliente)
                    VALUES(?, ?,?,?,?,?);
                """;
        try (Connection conexion = this.conexionDB.obtenerConexion();
                PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);) {
            comando.setString(1, domicilioNuevo.getCalle());
            comando.setInt(2, domicilioNuevo.getNumero_exterior());
            comando.setInt(3, domicilioNuevo.getNumero_interior());
            comando.setInt(4, domicilioNuevo.getCodigo_postal());
            comando.setString(5, domicilioNuevo.getColonia());
            comando.setInt(6, domicilioNuevo.getId_cliente());
            int numeroRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agrearon {0}", numeroRegistrosInsertados);
            ResultSet idsGenerados = comando.getGeneratedKeys();
            idsGenerados.next();
            Domicilio domicilio = new Domicilio(
                    idsGenerados.getInt(1),
                    domicilioNuevo.getCalle(),
                    domicilioNuevo.getNumero_interior(),
                    domicilioNuevo.getNumero_exterior(),
                    domicilioNuevo.getCodigo_postal(),
                    domicilioNuevo.getColonia(),
                    domicilioNuevo.getId_cliente());
            return domicilio;
        } catch (SQLException ex) {
            logger.log(Level.INFO, "No se ha podido agregar la cuenta", ex);
            throw new PersistenciaException("No se pudo agregar la cuenta");
        }
    }

    /**
     * Consulta un domicilio en la base de datos
     * 
     * @param id id del domicilio a consultar
     * @return el domicilio consultado
     * @throws PersistenciaException si no se pudo consultar el domicilio
     */
    @Override
    public Domicilio consultar(int id) throws PersistenciaException {
        String sentenciaSQL = """
                    SELECT * FROM domicilios
                    WHERE id_cliente = ?;
                """;
        try (Connection conexion = this.conexionDB.obtenerConexion();
                PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);) {
            comando.setInt(1, id);
            ResultSet resultado = comando.executeQuery();

            Domicilio domicilio = null;
            if (resultado.next()) {
                domicilio = new Domicilio(
                        resultado.getInt("id"),
                        resultado.getString("calle"),
                        resultado.getInt("numero_exterior"),
                        resultado.getInt("numero_interior"),
                        resultado.getInt("codigo_postal"),
                        resultado.getString("colonia"),
                        resultado.getInt("id_cliente"));
            }

            return domicilio;
        } catch (SQLException ex) {
            logger.log(Level.INFO, "No se ha podido encontrar el domicilio", ex);
            throw new PersistenciaException("No se ha podido encontrar el domicilio");
        }
    }

    /**
     * Elimina un domicilio de la base de datos
     * 
     * @param id id del domicilio a eliminar
     * @throws PersistenciaException si no se pudo eliminar el domicilio
     */
    @Override
    public Domicilio actualizar(DomicilioNuevoDTO domicilioNuevo, Domicilio domicilio) throws PersistenciaException {
        String sentenciaSQL = """
                    UPDATE Domicilios
                    SET calle = ?,
                    numero_exterior = ?,
                    numero_interior = ?,
                    codigo_postal = ?,
                    colonia = ?
                    WHERE id_cliente = ?;
                """;

        try (Connection conexion = this.conexionDB.obtenerConexion();
                PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);) {
            comando.setString(1, domicilioNuevo.getCalle());
            comando.setInt(2, domicilioNuevo.getNumero_exterior());
            comando.setInt(3, domicilioNuevo.getNumero_interior());
            comando.setInt(4, domicilioNuevo.getCodigo_postal());
            comando.setString(5, domicilioNuevo.getColonia());
            comando.setInt(6, domicilioNuevo.getId_cliente());

            int numeroRegistrosActualizados = comando.executeUpdate();
            logger.log(Level.INFO, "Se actualizaron {0} registros", numeroRegistrosActualizados);

            Domicilio domicilioAct = new Domicilio(
                    domicilio.getId_domicilio(),
                    domicilioNuevo.getCalle(),
                    domicilioNuevo.getNumero_exterior(),
                    domicilioNuevo.getNumero_interior(),
                    domicilioNuevo.getCodigo_postal(),
                    domicilioNuevo.getColonia(),
                    domicilio.getId_cliente());

            return domicilioAct;

        } catch (SQLException ex) {
            logger.log(Level.INFO, "No se pudo actualizar", ex);
            throw new PersistenciaException("No se pudo actualizar");
        }
    }

}
