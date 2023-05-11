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
    public boolean esMovimientoValido(Casilla casillaOriginal, Casilla casillaDestino, Tablero tablero) {

        int filaOriginal = casillaOriginal.getFila();
        int columnaOriginal = casillaOriginal.getColumna();
        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();

        Ficha fichaDestino = tablero.getCasilla(filaDestino,columnaDestino).getFicha();
        Ficha tuFicha = tablero.getCasilla(filaOriginal,columnaOriginal).getFicha();

        if ((Math.abs(filaDestino - filaOriginal)) <= 1 && (Math.abs(columnaDestino - columnaOriginal)) <= 1) {

            return fichaDestino == null || !fichaDestino.getColor().equals(tuFicha.getColor());

        }

        return false;
    }
}
