package com.company;

import java.util.Arrays;

public class SwapNodesInPares {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8};

        System.out.println(Arrays.toString(Swap(array)));
    }

    public static int[] Swap(int[] array){

        int[] arraySwap = new int[array.length];
        int ronda = 2;
        int indexPar = 0;
        int indexImpar = 0;

        for (int i = 0; i < arraySwap.length; i++) {

            if (isPar(ronda)){
                arraySwap[i] = array[nombrePar(array,indexPar)];
                indexPar = nombrePar(array,indexPar)+1;
            } else {
                arraySwap[i] = array[nombreImpar(array,indexImpar)];
                indexImpar = nombreImpar(array,indexImpar)+1;
            }

            ronda++;

        }

        return arraySwap;

    }

    public static int nombreImpar(int[] array, int index){

        for (int i = index; i < array.length; i++) {

            if (!isPar(array[i])){
                return i;
            }

        }

        return 0;

    }

    public static int nombrePar(int[] array, int index){

        for (int i = index; i < array.length; i++) {

            if (isPar(array[i])){
                return i;
            }

        }

        return 0;

    }

    public static boolean isPar(int num){

        return (num % 2 == 0);

    }

}
