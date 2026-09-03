package com.example.demo.service;

import java.util.Collection;

import com.example.demo.entities.Servicio;

public interface ServicioService {

    Servicio findById(Integer id);

    Collection<Servicio> findAll();
}