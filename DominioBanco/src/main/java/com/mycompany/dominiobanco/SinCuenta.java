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
    
}
