package com.example.demo.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Pago;
import com.example.demo.entities.Reserva;

@Repository
public class PagoRepository {

    private ReservaRepository reservaRepository;

    private Map<Integer, Pago> pago = new HashMap<>();

    public PagoRepository(ReservaRepository reservaRepository) {

        this.reservaRepository = reservaRepository;

        Reserva reserva1 = reservaRepository.findById(1);
        Reserva reserva2 = reservaRepository.findById(2);
        Reserva reserva3 = reservaRepository.findById(3);

        pago.put(1, new Pago(
                1,
                reserva1,
                70000.0,
                "Tarjeta",
                "Pagado"
        ));

        pago.put(2, new Pago(
                2,
                reserva2,
                270000.0,
                "Efectivo",
                "Pagado"
        ));

        pago.put(3, new Pago(
                3,
                reserva3,
                170000.0,
                "Tarjeta",
                "Pendiente"
        ));
    }

    public Pago findById(Integer id) {
        return pago.get(id);
    }

    public Collection<Pago> findAll() {
        return pago.values();
    }
}