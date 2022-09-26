package com.company;
import java.util.Scanner;

public class ArrayBiDimensionsPatro {

    public static void main(String[] args) {

        //Escribir un m ́etodo que construya y devuelva matrices cuadradas de cualquier di-
        //mensi ́on mayor o igual a 1, cuyos elementos sigan el patr ́on mostrado en las matrices
        //de la figura (cada elemento es la suma de sus  ́ındices). La dimensi ́on se pasar ́a como
        //par ́ametro al m ́etodo. El resultados se imprimir ́a en el m ́etodo main.

        // [0][1][2]
        // [1][2][3]
        // [2][3][4]

        // [0][1][2][3][4]
        // [1][2][3][4][5]
        // [2][3][4][5][6]
        // [3][4][5][6][7]
        // [4][5][6][7][8]


        int[][] ArrayBi = new int[5][5];
        RellenarMatriu(ArrayBi);
    }

    public static void RellenarMatriu(int[][] ArrayBi){

        for (int i = 0; i < ArrayBi.length; i++) {

            for (int j = 0; j < ArrayBi.length; j++) {

                ArrayBi[i][j] = i+j;

            }

        }

        for (int i = 0; i < ArrayBi.length; i++) {

            for (int j = 0; j < ArrayBi.length; j++) {

                System.out.print(ArrayBi[i][j] + " | ");

            }

            System.out.println();

        }

    }
}
