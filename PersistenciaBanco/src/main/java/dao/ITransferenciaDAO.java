/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import com.mycompany.dominiobanco.Transferencia;

import dto.TransferenciaNuevaDTO;
import excepciones.PersistenciaException;

/**
 * Esta interfaz posee los métodos para acceder y manipular los datos de la
 * tabla Transferencia en la base de datos.
 * 
 * @author ID145
 */
public interface ITransferenciaDAO {
    /**
     * Este método se encarga de agregar una nueva transferencia a la base de datos.
     * 
     * @param transferenciaNueva DTO con los datos de la transferencia a agregar
     * @return Transferencia agregada
     * @throws PersistenciaException
     */
    Transferencia agregar(TransferenciaNuevaDTO transferenciaNueva) throws PersistenciaException;

    /**
     * Este método se encarga de consultar una transferencia por su ID.
     * 
     * @param id_transferencia
     * @return Transferencia consultada
     * @throws PersistenciaException
     */
    Transferencia consultarTransferencia(int cuenta) throws PersistenciaException;
}
