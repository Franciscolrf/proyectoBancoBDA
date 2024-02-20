package com.mycompany.dominiobanco;

/**
 * Clase que representa una transacción.
 * 
 * @author ID145
 */
public class Transaccion {
    private int id;
    private float monto;
    private String tipo;
    private String fecha;
    private int id_cuenta;

    /**
     * Constructor por defecto de la clase Transaccion
     */
    public Transaccion() {
    }

    /**
     * Constructor de la clase Transaccion que inicializa todos los campos.
     * 
     * @param id        El ID de la transacción.
     * @param monto     El monto de la transacción.
     * @param tipo      El tipo de transacción.
     * @param fecha     La fecha de la transacción.
     * @param id_cuenta El ID de la cuenta asociada a la transacción.
     * 
     */
    public Transaccion(int id, float monto, String tipo, String fecha, int id_cuenta) {
        this.id = id;
        this.monto = monto;
        this.tipo = tipo;
        this.fecha = fecha;
        this.id_cuenta = id_cuenta;
    }

    /**
     * Constructor de la clase Transaccion que inicializa todos los campos excepto
     * el ID de la transacción.
     * 
     * @param monto     El monto de la transacción.
     * @param tipo      El tipo de transacción.
     * @param fecha     La fecha de la transacción.
     * @param id_cuenta El ID de la cuenta
     * 
     */
    public Transaccion(float monto, String tipo, String fecha, int id_cuenta) {
        this.monto = monto;
        this.tipo = tipo;
        this.fecha = fecha;
        this.id_cuenta = id_cuenta;
    }

    /**
     * Constructor de la clase Transaccion que inicializa todos los campos excepto
     * el ID de la transacción y el ID de la cuenta.
     * 
     * @param monto El monto de la transacción.
     * @param tipo  El tipo de transacción.
     * @param fecha La fecha de la transacción.
     * 
     */
    public Transaccion(float monto, String tipo, String fecha) {
        this.monto = monto;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    /**
     * Devuelve el ID de la transacción.
     *
     * @return El ID de la transacción.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID de la transacción.
     *
     * @param id El nuevo ID de la transacción.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve el monto de la transacción.
     *
     * @return El monto de la transacción.
     */
    public float getMonto() {
        return monto;
    }

    /**
     * Establece el monto de la transacción.
     *
     * @param monto El nuevo monto de la transacción.
     */
    public void setMonto(float monto) {
        this.monto = monto;
    }

    /**
     * Devuelve el tipo de la transacción.
     *
     * @return El tipo de la transacción.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de la transacción.
     *
     * @param tipo El nuevo tipo de la transacción.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve la fecha de la transacción.
     *
     * @return La fecha de la transacción.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la transacción.
     *
     * @param fecha La nueva fecha de la transacción.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Devuelve el ID de la cuenta asociada a la transacción.
     *
     * @return El ID de la cuenta asociada a la transacción.
     */
    public int getId_cuenta() {
        return id_cuenta;
    }

    /**
     * Establece el ID de la cuenta asociada a la transacción.
     *
     * @param id_cuenta El nuevo ID de la cuenta asociada a la transacción.
     */
    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    @Override
    /**
     * Devuelve un valor hash para el objeto.
     * 
     * @return Un valor hash para el objeto.
     */
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    /**
     * Método que compara dos objetos de tipo Transaccion.
     * @param obj El objeto a comparar.
     * @return true si los objetos son iguales, false en otro caso.
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this==obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transaccion other = (Transaccion) obj;
        return this.id == other.id;
    }
    

}
