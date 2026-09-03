package com.example.demo.service;

import com.example.demo.entities.Pago;
import java.util.Collection;

public interface PagoService {

    Pago findById(Integer id);

    Collection<Pago> findAll();
}