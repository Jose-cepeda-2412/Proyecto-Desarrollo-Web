package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.ReservaService;

@Controller
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    ReservaService service;

    // Carga todas las reservas para mostrarlas en la tabla de la vista.
    @GetMapping()
    public String mostrarReservas(Model model) {

        model.addAttribute("reservas", service.findAll());

        return "mostrar_reservas";
    }
}
