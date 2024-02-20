package com.mycompany.dominiobanco;

/**
 * Clase que representa una cuenta bancaria.
 *
 * @author ID145
 */
public class SinCuenta {
    private int id_transaccion;
    private String estado;
    private int folio;
    private String contrasena;

    /**
     * Constructor de la clase SinCuenta por defecto.
     */
    public SinCuenta() {
    }

    /**
     * Constructor de la clase SinCuenta que inicializa todos los campos.
     *
     * @param id_transaccion El ID de la transacción.
     * @param estado
     * @param folio
     * @param contrasena
     */
    public SinCuenta(int id_transaccion, String estado, int folio, String contrasena) {
        this.id_transaccion = id_transaccion;
        this.estado = estado;
        this.folio = folio;
        this.contrasena = contrasena;
    }

    /**
     * Constructor de la clase SinCuenta que inicializa todos los campos excepto el
     * ID de la transacción.
     *
     * @param estado
     * @param folio
     * @param contrasena
     */
    public SinCuenta(String estado, int folio, String contrasena) {
        this.estado = estado;
        this.folio = folio;
        this.contrasena = contrasena;
    }

    /**
     * Método que devuelve el ID de la transacción.	
     * @return El ID de la transacción.
     */
    public int getId_transaccion() {
        return id_transaccion;
    }

    /**
     * Método que establece el ID de la transacción
     * @param id El ID de la transacción.
     */
    public void setId_transaccion(int id) {
        this.id_transaccion = id;
    }

    /**
     * Método que devuelve el estado de la transacción.
     * @return El estado de la transacción.
     */
    public String getEstado() {
        return estado;
    }
    
    /**
     * Método que establece el estado de la transacción.
     * @param estado El estado de la transacción.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Método que devuelve el folio de la transacción.
     * @return El folio de la transacción.
     */
    public int getFolio() {
        return folio;
    }

    /**
     * Método que establece el folio de la transacción.
     * @param folio El folio de la transacción.
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * Método que devuelve la contraseña de la transacción.
     * @return La contraseña de la transacción.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Método que establece la contraseña de la transacción.
     * @param contrasena La contraseña de la transacción.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
