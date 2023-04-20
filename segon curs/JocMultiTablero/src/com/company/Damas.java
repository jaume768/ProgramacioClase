package com.company;

public class Damas extends Juego{

    @Override
    public void iniciarJuego() {
        TableroDamas tablero = new TableroDamas();

        tablero.rellenarTablero();
        tablero.ImprimirTablero();
    }

    @Override
    public void jugarTurno(Jugador jugador) {

    }

}
