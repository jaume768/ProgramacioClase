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

        Jugador jugador1 = new Jugador("b");
        Jugador jugador2 = new Jugador("n");

        jugador1.moverFicha(juego,1,4,2,4);



    }
}
