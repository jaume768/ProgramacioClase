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
    public boolean esMovimientoValido(Casilla casillaOrigen, Casilla casillaDestino, Tablero tablero) {
        int filaOrigen = casillaOrigen.getFila();
        int columnaOrigen = casillaOrigen.getColumna();
        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();

        if (casillaOrigen.getFicha() == null || casillaDestino.getFicha() != null) {
            return false;
        }

        Ficha ficha = casillaOrigen.getFicha();

        boolean esMovimientoDiagonal = Math.abs(filaDestino - filaOrigen) == 1 && Math.abs(columnaDestino - columnaOrigen) == 1;
        boolean esMovimientoDiagonalLargo = Math.abs(filaDestino - filaOrigen) == 2 && Math.abs(columnaDestino - columnaOrigen) == 2;

        if (esMovimientoDiagonal) {
            return true;
        }

        if (esMovimientoDiagonalLargo) {
            int filaIntermedia = (filaOrigen + filaDestino) / 2;
            int columnaIntermedia = (columnaOrigen + columnaDestino) / 2;

            Casilla casillaIntermedia = tablero.getCasilla(filaIntermedia, columnaIntermedia);

            return casillaIntermedia.getFicha() != null && !casillaIntermedia.getFicha().getColor().equals(ficha.getColor());
        }

        return false;
    }


}
