package com.company;

public abstract class Tablero {

    protected Pieza[][] casillas;

    public abstract void moverPieza(Pieza pieza, int filaDestino, int columnaDestino);
    public abstract boolean esEmpate();

}
