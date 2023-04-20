package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] list = {{1,4,5},{1,3,4},{2,6}};

        System.out.println(Arrays.toString(OrdenarArrayBubble(unaArray(list))));

    }

    public static int contadorNumArray(int[][] Matriu){

        int contador = 0;

        for (int i = 0; i < Matriu.length; i++) {
            for (int j = 0; j < Matriu[i].length; j++) {

                contador++;

            }

        }

        return contador;

    }

    public static int[] unaArray(int[][] Matriu){

        int[] Array = new int[contadorNumArray(Matriu)];
        int contador = 0;

        for (int i = 0; i < Matriu.length; i++) {
            for (int j = 0; j < Matriu[i].length; j++) {

                Array[contador] = Matriu[i][j];
                contador++;

            }

        }

        return Array;

    }

    public static int[] OrdenarArrayBubble(int[] array){

        int i, j, aux;
        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
            }
        }

        return array;

    }
}
