package com.example.demo.controller;

import com.example.demo.entities.Espacio;
import com.example.demo.service.EspacioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/espacios")
public class EspacioController {

    @Autowired
    private EspacioService espacioService;

    @GetMapping
    public String listarEspacios(Model model) {
        model.addAttribute("espacios", espacioService.obtenerTodos());
        return "espacios";
    }
    @GetMapping("/nuevo")
    public String mostrarFormularioCrear(Model model) {
        model.addAttribute("espacio", new Espacio());
        return "espacio_form";
    }

    @PostMapping("/guardar")
    public String guardarEspacio(@ModelAttribute("espacio") Espacio espacio) {
        espacioService.guardar(espacio);
        return "redirect:/admin/espacios";
    }
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        model.addAttribute("espacio", espacioService.obtenerPorId(id));
        return "espacio_form";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminarEspacio(@PathVariable Long id) {
        espacioService.eliminar(id);
        return "redirect:/admin/espacios";
    }
}