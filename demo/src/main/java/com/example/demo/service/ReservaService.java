package com.example.demo.service;

import java.util.Collection;

import com.example.demo.entities.Reserva;

public interface ReservaService {

    public Reserva findById(Integer id);

    public Collection<Reserva> findAll();
}