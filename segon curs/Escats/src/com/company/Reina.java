package com.company;

public class Reina extends Ficha{
    public Reina(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public char getTipo() {
        return 'Q';
    }

    @Override
    public boolean esMovimientoValido(Casilla casillaOriginal, Casilla casillaDestino, Tablero tablero) {

        int filaOriginal = casillaOriginal.getFila();
        int columnaOriginal = casillaOriginal.getColumna();
        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();

        int CalculoFila = Math.abs(filaDestino - filaOriginal);
        int CalculoColumna = Math.abs(columnaDestino - columnaOriginal);

        // Movimiento es vertical, horizontal o diagonal

        if (filaDestino == filaOriginal || columnaDestino == columnaOriginal || CalculoFila == CalculoColumna) {

            int IncrementoFila = (filaDestino > filaOriginal) ? 1 : -1;
            int IncrementoColumna = (columnaDestino > columnaOriginal) ? 1 : -1;

            if (filaDestino == filaOriginal) {
                for (int columnaIntermedia = columnaOriginal + IncrementoFila; columnaIntermedia != columnaDestino;) {

                    Ficha fichaIntermedia = tablero.getCasilla(filaDestino,columnaIntermedia).getFicha();

                    if (fichaIntermedia != null) {

                        return false;

                    }

                    columnaIntermedia += IncrementoColumna;

                }
            } else if (columnaDestino == columnaOriginal) {

                for (int filaIntermedia = filaOriginal + IncrementoColumna; filaIntermedia != filaDestino;) {

                    Ficha fichaIntermedia = tablero.getCasilla(filaIntermedia,columnaDestino).getFicha();

                    if (fichaIntermedia != null) {

                        return false;

                    }

                    filaIntermedia += IncrementoFila;
                }
            } else {

                int filaIntermedia = filaOriginal + IncrementoFila;
                int columnaIntermedia = columnaOriginal + IncrementoColumna;

                while (filaIntermedia != filaDestino && columnaIntermedia != columnaDestino) {

                    Ficha fichaIntermedia = tablero.getCasilla(filaIntermedia,columnaIntermedia).getFicha();

                    if (fichaIntermedia != null) {

                        return false;

                    }
                    filaIntermedia += IncrementoFila;
                    columnaIntermedia += IncrementoColumna;
                }
            }
        }

        return true;
    }
}
