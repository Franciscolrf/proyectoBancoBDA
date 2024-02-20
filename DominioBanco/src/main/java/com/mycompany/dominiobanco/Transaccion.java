package com.mycompany.dominiobanco;

/**
 * Clase que representa una transacción.
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
     * @param id El ID de la transacción.
     * @param monto El monto de la transacción.
     * @param tipo El tipo de transacción.
     * @param fecha La fecha de la transacción.
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
     * Constructor de la clase Transaccion que inicializa todos los campos excepto el ID de la transacción.
     * 
     * @param monto El monto de la transacción.
     * @param tipo El tipo de transacción.
     * @param fecha La fecha de la transacción.
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
     * Constructor de la clase Transaccion que inicializa todos los campos excepto el ID de la transacción y el ID de la cuenta.
     * 
     * @param monto El monto de la transacción.
     * @param tipo El tipo de transacción.
     * @param fecha La fecha de la transacción.
     * 
     */
    public Transaccion(float monto, String tipo, String fecha) {
        this.monto = monto;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    

}
