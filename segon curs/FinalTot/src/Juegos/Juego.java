package Juegos;
import Casillas.Casilla;

public interface Juego {

    void iniciarJuego();
    void jugar();
    boolean hayGanador(Casilla[][] tablero);
    void imprimirTablero();
    void moverFicha(Casilla casillaOrigen, Casilla casillaDestino);
    Casilla getCasilla(int filaOrigen,int columnaOrigen);
    Casilla[][] getTablero();
    String saberJuego();

}
