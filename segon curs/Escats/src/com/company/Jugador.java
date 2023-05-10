package com.company;

public class Jugador {
    private String color;

    public Jugador(String color){
        this.color = color;
    }

    public void moverFicha(Tablero tablero, int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino){

        Casilla casillaOrigen = tablero.getCasilla(filaOrigen,columnaOrigen);
        Casilla casillaFinal = tablero.getCasilla(filaDestino,columnaDestino);

        verificarCasillas(tablero,casillaFinal);

        Ficha ficha = tablero.getCasilla(casillaOrigen.getFila(),casillaOrigen.getColumna()).getFicha();

        if (ficha.esMovimientoValido(casillaOrigen,casillaFinal,tablero)){
            tablero.moverFicha(casillaOrigen,casillaFinal);
        }

        tablero.ImprimirTablero();
        System.out.println();

    }

    public String getColor() {
        return color;
    }

    private void verificarCasillas(Tablero tablero, Casilla casillaFinal){

        if (tablero.hayFicha(casillaFinal) && tablero.getCasilla(casillaFinal.getFila(), casillaFinal.getColumna()).getFicha().getColor().equals(color)){
            throw new IllegalArgumentException("La casilla destino contiene una ficha de tu color. ");
        }

    }
}
