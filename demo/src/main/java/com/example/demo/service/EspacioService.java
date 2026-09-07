package com.example.demo.service;

import com.example.demo.entities.Espacio;
import java.util.List;

public interface EspacioService {
    List<Espacio> obtenerTodos();
    Espacio guardar(Espacio espacio);
    Espacio obtenerPorId(Long id);
    void eliminar(Long id);
}