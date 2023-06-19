package Fichas;

import Casillas.Casilla;
import Juegos.Juego;

public class Gato extends Ficha{
    public Gato(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public char getTipo() {
        return 'G';
    }

    @Override
    public boolean esMovimientoValido(Casilla casillaOriginal, Casilla casillaDestino, Juego juego) {
        int filaOriginal = casillaOriginal.getFila();
        int columnaOriginal = casillaOriginal.getColumna();
        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();

        Ficha fichaDestino = juego.getCasilla(filaDestino, columnaDestino).getFicha();

        if ((columnaDestino < 0 || columnaDestino > 7) && filaDestino > 7 || filaDestino < 0){
            return false;
        }

        if (Math.abs(filaDestino - filaOriginal) == Math.abs(columnaDestino - columnaOriginal)) {

            return (filaDestino - filaOriginal) == 1 || (columnaDestino - columnaOriginal) == 1 && fichaDestino == null;
        }

        return false;
    }
}
