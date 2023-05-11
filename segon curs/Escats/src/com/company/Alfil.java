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
    public boolean esMovimientoValido(Casilla casillaOriginal, Casilla casillaDestino, Tablero tablero) {

        int filaOriginal = casillaOriginal.getFila();
        int columnaOriginal = casillaOriginal.getColumna();
        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();

        Ficha fichaDestino = tablero.getCasilla(filaDestino,columnaDestino).getFicha();
        Ficha tuFicha = tablero.getCasilla(filaOriginal,columnaOriginal).getFicha();

        // la condicion del if mira si es un movimiento diagonal
        if ((Math.abs(filaDestino - filaOriginal)) == (Math.abs(columnaDestino - columnaOriginal))){

            int FilaCalculo = (filaDestino > filaOriginal) ? 1 : -1;
            int ColumnaCalculo = (columnaDestino > columnaOriginal) ? 1 : -1;

            int filaIntermedia = filaOriginal + FilaCalculo;
            int columnaIntermedia = columnaOriginal + ColumnaCalculo;

            // Mirar las fichas intermedias

            while (filaIntermedia != filaDestino && columnaIntermedia != columnaDestino) {

                Ficha ficha = tablero.getCasilla(filaIntermedia,columnaIntermedia).getFicha();

                if (ficha != null) {
                    return true;
                }

                filaIntermedia += FilaCalculo;
                columnaIntermedia += ColumnaCalculo;

            }

            return fichaDestino == null || !fichaDestino.getColor().equals(tuFicha.getColor());

        }

        return true;
    }
}
