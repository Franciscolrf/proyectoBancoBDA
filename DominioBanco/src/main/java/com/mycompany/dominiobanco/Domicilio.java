package com.mycompany.dominiobanco;

/**
 * Clase que representa un domicilio.
 */
public class Domicilio {
    private int id_domicilio;
    private String calle;
    private int numero_exterior;
    private int numero_interior;
    private int codigo_postal;
    private String colonia;
    private int id_cliente;

    /*
     * Constructor de la clase Domicilio por defecto.
     */
    public Domicilio(){
        
    }

    /**
     * Constructor de la clase Domicilio que inicializa todos los campos.
     * @param id_domicilio
     * @param calle
     * @param numero_exterior
     * @param numero_interior
     * @param codigo_postal
     * @param colonia
     * @param id_cliente
     */
    public Domicilio(int id_domicilio, String calle, int numero_exterior, int numero_interior, int codigo_postal, String colonia, int id_cliente) {
        this.id_domicilio = id_domicilio;
        this.calle = calle;
        this.numero_exterior = numero_exterior;
        this.numero_interior = numero_interior;
        this.codigo_postal = codigo_postal;
        this.colonia = colonia;
        this.id_cliente = id_cliente;
    }

    /**
     * Constructor de la clase Domicilio que inicializa todos los campos excepto el ID del domicilio.
     * @param calle
     * @param numero_exterior
     * @param numero_interior
     * @param codigo_postal
     * @param colonia
     * @param id_cliente
     */
    public Domicilio( String calle, int numero_exterior, int numero_interior, int codigo_postal, String colonia, int id_cliente) {
        this.calle = calle;
        this.numero_exterior = numero_exterior;
        this.numero_interior = numero_interior;
        this.codigo_postal = codigo_postal;
        this.colonia = colonia;
        this.id_cliente = id_cliente;
    }
}
