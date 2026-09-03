package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Usuario;


public interface UsuarioRepository  
        extends JpaRepository<Usuario, Long>{ // Usuario es la entidad y Long es el tipo de su id.

} 
