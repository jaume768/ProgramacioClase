package Tableros;
import Casillas.Casilla;

public interface Tablero {
    void imprimirTablero();
    Casilla getCasilla();
    void moverFicha();
    boolean hayFicha();
    void inicializarTablero();
}
