package com.example.demo.service;

import java.util.Collection;
import com.example.demo.entities.Reserva;

public interface ReservaService {

    // Busca una reserva puntual por id (cambiado a Long para concordar con la entidad)
    public Reserva findById(Long id);

    // Devuelve todas las reservas guardadas
    public Collection<Reserva> findAll();

    // Guardar o actualizar una reserva
    public Reserva save(Reserva reserva);

    // Eliminar una reserva por id
    public void deleteById(Long id);
}