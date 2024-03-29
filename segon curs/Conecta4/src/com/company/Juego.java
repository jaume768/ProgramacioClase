package com.company;

import java.util.Scanner;

public class Juego {

    public void Jugar(){

        Tablero tablero = new Tablero(8,8);
        Scanner sc = new Scanner(System.in);
        Jugador jugador1 = new Jugador(1);
        Jugador jugador2 = new Jugador(2);

        Jugador jugadorActual = jugador1;

        while (!tablero.tableroLleno()){

            String missatge = jugadorActual.getNumero() == 1 ? "X" : "O";

            System.out.println("Turno del jugador " + missatge + ": ");

            System.out.println("Dime done quieres insertar una ficha: " );
            int columna = sc.nextInt();

            if (verificarTamanyo(columna)){
                jugadorActual.insertarFicha(tablero,columna);
            } else {
                System.out.println("Tamaño incorrecto, vuelve a insertar la ficha");
                continue;
            }

            if (tablero.hayGanador(tablero.ultimaFichaInsertada(columna),columna,jugadorActual.getNumero())){

                System.out.println("Ganador!!!");

                break;
            }

            if (jugadorActual == jugador1) {
                jugadorActual = jugador2;
            } else {
                jugadorActual = jugador1;
            }

        }

        tablero.imprimirTablero();

    }

    private boolean verificarTamanyo(int columna){

        return (columna <= 7 && columna >= 0);

    }

}
