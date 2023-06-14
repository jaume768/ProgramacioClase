package Fichas;
import Casillas.Casilla;
import Juegos.Juego;

public class Reina extends Ficha{
    public Reina(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public char getTipo() {
        return 'Q';
    }

    @Override
    public boolean esMovimientoValido(Casilla casillaOriginal, Casilla casillaDestino, Juego tablero) {

        int filaOriginal = casillaOriginal.getFila();
        int columnaOriginal = casillaOriginal.getColumna();
        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();

        int CalculoFila = Math.abs(filaDestino - filaOriginal);
        int CalculoColumna = Math.abs(columnaDestino - columnaOriginal);

        Ficha fichaDestino = tablero.getCasilla(filaDestino,columnaDestino).getFicha();
        Ficha tuFicha = tablero.getCasilla(filaOriginal,columnaOriginal).getFicha();

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

                return fichaDestino == null || !fichaDestino.getColor().equals(tuFicha.getColor());

            } else if (columnaDestino == columnaOriginal) {

                for (int filaIntermedia = filaOriginal + IncrementoColumna; filaIntermedia != filaDestino;) {

                    Ficha fichaIntermedia = tablero.getCasilla(filaIntermedia,columnaDestino).getFicha();

                    if (fichaIntermedia != null) {

                        return false;

                    }

                    filaIntermedia += IncrementoFila;
                }

                return fichaDestino == null || !fichaDestino.getColor().equals(tuFicha.getColor());

            } else if (Math.abs(filaDestino - filaOriginal) == Math.abs(columnaDestino - columnaOriginal)) {

                int filaIntermedia = filaOriginal + IncrementoFila;
                int columnaIntermedia = columnaOriginal + IncrementoColumna;

                while (filaIntermedia != filaDestino && columnaIntermedia != columnaDestino) {
                    Ficha fichaIntermedia = tablero.getCasilla(filaIntermedia, columnaIntermedia).getFicha();
                    if (fichaIntermedia != null) {
                        return false;
                    }
                    filaIntermedia += IncrementoFila;
                    columnaIntermedia += IncrementoColumna;
                }

                return fichaDestino == null || !fichaDestino.getColor().equals(tuFicha.getColor());
            }
        }

        return false;
    }
}
