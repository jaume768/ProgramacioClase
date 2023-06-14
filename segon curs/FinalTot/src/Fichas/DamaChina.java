package Fichas;

import Casillas.Casilla;
import Juegos.Juego;

public class DamaChina extends Ficha{
    public DamaChina(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public char getTipo() {
        return 'C';
    }

    @Override
    public boolean esMovimientoValido(Casilla casillaOriginal, Casilla casillaDestino, Juego juego) {
        int filaOrigen = casillaOriginal.getFila();
        int columnaOrigen = casillaOriginal.getColumna();
        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();

        if (casillaOriginal.getFicha() == null || casillaDestino.getFicha() != null) {
            return false;
        }

        Ficha ficha = casillaOriginal.getFicha();

        boolean esMovimientoDiagonal = Math.abs(filaDestino - filaOrigen) == 1 && Math.abs(columnaDestino - columnaOrigen) == 1;
        boolean esMovimientoDiagonalLargo = Math.abs(filaDestino - filaOrigen) == 2 && Math.abs(columnaDestino - columnaOrigen) == 2;

        if (esMovimientoDiagonal) {
            return true;
        }

        if (esMovimientoDiagonalLargo) {
            int filaIntermedia = (filaOrigen + filaDestino) / 2;
            int columnaIntermedia = (columnaOrigen + columnaDestino) / 2;

            Casilla casillaIntermedia = juego.getCasilla(filaIntermedia, columnaIntermedia);

            return casillaIntermedia.getFicha() != null && !casillaIntermedia.getFicha().getColor().equals(ficha.getColor());
        }

        return false;
    }
}
