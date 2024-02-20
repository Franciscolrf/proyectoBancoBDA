/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominiobanco;

/**
 *
 * @author ID145
 */
public class Transferencia {
    
    private int id_transaccion;
    private int cuenta_destino;

    /**
     * Constructor de la clase Transferencia por defecto.
     */
    public Transferencia() {
    }

    /**
     * Constructor de la clase Transferencia que inicializa todos los campos.
     * 
     * @param id_transaccion El ID de la transacción.
     * @param cuenta_destino El número de cuenta destino.
     */
    public Transferencia(int id_transaccion, int cuenta_destino) {
        this.id_transaccion = id_transaccion;
        this.cuenta_destino = cuenta_destino;
    }

    /**
     * Método que devuelve el ID de la transacción.
     * 
     * @return El ID de la transacción.
     */
    public int getId_transaccion() {
        return id_transaccion;
    }

    /**
     * Método que devuelve el número de cuenta destino.
     * 
     * @return El número de cuenta destino.
     */
    public int getCuenta_destino() {
        return cuenta_destino;
    }

    /**
     * Método que establece el ID de la transacción
     * 
     * @param id El ID de la transacción.
     */
    public void setId_transaccion(int id) {
        this.id_transaccion = id;
    }

    /**
     * Método que establece el número de cuenta destino.
     * 
     * @param cuenta El número de cuenta destino.
     */
    public void setCuenta_destino(int cuenta) {
        this.cuenta_destino = cuenta;
    }

    /**
     * Devuelve un valor hash code para el objeto.
     * 
     * @return Un valor hash code para el objeto.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.id_transaccion;
        return hash;

    }

    /**
     * Método que compara dos objetos de tipo Transferencia.
     * 
     * @param obj El objeto a comparar.
     * @return true si los objetos son iguales, false en otro caso.
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
        final Transferencia other = (Transferencia) obj;
        return this.id_transaccion == other.id_transaccion;
    }

}
