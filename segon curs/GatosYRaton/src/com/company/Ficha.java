package com.company;

public abstract class Ficha {

    private int fila;
    private int columna;
    private String color;

    public Ficha(int fila, int columna,String color) {

        this.fila = fila;
        this.columna = columna;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract char getTipo();

    public abstract boolean esMovimientoValido(Casilla casillaOriginal, Casilla casillaDestino, Tablero tablero);

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
}
