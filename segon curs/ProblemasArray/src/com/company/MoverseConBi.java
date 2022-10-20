package com.company;

public class MoverseConBi {

    public static void main(String[] args) {

        int Files = 5;
        int Columnes = 10;

        int[][] Array = new int[Files][Columnes];

        // i = files, j = columnes
        for (int i = 0; i < Array.length; i++) {

            for (int j = 0; j < Array[0].length; j++) {

                System.out.print((j+1) + " ");

            }

            System.out.println();

        }

    }
}
