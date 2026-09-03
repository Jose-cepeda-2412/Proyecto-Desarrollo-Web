package com.example.demo.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Espacio;
import com.example.demo.repository.EspacioRepository;

@Service
public class EspacioServiceImpl implements EspacioService {

    private final EspacioRepository espacioRepository;

    public EspacioServiceImpl(EspacioRepository espacioRepository) {
        this.espacioRepository = espacioRepository;
    }

    @Override
    public Espacio findById(Integer id) {
        return espacioRepository.findById(id).orElse(null);
    }

    @Override
    public Collection<Espacio> findAll() {
        return espacioRepository.findAll();
    }
}