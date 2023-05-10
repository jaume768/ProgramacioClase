package com.company;

public class Peon extends Ficha{

    public Peon(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public char getTipo() {
        return 'P';
    }

    public boolean esMovimientoValido(Casilla casillaOriginal, Casilla casillaDestino, Tablero tablero) {

        int filaOriginal = casillaOriginal.getFila();
        int columnaOriginal = casillaOriginal.getColumna();
        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();

        String color = casillaOriginal.getFicha().getColor();

        if (color.equals("b")){

            // Un peón sólo puede moverse hacia adelante

            if (filaDestino >= filaOriginal) {
                return false;
            }

            // Un peón puede avanzar dos casillas desde su posición inicial

            if (filaOriginal == 6 && filaDestino == 4 && columnaOriginal == columnaDestino) {
                return true;
            }

            // Un peón sólo puede avanzar una casilla hacia adelante

            if (filaDestino != filaOriginal - 1) {
                return false;
            }

        } else {

            // Un peón sólo puede moverse hacia adelante

            if (filaDestino <= filaOriginal) {
                return false;
            }

            // Un peón puede avanzar dos casillas desde su posición inicial

            if (filaOriginal == 1 && filaDestino == 3 && columnaOriginal == columnaDestino) {
                return true;
            }

            // Un peón sólo puede avanzar una casilla hacia adelante

            if (filaDestino != filaOriginal + 1) {
                return false;
            }
        }

        // un peón no se puede mover de lado, solo en caso de matar una ficha rival

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
