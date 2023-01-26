package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class telefono {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        char[][] telefono = {{'ñ'},{'a','b','c'},{'d','e','f'},
                            {'g','h','i'},{'j','k','l'},{'m','n','o'},
                            {'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

        String digito = leer.nextLine();
        if (digito.length() < 2){
            System.out.println(Arrays.toString(letrasPorNumero(Integer.parseInt(digito),telefono)));
        } else {
            System.out.println(Arrays.toString(CombinacionesNumeros(digito,telefono)));
        }

    }

    public static char[] letrasPorNumero(int numero,char[][] telefono){

        int contador = 0;

        for (int i = 0; i < telefono[numero-1].length; i++) {

            contador++;

        }

        char[] letras = new char[contador];

        for (int i = 0; i < telefono[numero-1].length; i++) {

            letras[i] = telefono[numero-1][i];

        }

        return letras;

    }

    public static String[] CombinacionesNumeros(String digito,char[][] telefono){

        int PrimerNumero = Character.getNumericValue(digito.charAt(0))-1;
        int segundoNumero = Character.getNumericValue(digito.charAt(1))-1;
        String[] combinaciones = new String[telefono[PrimerNumero].length * telefono[segundoNumero].length];
        String suma = "";

        int contador1 = 0;
        int contador2 = 0;
        int combinacions = 0;

        for (int i = 0; i < combinaciones.length; i++) {

            for (int j = 0; j < telefono[PrimerNumero].length; j++) {

                char lletra1 = telefono[PrimerNumero][contador2];
                char lletra2 = telefono[segundoNumero][contador1];
                suma = Character.toString(lletra1) + Character.toString(lletra2);
                combinaciones[combinacions] = suma;
                contador1++;
                combinacions++;

            }

            contador1 = 0;
            contador2++;
            if (contador2 == telefono[PrimerNumero].length)
                break;

        }

        return combinaciones;
    }

    public static void imprimir(char[][] telefono){

        int contador = 1;
        for (int i = 0; i < telefono.length; i++) {
            System.out.print(" ");

            for (int j = 0; j < telefono[i].length; j++) {

                System.out.print(telefono[i][j]);

            }

            if (contador % 3 == 0)
                System.out.println();

            contador++;

        }

    }

}
