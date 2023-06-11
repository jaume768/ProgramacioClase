package com.company;

public class Main {

    public static void main(String[] args) {

        Tablero tablero = new Tablero(8,8);

        tablero.insertarFicha(0,1);
        tablero.insertarFicha(0,1);
        tablero.insertarFicha(0,1);
        tablero.insertarFicha(0,1);

        System.out.println(tablero.hayGanador(7,0,1));

        tablero.imprimirTablero();

    }
}
