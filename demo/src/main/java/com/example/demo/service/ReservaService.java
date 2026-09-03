package com.example.demo.service;

import java.util.Collection;

import com.example.demo.entities.Reserva;

public interface ReservaService {

    // Busca una reserva puntual por id.
    public Reserva findById(Integer id);

    // Devuelve todas las reservas guardadas.
    public Collection<Reserva> findAll();
}
