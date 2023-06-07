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

        // Colocar las fichas en la parte inferior izquierda del tablero
        int filaInicio = 0;
        int filaFin = 2;
        int columnaInicio = 0;
        int columnaFin = 2;

        for (int i = filaInicio; i <= filaFin; i++) {
            for (int j = columnaInicio; j <= columnaFin; j++) {
                tablero[i][j] = new Casilla(i,j,new Peon(i,j,"n"));
            }
        }

        // Colocar las fichas en la parte superior derecha del tablero
        filaInicio = 5;
        filaFin = 7;
        columnaInicio = 5;
        columnaFin = 7;

        for (int i = filaInicio; i <= filaFin; i++) {
            for (int j = columnaInicio; j <= columnaFin; j++) {
                tablero[i][j] = new Casilla(i,j,new Peon(i,j,"b"));
            }
        }

    }

    public void moverFicha(Casilla casillaOrigen, Casilla casillaDestino) {

        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();
        Ficha fichaOrigen = casillaOrigen.getFicha();

        // Si es válido, actualiza la posición de la ficha en el tablero
        tablero[filaDestino][columnaDestino] = new Casilla(filaDestino,columnaDestino,fichaOrigen);
        tablero[casillaOrigen.getFila()][casillaOrigen.getColumna()] = new Casilla(casillaOrigen.getFila(),casillaOrigen.getColumna(),null);

    }

    public void ImprimirTablero(){

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


    }

    public Casilla getCasilla(int filaOrigen,int columnaOrigen) {
        return tablero[filaOrigen][columnaOrigen];
    }

    public boolean hayFicha(Casilla casilla){

        return (getCasilla(casilla.getFila(),casilla.getColumna()).getFicha() != null);

    }

    public boolean ganador(){

        int contador = 0;

        int filaInicio = 0;
        int filaFin = 2;
        int columnaInicio = 0;
        int columnaFin = 2;

        for (int i = filaInicio; i <= filaFin; i++) {
            for (int j = columnaInicio; j <= columnaFin; j++) {

                if (tablero[i][j].getFicha() != null && tablero[i][j].getFicha().getColor().equals("b")) {
                    contador += 1;
                }

            }
        }

        if (contador == 9){
            System.out.println("Gana el equipo B");
            return true;
        } else {
            contador = 0;
        }

        filaInicio = 5;
        filaFin = 7;
        columnaInicio = 5;
        columnaFin = 7;

        for (int i = filaInicio; i <= filaFin; i++) {
            for (int j = columnaInicio; j <= columnaFin; j++) {
                if ( tablero[i][j].getFicha() != null && tablero[i][j].getFicha().getColor().equals("n")){
                    contador += 1;
                }
            }
        }

        if (contador == 9){
            System.out.println("Gana el equipo N");
            return true;
        }

        return false;

    }
}
