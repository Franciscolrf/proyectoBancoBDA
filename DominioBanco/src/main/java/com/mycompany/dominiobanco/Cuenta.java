package com.mycompany.dominiobanco;

/**
 * Clase que representa una cuenta bancaria.
 */
public class Cuenta {
    private int id_cuenta;
    private String fecha_apertura;
    private int numero;
    private float saldo;
    private int id_cliente;
    private boolean esta_activo;

     /**
     * Constructor de la clase Cuenta que inicializa todos los campos.
     *
     * @param id_cuenta El ID de la cuenta.
     * @param fecha_apertura La fecha de apertura de la cuenta.
     * @param numero El número de la cuenta.
     * @param saldo El saldo de la cuenta.
     * @param id_cliente El ID del cliente asociado a la cuenta.
     * @param esta_activo Indica si la cuenta está activa o no.
     */
    public Cuenta(int id_cuenta, String fecha_apertura, int numero, float saldo, int id_cliente, boolean esta_activo) {
        this.id_cuenta = id_cuenta;
        this.fecha_apertura = fecha_apertura;
        this.numero = numero;
        this.saldo = saldo;
        this.id_cliente = id_cliente;
        this.esta_activo = esta_activo;
    }
}
