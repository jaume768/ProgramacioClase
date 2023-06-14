package Fichas;

import Casillas.Casilla;
import Juegos.Juego;

public class Dama extends Ficha{

    public Dama(int fila, int columna,String color) {
        super(fila,columna,color);

    }

    @Override
    public char getTipo() {
        return 'D';
    }

    @Override
    public boolean esMovimientoValido(Casilla casillaOriginal, Casilla casillaDestino, Juego juego) {

        int filaOrigen = casillaOriginal.getFila();
        int filaDestino = casillaDestino.getFila();

        int columnaOrigen = casillaOriginal.getColumna();
        int columnaDestino = casillaDestino.getColumna();

        return (filaDestino - filaOrigen) >= 1 && (columnaDestino - columnaOrigen) >= 1 || (columnaDestino-columnaOrigen) >= -1 || (filaDestino - filaOrigen) >= -1;
    }

}
