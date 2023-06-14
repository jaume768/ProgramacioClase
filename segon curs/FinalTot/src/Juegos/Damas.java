package Juegos;

import Casillas.Casilla;
import Fichas.Dama;
import Fichas.Ficha;

public class Damas implements Juego {

    Casilla[][] tablero = new Casilla[8][8];

    @Override
    public void iniciarJuego() {

        inicializarTablero();

    }

    public void inicializarTablero(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i != 3 && i != 4){
                    if ((i + j) % 2 == 0) {
                        tablero[i][j] = new Casilla(i, j, null);
                    } else {
                        tablero[i][j] = new Casilla(i, j, new Dama(i,j,(i < 3) ? "n" : "b"));
                    }
                } else {
                    tablero[i][j] = new Casilla(i, j, null);
                }

            }
        }
    }

    @Override
    public void jugar() {

    }

    @Override
    public boolean hayGanador(Casilla[][] tablero) {
        return false;
    }

    @Override
    public void imprimirTablero() {

        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                Ficha ficha = tablero[i][j].getFicha();

                if (tablero[i][j].getFicha() == null){
                    System.out.print("[ ]");
                } else if (ficha.getColor().equals("n")){
                    System.out.print("[" + ANSI_RED + ficha.getTipo() + ANSI_RESET +"]");
                } else {
                    System.out.print("[" + ficha.getTipo()  +"]");
                }

            }

            System.out.println();

        }

    }

    @Override
    public void moverFicha(Casilla casillaOrigen, Casilla casillaDestino) {

        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();
        int filaOrigen = casillaOrigen.getFila();
        int columnaOrigen = casillaOrigen.getColumna();
        Ficha fichaOrigen = casillaOrigen.getFicha();


        if ((filaDestino - filaOrigen) == 2 && (columnaDestino - columnaOrigen) == 2
                || (columnaDestino-columnaOrigen) == -2
                || (filaDestino - filaOrigen) == -2){
            int fila = 0;
            int colum = 0;

            if ((filaDestino - filaOrigen) == 2 && (columnaDestino - columnaOrigen) == 2){
                fila = (filaDestino - 1);
                colum = (columnaDestino - 1 );
            }

            if ((columnaDestino-columnaOrigen) == -2){
                fila = (filaDestino - 1);
                colum = (columnaDestino + 1);
            }

            if ((filaDestino - filaOrigen) == -2){
                fila = (filaDestino + 1);
                colum = (columnaDestino - 1);
            }

            if (tablero[fila][colum].getFicha() != null){

                tablero[fila][colum] = new Casilla(fila,colum,null);
            }

        }


        tablero[filaDestino][columnaDestino] = new Casilla(filaDestino,columnaDestino,fichaOrigen);
        tablero[casillaOrigen.getFila()][casillaOrigen.getColumna()] = new Casilla(casillaOrigen.getFila(),casillaOrigen.getColumna(),null);


    }

    @Override
    public Casilla getCasilla(int filaOrigen, int columnaOrigen) {
        return tablero[filaOrigen][columnaOrigen];
    }

    @Override
    public Casilla[][] getTablero() {
        return tablero;
    }
}
