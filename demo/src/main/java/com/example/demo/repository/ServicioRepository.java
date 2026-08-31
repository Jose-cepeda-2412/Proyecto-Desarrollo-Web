package com.example.demo.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Servicio;

@Repository
public class ServicioRepository {

    private Map<Integer, Servicio> servicio = new HashMap<>();

    public ServicioRepository() {

        servicio.put(1, new Servicio(
                1,
                "Corte de cabello",
                "Servicio de corte de cabello",
                30000.0
        ));

        servicio.put(2, new Servicio(
                2,
                "Manicure",
                "Servicio de manicure",
                25000.0
        ));

        servicio.put(3, new Servicio(
                3,
                "Peinado",
                "Servicio de peinado",
                40000.0
        ));
    }

    public Servicio findById(Integer id) {
        return servicio.get(id);
    }

    public Collection<Servicio> findAll() {
        return servicio.values();
    }
}