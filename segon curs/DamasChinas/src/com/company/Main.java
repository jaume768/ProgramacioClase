package com.company;

public class Main {

    public static void main(String[] args) {

        Tablero tablero = new Tablero();

        tablero.ImprimirTablero();
        System.out.println();
        Jugador jugador1 = new Jugador("b");
        Jugador jugador2 = new Jugador("n");

        jugador1.moverFicha(tablero,5,5,4,4);
        jugador2.moverFicha(tablero,2,2,3,3);
        jugador1.moverFicha(tablero,4,4,2,2);
        jugador2.moverFicha(tablero,3,3,4,4);

    }
}
