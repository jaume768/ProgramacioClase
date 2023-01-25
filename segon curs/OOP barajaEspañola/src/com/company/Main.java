package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Carta> Baraja = new ArrayList();
        ArrayList<Carta> jugador1 = new ArrayList();
        ArrayList<Carta> jugador2 = new ArrayList();

        IniciPartida.GenerarPrincipi(Baraja,jugador1,jugador2);

        String TipoPrincipal = Baraja.get(Baraja.size()-1).getTipo();

        IniciPartida.Imprimir(Baraja);
    }
}
