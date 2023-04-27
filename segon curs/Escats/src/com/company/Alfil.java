package com.company;

public class Alfil extends Ficha{
    public Alfil(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public char getTipo() {
        return 'A';
    }

    @Override
    public boolean mover(Casilla casillaOriginal, Casilla casillaDestino) {
        return false;
    }

    @Override
    public boolean esMovimientoValido(Casilla casillaOriginal, Casilla casillaDestino) {
        return false;
    }
}
