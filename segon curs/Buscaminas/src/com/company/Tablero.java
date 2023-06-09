package com.company;

import java.util.Random;

public class Tablero {

    private Casilla[][] tablero;

    public Tablero(){

        tablero = new Casilla[8][8];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                tablero[i][j] = new Casilla(i,j,null,true,false);

            }

        }

        inicializarTablero();

    }

    private void inicializarTablero(){

        Random random = new Random();

        int numeroDeMinas = 10;

        // inicialitzar mines amb les fiches adjacents
        for (int i = 0; i < numeroDeMinas; i++) {

            int filaRandom = random.nextInt(7)+1;
            int columnaRandom = random.nextInt(7)+1;

            tablero[filaRandom][columnaRandom] = new Casilla(filaRandom,columnaRandom,new Ficha(filaRandom,columnaRandom,9),true,false);

            for (int fila = filaRandom - 1; fila <= filaRandom + 1; fila++) {
                for (int columna = columnaRandom - 1; columna <= columnaRandom + 1; columna++) {

                    // mirar que esta en rango
                    if (fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero[0].length) {
                        if (!(fila == filaRandom && columna == columnaRandom)) {

                            if (tablero[fila][columna].getFicha() == null) {
                                tablero[fila][columna] = new Casilla(fila,columna,new Ficha(fila, columna, 1),true,false);
                            } else {
                                Ficha ficha = tablero[fila][columna].getFicha();
                                if (ficha.getNumero() != 9) {
                                    ficha.setNumero(ficha.getNumero() + 1);
                                }
                            }
                        }
                    }
                }
            }

        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                if (tablero[i][j].getFicha() == null){
                    tablero[i][j] = new Casilla(i,j,new Ficha(i,j,0),true,false);
                }

            }

        }


    }

    public void imprimirTablero(){

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                Ficha ficha = tablero[i][j].getFicha();

                if (!tablero[i][j].isDestapada()){
                    if (ficha != null){

                        int numero = ficha.getNumero();
                        switch (numero) {

                            case 0:
                                System.out.print("[" + numero + "]");
                                break;
                            case 1:
                                System.out.print("\u001B[34m[" + numero + "]\u001B[0m"); // Azul número 1
                                break;
                            case 2:
                                System.out.print("\u001B[32m[" + numero + "]\u001B[0m"); // Verde número 2
                                break;
                            case 3:
                                System.out.print("\u001B[33m[" + numero + "]\u001B[0m"); // Amarillo número 3
                                break;
                            case 9:
                                System.out.print("\u001B[31m[X]\u001B[0m");
                                break;
                            default:
                                System.out.print("\u001B[31m[" + numero + "]\u001B[0m"); // Rojo número 4 o más
                                break;
                        }
                    } else {
                        System.out.print("[ ]");
                    }
                } else if (tablero[i][j].isBandera()){
                    System.out.print("[B]");
                } else {
                    System.out.print("[ ]");
                }


            }

            System.out.println();

        }

    }

    public void destaparFicha(int fila, int columna) {
        if (fila <= -1 || fila >= tablero.length || columna <= -1 || columna >= tablero[0].length) {
            return;
        }

        Casilla casilla = tablero[fila][columna];
        if (!casilla.isDestapada()) {
            return;
        }

        Ficha ficha = casilla.getFicha();
        casilla.setDestapada(false);

        if (ficha != null && ficha.getNumero() == 0) {
            for (int i = fila - 1; i <= fila + 1; i++) {
                for (int j = columna - 1; j <= columna + 1; j++) {
                    destaparFicha(i, j);
                }
            }
        }
    }

    public void ponerBandera(int fila, int columna){
        tablero[fila][columna].setBandera(true);
    }

    public boolean bombaExplotada(int fila, int columna){

        return !tablero[fila][columna].isDestapada() && tablero[fila][columna].getFicha().getNumero() == 9;
    }

    public boolean ganador(){

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                if (tablero[i][j].getFicha().getNumero() == 9 && !tablero[i][j].isBandera()){
                    return false;
                }

            }

        }

        return true;

    }
}
