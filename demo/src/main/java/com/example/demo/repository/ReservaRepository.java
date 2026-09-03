package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
    // Centraliza el acceso a la tabla de reservas.
}
