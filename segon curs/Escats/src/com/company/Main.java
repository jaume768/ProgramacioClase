package com.company;

public class Main {

    public static void main(String[] args) {

        Tablero tablero = new Tablero();

        tablero.ImprimirTablero();

        System.out.println();

        Jugador jugador1 = new Jugador("b");

        jugador1.moverFicha(tablero,6,0,5,0);

    }
}
