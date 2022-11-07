package com.company;

public class Main {

    public static void main(String[] args) {

       int[] array = {1,2,3,4,5,6,7,8,9};

        System.out.println("Media: " + media(array));

        System.out.println(valorCercano(array));

    }

    public static int media(int[] array){

        int media = 0;

        for (int i = 0; i < array.length; i++) {

            media += array[i];

        }

        return media/array.length;

    }

    public static boolean MayorACero(int nombre){

        boolean Mayor = nombre < 0;

        return Mayor;

    }

    public static int valorCercano(int[] array){

        int media = media(array);
        int valor = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] - media == 0){

                return array[i];

            } else if (MayorACero(array[i] - media) && !MayorACero(array[i + 1] - media) && i < array.length-1){

                valor = array[i];

            }

        }

        return valor;

    }
}
