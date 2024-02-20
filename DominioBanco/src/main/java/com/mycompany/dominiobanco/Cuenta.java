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
     * @param id_cuenta      El ID de la cuenta.
     * @param fecha_apertura La fecha de apertura de la cuenta.
     * @param numero         El número de la cuenta.
     * @param saldo          El saldo de la cuenta.
     * @param id_cliente     El ID del cliente asociado a la cuenta.
     * @param esta_activo    Indica si la cuenta está activa o no.
     */
    public Cuenta(int id_cuenta, String fecha_apertura, int numero, float saldo, int id_cliente, boolean esta_activo) {
        this.id_cuenta = id_cuenta;
        this.fecha_apertura = fecha_apertura;
        this.numero = numero;
        this.saldo = saldo;
        this.id_cliente = id_cliente;
        this.esta_activo = esta_activo;
    }

    /**
     * Constructor de la clase Cuenta que inicializa todos los campos excepto la
     * fecha de apertura.
     * 
     *
     * @param id_cuenta   El ID de la cuenta.
     * @param numero      El número de la cuenta.
     * @param saldo       El saldo de la cuenta.
     * @param id_cliente  El ID del cliente asociado a la cuenta.
     * @param esta_activo Indica si la cuenta está activa o no.
     */
    public Cuenta(int id_cuenta, int numero, float saldo, int id_cliente, boolean esta_activo) {
        this.id_cuenta = id_cuenta;
        this.numero = numero;
        this.saldo = saldo;
        this.id_cliente = id_cliente;
        this.esta_activo = esta_activo;
    }

    /**
     * Constructor de la clase Cuenta que inicializa todos los campos excepto el ID
     * de la cuenta y la fecha de apertura.
     * 
     * @param numero
     * @param saldo
     * @param id_cliente
     * @param esta_activo
     */
    public Cuenta(int numero, float saldo, int id_cliente, boolean esta_activo) {
        this.numero = numero;
        this.saldo = saldo;
        this.id_cliente = id_cliente;
        this.esta_activo = esta_activo;
    }

    /**
     * Constructor por defecto.
     */
    public Cuenta() {
    }

    /**
     * Método que devuelve el ID de la cuenta.
     * 
     * @return El ID de la cuenta.
     */
    public int getId_cuenta() {
        return id_cuenta;
    }

    /**
     * Método que establece el ID de la cuenta.
     * 
     * @param id_cuenta El ID de la cuenta.
     */
    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    /**
     * Método que devuelve la fecha de apertura de la cuenta.
     * 
     * @return La fecha de apertura de la cuenta.
     */
    public String getFecha_apertura() {
        return fecha_apertura;
    }

    /**
     * Método que establece la fecha de apertura de la cuenta.
     * 
     * @param fecha_apertura La fecha de apertura de la cuenta.
     */
    public void setFecha_apertura(String fecha_apertura) {
        this.fecha_apertura = fecha_apertura;

    }

    /**
     * Método que devuelve el número de la cuenta.
     * 
     * @return El número de la cuenta.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método que establece el número de la cuenta.
     * 
     * @param numero El número de la cuenta.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Método que devuelve el saldo de la cuenta.
     * 
     * @return El saldo de la cuenta.
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * Método que establece el saldo de la cuenta.
     * 
     * @param saldo El saldo de la cuenta.
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * Método que devuelve el ID del cliente asociado a la cuenta.
     * 
     * @return El ID del cliente asociado a la cuenta.
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * Método que establece el ID del cliente asociado a la cuenta.
     * 
     * @param id_cliente El ID del cliente asociado a la cuenta.
     */

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * Método que devuelve si la cuenta está activa o no.
     * 
     * @return true si la cuenta está activa, false si no.
     */
    public boolean isEsta_activo() {
        return esta_activo;
    }

    /**
     * Método que establece si la cuenta está activa o no.
     * 
     * @param esta_activo true si la cuenta está activa, false si no.
     */
    public void setEsta_activo(boolean esta_activo) {
        this.esta_activo = esta_activo;
    }

    /**
     * Devuelve una representación en forma de cadena de este objeto.
     *
     * @return Una cadena que contiene la información de la cuenta.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("id_cuenta=").append(id_cuenta);
        sb.append(", fecha_apertura=").append(fecha_apertura);
        sb.append(", numero=").append(numero);
        sb.append(", saldo=").append(saldo);
        sb.append(", id_cliente=").append(id_cliente);
        sb.append(", esta_activo=").append(esta_activo);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Devuelve un valor hash para este objeto.
     *
     * @return El valor hash calculado.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id_cuenta;
        return hash;
    }

    /**
     * Compara este objeto con otro objeto para determinar la igualdad.
     *
     * @param obj El objeto a comparar con este objeto.
     * @return true si los objetos son iguales, false de lo contrario.
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
        final Cuenta other = (Cuenta) obj;
        return this.id_cuenta == other.id_cuenta;
    }

}
