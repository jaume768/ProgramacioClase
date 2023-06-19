package Fichas;

import Casillas.Casilla;
import Juegos.Juego;

public class Raton extends Ficha{
    public Raton(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public char getTipo() {
        return 'R';
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

        // Verificar si es un movimient diagonal
        if (Math.abs(filaDestino - filaOriginal) == Math.abs(columnaDestino - columnaOriginal)) {

            return Math.abs(filaDestino - filaOriginal) <= 1 || Math.abs(columnaDestino - columnaOriginal) <= 1 && fichaDestino == null;
        }

        return false;
    }
}
