package com.company;
import java.util.Scanner;

public class ArrayBiConNumAleatorios {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] Matriz = new int[9][9];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {

                Matriz[i][j] = (int)Math.floor(Math.random()*10);

            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < Matriz.length; j++) {

                System.out.print(Matriz[i][j] + " ");

            }

            System.out.println();

        }

    }
}
