package com.example.demo.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Espacio;
import com.example.demo.entities.Reserva;
import com.example.demo.entities.Usuario;

@Repository
public class ReservaRepository {

    private UsuarioRepository usuarioRepository;
    private EspacioRepository espacioRepository;

    private Map<Integer, Reserva> reserva = new HashMap<>();

    public ReservaRepository(
            UsuarioRepository usuarioRepository,
            EspacioRepository espacioRepository) {

        this.usuarioRepository = usuarioRepository;
        this.espacioRepository = espacioRepository;

        Usuario usuario1 = usuarioRepository.findById(1);
        Usuario usuario2 = usuarioRepository.findById(2);
        Usuario usuario3 = usuarioRepository.findById(3);

        Espacio espacio1 = espacioRepository.findById(1);
        Espacio espacio2 = espacioRepository.findById(2);
        Espacio espacio3 = espacioRepository.findById(3);

        reserva.put(
                1,
                new Reserva(
                        1,
                        usuario1,
                        espacio1,
                        "2026/08/24",
                        "10:45"
                )
        );

        reserva.put(
                2,
                new Reserva(
                        2,
                        usuario2,
                        espacio2,
                        "2026/08/25",
                        "12:30"
                )
        );

        reserva.put(
                3,
                new Reserva(
                        3,
                        usuario3,
                        espacio3,
                        "2026/08/26",
                        "15:00"
                )
        );
    }

    public Reserva findById(Integer id) {
        return reserva.get(id);
    }

    public Collection<Reserva> findAll() {
        return reserva.values();
    }
}