/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;

import com.mycompany.dominiobanco.Cuenta;

import dto.CuentaNuevaDTO;
import excepciones.PersistenciaException;

/**
 * Esta interfaz posee los métodos para acceder y manipular los datos de la
 * tabla Cuenta en la base de datos.
 *
 * @author ID145
 */
public interface ICuentaDAO {
    /**
     * Este método se encarga de agregar una nueva cuenta a la base de datos.
     * 
     * @param cuentaNueva DTO con los datos de la cuenta a agregar
     * @return Cuenta agregada
     * @throws PersistenciaException
     */
    Cuenta agregar(CuentaNuevaDTO cuentaNueva) throws PersistenciaException;

    /**
     * Este método se encarga de consultar las cuentas de un cliente.
     * 
     * @param Id_cuenta ID del cliente
     * @return Lista de cuentas del cliente
     * @throws PersistenciaException
     */
    List<Cuenta> consultar(int Id_cuenta) throws PersistenciaException;

    /**
     * Este método se encarga de consultar una cuenta por su ID.
     * 
     * @param Id_cuenta ID de la cuenta
     * @return Cuenta consultada
     * @throws PersistenciaException
     */
    Cuenta consultarCuenta(int Id_cuenta) throws PersistenciaException;

    /**
     * Este método se encarga de cancelar una cuenta.
     * 
     * @param ID ID de la cuenta a cancelar
     * @throws PersistenciaException
     */
    void CancelarCuenta(int ID) throws PersistenciaException;

    /**
     * Este método se encarga de actualizar los datos de una cuenta.
     * 
     * @param ID          ID de la cuenta a actualizar
     * @param cuentaNueva DTO con los datos de la cuenta a actualizar
     * @return Cuenta actualizada
     * @throws PersistenciaException
     */
    Cuenta actualizar(String ID, CuentaNuevaDTO cuentaNueva) throws PersistenciaException;

    /**
     * Este método se encarga de consultar una cuenta por su ID.
     * 
     * @param id ID de la cuenta a consultar
     * @return Cuenta consultada
     * @throws PersistenciaException
     */
    Cuenta consultarCuentaId(int id) throws PersistenciaException;

    /**
     * Este método se encarga de actualizar el monto de una transacción.
     * 
     * @param emisor         Cuenta emisora
     * @param numeroReceptor Número de cuenta del receptor
     * @param cantidad       Cantidad a transferir
     * @throws PersistenciaException
     */
    void actualizarMontoTransaccion(Cuenta emisor, int numeroReceptor, float cantidad) throws PersistenciaException;

    /**
     * Este método se encarga de retirar dinero de una cuenta.
     * 
     * @param cuenta   Cuenta de la que se retirará el dinero
     * @param cantidad Cantidad a retirar
     * @throws PersistenciaException
     */
    void retirarSinCuenta(Cuenta cuenta, float cantidad) throws PersistenciaException;
}
