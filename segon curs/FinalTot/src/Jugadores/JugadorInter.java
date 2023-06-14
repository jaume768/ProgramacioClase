package Jugadores;
import Casillas.Casilla;
import Juegos.Juego;

public interface JugadorInter {

    void moverFicha(Juego aj, int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino);
    void verificarMovimiento(Casilla[][] tablero, Casilla casillaFinal);
    String getColor();

}
