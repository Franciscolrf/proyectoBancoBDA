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
    public Domicilio() {

    }

    /**
     * Constructor de la clase Domicilio que inicializa todos los campos.
     * 
     * @param id_domicilio
     * @param calle
     * @param numero_exterior
     * @param numero_interior
     * @param codigo_postal
     * @param colonia
     * @param id_cliente
     */
    public Domicilio(int id_domicilio, String calle, int numero_exterior, int numero_interior, int codigo_postal,
            String colonia, int id_cliente) {
        this.id_domicilio = id_domicilio;
        this.calle = calle;
        this.numero_exterior = numero_exterior;
        this.numero_interior = numero_interior;
        this.codigo_postal = codigo_postal;
        this.colonia = colonia;
        this.id_cliente = id_cliente;
    }

    /**
     * Constructor de la clase Domicilio que inicializa todos los campos excepto el
     * ID del domicilio.
     * 
     * @param calle
     * @param numero_exterior
     * @param numero_interior
     * @param codigo_postal
     * @param colonia
     * @param id_cliente
     */
    public Domicilio(String calle, int numero_exterior, int numero_interior, int codigo_postal, String colonia,
            int id_cliente) {
        this.calle = calle;
        this.numero_exterior = numero_exterior;
        this.numero_interior = numero_interior;
        this.codigo_postal = codigo_postal;
        this.colonia = colonia;
        this.id_cliente = id_cliente;
    }

    /**
     * Método que regresa el ID del domicilio.
     * 
     * @return El ID del domicilio.
     */
    public int getId_domicilio() {
        return id_domicilio;
    }

    /**
     * Método que establece el ID del domicilio.
     * 
     * @param id_domicilio El ID del domicilio.
     */
    public void setId_domicilio(int id_domicilio) {
        this.id_domicilio = id_domicilio;
    }

    /**
     * Método que regresa la calle del domicilio.
     * 
     * @return La calle del domicilio.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Método que establece la calle del domicilio.
     * 
     * @param calle La calle del domicilio.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Método que regresa el número exterior del domicilio.
     * 
     * @return El número exterior del domicilio.
     */
    public int getNumero_exterior() {
        return numero_exterior;
    }

    /**
     * Método que establece el número exterior del domicilio.
     * 
     * @param numero_exterior El número exterior del domicilio.
     */
    public void setNumero_exterior(int numero_exterior) {
        this.numero_exterior = numero_exterior;
    }

    /**
     * Método que regresa el número interior del domicilio.
     * 
     * @return El número interior del domicilio.
     */
    public int getNumero_interior() {
        return numero_interior;
    }

    /**
     * Método que establece el número interior del domicilio.
     * 
     * @param numero_interior El número interior del domicilio.
     */
    public void setNumero_interior(int numero_interior) {
        this.numero_interior = numero_interior;
    }

    /**
     * Método que regresa el código postal del domicilio.
     * 
     * @return El código postal del domicilio.
     */
    public int getCodigo_postal() {
        return codigo_postal;
    }

    /**
     * Método que establece el código postal del domicilio.
     * 
     * @param codigo_postal El código postal del domicilio.
     */
    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    /**
     * Método que regresa la colonia del domicilio.
     * 
     * @return La colonia del domicilio.
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Método que establece la colonia del domicilio.
     * 
     * @param colonia La colonia del domicilio.
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * Método que regresa el ID del cliente asociado al domicilio.
     * 
     * @return El ID del cliente asociado al domicilio.
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * Método que establece el ID del cliente asociado al domicilio.
     * 
     * @param id_cliente El ID del cliente asociado al domicilio.
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * Devuelve un valor hash para el objeto.
     * 
     * @return Un valor hash para el objeto.
     */
    @Override
    public int hashCode() {

        int hash = 3;
        hash = 53 * hash + this.id_domicilio;
        return hash;
    }

    /**
     * Método que compara este objeto con otro.
     * 
     * @param obj El objeto con el que se compara.
     * @return true si los objetos son iguales, false si no.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Domicilio other = (Domicilio) obj;
        
        return this.id_domicilio == other.id_domicilio;
    }
}
