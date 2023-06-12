package Fichas;
import Casillas.Casilla;
import Tableros.Tablero;

public class Caballo extends Ficha{

    public Caballo(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public char getTipo() {
        return 'C';
    }

    @Override
    public boolean esMovimientoValido(Casilla casillaOriginal, Casilla casillaDestino, Tablero tablero) {

        int filaOriginal = casillaOriginal.getFila();
        int columnaOriginal = casillaOriginal.getColumna();
        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();

        int CalculoFila = Math.abs(filaDestino - filaOriginal);
        int CalculoColumna = Math.abs(columnaDestino - columnaOriginal);

        Ficha ficha = tablero.getCasilla(filaDestino,columnaDestino).getFicha();

        return (CalculoFila == 2 && CalculoColumna == 1) || (CalculoFila == 1 && CalculoColumna == 2) && ficha == null;

    }
}
