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

    private void inicializarTablero() {
        colocarFichas(0, 2, 0, 2, "n");
        colocarFichas(5, 7, 5, 7, "b");
    }

    private void colocarFichas(int filaInicio, int filaFin, int columnaInicio, int columnaFin, String color) {
        for (int i = filaInicio; i <= filaFin; i++) {
            for (int j = columnaInicio; j <= columnaFin; j++) {
                tablero[i][j] = new Casilla(i, j, new Peon(i, j, color));
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

    public boolean ganador() {
        if (contarFichasPorColor("b") == 9 || contarFichasPorColor("n") == 9) {
            System.out.println("Gana el equipo " + (contarFichasPorColor("b") == 9 ? "B" : "N"));
            return true;
        }
        return false;
    }

    private int contarFichasPorColor(String color) {
        int contador = 0;

        int filaInicio = (color.equals("b")) ? 0 : 5;
        int filaFin = filaInicio + 2;
        int columnaInicio = (color.equals("b")) ? 0 : 5;
        int columnaFin = columnaInicio + 2;

        for (int i = filaInicio; i <= filaFin; i++) {
            for (int j = columnaInicio; j <= columnaFin; j++) {
                if (tablero[i][j].getFicha() != null && tablero[i][j].getFicha().getColor().equals(color)) {
                    contador++;
                }
            }
        }

        return contador;
    }
}
