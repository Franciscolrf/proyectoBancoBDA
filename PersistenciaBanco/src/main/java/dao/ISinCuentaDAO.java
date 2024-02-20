/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import com.mycompany.dominiobanco.SinCuenta;

import dto.SinCuentaNuevaDTO;
import excepciones.PersistenciaException;

/**
 * Esta interfaz posee los métodos para acceder y manipular los datos de la tabla SinCuenta en la base de datos.
 * @author ID145
 */
public interface ISinCuentaDAO {
    
    /**
     * Este método se encarga de agregar una nueva transacción a la base de datos.
     * 
     * @param sinCuentaNueva DTO con los datos de la transacción a agregar
     * @return Transacción agregada
     * @throws PersistenciaException
     */
    SinCuenta agregar(SinCuentaNuevaDTO sinCuentaNueva) throws PersistenciaException;

    /**
     * Este método se encarga de consultar una transacción por su ID.
     * @param id_transaccion 
     * @return Transacción consultada
     * @throws PersistenciaException
     */
    SinCuenta consultar(int id_transaccion) throws PersistenciaException;

    /**
     * Este método se encarga de consultar una transacción por su ID.
     * @param folio
     * @param contrasena
     * @return Transacción consultada sin cuenta.
     * @throws PersistenciaException
     */
    SinCuenta consultarSinCuenta(int folio, String contrasena) throws PersistenciaException;
}
