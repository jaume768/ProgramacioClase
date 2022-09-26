package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class metodes {

    List<ballena> llistaballenas = new ArrayList<ballena>();
    Scanner entrada = new Scanner (System.in);

    public void CrearBallenas(){

        entradas Entrada = new entradas();

        int NumeroBallenas;
        int i = 0;
        System.out.println("Dime el numero de ballenas a crear: ");
        NumeroBallenas = entrada.nextInt();

        while (NumeroBallenas > i){

            System.out.println("Información de la ballena " + (i+1) + ":");
            llistaballenas.add(new ballena(Entrada.kilos(), Entrada.tamaño()));
            System.out.println("--------------------------------------------");

            i++;

        }

    }

    public void imprimirInformacio(){

        System.out.println("--------------------------------------------");

        for (int i = 0; i < llistaballenas.size(); i++) {

            System.out.println("Los kilos de la ballena " + (i+1) + " es de: " + llistaballenas.get(i).getKilos() + " kg");
            System.out.println("El tamaño de la ballena " + (i+1) + " es de: " + llistaballenas.get(i).getKilos() + " cm");
            System.out.println("--------------------------------------------");

        }

    }

    public int ComprarDuesBallenes(){

        System.out.println("Com a molt es poden comparar dues ballenes, dim la posició de la primera ballena a comprar: ");
        int primera = entrada.nextInt()-1;

        System.out.println("Dim la posicio de la segona ballena: ");
        int segona = entrada.nextInt()-1;

        return (llistaballenas.get(primera).getKilos() - llistaballenas.get(segona).getKilos());

    }

}
