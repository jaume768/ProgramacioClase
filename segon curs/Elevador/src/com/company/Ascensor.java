package com.company;

public class Ascensor {

    private int PisoActual = 0;

    public int Subir(){

        return this.PisoActual++;

    }

    public int Bajar(){

        return this.PisoActual--;

    }

    public int GetPisoActual(){

        return this.PisoActual;

    }

}
