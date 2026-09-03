package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioServicelmpl implements UsuarioService{
    
    // Repositorio usado para guardar, buscar y actualizar usuarios.
    @Autowired
    private UsuarioRepository repo;
    
    // Trae todos los usuarios que existen en la base de datos.
    @Override
    public List<Usuario> buscarTodos() {
        return repo.findAll();
    }

    // Busca por id y devuelve null si no encuentra nada.
    @Override
    public Usuario buscarPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    // Spring Data decide si inserta o actualiza según el id del usuario.
    @Override
    public void guardar(Usuario usuario) {
        repo.save(usuario);
    }

    // Se cambia el estado para no perder el historial del usuario.
    @Override
    public void desactivar(Long id) {
        Usuario usuario = buscarPorId(id);
        if (usuario != null) {
            usuario.setActivo(false);
            repo.save(usuario);
        }
    }

    // Sirve para recuperar un usuario que antes fue desactivado.
    @Override
    public void activar(Long id) {
        Usuario usuario = buscarPorId(id);
        if (usuario != null) {
            usuario.setActivo(true);
            repo.save(usuario);
        }
    }
}
