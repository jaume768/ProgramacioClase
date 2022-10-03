package com.company;

public class Main {

    public static void main(String[] args) {

        metodes comunicador = new metodes();

        comunicador.CrearBallenas();
        comunicador.imprimirInformacio();

        System.out.println("El resultat de comparar els kilos de les ballenes, dona com a resultat una difarencia de: " + comunicador.ComprarDuesBallenes() + "kg");
    }
}
