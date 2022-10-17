package com.company;

public class Ascensor {

    private int PisoActual = 0;
    private final int PisoMaximo = 5;

    public int Subir(){

        if (this.PisoActual == PisoMaximo){
            System.out.println("No se pude subir mas pisos");
            return this.PisoActual;
        }

        System.out.println("Subiendo piso...");
        return this.PisoActual++;

    }

    public int Bajar(){

        if (this.PisoActual == 0){
            System.out.println("No se pude bajar del piso 0.");
            return this.PisoActual;
        }

        System.out.println("Bajando piso...");
        return this.PisoActual--;

    }

    public int GetPisoActual(){

        return this.PisoActual;

    }

}
