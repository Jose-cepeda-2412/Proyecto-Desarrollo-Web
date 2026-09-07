package com.example.demo.service;

import com.example.demo.entities.Reserva;
import com.example.demo.repository.ReservaRepository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public ReservaServiceImpl(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }
    @Override
    public Reserva findById(Long id) {
        return reservaRepository.findById(id).orElse(null);
    }
    @Override
    public Collection<Reserva> findAll() {
        return reservaRepository.findAll();
    }
    @Override
    public Reserva save(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
    @Override
    public void deleteById(Long id) {
        reservaRepository.deleteById(id);
    }
}