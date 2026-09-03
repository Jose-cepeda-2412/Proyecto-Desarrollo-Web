package com.example.demo.entities;

import jakarta.annotation.Generated;
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 120)
    private String nombre;
    @Column (nullable = false, unique = true, length = 120)
    private String correo;
    @Column(length = 30)
    private String telefono;
    @Column (nullable = false)
    private Boolean activo = true;

    public Usuario(String nombre, String correo, String telefono){
        nombre = this.nombre;
        correo = this.correo;
        telefono = this.telefono;
        this.activo = true;
    }
}
