package com.company;

public class Casilla {
    private int fila;
    private int columna;
    private Ficha ficha;
    private boolean destapada;
    private boolean bandera;

    public Casilla(int fila, int columna, Ficha ficha, boolean destapada,boolean bandera) {
        this.fila = fila;
        this.columna = columna;
        this.ficha = ficha;
        this.destapada = destapada;
        this.bandera = bandera;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    public boolean isDestapada() {
        return destapada;
    }

    public void setDestapada(boolean destapada) {
        this.destapada = destapada;
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
