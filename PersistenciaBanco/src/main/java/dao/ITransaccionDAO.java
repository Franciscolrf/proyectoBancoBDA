/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;

import com.mycompany.dominiobanco.Transaccion;

import dto.TransaccionNuevaDTO;
import excepciones.PersistenciaException;

/**
 * Esta interfaz posee los métodos para acceder y manipular los datos de la tabla Transaccion en la base de datos.
 * @author ID145
 */
public interface ITransaccionDAO {
    /**
     * Este método se encarga de agregar una nueva transacción a la base de datos.
     * @param transaccionNueva
     * @return
     * @throws PersistenciaException en caso de que no se pueda agregar la transacción.
     */
    Transaccion agregar(TransaccionNuevaDTO transaccionNueva) throws PersistenciaException;

    /**
     * Este método se encarga de consultar una transacción por su ID.
     * @param id 
     * @return Transacción consultada
     * @throws PersistenciaException en caso de que no se encuentre la transacción. 
     */
    Transaccion consultarTransaccion(int id) throws PersistenciaException;

    /**
     *  Este método se encarga de consultar todas las transacciones de una cuenta.
     * @param id 
     * @return Transacciones consultadas
     * @throws PersistenciaException en caso de que no se encuentren transacciones para la cuenta.
     */
    List<Transaccion> consultar(int id) throws PersistenciaException;

    /**
     * Este método se encarga de consultar todas las transacciones de una cuenta en un periodo de tiempo.
     * @param id
     * @param desde
     * @param hasta
     * @return Transacciones consultadas
     * @throws PersistenciaException en caso de que no se encuentren transacciones para la cuenta.
     */
    List<Transaccion> consultarPeriodo(int id, String desde, String hasta) throws PersistenciaException;
}
