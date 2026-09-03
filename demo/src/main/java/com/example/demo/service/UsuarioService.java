package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Usuario;

public interface UsuarioService {

    // Lista todos los usuarios para mostrarlos en la vista.
    List<Usuario> buscarTodos();
    
    // Busca un usuario específico antes de editarlo o cambiar su estado.
    Usuario buscarPorId(Long id);
    
    // Guarda tanto usuarios nuevos como cambios de usuarios existentes.
    void guardar (Usuario usuario);

    // Mantiene el registro, pero lo deja inactivo.
    void desactivar (Long id);

    // Vuelve a habilitar un usuario inactivo.
    void activar(Long id);

}
