package com.company;

public class Juego {

    private Casilla devolverFicha(char tipo,String color, Casilla[][] tablero,int contador){

        int fila = 0;
        int columna = 0;
        int increment = 0;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                if (tablero[i][j].getFicha() != null && tablero[i][j].getFicha().getTipo() == tipo && tablero[i][j].getFicha().getColor().equals(color)){

                    ++increment;
                    if (increment == contador){
                        return tablero[i][j];
                    }

                }

            }

        }

        Casilla casillaRei = new Casilla(fila,columna,tablero[fila][columna].getFicha());

        if (casillaRei.getFicha().getTipo() != tipo){
            casillaRei = null;
        }

        return casillaRei;

    }

    public boolean esJaqueMate(Casilla[][] tablero){

        Casilla casillaReiBlanco = devolverFicha('K',"b",tablero,1);

        Casilla casillaReiNegro = devolverFicha('K',"n",tablero,1);

        return (casillaReiNegro == null || casillaReiBlanco == null);

    }

}
