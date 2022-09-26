package com.company;

public class ArrayCapALaEsquerra {

    public static void main(String[] args) {
        //Escribir un m ́etodo que reciba como par ́ametro un vector de enteros A y devuelva
        //un nuevo vector B que sea igual al vector A pero desplazado hacia la izquierda,
        //es decir, todos sus elementos han sido desplazados una posici ́on hacia la izquierda.

        int[] A = {1,2,3,4};
        int[] B = new int[A.length];

        ordenar(A,B);
    }

    public static void ordenar(int[] A,int[] B){

        int primerValor = 0;

        for (int i = 0; i < A.length; i++) {

            if (i == 0){

                primerValor = A[i];

            }else if (i >= 1){

                B[i-1] = A[i];

            }

        }

        B[3] = primerValor;

        for (int i = 0; i < A.length; i++) {

            System.out.print(B[i] + " | ");

        }

    }
}
