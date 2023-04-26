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
}
