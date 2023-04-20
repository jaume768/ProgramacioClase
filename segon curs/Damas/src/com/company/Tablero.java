package com.company;

public class Tablero {

    private Casilla[][] tablero;

    public Tablero(){
        tablero = new Casilla[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i != 3 && i != 4){
                    if ((i + j) % 2 == 0) {
                        tablero[i][j] = new Casilla(i, j, null);
                    } else {
                        tablero[i][j] = new Casilla(i, j, new Ficha(i,j,(i < 3) ? "n" : "b"));
                    }
                } else {
                    tablero[i][j] = new Casilla(i, j, null);
                }

            }
        }
    }

    public void ImprimirTablero() {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                Ficha ficha = tablero[i][j].getFicha();

                if (tablero[i][j].getFicha() == null){
                    System.out.print("[ ] ");
                } else {
                    System.out.print("[" + ficha.getColor() + "] ");
                }

            }

            System.out.println();

        }

    }
}
