package com.company;

public class Tablero {

    private Casilla[][] tablero;

    public Tablero(){

        tablero = new Casilla[8][8];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                tablero[i][j] = new Casilla(i,j,null);

            }

        }

        incializarTablero();

    }

    private void incializarTablero(){

        // Peons negres
        for (int i = 0; i < 8; i++) {
            tablero[1][i] = new Casilla(1,i,new Peon(1,i,"n"));
        }

        // Peons blancs

        for (int i = 0; i < 8; i++) {
            tablero[6][i] = new Casilla(6,i,new Peon(6,i,"b"));
        }


        tablero[0][0] = new Casilla(0,0,new Torre(0,0,"n"));
        tablero[0][7] = new Casilla(0,7,new Torre(0,7,"n"));

        // Inicializar torres blancas
        tablero[7][0] = new Casilla(7,0,new Torre(7,0,"b"));
        tablero[7][7] = new Casilla(7,7,new Torre(7,7,"b"));


        // Inicializar caballos negros
        tablero[0][1] = new Casilla(0,1,new Caballo(0,1,"n"));
        tablero[0][6] = new Casilla(0,6,new Caballo(0,6,"n"));


        // Inicializar caballos blancos
        tablero[7][1] = new Casilla(7,1,new Caballo(7,1,"b"));
        tablero[7][6] = new Casilla(7,6,new Caballo(7,6,"b"));


        // Inicializar alfiles negros
        tablero[0][2] = new Casilla(0,2,new Alfil(0,2,"n"));
        tablero[0][5] = new Casilla(0,5,new Alfil(0,5,"n"));

        // Inicializar alfiles blancos
        tablero[7][2] = new Casilla(7,2,new Alfil(7,2,"b"));
        tablero[7][5] = new Casilla(7,5,new Alfil(7,5,"b"));


        // Inicializar reina negra
        tablero[0][3] = new Casilla(0,3,new Reina(0,3,"n"));

        // Inicializar reina blanca
        tablero[7][3] = new Casilla(7,3,new Reina(7,3,"b"));


        // Inicializar rey negro
        tablero[0][4] = new Casilla(0,4,new Rei(0,4,"n"));

        // Inicializar rey blanco
        tablero[7][4] = new Casilla(7,4,new Rei(7,4,"b"));

    }

    public void ImprimirTablero(){

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                Ficha ficha = tablero[i][j].getFicha();

                if (tablero[i][j].getFicha() != null){
                    System.out.print("[" + ficha.getTipo() + "]");
                } else {
                    System.out.print("[ ]");
                }

            }

            System.out.println();

        }


    }

}
