package com.example.demo.service;

import java.util.Collection;

import com.example.demo.entities.Servicio;

public interface ServicioService {

    // Busca un servicio por su id.
    public Servicio findById(Integer id);

    // Lista los servicios que se pueden ofrecer.
    public Collection<Servicio> findAll();
}
