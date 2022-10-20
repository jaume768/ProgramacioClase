package com.company;
import java.util.Scanner;

public class SumarArrays {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Dime el tamaño");
        int Tamanyo = sc.nextInt();

        // Resultado de sumar 2 Arrays rellenadas por el usuario
        int[][] ResultadoFinal = Sumar(Tamanyo);

        ImprimirArray(ResultadoFinal);

    }

    public static int[][] RellenarArrays(int[][] Array){

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {

                System.out.println("Dime el valor de la posición " + i + " " + j + ": ");
                Array[i][j] = sc.nextInt();

            }

        }

        return Array;

    }

    public static int[][] Sumar(int Tamanyo){

        int[][] Array1 = new int[Tamanyo][Tamanyo];
        int[][] Array2 = new int[Tamanyo][Tamanyo];

        int[][] Suma = new int[Tamanyo][Tamanyo];

        System.out.println("Rellena la Array numero 1: ");

        Array1 = RellenarArrays(Array1);

        System.out.println("Rellena la Array numero 2: ");

        Array2 = RellenarArrays(Array2);

        for (int i = 0; i < Suma.length; i++) {
            for (int j = 0; j < Suma[0].length; j++) {

                Suma[i][j] = Array1[i][j] + Array2[i][j];

            }

        }

        return Suma;

    }

    public static void ImprimirArray(int[][] Array){

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[0].length; j++) {

                System.out.print(Array[i][j] + " ");

            }

            System.out.println();

        }

    }

}
