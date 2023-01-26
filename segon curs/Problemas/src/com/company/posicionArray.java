package com.company;

public class posicionArray {

    public static void main(String[] args) {

        int[] array = {10,5,3,4,8};

        imprimir(intercambiar(array,2));

    }

    public static int[] intercambiar(int[] array, int posicion){

        int numeroMayor = 0;
        int index = 0;
        int temp = 0;

        for (int i = 0; i < array.length-posicion; i++) {

            if (array[i] > array[posicion] && array[i] > numeroMayor){

                numeroMayor = array[i];
                index = i;

            }

        }

        temp = array[posicion];
        array[posicion] = numeroMayor;
        array[index] = temp;

        return array;

    }

    public static void imprimir(int[] array){

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + ",");

        }

    }
}
