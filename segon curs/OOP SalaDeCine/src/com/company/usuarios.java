package com.company;

public class usuarios {

    private int id;
    private boolean ocupada;

    public usuarios(int id,boolean ocupada) {
        this.id = id;
        this.ocupada = ocupada;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}
