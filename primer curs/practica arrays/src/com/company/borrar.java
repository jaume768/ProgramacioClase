package com.company;

public class borrar {
    public static void main(String[] args) {

        String[][] tauler = new String[5][5];

        for (int i = 0; i < tauler.length; i++) {

            for (int j = 0; j < tauler.length; j++) {

                if (tauler[i][j] == null){
                    tauler[i][j] = " ";
                }

            }

        }

        tauler[1][1] = "O";

        for (int i = 0; i < tauler.length; i++) {

            System.out.println(" | ");

            for (int j = 0; j < tauler.length; j++) {

                System.out.print(tauler[i][j] + "|");
            }

        }
    }
}
