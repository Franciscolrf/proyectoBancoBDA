
package dto;

/**
 * DTO para la creación de una cuenta nueva
 * @author ID145
 */
public class CuentaNuevaDTO {
    private int saldo;
    private int id_cliente;
    private boolean esta_activo;

    /**
     * Constructor vacío.
     */
    public CuentaNuevaDTO() {
    }

    /**
     * Método que devuelve el saldo de la cuenta.
     * @return saldo de la cuenta.
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Método que establece el saldo de la cuenta.
     * @param saldo
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * Método que devuelve el id del cliente.
     * @return id del cliente.
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * Método que establece el id del cliente.
     * @param id_cliente
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * Método que devuelve si la cuenta está activa.
     * @return true si la cuenta está activa, false si no.
     */
    public boolean isEsta_activo() {
        return esta_activo;
    }

    /**
     * Método que establece si la cuenta está activa.
     * @param esta_activo
     */
    public void setEsta_activo(boolean esta_activo) {
        this.esta_activo = esta_activo;
    }
    
}
