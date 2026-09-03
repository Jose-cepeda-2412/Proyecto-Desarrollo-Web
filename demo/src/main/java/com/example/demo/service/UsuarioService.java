package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Usuario;

public interface UsuarioService {

    List<Usuario> buscarTodos();
    
    Usuario buscarPorId(Long id);
    
    void guardar (Usuario usuario);

    void desactivar (Long id);

    void activar(Long id);

}
