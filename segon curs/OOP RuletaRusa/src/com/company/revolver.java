package com.company;

public class revolver {

    private int tamañoTambor;
    private int actual;
    private int bala;

    public revolver(int tamañoTambor,int actual, int bala) {
        this.actual = actual;
        this.bala = bala;
        this.tamañoTambor = tamañoTambor;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public int getBala() {
        return bala;
    }

    public void setBala(int bala) {
        this.bala = bala;
    }

    public int getTamañoTambor() {
        return tamañoTambor;
    }

    public void setTamañoTambor(int tamañoTambor) {
        this.tamañoTambor = tamañoTambor;
    }
}
