package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {3, 2, 57, 21, 56};
        int[] array2 = {1, 2, 3, 4, 5, 6};
        int[] array3 = {0, 5, 0, 3, 0, 1};
        int[] arrayEjemplo = {56,6,7,3,45,2,1,2,3,1,43};

        System.out.println(Arrays.toString(ordenarArray(arrayEjemplo)));

    }

    public static int Mitja(int[] array) {

        int Suma = 0;

        for (int i = 0; i < array.length; i++) {

            Suma += array[i];

        }

        return Suma / array.length;

    }

    public static int NumeroPequenyo(int[] array) {

        int Numero = array[0];

        for (int i = 0; i < array.length; i++) {

            /*if (Numero > array[i]){

                Numero = array[i];

            }*/

            Numero = (Numero > array[i]) ? array[i] : Numero;

        }

        return Numero;

    }

    public static int IndexNumeroPequenyo(int[] array) {

        int Numero = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {

            /*if (Numero > array[i]){

                index = i;

            }*/

            index = (Numero > array[i]) ? i : index;

        }

        return index;

    }

    public static boolean OrdenadaAsc(int[] array2) {

        for (int i = 0; i < array2.length - 1; i++) {

            if (!(array2[i] < array2[i + 1])) {

                return false;

            }

        }

        return true;

    }

    public static boolean OrdenadaDescPares(int[] array3) {

        for (int i = 1; i < array3.length - 2; i += 2) {

            if (!(array3[i] > array3[i + 2])) {

                return false;

            }


        }

        return true;

    }

    public static int[] arrayInvertida(int[] array2) {

        int[] arrayInvertida = new int[array2.length];
        int contador = 0;

        for (int i = array2.length - 1; i >= 0; i--) {

            arrayInvertida[contador] = array2[i];
            contador++;

        }

        return arrayInvertida;

    }

    public static int Ocurrencia(int[] array, int numero) {

        for (int i = 0; i < array.length; i++) {

            if (numero == array[i]) {
                return i;
            }

        }

        return -1;

    }

    // el ejercicio 10 se hace despues

    // ejercicio 11

    public static int NumeroMayorIndex(int[] array, int posicion){

        int NumeroMayor = array[posicion];
        // numero mayor = 1
        int index = posicion;
        // index = 9

        for (int i = posicion; i >= 0; i--) {

            if (NumeroMayor < array[i] && array[index] < array[i]){

                index = i;

            }

        }

        return index;


    }

    public static int[] intercambioIndex(int[] array, int posicion) {

        int indexNumeroMayor = NumeroMayorIndex(array,posicion);

        int temp = array[indexNumeroMayor];
        array[indexNumeroMayor] = array[posicion];
        array[posicion] = temp;

        return array;

    }

    // ejercicio 12

    public static int[] ordenarArray(int[] array){

        for (int i = array.length-1;i > 0; i--) {

            array = intercambioIndex(array,i);

        }

        return array;

    }

}
