package com.example.demo.service;

import com.example.demo.entities.Reserva;
import com.example.demo.repository.ReservaRepository;

import java.util.Collection;

import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl implements ReservaService {

    // El servicio usa el repositorio para separar la lógica del acceso a datos.
    private final ReservaRepository reservaRepository;

    public ReservaServiceImpl(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    // Busca una reserva y devuelve null cuando no hay coincidencia.
    @Override
    public Reserva findById(Integer id) {
        return reservaRepository.findById(id).orElse(null);
    }

    // Obtiene todas las reservas para mostrarlas en la pantalla principal.
    @Override
    public Collection<Reserva> findAll() {
        return reservaRepository.findAll();
    }
}
