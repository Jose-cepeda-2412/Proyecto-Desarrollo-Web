package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Pago;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer> {
    // Permite consultar y guardar pagos sin escribir SQL manual.
}
