/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import com.mycompany.dominiobanco.Domicilio;

import dto.DomicilioNuevoDTO;
import excepciones.PersistenciaException;

/**
 * Esta interfaz posee los métodos para acceder y manipular los datos de la tabla Domicilio en la base de datos.
 * @author ID145
 */
public interface IDomicilioDAO {
    /**
     * Este método se encarga de agregar un nuevo domicilio a la base de datos.
     * 
     * @param domicilioNuevo DTO con los datos del domicilio a agregar
     * @return Domicilio agregado
     * @throws PersistenciaException
     */
    Domicilio agregar(DomicilioNuevoDTO domicilioNuevo) throws PersistenciaException;

    /**
     * Este método se encarga de consultar un domicilio por su ID.
     * 
     * @param id ID del domicilio
     * @return Domicilio consultado
     * @throws PersistenciaException
     */
    Domicilio consultar(int id) throws PersistenciaException;

    /**
     * Este método se encarga de actualizar los datos de un domicilio.
     * 
     * @param domicilioNuevo DTO con los datos del domicilio a actualizar
     * @param domicilio      Domicilio a actualizar
     * @return Domicilio actualizado
     * @throws PersistenciaException
     */
    Domicilio actualizar(DomicilioNuevoDTO domicilioNuevo, Domicilio domicilio) throws PersistenciaException;
}
