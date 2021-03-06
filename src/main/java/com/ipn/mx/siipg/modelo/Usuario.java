package com.ipn.mx.siipg.modelo;
// Generated 12/12/2016 01:27:14 AM by Hibernate Tools 4.3.1

/**
 * Usuario generated by hbm2java
 */
public class Usuario implements java.io.Serializable {

    private UsuarioId id;
    private Rol rol;
    private Unidadresponsable unidadresponsable;
    private String password;
    private int status;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String numeroEmpleado;
    private String email;
    private String telefonos;

    public Usuario() {
       
    }

    public Usuario(UsuarioId id, Rol rol, Unidadresponsable unidadresponsable, String password, int status, String nombre, String apellidoPaterno, String apellidoMaterno, String email, String telefonos) {
        this.id = id;
        this.rol = rol;
        this.unidadresponsable = unidadresponsable;
        this.password = password;
        this.status = status;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.email = email;
        this.telefonos = telefonos;
    }

    public Usuario(UsuarioId id, Rol rol, Unidadresponsable unidadresponsable, String password, int status, String nombre, String apellidoPaterno, String apellidoMaterno, String numeroEmpleado, String email, String telefonos) {
        this.id = id;
        this.rol = rol;
        this.unidadresponsable = unidadresponsable;
        this.password = password;
        this.status = status;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.numeroEmpleado = numeroEmpleado;
        this.email = email;
        this.telefonos = telefonos;
    }

    public UsuarioId getId() {
        return this.id;
    }

    public void setId(UsuarioId id) {
        this.id = id;
    }

    public Rol getRol() {
        return this.rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Unidadresponsable getUnidadresponsable() {
        return this.unidadresponsable;
    }

    public void setUnidadresponsable(Unidadresponsable unidadresponsable) {
        this.unidadresponsable = unidadresponsable;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNumeroEmpleado() {
        return this.numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonos() {
        return this.telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

}
