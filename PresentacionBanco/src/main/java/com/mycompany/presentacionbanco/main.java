/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.presentacionbanco;

import conexion.Conexion;
import conexion.IConexion;
import dao.ClienteDAO;
import dao.IClienteDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author r
 */
public class main {

    static final Logger logger = Logger.getLogger(main.class.getName());

    public static void main(String[] args) {
        String candenaConexion = "jdbc:mysql://localhost:3306/banco";
        String usuario = "root";
        // String password = "fransql";
        String password = "itson";
        IConexion conexion = new Conexion(candenaConexion, usuario, password);
        IClienteDAO clienteDAO = new ClienteDAO(conexion);

        PantallaInicial pi = new PantallaInicial(clienteDAO, conexion);
        pi.setVisible(true);
    }
}
