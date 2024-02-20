/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mycompany.dominiobanco.SinCuenta;

import dto.SinCuentaNuevaDTO;
import excepciones.PersistenciaException;
/**
 * Esta clase representa un DAO para movimientos sin cuenta.
 * @author ID145
 */
public class SinCuentaDAO implements ISinCuentaDAO{

    @Override
    public SinCuenta agregar(SinCuentaNuevaDTO sinCuentaNueva) throws PersistenciaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    @Override
    public SinCuenta consultar(int id_transaccion) throws PersistenciaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultar'");
    }

    @Override
    public SinCuenta consultarSinCuenta(int folio, String contrasena) throws PersistenciaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarSinCuenta'");
    }
    
}
