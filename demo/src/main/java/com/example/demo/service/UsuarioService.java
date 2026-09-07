package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Usuario;

public interface UsuarioService {

    // Lista todos los usuarios para mostrarlos en la vista.
    public List<Usuario> buscarTodos();
    
    // Busca un usuario específico antes de editarlo o cambiar su estado.
    public Usuario buscarPorId(Long id);
    
    // Guarda tanto usuarios nuevos como cambios de usuarios existentes.
    public void guardar (Usuario usuario);

    // Mantiene el registro, pero lo deja inactivo.
    public void desactivar (Long id);

    // Vuelve a habilitar un usuario inactivo.
    public void activar(Long id);

}
