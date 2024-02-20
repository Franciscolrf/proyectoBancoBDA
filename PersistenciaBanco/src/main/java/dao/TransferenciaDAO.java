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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.dominiobanco.Transferencia;

import conexion.IConexion;
import dto.TransferenciaNuevaDTO;
import excepciones.PersistenciaException;

/**
 * Clase que implementa la interfaz ITransferenciaDAO
 * Esta clase se encarga de realizar las operaciones de transferencia en la base
 * de datos.
 * 
 * @author ID145
 */
public class TransferenciaDAO implements ITransferenciaDAO {
    final IConexion conexionDB;
    static final Logger logger = Logger.getLogger(TransferenciaDAO.class.getName());

    /**
     * Construye un nuevo objeto TransferenciaDAO con la conexión especificada.
     *
     * @param conexion La conexión a la base de datos que se utilizará para
     *                 interactuar con las cuentas.
     */
    public TransferenciaDAO(IConexion conexion) {
        this.conexionDB = conexion;
    }

    /**
     * Agrega una nueva transferencia utilizando los datos proporcionados en un
     * objeto TransferenciaNuevaDTO.
     *
     * @param transferenciaNueva El objeto TransferenciaNuevaDTO que contiene
     *                           los datos de la nueva transferencia a agregar.
     * @return La transferencia agregada.
     * @throws PersistenciaException Si ocurre un error durante la persistencia
     *                               de los datos de la transferencia.
     */
    @Override
    public Transferencia agregar(TransferenciaNuevaDTO transferenciaNueva) throws PersistenciaException {
        String setenciaSQL = """
                    INSERT INTO Transferencia(id_transaccion, id_cuenta_destino)
                    VALUES(?, ?);
                """;
        try (Connection conexion = this.conexionDB.obtenerConexion();
                PreparedStatement comando = conexion.prepareStatement(setenciaSQL, Statement.RETURN_GENERATED_KEYS);) {
            comando.setInt(1, transferenciaNueva.getId_transaccion());
            comando.setInt(2, transferenciaNueva.getCuenta_destino());
            int numeroRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agrearon {0}", numeroRegistrosInsertados);
            ResultSet idsGenerados = comando.getGeneratedKeys();
            idsGenerados.next();
            Transferencia transferencia = new Transferencia(
                    transferenciaNueva.getId_transaccion(),
                    transferenciaNueva.getCuenta_destino());
            return transferencia;
        } catch (SQLException ex) {
            logger.log(Level.INFO, "No se ha podido agregar la transferencia", ex);
            throw new PersistenciaException("No se pudo agregar la transferencia");
        }
    }

    /**
     * Consulta una transferencia por el número de cuenta.
     *
     * @param cuenta El número de cuenta asociado a la transferencia a
     *               consultar.
     * @return La transferencia encontrada.
     * @throws PersistenciaException Si ocurre un error durante la consulta de
     *                               la transferencia.
     */
    @Override
    public Transferencia consultarTransferencia(int cuenta) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
