package com.company;

public class Main {

    public static void main(String[] args) {

        Tablero tablero = new Tablero();

        tablero.ImprimirTablero();

        System.out.println();

        Jugador jugador1 = new Jugador("b");
        Jugador jugador2 = new Jugador("n");

        jugador1.moverFicha(tablero,6,3,4,3);
        jugador1.moverFicha(tablero,7,2,3,6);
        jugador1.moverFicha(tablero,7,3,5,3);
        jugador1.moverFicha(tablero,5,3,5,0);
        jugador1.moverFicha(tablero,5,0,3,2);
        jugador1.moverFicha(tablero,3,2,1,4);

        jugador1.moverFicha(tablero,4,3,3,3);
        jugador1.moverFicha(tablero,3,3,2,3);
        jugador1.moverFicha(tablero,2,3,1,2);
        jugador1.moverFicha(tablero,1,2,0,3);


        /*

        Un peon mata a otro

        jugador1.moverFicha(tablero,6,1,4,1);
        jugador2.moverFicha(tablero,1,2,3,2);

        jugador1.moverFicha(tablero,4,1,3,2);

         */
    }
}
