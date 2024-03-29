/**
 * ClienteNuevoDTO.java
 */
package dto;

import utiles.EncriptarPassword;

/**
 * DTO que representa un nuevo cliente.
 */
public class ClienteNuevoDTO {

    private String contrasena;
    private String nombres;
    private String apellido_paterno;
    private String apellido_materno;
    private String nacimiento;
    /**
     * Constructor por defecto de la clase ClienteNuevoDTO.
     */
    public ClienteNuevoDTO() {
    }

    /**
     * Obtiene la contraseña del cliente.
     *
     * @return La contraseña del cliente.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Establece la contraseña del cliente.
     *
     * @param contrasena La contraseña del cliente a establecer.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = EncriptarPassword.encriptar(contrasena);

    }

    /**
     * Obtiene el nombre(s) del cliente.
     *
     * @return El nombre(s) del cliente.
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Establece el nombre(s) del cliente.
     *
     * @param nombres El nombre(s) del cliente a establecer.
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Obtiene el apellido paterno del cliente.
     *
     * @return El apellido paterno del cliente.
     */
    public String getApellido_paterno() {
        return apellido_paterno;
    }

    /**
     * Establece el apellido paterno del cliente.
     *
     * @param apellido_paterno El apellido paterno del cliente a establecer.
     */
    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    /**
     * Obtiene el apellido materno del cliente.
     *
     * @return El apellido materno del cliente.
     */
    public String getApellido_materno() {
        return apellido_materno;
    }

    /**
     * Establece el apellido materno del cliente.
     *
     * @param apellido_materno El apellido materno del cliente a establecer.
     */
    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    /**
     * Obtiene la fecha de nacimiento del cliente.
     *
     * @return La fecha de nacimiento del cliente.
     */
    public String getNacimiento() {
        return nacimiento;
    }

    /**
     * Establece la fecha de nacimiento del cliente.
     *
     * @param nacimiento La fecha de nacimiento del cliente a establecer.
     */
    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

}
