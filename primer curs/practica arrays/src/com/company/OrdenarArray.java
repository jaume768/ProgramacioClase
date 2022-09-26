package com.company;

public class OrdenarArray {

    public static void main(String[] args) {

        int[] Array = {12,2,15,20,100};

        Ordenar(Array);

    }

    public static void Ordenar(int[] Array){

        int temporal = 0;
        int n = Array.length;

        for (int valor = 0; valor < n; valor++) {

            for (int ordenament = 0; ordenament < (n-1)-valor; ordenament++) {

                if (Array[ordenament] > Array[ordenament+1]){

                    temporal = Array[ordenament];
                    Array[ordenament] = Array[ordenament+1];
                    Array[ordenament+1] = temporal;

                }

            }

        }

        for (int i = 0; i < Array.length; i++) {

            System.out.print(Array[i] + " ");

        }

    }
}
