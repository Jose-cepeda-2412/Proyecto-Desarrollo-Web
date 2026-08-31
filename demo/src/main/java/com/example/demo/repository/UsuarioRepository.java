package com.example.demo.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Usuario;

@Repository
public class UsuarioRepository {

    private Map<Integer, Usuario> usuario = new HashMap<>();

    public UsuarioRepository() {

        usuario.put(1, new Usuario(
                1,
                "Andres",
                "Andres@javeriana.edu.co"
        ));

        usuario.put(2, new Usuario(
                2,
                "Sebastian",
                "Sebastian@javeriana.edu.co"
        ));

        usuario.put(3, new Usuario(
                3,
                "Julian",
                "Julian@javeriana.edu.co"
        ));
    }

    public Usuario findById(Integer id) {
        return usuario.get(id);
    }

    public Collection<Usuario> findAll() {
        return usuario.values();
    }
}