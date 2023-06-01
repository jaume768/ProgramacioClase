package com.company;

public class Main {

    public static void main(String[] args) {

        Tablero tablero = new Tablero();

        tablero.ImprimirTablero();

        System.out.println();

        Jugador jugador1 = new Jugador("b");
        Jugador jugador2 = new Jugador("n");
        Juego juego = new Juego();

        jugador2.moverFicha(tablero,1,4,7,4);
        jugador1.moverFicha(tablero,6,3,4,3);
        jugador1.moverFicha(tablero,6,4,4,4);

        /*

        Un peon mata a otro

        jugador1.moverFicha(tablero,6,1,4,1);
        jugador2.moverFicha(tablero,1,2,3,2);

        jugador1.moverFicha(tablero,4,1,3,2);

         */
    }
}
