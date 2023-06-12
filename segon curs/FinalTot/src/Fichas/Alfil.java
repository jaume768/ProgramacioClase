package Fichas;
import Casillas.Casilla;
import Tableros.Tablero;

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

        Ficha fichaDestino = tablero.getCasilla(filaDestino, columnaDestino).getFicha();
        Ficha tuFicha = tablero.getCasilla(filaOriginal, columnaOriginal).getFicha();

        // Verificar si es un movimiento diagonal
        if (Math.abs(filaDestino - filaOriginal) == Math.abs(columnaDestino - columnaOriginal)) {
            int incrementoFila = (filaDestino > filaOriginal) ? 1 : -1;
            int incrementoColumna = (columnaDestino > columnaOriginal) ? 1 : -1;

            int filaIntermedia = filaOriginal + incrementoFila;
            int columnaIntermedia = columnaOriginal + incrementoColumna;

            // Verificar las fichas intermedias
            while (filaIntermedia != filaDestino && columnaIntermedia != columnaDestino) {
                Ficha fichaIntermedia = tablero.getCasilla(filaIntermedia, columnaIntermedia).getFicha();
                if (fichaIntermedia != null) {
                    return false;
                }
                filaIntermedia += incrementoFila;
                columnaIntermedia += incrementoColumna;
            }

            return fichaDestino == null || !fichaDestino.getColor().equals(tuFicha.getColor());
        }

        return false; // Movimiento inválido si no es diagonal
    }
}
