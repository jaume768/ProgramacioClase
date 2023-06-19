package Tableros;

import Casillas.Casilla;
import Fichas.Ficha;

public class Tablero {

    Casilla[][] tablero = new Casilla[8][8];

    public void imprimirTablero() {

        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                Ficha ficha = tablero[i][j].getFicha();

                if (tablero[i][j].getFicha() != null){

                    if (ficha.getColor().equals("n")){
                        System.out.print("[" + ANSI_RED + ficha.getTipo() + ANSI_RESET +"]");
                    } else {
                        System.out.print("[" + ficha.getTipo()  +"]");
                    }


                } else {
                    System.out.print("[ ]");
                }

            }

            System.out.println();

        }


        System.out.println();

    }

    public Casilla[][] getTablero() {
        return tablero;
    }
}
