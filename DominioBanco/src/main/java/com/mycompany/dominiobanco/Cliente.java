/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominiobanco;

import java.util.Objects;

/**
 *
 * @author ID145
 *         Clase que representa a un cliente del banco.
 */
public class Cliente {
    private String nombres;
    private int id;
    private String contrasena;
    private String nacimiento;
    private int edad;
    private String apellido_materno;
    private String apellido_paterno;
    private String usuario;

    /**
     * Constructor vacío.
     */
    public Cliente() {
    }

    /**
     * Constructor que inicializa todos los atributos de la clase.
     * 
     * @param nombres
     * @param id
     * @param contrasena
     * @param nacimiento
     * @param edad
     * @param apellido_materno
     * @param apellido_paterno
     * @param usuario
     */
    public Cliente(String nombres, int id, String contrasena, String nacimiento, int edad, String apellido_materno,
            String apellido_paterno, String usuario) {
        this.nombres = nombres;
        this.id = id;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
        this.edad = edad;
        this.apellido_materno = apellido_materno;
        this.apellido_paterno = apellido_paterno;
        this.usuario = usuario;
    }

    /**
     * Constructor que inicializa todos los atributos de la clase excepto el id y la
     * edad.
     * 
     * @param nombres
     * @param contrasena
     * @param nacimiento
     * @param apellido_materno
     * @param apellido_paterno
     * @param usuario
     */
    public Cliente(String nombres, String contrasena, String nacimiento, String apellido_materno,
            String apellido_paterno, String usuario) {
        this.nombres = nombres;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
        this.apellido_materno = apellido_materno;
        this.apellido_paterno = apellido_paterno;
        this.usuario = usuario;
    }

    /**
     * Constructor que inicializa todos los atributos de la clase excepto el id.
     * 
     * @param contrasena
     * @param usuario
     * @param nombres
     * @param apellido_paterno
     * @param apellido_materno
     * @param nacimiento
     * @param edad
     */
    public Cliente(String contrasena, String usuario, String nombres, String apellido_paterno, String apellido_materno,
            String nacimiento, int edad) {
        this.nombres = nombres;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
        this.edad = edad;
        this.apellido_materno = apellido_materno;
        this.apellido_paterno = apellido_paterno;
        this.usuario = usuario;
    }

    /**
     * Método que establece la edad del cliente.
     * 
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que devuelve la edad del cliente.
     * 
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método que establece el nombre del cliente.
     * 
     * @param nombres
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Método que devuelve el nombre del cliente.
     * 
     * @return
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Método que establece el id del cliente.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método que devuelve el id del cliente.
     * 
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Método que establece la contraseña del cliente.
     * 
     * @param contrasena
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Método que devuelve la contraseña del cliente.
     * 
     * @return
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Método que establece la fecha de nacimiento del cliente.
     * 
     * @param nacimiento
     */
    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Método que devuelve la fecha de nacimiento del cliente.
     * 
     * @return
     */
    public String getNacimiento() {
        return nacimiento;
    }

    /**
     * Método que establece el apellido materno del cliente.
     * 
     * @param apellido_materno
     */
    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    /**
     * Método que devuelve el apellido materno del cliente.
     * 
     * @return
     */
    public String getApellido_materno() {
        return apellido_materno;
    }

    /**
     * Método que establece el apellido paterno del cliente.
     * 
     * @param apellido_paterno
     */
    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    /**
     * Método que devuelve el apellido paterno del cliente.
     * 
     * @return apellido_paterno
     */
    public String getApellido_paterno() {
        return apellido_paterno;
    }

    /**
     * Método que establece el usuario del cliente.
     * 
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Método que devuelve el usuario del cliente.
     * 
     * @return usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Devuelve un valor hash para el cliente.
     * 
     * @return devuelve un valor hash para el cliente.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Método que compara dos objetos de tipo Cliente.
     * @param obj
     * @return Devuelve true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        final Cliente other = (Cliente) obj;
       return Objects.equals(this.id, other.id);
    }
}
