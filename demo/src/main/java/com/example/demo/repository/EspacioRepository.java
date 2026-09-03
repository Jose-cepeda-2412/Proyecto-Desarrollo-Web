package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Espacio;

@Repository
public interface EspacioRepository extends JpaRepository<Espacio, Integer> {

}