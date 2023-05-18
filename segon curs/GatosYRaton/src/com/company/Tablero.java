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

    private Casilla devolverRaton(){

        int fila = 0;
        int columna = 0;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                if (tablero[i][j].getFicha() != null && tablero[i][j].getFicha().getTipo() == 'R'){

                    fila = i;
                    columna = j;
                }

            }

        }

        Casilla casillaRaton = new Casilla(fila,columna,tablero[fila][columna].getFicha());

        return casillaRaton;

    }

    public boolean esJaqueMate(){

        Casilla casillaRaton = devolverRaton();
        int fila = casillaRaton.getFila();
        int columna = casillaRaton.getColumna();

        int[] deltaFilas = {-1, -1, 1, 1};
        int[] deltaColumnas = {-1, 1, -1, 1};

        for (int i = 0; i < deltaFilas.length; i++) {

            int nuevaFila = fila + deltaFilas[i];
            int nuevaColumna = columna + deltaColumnas[i];

            if (esPosicionValida(nuevaFila, nuevaColumna)) {

                return false;

            }

        }

        return true;

    }

    private boolean esPosicionValida(int fila, int columna) {
        return fila >= 0 && fila < 8 && columna >= 0 && columna < 8;
    }

}
