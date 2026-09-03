package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entities.Usuario;
import com.example.demo.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService service;
    
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("usuarios", service.buscarTodos());
        return "usuarios";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuario-form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Usuario usuario) {
        service.guardar(usuario);
        return "redirect:/usuarios";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("usuario", service.buscarPorId(id));
        return "usuario-form";
    }
    
    @GetMapping("/desactivar/{id}")
    public String desactivar(@PathVariable Long id) {
        service.desactivar(id);
        return "redirect:/usuarios";
    }

    @GetMapping("/activar/{id}")
    public String activar(@PathVariable Long id) {
        service.activar(id);
        return "redirect:/usuarios";
    }
}
