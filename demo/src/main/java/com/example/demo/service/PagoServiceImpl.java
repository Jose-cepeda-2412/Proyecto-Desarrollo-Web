package com.example.demo.service;

import com.example.demo.entities.Pago;
import com.example.demo.repository.PagoRepository;

import java.util.Collection;

import org.springframework.stereotype.Service;

@Service
public class PagoServiceImpl implements PagoService {

    // Se usa para consultar pagos desde la capa de servicio.
    private final PagoRepository pagoRepository;

    public PagoServiceImpl(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    // Devuelve null si el pago no existe, evitando romper la aplicación.
    @Override
    public Pago findById(Integer id) {
        return pagoRepository.findById(id).orElse(null);
    }

    // Entrega todos los pagos disponibles para la vista o futuras consultas.
    @Override
    public Collection<Pago> findAll() {
        return pagoRepository.findAll();
    }
}
