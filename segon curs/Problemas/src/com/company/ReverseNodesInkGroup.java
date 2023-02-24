package com.company;

import java.util.Arrays;

public class ReverseNodesInkGroup {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int k = 2;

        System.out.println(Arrays.toString(invertArrayByIndex(array,4,2)));

    }

    public static int[] invertArrayByIndex(int[] array, int index,int numATreure){

        int[] arrayInvert = new int[numATreure];
        int contador = 0;

        for (int i = (index-1); i > -1; i--) {

            arrayInvert[contador] = array[i];
            contador++;

        }

        return arrayInvert;

    }

    public static int[] solucion(int[] array, int k){

        int[] arraySwap = new int[array.length];

        for (int i = 0; i < array.length; i++) {



        }

        return arraySwap;

    }
}
