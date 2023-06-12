package com.company;

public class Jugador {

    private int numero;

    public Jugador(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void insertarFicha(Tablero tablero, int columna){

        if (verificarCasillas(tablero,columna)){
            tablero.insertarFicha(columna,numero);
        }

        tablero.imprimirTablero();
        System.out.println();

    }

    private boolean verificarCasillas(Tablero tablero,int columna){

        return ((columna <= tablero.getColumnas() && columna >= 0));

    }

}
