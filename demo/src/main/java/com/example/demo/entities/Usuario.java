package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Usuario {
    // Datos básicos del cliente que hará reservas en la aplicación.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 120)
    private String nombre;

    // El correo queda como único para evitar registros duplicados.
    @Column (nullable = false, unique = true, length = 120)
    private String correo;
    @Column(length = 120)
    private String empresa;
    @Column(length = 30)
    private String telefono;
    @Column (nullable = false)
    private Boolean activo = true;

    // Constructor cómodo para crear usuarios activos desde el inicio.
    public Usuario(String nombre, String correo, String empresa, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.telefono = telefono;
        this.activo = true;
    }
}
