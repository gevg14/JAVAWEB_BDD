package com.puertogames.puertogames_api.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    // Constructor vacío requerido por JPA
    public Usuario() {
        this.fechaRegistro = new Date(); // Fecha actual al crear usuario
    }

    // Constructor personalizado
    public Usuario(String nombre, String correo, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.fechaRegistro = new Date();
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}

