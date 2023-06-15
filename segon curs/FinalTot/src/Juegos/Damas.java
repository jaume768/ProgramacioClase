package Juegos;

import Casillas.Casilla;
import Fichas.Dama;
import Fichas.Ficha;
import Tableros.Tablero;

public class Damas extends JuegoAbs implements Juego {

    Casilla[][] tablero = t.getTablero();

    public Damas(Tablero t) {
        super(t);
    }

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
    public boolean hayGanador() {
        return false;
    }

    @Override
    public void imprimirTablero() {
        t.imprimirTablero();
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
    public String saberJuego() {
        return "damas";
    }
}
