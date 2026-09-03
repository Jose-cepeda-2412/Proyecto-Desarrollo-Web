package com.example.demo.service;

import com.example.demo.entities.Espacio;
import java.util.Collection;

public interface EspacioService {

    // Busca un espacio específico cuando se conoce su id.
    Espacio findById(Integer id);

    // Devuelve todos los espacios para listarlos o seleccionarlos.
    Collection<Espacio> findAll();
}
