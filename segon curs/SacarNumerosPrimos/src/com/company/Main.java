package com.company;

public class Main {

    public static void main(String[] args) {

        int numero = 200;

        imprimir(ArrayPrimos(numero));

    }

    public static void imprimir(int[] array){

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }

    }

    public static boolean EsPrimo(int numero){

        for (int i = 2; i < numero; i++) {

            if (numero % i == 0){

                return false;

            }

        }

        return true;

    }

    public static int ContadorPrimos(int numero){

        int contador = 2;
        int contadorPrimos = 0;

        while (contador != numero){

            if (EsPrimo(contador)){

                contadorPrimos++;

            }

            contador++;

        }

        return contadorPrimos;

    }

    public static int[] ArrayPrimos(int numero){

        int[] array = new int[ContadorPrimos(numero)];
        int contador = 0;

        for (int i = 2; i < numero; i++) {

            if (EsPrimo(i)){

                array[contador] = i;
                contador++;

            }

        }

        return array;

    }

}
