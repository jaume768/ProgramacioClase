package com.company;

public class canviarDobleArray {
    public static void main(String[] args) {
        //Escribir un programa que cree una matriz con los caracteres de la ‘a’ a la ‘j’ y
        //a continuaci ́on sustituya todas las vocales que se encuentren en la matriz por el
        //car ́acter @.

        char[] lletres = {'a','b','c','d','e','f','g','h','i','j'};
        char[] vocals = {'a','e','i','o','u'};

        for (int i = 0; i < lletres.length; i++) {

            for (int j = 0; j < vocals.length; j++) {

                if (lletres[i] == vocals[j]){

                    lletres[i] = '@';

                }

            }

        }

        for (int i = 0; i < lletres.length; i++) {

            System.out.print(lletres[i] + " | ");

        }
    }
}
