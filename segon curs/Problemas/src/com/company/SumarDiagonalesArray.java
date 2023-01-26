package com.company;
import java.util.Scanner;

public class SumarDiagonalesArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] Array = new int[2][2];
        Array = RellenarArray(Array);

        System.out.println(SumarColumnes(1,Array));

    }

    public static int[][] RellenarArray(int[][] Array){

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[0].length; j++) {

                System.out.println("Dime el valor de la posición " + i + " " + j + ": ");
                Array[i][j] = sc.nextInt();

            }

        }

        return Array;

    }

    public static int SumarFiles(int Fila,int[][] Array){

        int Suma = 0;

        for (int i = 0; i < Array.length; i++) {

            Suma += Array[Fila][i];

        }

        return Suma;

    }

    public static int SumarColumnes(int Columna,int[][] Array){

        int Suma = 0;

        for (int i = 0; i < Array.length; i++) {

            Suma += Array[i][Columna];

        }

        return Suma;

    }



}
