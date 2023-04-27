package com.company;

public class Peon extends Ficha{

    public Peon(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public char getTipo() {
        return 'P';
    }

    @Override
    public boolean mover(Casilla casillaOriginal, Casilla casillaDestino) {
        return true;
    }

    public boolean esMovimientoValido(Casilla casillaOriginal, Casilla casillaDestino) {
        return false;
    }


}
