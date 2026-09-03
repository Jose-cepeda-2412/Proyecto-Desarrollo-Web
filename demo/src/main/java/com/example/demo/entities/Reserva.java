package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Reserva {
    // Une a un usuario con el espacio que reservó y el horario elegido.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Se usa ManyToOne porque un usuario puede tener varias reservas.
    @ManyToOne(optional = false)
    private Usuario usuario;

    // Un mismo espacio puede aparecer en distintas reservas.
    @ManyToOne(optional = false)
    private Espacio espacio;

    @Column(nullable = false, length = 20)
    private String fecha;

    @Column(nullable = false, length = 10)
    private String hora;
}
