/**
 * Conexion.java
 */
package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * Clase que representa una conexión a la base de datos.
 * Implementa la interfaz IConexion.
 * @see IConexion
 * @author ID145
 */
public class Conexion  implements IConexion{

    String cadenaConexion;
    String usuario;
    String contrasena;
    static final Logger logger = Logger.getLogger(Conexion.class.getName());
    
    /**
     * Constructor por defecto.
     */
    public Conexion() {
    }

    /**
     * Constructor que inicializa los campos de la clase.
     * @param cadenaConexion
     * @param usuario
     * @param contrasena
     */
    public Conexion (String cadenaConexion, String usuario, String contrasena) {
        this.cadenaConexion = cadenaConexion;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public Connection obtenerConexion() throws SQLException {
        Connection conexion = DriverManager.getConnection(cadenaConexion, usuario, contrasena);
        logger.log(Level.INFO, "Conexión establecida",cadenaConexion);
        return conexion;
    }
    
    
}
