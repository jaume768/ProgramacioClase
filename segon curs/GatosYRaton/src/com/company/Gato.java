package com.company;

public class Gato extends Ficha {

    public Gato(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public char getTipo() {
        return 'G';
    }

    @Override
    public boolean esMovimientoValido(Casilla casillaOriginal, Casilla casillaDestino, Tablero tablero) {
        int filaOriginal = casillaOriginal.getFila();
        int columnaOriginal = casillaOriginal.getColumna();
        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();

        Ficha fichaDestino = tablero.getCasilla(filaDestino, columnaDestino).getFicha();

        // Verificar si es un movimiento diagonal
        if (Math.abs(filaDestino - filaOriginal) == Math.abs(columnaDestino - columnaOriginal)) {

            return (filaDestino - filaOriginal) == 1 || (columnaDestino - columnaOriginal) == 1 && fichaDestino == null;
        }

        return false; // Movimiento inválido si no es diagonal
    }
}
