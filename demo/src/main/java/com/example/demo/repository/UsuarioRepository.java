package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Usuario;


public interface UsuarioRepository  
        extends JpaRepository<Usuario, Long>{ //usuario es la entidad y long es la llave primaria 
    
} 