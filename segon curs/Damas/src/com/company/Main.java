package com.company;

public class Main {

    public static void main(String[] args) {

        /*Crear una clase "Tablero" que represente el estado actual del juego, con un arreglo bidimensional de objetos "Casilla" que contenga la información de cada una de las 64 casillas del tablero (8x8).
        Crear una clase "Ficha" que represente cada ficha del juego, con atributos que indiquen su color (blanco o negro) y su posición actual en el tablero (fila y columna).
        Crear una clase "Jugador" que represente a cada jugador del juego, con atributos que indiquen su color de fichas (blanco o negro) y un método que permita mover una ficha en el tablero.
        Crear una clase "Partida" que gestione el estado actual del juego y permita a los jugadores realizar sus movimientos de acuerdo a las reglas del juego.*/


        Tablero tablero = new Tablero();

        tablero.ImprimirTablero();
        System.out.println();

        Jugador jugador1 = new Jugador("n");

        jugador1.moverFicha(tablero,2,1,3,0);

        tablero.ImprimirTablero();
    }
}
