package com.company;

public class PiezaDamas extends Pieza{

    public PiezaDamas(int fila,int columna) {

        this.fila = fila;
        this.columna = columna;
    }

    public boolean hayPieza(){
        System.out.print(super.getColumna());
        return super.getColumna() >= 0 && super.getFila() >= 0;
    }

    @Override
    public int getColumna() {
        return super.getColumna();
    }

    @Override
    public int getFila() {
        return super.getFila();
    }
}
