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

        if (verificarMovimiento(juego.getTablero(), casillaFinal)){
            System.out.println("prueba");
        }

        Ficha ficha = juego.getCasilla(casillaOrigen.getFila(),casillaOrigen.getColumna()).getFicha();

        if (ficha.esMovimientoValido(casillaOrigen,casillaFinal,juego)){
            juego.moverFicha(casillaOrigen,casillaFinal);
        }

        juego.imprimirTablero();
        System.out.println();

    }

    @Override
    public boolean verificarMovimiento(Casilla[][] tablero, Casilla casillaFinal) {

        return (tablero[casillaFinal.getFila()][casillaFinal.getColumna()].getFicha() != null && tablero[casillaFinal.getFila()][casillaFinal.getColumna()].getFicha().getColor().equals(color));

    }

    @Override
    public String getColor() {
        return color;
    }
}
