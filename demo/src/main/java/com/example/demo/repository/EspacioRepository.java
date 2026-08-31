package com.example.demo.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Espacio;

@Repository
public class EspacioRepository {

    private Map<Integer, Espacio> espacio = new HashMap<>();

    public EspacioRepository() {

        espacio.put(1, new Espacio(1, "Nombre espacio", 4, 70000.0));

        espacio.put(2, new Espacio(2, "Nombre espacio 2", 6, 270000.0));

        espacio.put(3, new Espacio(3, "Nombre espacio 3", 8, 170000.0));
    }

    public Espacio findById(Integer id) {
        return espacio.get(id);
    }

    public Collection<Espacio> findAll() {
        return espacio.values();
    }
}