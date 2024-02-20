/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;

import com.mycompany.dominiobanco.Cuenta;

import dto.CuentaNuevaDTO;
import excepciones.PersistenciaException;

/**
 * Esta clase representa un DAO para cuentas.
 * @author ID145
 */
public class CuentaDAO implements ICuentaDAO{

    /**
     * Agrega una nueva cuenta a la base de datos.
     * @param cuentaNueva La cuenta que se agregará a la base de datos.
     * @return La cuenta que se agregó a la base de datos.
     * @throws PersistenciaException Si no se pudo agregar la cuenta a la base de datos.
     */
    @Override
    public Cuenta agregar(CuentaNuevaDTO cuentaNueva) throws PersistenciaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    /**
     * Consulta las cuentas de la base de datos.
     * @param Id_cuenta El identificador de la cuenta que se desea consultar.
     * @return La lista de cuentas que se consultó de la base de datos.
     * @throws PersistenciaException Si no se pudo consultar las cuentas de la base de datos.
     */
    @Override
    public List<Cuenta> consultar(int Id_cuenta) throws PersistenciaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultar'");
    }

    /**
     * Consulta una cuenta de la base de datos.
     * @param Id_cuenta El identificador de la cuenta que se desea consultar.
     * @return La cuenta que se consultó de la base de datos.
     * @throws PersistenciaException Si no se pudo consultar la cuenta de la base de datos.
     */
    @Override
    public Cuenta consultarCuenta(int Id_cuenta) throws PersistenciaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarCuenta'");
    }

    @Override
    public void CancelarCuenta(int ID) throws PersistenciaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CancelarCuenta'");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarCuentaId'");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarMontoTransaccion'");
    }

    /**
     * Actualiza el monto de una transacción en la base de datos.
     * @param emisor El emisor de la transacción.
     * @param cantidad La cantidad que se utilizará para actualizar el monto de la transacción en la base de datos.
     * @throws PersistenciaException Si no se pudo actualizar el monto de la transacción en la base de datos.
     */
    @Override
    public void retirarSinCuenta(Cuenta cuenta, float cantidad) throws PersistenciaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retirarSinCuenta'");
    }
    
}
