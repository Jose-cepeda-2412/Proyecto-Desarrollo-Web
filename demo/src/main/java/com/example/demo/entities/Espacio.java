package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Espacio {
    private Integer id;
    private String nombre;
    private Integer capacidad;
    private Double precioBase;
}
