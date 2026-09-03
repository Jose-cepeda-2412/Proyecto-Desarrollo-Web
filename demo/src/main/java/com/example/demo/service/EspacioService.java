package com.example.demo.service;

import com.example.demo.entities.Espacio;
import java.util.Collection;

public interface EspacioService {

    Espacio findById(Integer id);

    Collection<Espacio> findAll();
}