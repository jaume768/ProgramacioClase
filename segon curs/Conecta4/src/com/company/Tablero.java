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

    public int getColumnas() {
        return columnas;
    }

    private void inicializarTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = new Casilla(i,j,new Ficha(i,j,0));
            }
        }
    }

    public int ultimaFichaInsertada(int columna){
        int filaUltimaFicha = -1;

        for (int fila = filas - 1; fila >= 0; fila--) {
            if (tablero[fila][columna].getFicha() != null) {
                filaUltimaFicha = fila;
                break;
            }
        }

        return filaUltimaFicha;

    }

    public void imprimirTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tablero[i][j].getFicha().getNumero() == 0) {
                    System.out.print("\u001B[37m|   |"); // Color blanco para fichas vacías
                } else if (tablero[i][j].getFicha().getNumero() == 1) {
                    System.out.print("\u001B[31m| X |"); // Color rojo para fichas del jugador 1
                } else if (tablero[i][j].getFicha().getNumero() == 2) {
                    System.out.print("\u001B[34m| O |"); // Color azul para fichas del jugador 2
                }
            }
            System.out.println(" "); // Restaurar el color blanco al final de la línea
        }

        System.out.print(" ");
        System.out.println("\u001B[0m"); // Restaurar el color predeterminado
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
        int jMin = Math.max(0, columna - 3);
        int jMax = Math.min(columna, columnas - 4);

        for (int j = jMin; j <= jMax; j++) {
            if (tablero[fila][j].getFicha().getNumero() == numero
                    && tablero[fila][j + 1].getFicha().getNumero() == numero
                    && tablero[fila][j + 2].getFicha().getNumero() == numero
                    && tablero[fila][j + 3].getFicha().getNumero() == numero) {
                return true;
            }
        }

        int iMin = Math.max(0, fila - 3);
        int iMax = Math.min(fila, filas - 4);

        for (int i = iMin; i <= iMax; i++) {
            if (tablero[i][columna].getFicha().getNumero() == numero
                    && tablero[i + 1][columna].getFicha().getNumero() == numero
                    && tablero[i + 2][columna].getFicha().getNumero() == numero
                    && tablero[i + 3][columna].getFicha().getNumero() == numero) {
                return true;
            }
        }

        if (columna != 7){
            int iStart = Math.max(3, fila);
            int iEnd = filas - 1;

            for (int i = iStart; i <= iEnd; i++) {
                int j = columna - (fila - i);
                int jMinDiagonal = Math.max(0, j);
                int jMaxDiagonal = Math.min(j + 3, columnas - 1);
                if (jMinDiagonal <= jMaxDiagonal) {
                    if (tablero[i][jMinDiagonal].getFicha().getNumero() == numero
                            && tablero[i - 1][jMinDiagonal + 1].getFicha().getNumero() == numero
                            && tablero[i - 2][jMinDiagonal + 2].getFicha().getNumero() == numero
                            && tablero[i - 3][jMinDiagonal + 3].getFicha().getNumero() == numero) {
                        return true;
                    }
                }
            }

        }

        int iStartReverse = Math.min(fila, filas - 4);
        int iEndReverse = Math.max(3, iStartReverse);

        for (int i = iStartReverse; i >= iEndReverse; i--) {
            int j = columna - (fila - i);
            int jMinDiagonalReverse = Math.max(0, j);
            int jMaxDiagonalReverse = Math.min(j + 3, columnas - 1);
            if (jMinDiagonalReverse <= jMaxDiagonalReverse) {
                if (tablero[i][jMinDiagonalReverse].getFicha().getNumero() == numero
                        && tablero[i + 1][jMinDiagonalReverse + 1].getFicha().getNumero() == numero
                        && tablero[i + 2][jMinDiagonalReverse + 2].getFicha().getNumero() == numero
                        && tablero[i + 3][jMinDiagonalReverse + 3].getFicha().getNumero() == numero) {
                    return true;
                }
            }
        }

        return false;
    }
}
