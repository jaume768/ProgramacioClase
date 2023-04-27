package com.company;

public class Casilla {

    private int fila;
    private int columna;
    private Ficha ficha;

    public Casilla(int fila, int columna, Ficha ficha) {
        this.fila = fila;
        this.columna = columna;
        this.ficha = ficha;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }
}
