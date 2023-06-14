package com.company;

import Factory.JuegoFactory;
import Factory.JuegoFactoryImpl;
import Juegos.Juego;
import Jugadores.Jugador;

public class Main {

    public static void main(String[] args) {

        JuegoFactory juegoFactory = new JuegoFactoryImpl();
        Juego juego = juegoFactory.crearJuego("gato y raton");

        juego.iniciarJuego();

        juego.imprimirTablero();
        System.out.println();

        Jugador jugador1 = new Jugador("b");
        Jugador jugador2 = new Jugador("n");

        jugador1.moverFicha(juego,0,1,1,2);
        jugador1.moverFicha(juego,0,3,1,4);

        jugador2.moverFicha(juego,7,4,6,5);
        jugador2.moverFicha(juego,6,5,5,6);
        jugador2.moverFicha(juego,5,6,4,7);

        juego.jugar();

    }
}
