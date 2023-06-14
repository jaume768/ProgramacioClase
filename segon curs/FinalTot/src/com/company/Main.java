package com.company;

import Factory.JuegoFactory;
import Factory.JuegoFactoryImpl;
import Juegos.Juego;
import Jugadores.Jugador;

public class Main {

    public static void main(String[] args) {

        JuegoFactory juegoFactory = new JuegoFactoryImpl();
        Juego juego = juegoFactory.crearJuego("ajedrez");

        juego.iniciarJuego();

        juego.imprimirTablero();
        System.out.println();

        Jugador jugador1 = new Jugador("b");
        Jugador jugador2 = new Jugador("n");

        jugador1.moverFicha(juego,1,1,3,1);
        jugador1.moverFicha(juego,3,1,4,1);
        jugador1.moverFicha(juego,4,1,5,1);
        jugador1.moverFicha(juego,5,1,6,2);

        jugador1.moverFicha(juego,1,2,3,2);

    }
}
