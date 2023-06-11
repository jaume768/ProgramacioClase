package com.company;

public class Ficha {
    private int fila;
    private int columna;
    private int numero;

    public Ficha(int fila, int columna, int numero) {

        this.fila = fila;
        this.columna = columna;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
