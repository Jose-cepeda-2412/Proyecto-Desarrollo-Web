package com.example.demo.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Servicio;
import com.example.demo.repository.ServicioRepository;

@Service
public class ServicioServiceImpl implements ServicioService {

    private final ServicioRepository servicioRepository;

    public ServicioServiceImpl(ServicioRepository servicioRepository) {
        this.servicioRepository = servicioRepository;
    }

    @Override
    public Servicio findById(Integer id) {
        return servicioRepository.findById(id).orElse(null);
    }

    @Override
    public Collection<Servicio> findAll() {
        return servicioRepository.findAll();
    }
}