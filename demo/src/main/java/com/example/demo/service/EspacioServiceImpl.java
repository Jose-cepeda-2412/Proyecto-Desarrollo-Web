package com.example.demo.service;

import com.example.demo.entities.Espacio;
import com.example.demo.repository.EspacioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspacioServiceImpl implements EspacioService {

    @Autowired
    private EspacioRepository espacioRepository;

    @Override
    public List<Espacio> obtenerTodos() {
        return espacioRepository.findAll();
    }

    @Override
    public Espacio guardar(Espacio espacio) {
        return espacioRepository.save(espacio);
    }

    @Override
    public Espacio obtenerPorId(Long id) {
        return espacioRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        espacioRepository.deleteById(id);
    }
}