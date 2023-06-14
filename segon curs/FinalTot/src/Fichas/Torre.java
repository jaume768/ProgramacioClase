package Fichas;
import Casillas.Casilla;
import Juegos.Juego;


public class Torre extends Ficha {

    public Torre(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public char getTipo() {
        return 'T';
    }

    @Override
    public boolean esMovimientoValido(Casilla casillaOriginal, Casilla casillaDestino, Juego tablero) {
        int filaOriginal = casillaOriginal.getFila();
        int columnaOriginal = casillaOriginal.getColumna();
        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();

        Ficha fichaDestino = casillaDestino.getFicha();
        Ficha fichaOrigen = casillaOriginal.getFicha();

        // Verificar si el movimiento es horizontal o vertical

        if (filaDestino != filaOriginal && columnaDestino != columnaOriginal) {
            return false;
        }

        // Verificar que no hay ficha por el camino

        int increment = ((filaDestino - filaOriginal) > 0) ? 1 : -1;

        for (int i = filaOriginal; i != filaDestino; i += increment) {

            i += increment;

            Ficha ficha = tablero.getCasilla(i,columnaOriginal).getFicha();

            if (ficha != null){

                return false;

            }

        }

        for (int i = columnaOriginal; i != columnaDestino; i -= increment) {

            i -= increment;

            Ficha ficha = tablero.getCasilla(filaOriginal,i).getFicha();

            if (ficha != null){
                return false;
            }

        }

        // Verificar si hay una ficha rival en la casilla de destino

        if (fichaDestino != null && !fichaDestino.getColor().equals(fichaOrigen.getColor())) {

            return true;

        }

        return true;
    }
}
