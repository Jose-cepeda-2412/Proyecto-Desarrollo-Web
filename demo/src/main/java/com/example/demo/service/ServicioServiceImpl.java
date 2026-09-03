package com.example.demo.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Servicio;
import com.example.demo.repository.ServicioRepository;

@Service
public class ServicioServiceImpl implements ServicioService {

    // Repositorio encargado de hablar con la base de datos de servicios.
    private final ServicioRepository servicioRepository;

    public ServicioServiceImpl(ServicioRepository servicioRepository) {
        this.servicioRepository = servicioRepository;
    }

    // Intenta encontrar el servicio; si no existe, retorna null.
    @Override
    public Servicio findById(Integer id) {
        return servicioRepository.findById(id).orElse(null);
    }

    // Devuelve todos los servicios guardados.
    @Override
    public Collection<Servicio> findAll() {
        return servicioRepository.findAll();
    }
}
