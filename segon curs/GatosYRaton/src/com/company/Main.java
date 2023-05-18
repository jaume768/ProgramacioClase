package com.company;

public class Main {

    public static void main(String[] args) {

        Tablero tablero = new Tablero();

        System.out.println();
        tablero.ImprimirTablero();

        Jugador jugador1 = new Jugador("G");
        Jugador jugador2 = new Jugador("R");

        jugador1.moverFicha(tablero,0,1,1,2);
        jugador1.moverFicha(tablero,0,3,1,4);

        jugador2.moverFicha(tablero,7,4,6,5);

    }
}
