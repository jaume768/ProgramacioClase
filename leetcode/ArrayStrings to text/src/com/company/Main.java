package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};

        System.out.println(toText(words).length());

        System.out.println(Arrays.toString(arrayText(toText(words))));

    }

    public static String toText(String[] words){

        int len = words.length;
        String palabra = "";

        for (int i = 0; i < words.length; i++) {

            palabra += words[i] + " ";

        }

        return palabra;

    }

    public static String[] arrayText(String frase){

        int max = (frase.length() % 16 == 0) ? frase.length() / 16 : (frase.length() / 16) +1;

        String[] fases = new String[max];
        int contador = 0;
        int maxim = 16;
        int prova = 0;
        int len = 0;

        for (int i = 0; i < fases.length; i++) {

            for (contador = prova; contador < maxim; contador++) {

                fases[i] += (frase.charAt(contador));
                len++;
                if (len == frase.length()){
                    break;
                }
            }
            prova = maxim;
            maxim = maxim * 2;

        }


        return fases;


    }
}
