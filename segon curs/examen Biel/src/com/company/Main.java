package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(eliminarPalindromos("ana esta ama"));

    }

    public static void descomposicioFactorial(int n) {

        int contador = 2;

        while (n != 0) {

            if (n % contador == 0) {
                System.out.println(n + "|" + contador);
                n = (n / contador) != 1 ? n / contador : 0;
            } else {
                contador++;
            }
        }

        System.out.println(1);
    }

    public static String eliminarPalindromos(String cadena) {
        StringBuilder resultado = new StringBuilder();
        StringBuilder palabra = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (Character.isLetter(c)) {
                palabra.append(c);
            } else {
                if (palabra.length() == 0 || !esPalindromo(palabra)) {
                    resultado.append(palabra);
                }

                resultado.append(c);

                palabra.setLength(0);
            }
        }

        if (palabra.length() == 0 || !esPalindromo(palabra)) {
            resultado.append(palabra);
        }

        return resultado.toString();
    }

    private static boolean esPalindromo(StringBuilder palabra) {
        int longitud = palabra.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
