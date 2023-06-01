package com.company;

public class Juego {

    private Casilla devolverRei(char tipo,String color, Casilla[][] tablero){

        int fila = 0;
        int columna = 0;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                if (tablero[i][j].getFicha() != null && tablero[i][j].getFicha().getTipo() == tipo && tablero[i][j].getFicha().getColor().equals(color)){

                    fila = i;
                    columna = j;
                }

            }

        }

        Casilla casillaRei = new Casilla(fila,columna,tablero[fila][columna].getFicha());

        if (casillaRei.getFicha().getTipo() != 'K'){
            casillaRei = null;
        }

        return casillaRei;

    }

    public boolean esJaqueMate(Casilla[][] tablero){

        Casilla casillaRei = devolverRei('K',"b",tablero);
        int fila = casillaRei.getFila();
        int columna = casillaRei.getColumna();

        int[] poisblesFiles = {-1, -1, -1, 0, 0, 1, 1, 1, 0};
        int[] posiblesColumnes = {-1, 0, 1, -1, 1, -1, 0, 1, 0};

        for (int i = 0; i < poisblesFiles.length; i++) {

            int nuevaFila = fila + poisblesFiles[i];
            int nuevaColumna = columna + posiblesColumnes[i];

            if (esPosicionValida(nuevaFila, nuevaColumna,tablero)) {

                // anar ficha per ficha contraria, mirant si despres de fer el moviment a la fila i a la columna, el rei segueix viu

            }

        }

        return true;

    }

    private boolean esPosicionValida(int fila, int columna,Casilla[][] tablero) {

        Ficha ficha = null;

        if (fila >= 0 && fila < 8 && columna >= 0 && columna < 8 ){
            ficha = tablero[fila][columna].getFicha();
        }

        return fila >= 0 && fila < 8 && columna >= 0 && columna < 8 && ficha == null;
    }

}
