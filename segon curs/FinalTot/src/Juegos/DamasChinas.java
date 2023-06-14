package Juegos;

import Casillas.Casilla;
import Fichas.DamaChina;
import Fichas.Ficha;

public class DamasChinas implements Juego{

    Casilla[][] tablero = new Casilla[8][8];

    @Override
    public void iniciarJuego() {

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
                tablero[i][j] = new Casilla(i, j, new DamaChina(i, j, color));
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
        Ficha fichaOrigen = casillaOrigen.getFicha();

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

    @Override
    public String saberJuego() {
        return "damas chinas";
    }
}
