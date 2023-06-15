package Jugadores;

import Casillas.Casilla;
import Fichas.*;
import Juegos.Juego;



public class Jugador implements JugadorInter {

    private final String color;

    public Jugador(String color){
        this.color = color;
    }

    @Override
    public boolean moverFicha(Juego juego, int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {

        Casilla casillaOrigen = juego.getCasilla(filaOrigen,columnaOrigen);
        Casilla casillaFinal = juego.getCasilla(filaDestino,columnaDestino);


        if (!juego.saberJuego().equals("ajedrez")){
            if (verificarMovimiento(juego.getTablero(), casillaFinal)){

                return false;

            }
        }

        Ficha ficha = juego.getCasilla(casillaOrigen.getFila(),casillaOrigen.getColumna()).getFicha();

        if (ficha.esMovimientoValido(casillaOrigen,casillaFinal,juego)){
            juego.moverFicha(casillaOrigen,casillaFinal);

            juego.imprimirTablero();
            System.out.println();

            return true;

        }


        return false;

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
