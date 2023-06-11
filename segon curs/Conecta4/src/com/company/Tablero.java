package com.company;

public class Tablero {

    private int filas;
    private int columnas;
    private Casilla[][] tablero;

    public Tablero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        tablero = new Casilla[filas][columnas];
        inicializarTablero();
    }

    private void inicializarTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = new Casilla(i,j,new Ficha(i,j,0));
            }
        }
    }

    public void imprimirTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (tablero[i][j].getFicha().getNumero() == 0){
                    System.out.print("|   ");
                } else {
                    System.out.print("| " + tablero[i][j].getFicha().getNumero() + " ");
                }
            }
            System.out.println("|");
        }

        System.out.print(" ");

        for (int j = 0; j < columnas; j++) {
            System.out.print("===");
        }
        System.out.println();
    }

    public boolean insertarFicha(int columna, int numero) {
        if (columna < 0 || columna >= columnas) {
            return false;
        }

        for (int i = filas - 1; i >= 0; i--) {
            if (tablero[i][columna].getFicha().getNumero() == 0) {
                tablero[i][columna] = new Casilla(i,columna,new Ficha(i,columna,numero));
                return true;
            }
        }

        return false;
    }

    public boolean tableroLleno() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tablero[i][j].getFicha().getNumero() == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hayGanador(int fila, int columna,int numero) {
        int jMinRow = columna - 3 < 0 ? 0 : columna - 3;
        int jMaxRow = columna > columnas - 4 ? columnas - 4 : columna;
        for (int j = jMinRow; j <= jMaxRow; j++) {
            if (tablero[fila][j].getFicha().getNumero() == numero
                    && tablero[fila][j + 1].getFicha().getNumero() == numero
                    && tablero[fila][j + 2].getFicha().getNumero() == numero
                    && tablero[fila][j + 3].getFicha().getNumero() == numero) {
                return true;
            }
        }

        int iMinColumn = fila - 3 < 0 ? 0 : fila - 3;
        int iMaxColumn = fila > filas - 4 ? filas - 4 : fila;
        for (int i = iMinColumn; i <= iMaxColumn; i++) {
            if (tablero[i][columna].getFicha().getNumero() == numero
                    && tablero[i + 1][columna].getFicha().getNumero() == numero
                    && tablero[i + 2][columna].getFicha().getNumero() == numero
                    && tablero[i + 3][columna].getFicha().getNumero() == numero) {
                return true;
            }
        }

        int iStartDiagonalUp = fila - 3 < 0 ? 0 : fila - 3;
        int iEndDiagonalUp = fila;
        int jStartDiagonalUp = columna - (fila - iStartDiagonalUp);
        int jEndDiagonalUp = columna - (fila - iEndDiagonalUp);
        jStartDiagonalUp = jStartDiagonalUp < 0 ? 0 : jStartDiagonalUp;
        jEndDiagonalUp = jEndDiagonalUp > columnas - 4 ? columnas - 4 : jEndDiagonalUp;
        for (int i = iStartDiagonalUp; i <= iEndDiagonalUp; i++) {
            int j = columna - (fila - i);
            if (j >= 0 && j <= columnas - 4) {
                if (tablero[i][j].getFicha().getNumero() == numero
                        && tablero[i - 1][j + 1].getFicha().getNumero() == numero
                        && tablero[i - 2][j + 2].getFicha().getNumero() == numero
                        && tablero[i - 3][j + 3].getFicha().getNumero() == numero) {
                    return true;
                }
            }
        }

        int iStartDiagonalDown = fila;
        int iEndDiagonalDown = fila + 3;
        int jStartDiagonalDown = columna - (iStartDiagonalDown - fila);
        int jEndDiagonalDown = columna - (iEndDiagonalDown - fila);
        jStartDiagonalDown = jStartDiagonalDown < 0 ? 0 : jStartDiagonalDown;
        jEndDiagonalDown = jEndDiagonalDown > columnas - 4 ? columnas - 4 : jEndDiagonalDown;
        for (int i = iStartDiagonalDown; i <= iEndDiagonalDown; i++) {
            int j = columna - (i - fila);
            if (j >= 0 && j <= columnas - 4) {
                if (tablero[i][j].getFicha().getNumero() == numero
                        && tablero[i + 1][j + 1].getFicha().getNumero() == numero
                        && tablero[i + 2][j + 2].getFicha().getNumero() == numero
                        && tablero[i + 3][j + 3].getFicha().getNumero() == numero) {
                    return true;
                }
            }
        }

        return false;

}
