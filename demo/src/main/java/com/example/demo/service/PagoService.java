package com.example.demo.service;

import com.example.demo.entities.Pago;
import java.util.Collection;

public interface PagoService {

    // Busca un pago concreto por su identificador.
    Pago findById(Integer id);

    // Lista los pagos registrados en el sistema.
    Collection<Pago> findAll();
}
