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
    public void moverFicha(Juego juego, int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {

        Casilla casillaOrigen = juego.getCasilla(filaOrigen,columnaOrigen);
        Casilla casillaFinal = juego.getCasilla(filaDestino,columnaDestino);

        verificarMovimiento(juego.getTablero(),casillaFinal);

        Ficha ficha = juego.getCasilla(casillaOrigen.getFila(),casillaOrigen.getColumna()).getFicha();

        if (ficha.esMovimientoValido(casillaOrigen,casillaFinal,juego)){
            juego.moverFicha(casillaOrigen,casillaFinal);
        }

        juego.imprimirTablero();
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
