package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Reserva {

    private Integer id;

    private Usuario usuario;

    private Espacio espacio;

    private String fecha;

    private String hora;
}