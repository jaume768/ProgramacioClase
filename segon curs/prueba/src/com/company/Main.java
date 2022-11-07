package com.company;

public class Main {

    public static void main(String[] args) {

        int[] Array = new int[20];

        Array = LlenarArray(Array);

        System.out.println(Media(Array));

    }

    public static int[] LlenarArray(int[] Array){

        for (int i = 0; i < Array.length; i++) {

            Array[i] = i;

        }

        return Array;

    }

    public static int Media(int[] Array){

        int Suma = 0;
        int Media;

        for (int i = 0; i < Array.length; i++) {

            Suma += Array[i];

        }

        Media = Suma/Array.length;

        return Media;

    }


}

