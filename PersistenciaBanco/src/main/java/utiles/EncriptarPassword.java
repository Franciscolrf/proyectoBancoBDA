/**
 * EncriptarContrasena.java
 */
package utiles;

import org.mindrot.jbcrypt.BCrypt;

/**
 * Clase que proporciona métodos para encriptar y comprobar contraseñas
 * utilizando el algoritmo BCrypt.
 */
public class EncriptarPassword {

    /**
     * Constructor por defecto de la clase EncriptarContrasena.
     */
    public EncriptarPassword() {
    }

    /**
     * Encripta una contraseña utilizando el algoritmo BCrypt.
     *
     * @param contrasena La contraseña a encriptar.
     * @return La contraseña encriptada.
     */
    static public String encriptar(String contrasena) {
        return BCrypt.hashpw(contrasena, BCrypt.gensalt());
    }

    /**
     * Comprueba si una contraseña sin encriptar coincide con una contraseña
     * encriptada.
     *
     * @param contra1 La contraseña sin encriptar.
     * @param contra2 La contraseña encriptada.
     * @return true si las contraseñas coinciden, false en caso contrario.
     */
    static public boolean comprobarContrasena(String contra1, String contra2) {
        return BCrypt.checkpw(contra1, contra2);
    }

}
