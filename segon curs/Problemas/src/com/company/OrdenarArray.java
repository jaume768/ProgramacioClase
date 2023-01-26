package com.company;

public class OrdenarArray {

    public static void main(String[] args) {

        int[] Desordenada = {3,12,4,5,61,5,12,76};

        ordenar(Desordenada);

    }

    public static void ordenar(int[] Desordenada){

        for (int i = 0; i < Desordenada.length; i++) {

            NombrePetit(Desordenada,i);

        }

        for (int i = 0; i < Desordenada.length; i++) {

            System.out.println(Desordenada[i]);

        }

    }

    public static int[] NombrePetit(int[] Array,int Posicio){

        int temp;

        for (int i = 0; i < Array.length; i++) {

            if (Array[i] > Array[Posicio]){

                temp = Array[i];
                Array[i] = Array[Posicio];
                Array[Posicio] = temp;

                i = Array.length;


            }

        }

        return Array;

    }

}
