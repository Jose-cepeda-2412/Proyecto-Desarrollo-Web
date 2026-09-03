package com.example.demo.service;

import com.example.demo.entities.Reserva;
import com.example.demo.repository.ReservaRepository;

import java.util.Collection;

import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl implements ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaServiceImpl(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    @Override
    public Reserva findById(Integer id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @Override
    public Collection<Reserva> findAll() {
        return reservaRepository.findAll();
    }
}