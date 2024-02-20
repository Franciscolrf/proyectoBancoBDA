/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Interfaz que define los métodos que debe implementar una conexión.
 * @author ID145
 */
public interface IConexion {
    /**
     * Método que obtiene una conexión.
     * @return La conexión.
     * @throws SQLException Si ocurre un error al obtener la conexión.
     */
    Connection obtenerConexion() throws SQLException;
}
