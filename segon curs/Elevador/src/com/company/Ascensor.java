package com.company;

public class Ascensor {

    private int PisoActual = 0;

    public int Subir(){

        System.out.println("Subiendo piso...");
        return this.PisoActual++;

    }

    public int Bajar(){

        System.out.println("Bajando piso...");
        return this.PisoActual--;

    }

    public int GetPisoActual(){

        return this.PisoActual;

    }

}
