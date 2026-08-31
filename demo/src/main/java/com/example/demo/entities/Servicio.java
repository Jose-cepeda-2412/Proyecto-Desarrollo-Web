package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Servicio {

    private Integer id;

    private String nombre;

    private String descripcion;

    private Double precio;
}