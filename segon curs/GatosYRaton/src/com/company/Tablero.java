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

        inicializarTablero();

    }

    private void inicializarTablero(){

        // iniciar gato
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0){
                tablero[0][i] = new Casilla(0,i,new Gato(0,i,"G"));
            }
        }

        // iniciar ratón

        tablero[7][4] = new Casilla(7,4,new Raton(7,4,"R"));

    }

    public void ImprimirTablero(){
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                Ficha ficha = tablero[i][j].getFicha();

                if (tablero[i][j].getFicha() != null){

                    if (ficha.getColor().equals("G")){
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
    }

    public Casilla getCasilla(int filaOrigen,int columnaOrigen) {
        return tablero[filaOrigen][columnaOrigen];
    }

    public boolean hayFicha(Casilla casilla){

        return (getCasilla(casilla.getFila(),casilla.getColumna()).getFicha() != null);

    }

    public void moverFicha(Casilla casillaOrigen, Casilla casillaDestino){

        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();
        Ficha fichaOrigen = casillaOrigen.getFicha();

        tablero[filaDestino][columnaDestino] = new Casilla(filaDestino,columnaDestino,fichaOrigen);
        tablero[casillaOrigen.getFila()][casillaOrigen.getColumna()] = new Casilla(casillaOrigen.getFila(),casillaOrigen.getColumna(),null);

    }

}
