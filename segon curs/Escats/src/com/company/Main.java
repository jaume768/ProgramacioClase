package com.company;

public class Main {

    public static void main(String[] args) {

        Tablero tablero = new Tablero();

        tablero.ImprimirTablero();
        Juego juego = new Juego();

        System.out.println();

        Jugador jugador1 = new Jugador("b");
        Jugador jugador2 = new Jugador("n");

        jugador2.moverFicha(tablero,1,4,7,4);
        jugador1.moverFicha(tablero,6,3,4,3);
        jugador1.moverFicha(tablero,6,4,4,4);

    }
}
