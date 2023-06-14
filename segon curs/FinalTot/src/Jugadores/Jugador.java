package Jugadores;

import Casillas.Casilla;
import Juegos.Ajedrez;
import Fichas.*;
import Juegos.Juego;


public class Jugador implements JugadorInter {

    private final String color;

    public Jugador(String color){
        this.color = color;
    }

    @Override
    public void moverFicha(Juego aj, int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {

        Casilla casillaOrigen = aj.getCasilla(filaOrigen,columnaOrigen);
        Casilla casillaFinal = aj.getCasilla(filaDestino,columnaDestino);

        verificarMovimiento(aj.getTablero(),casillaFinal);

        Ficha ficha = aj.getCasilla(casillaOrigen.getFila(),casillaOrigen.getColumna()).getFicha();

        if (ficha.esMovimientoValido(casillaOrigen,casillaFinal,aj)){
            aj.moverFicha(casillaOrigen,casillaFinal);
        }

        aj.imprimirTablero();
        System.out.println();

    }

    @Override
    public void verificarMovimiento(Casilla[][] tablero, Casilla casillaFinal) {

    }

    @Override
    public String getColor() {
        return color;
    }
}
