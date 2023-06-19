package Fichas;

import Casillas.Casilla;
import Juegos.Juego;

public class Peon extends Ficha {

    public Peon(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public char getTipo() {
        return 'P';
    }

    @Override
    public boolean esMovimientoValido(Casilla casillaOriginal, Casilla casillaDestino, Juego tablero) {
        int filaOriginal = casillaOriginal.getFila();
        int columnaOriginal = casillaOriginal.getColumna();
        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();

        String color = casillaOriginal.getFicha().getColor();

        if (color.equals("b")){

            if (filaDestino >= filaOriginal) {
                return false;
            }

            if (filaOriginal == 6 && filaDestino == 4 && columnaOriginal == columnaDestino) {
                return true;
            }

            if (filaDestino != filaOriginal - 1) {
                return false;
            }

        } else {


            if (filaDestino <= filaOriginal) {
                return false;
            }


            if (filaOriginal == 1 && filaDestino == 3 && columnaOriginal == columnaDestino) {
                return true;
            }


            if (filaDestino != filaOriginal + 1) {
                return false;
            }
        }


        if (columnaDestino != columnaOriginal && Math.abs(columnaDestino - columnaOriginal) == 1) {

            Ficha fichaRival = casillaDestino.getFicha();
            Ficha tuFicha = casillaOriginal.getFicha();

            if (fichaRival != null && !fichaRival.getColor().equals(tuFicha.getColor())){
                return true;
            }

            return false;
        }

        return true;
    }


}
