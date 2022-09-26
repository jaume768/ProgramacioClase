package com.company;

public class PuntBidimensional {


    public static void main(String[] args) {

        int puntX = 3;
        int puntY = 4;
        int[] cordenadesOrigen = new int[2];

        CalcularDistancia(puntX,puntY);

    }

    public static int[] FerAltrePunt(int puntX, int puntY){

        int puntX2 = 2;
        int puntY2 = 3;
        int[] AltrePunt = {puntX2,puntY2};

        int[] Distancia = new int[]{puntX-puntX2,puntY-puntY2};

        return Distancia;

    }

    public static void CalcularDistancia(int puntX, int puntY){

        int[] Distancia = FerAltrePunt(puntX,puntY);

        System.out.println("Distancia entre els dos punts: ");

        for (int i = 0; i < Distancia.length; i++) {

            System.out.print(Distancia[i] + " | ");

        }

    }

}
