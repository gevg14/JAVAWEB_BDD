package com.puertogames.puertogames_api.model;
import lombok.*;
import jakarta.persistence.*;

@Entity
@Data
@AllArgsConstructor
public class Videojuego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String categoria;
    private String plataforma;
    private int ventas;


    // Constructores
    public Videojuego() {}

    public Videojuego(String nombre, String categoria, String plataforma, int ventas) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.plataforma = plataforma;
        this.ventas = ventas;
    }

    // Getters y Setters
    public Long getId() { return id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public int getVentas() { return ventas; }
    public void setVentas(int ventas) { this.ventas = ventas; }
}
