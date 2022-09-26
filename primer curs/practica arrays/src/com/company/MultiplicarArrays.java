package com.company;

public class MultiplicarArrays {

    public static void main(String[] args) {

        // Escribir un m ́etodo que reciba dos vectores A y B de enteros del mismo tama ̃no y
        //devuelva la multiplicaci ́on inversa de ambas matrices, es decir, multiplique el primero
        //elemento de A por el  ́ultimo de B, el segundo elemento de A por el pen ́ultimo de B,
        //y as ́ı sucesivamente.


        int[] A = {1,2,3};
        int[] B = {5,6,7};

        multiplicacioArrays(A,B);

    }

    public static void multiplicacioArrays(int[] A, int[] B){

        int[] resultat = new int[A.length];
        int posicioA = 0;
        int posicioB = 0;

        for (int i = 0; i < A.length; i++) {

            posicioA = A[i];
            posicioB = B[(A.length-1)- i];
            resultat[i] = (posicioA * posicioB);

        }

        for (int i = 0; i < resultat.length; i++) {

            System.out.print(resultat[i] + " | ");

        }

    }
}
