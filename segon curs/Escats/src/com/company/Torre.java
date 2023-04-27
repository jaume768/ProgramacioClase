package com.company;

public class Torre extends Ficha{

    public Torre(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public char getTipo() {
        return 'T';
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
