package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(TextSenseSubText("Hola que Hola tal","boo"));

    }

    // ejercicio 1

    public static boolean[] ArrayDeBooleans(int n){

        boolean[] arrayBooleans = new boolean[n+1];

        for (int i = 0; i < arrayBooleans.length; i++) {
            arrayBooleans[i] = true;

        }

        arrayBooleans[0] = false;
        arrayBooleans[1] = false;

        for (int i = 2; i < (int) Math.sqrt(n)+1; i++) {
            if (arrayBooleans[i]){
                for (int j = 2; j * i < arrayBooleans.length; j++) {

                    arrayBooleans[j * i] = false;

                }
            }

        }

        return arrayBooleans;

    }

    public static int[] arrayDePrimos(boolean[] arrayDeBooleans){

        // aixo ho faig per contar els nombres primers i despres fer una array de ints amb el temany
        int contadorPrimos = 0;
        for (int i = 0; i < arrayDeBooleans.length; i++) {

            if (arrayDeBooleans[i]){
                contadorPrimos++;
            }

        }

        //  tot lo seguent es per tenir una array de ints amb els nombres primers
        int[] numerosPrimos = new int[contadorPrimos];
        int contador = 0;

        for (int i = 0; i < arrayDeBooleans.length; i++) {

            if (arrayDeBooleans[i]){
                numerosPrimos[contador] = i;
                contador++;
            }

        }

        return numerosPrimos;

    }

    // ejercicio 2

    public static void DescomposicionFactorial(int n){

        int[] arrayDePrimos = arrayDePrimos(ArrayDeBooleans(n));
        int i = 0;

        while (n != 1){
                while (n % arrayDePrimos[i] == 0){

                    System.out.println(n + "/" + arrayDePrimos[i]);
                    n = n/arrayDePrimos[i];

                }
                i++;
        }

        System.out.println(1);

    }

    // ejercicio 3

    public static char[] arrayDeChars(String text){

        char[] array = new char[text.length()];
        for (int i = 0; i < array.length; i++) {

            array[i] = text.charAt(i);

        }

        return array;

    }

    public static boolean esDelimitador(int n,char[] array){

        char[] delimitadores = {' ','?','-'};

        for (int i = 0; i < delimitadores.length; i++) {

            if (array[n] == delimitadores[i]){
                return true;
            }

        }

        return false;

    }

    public static int longuitudPalabra(int n,char[] array){

        int contador = 0;

        for (int i = n; i < array.length; i++) {

            if (!(esDelimitador(i,array))){
                contador++;
            } else {
                break;
            }

        }

        return contador;

    }

    public static String palabraDesdeIndex(int n,char[] array){

        String paraula = "";

        for (int i = n; i < (longuitudPalabra(n,array)+n); i++) {

            paraula += array[i];

        }

        return paraula;

    }

    public static String[] Palabras(char[] array){

        int contador = 0;

        for (int i = 0; i < array.length; i++) {

            i += longuitudPalabra(i,array);
            contador++;

        }

        String[] palabras = new String[contador];
        int contadorIndex = 0;

        for (int i = 0; i < array.length; i++) {

            palabras[contadorIndex] = palabraDesdeIndex(i,array);
            i += longuitudPalabra(i,array);
            contadorIndex++;

        }

        return palabras;

    }

    public static String TextSenseSubText(String text, String subtext){

        String[] arrayTextoNormal = Palabras(arrayDeChars(text));
        String[] arraySubText = Palabras(arrayDeChars(subtext));
        boolean[] array = new boolean[arrayTextoNormal.length];
        String Final = "";

        for (int i = 0; i < arraySubText.length; i++) {

            for (int j = 0; j < arrayTextoNormal.length; j++) {

                if (arrayTextoNormal[j].equals(arraySubText[i])){

                    array[j] = true;

                }

            }

        }

        for (int i = 0; i < arrayTextoNormal.length; i++) {

            if (!(array[i])){
                Final += arrayTextoNormal[i] + " ";
            }

        }

        return Final;
    }

}
