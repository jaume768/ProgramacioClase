package com.company;

import java.util.Arrays;

public class MedianaDeDosArraysMezcladas {

    public static void main(String[] args) {

        int[] array1 = {1,3,8,7,5};
        int[] array2 = {2,4,6,9};

        int[] arrayJunta = ordernarArray(ArrayJunta(array1,array2));

        System.out.println(Arrays.toString(arrayJunta));
        System.out.println("Media: " + MediaArray(arrayJunta));

    }

    public static int[] ArrayJunta(int[] array1,int[] array2){

        int longitud = array1.length + array2.length;

        int[] arrayJunta = new int[longitud];
        int contador = 0;

        for (int i = 0; i < arrayJunta.length; i++) {

            if (i < array1.length){
                arrayJunta[i] = array1[i];
            } else {
                arrayJunta[i] = array2[contador];
                contador++;
            }

        }

        return arrayJunta;

    }

    public static int[] ordernarArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    public static double MediaArray(int[] array){

        double suma = 0;
        for (int i = 0; i < array.length; i++) {

            suma += array[i];

        }

        return (suma/array.length);

    }

}
