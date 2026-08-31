package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pago {

    private Integer id;

    private Reserva reserva;

    private Double monto;

    private String metodoPago;

    private String estado;
}