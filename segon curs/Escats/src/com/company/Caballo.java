package com.company;

public class Caballo extends Ficha{

    public Caballo(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public char getTipo() {
        return 'C';
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
