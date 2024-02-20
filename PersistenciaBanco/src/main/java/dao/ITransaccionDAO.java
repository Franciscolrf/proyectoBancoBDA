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
    Transaccion agregar(TransaccionNuevaDTO transaccionNueva) throws PersistenciaException;
    Transaccion consultarTransaccion(int id) throws PersistenciaException;
    List<Transaccion> consultar(int id) throws PersistenciaException;
    List<Transaccion> consultarPeriodo(int id, String desde, String hasta) throws PersistenciaException;
}
