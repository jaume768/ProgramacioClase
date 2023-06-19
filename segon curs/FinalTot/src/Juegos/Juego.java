package Juegos;
import Casillas.Casilla;

public interface Juego {

    void iniciarJuego();
    boolean hayGanador();
    void imprimirTablero();
    void moverFicha(Casilla casillaOrigen, Casilla casillaDestino);
    Casilla getCasilla(int filaOrigen,int columnaOrigen);
    String saberJuego();
    Casilla[][] getTablero();

}
