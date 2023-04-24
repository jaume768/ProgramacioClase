package com.company;

public class Main {

    public static void main(String[] args) {

        Tablero tablero = new Tablero();

        tablero.ImprimirTablero();
        System.out.println();

        Jugador jugador1 = new Jugador("n",0);
        Jugador jugador2 = new Jugador("b",0);
        Jugador turnoActual;
        turnoActual = jugador1;

        System.out.println("Turno del color " + turnoActual.getColor());
        jugador1.moverFicha(tablero,2,5,3,4,jugador1);
        System.out.println("punts jugador1: " + jugador1.getPunts());
        System.out.println();
        turnoActual = (turnoActual == jugador1) ? jugador2 : jugador1;

        System.out.println("Turno del color " + turnoActual.getColor());
        jugador2.moverFicha(tablero,5,2,4,3,jugador2);
        System.out.println("punts jugador2: " + jugador2.getPunts());
        System.out.println();
        turnoActual = (turnoActual == jugador1) ? jugador2 : jugador1;

        System.out.println("Turno del color " + turnoActual.getColor());
        jugador1.moverFicha(tablero,3,4,5,2,jugador1);
        System.out.println("punts jugador1: " + jugador1.getPunts());
        turnoActual = (turnoActual == jugador1) ? jugador2 : jugador1;

        System.out.println("Turno del color " + turnoActual.getColor());
        jugador2.moverFicha(tablero,6,1,4,3,jugador2);
        System.out.println("punts jugador2: " + jugador2.getPunts());
        System.out.println();


    }
}
