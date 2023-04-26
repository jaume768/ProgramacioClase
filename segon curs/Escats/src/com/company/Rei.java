package com.company;

public class Rei extends Ficha{
    public Rei(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public char getTipo() {
        return 'K';
    }

    @Override
    public boolean mover(Casilla casillaOriginal, Casilla casillaDestino) {
        return false;
    }
}
