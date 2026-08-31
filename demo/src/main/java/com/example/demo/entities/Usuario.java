package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Usuario {
    private Integer id;
    private String nombre;
    private String correo;
}
