package com.example.demo.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Espacio;
import com.example.demo.repository.EspacioRepository;

@Service
public class EspacioServiceImpl implements EspacioService {

    // El repositorio hace el trabajo directo con la base de datos.
    private final EspacioRepository espacioRepository;

    public EspacioServiceImpl(EspacioRepository espacioRepository) {
        this.espacioRepository = espacioRepository;
    }

    // Si no encuentra el espacio, devuelve null para que quien lo use pueda validarlo.
    @Override
    public Espacio findById(Integer id) {
        return espacioRepository.findById(id).orElse(null);
    }

    // Trae todos los espacios guardados.
    @Override
    public Collection<Espacio> findAll() {
        return espacioRepository.findAll();
    }
}
