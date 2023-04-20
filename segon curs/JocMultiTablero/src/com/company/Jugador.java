package com.company;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private List<Pieza> piezas;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.piezas = new ArrayList<>();
    }
}
