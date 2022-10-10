package com.company;

public class ArregloSinNumerosRepetidos {

    public static void main(String[] args) {

        Imprimir(GenerarArraySinNumerosRepetidos());

    }

    public static int[] GenerarArraySinNumerosRepetidos(){

        int[] array = new int[10];
        boolean Repetido = true;

        for (int i = 0; i < array.length; i++) {

            while (Repetido){

                int NumeroGenerado = (int)Math.floor(Math.random()*10);
                for (int j = 0; j < array.length; j++) {

                    if (NumeroGenerado == array[j]){

                        Repetido = true;
                        j = array.length;

                    } else {

                        Repetido = false;

                    }

                }

                array[i] = NumeroGenerado;

            }

            Repetido = true;


        }

        return array;

    }

    public static void Imprimir(int[] Array){

        for (int i = 0; i < Array.length; i++) {

            System.out.print(Array[i] + ",");

        }

    }
}
