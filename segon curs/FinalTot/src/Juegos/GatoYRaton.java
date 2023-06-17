package Juegos;

import Casillas.Casilla;
import Fichas.Ficha;
import Fichas.Gato;
import Fichas.Raton;
import Tableros.Tablero;

public class GatoYRaton extends JuegoAbs implements Juego{

    Casilla[][] tablero = t.getTablero();

    public GatoYRaton(Tablero t) {
        super(t);
    }

    @Override
    public void iniciarJuego() {

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

    @Override
    public void jugar() {

        System.out.println(esJaqueMate());

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
        Ficha fichaOrigen = casillaOrigen.getFicha();

        tablero[filaDestino][columnaDestino] = new Casilla(filaDestino,columnaDestino,fichaOrigen);
        tablero[casillaOrigen.getFila()][casillaOrigen.getColumna()] = new Casilla(casillaOrigen.getFila(),casillaOrigen.getColumna(),null);

    }

    public boolean esJaqueMate(){

        Casilla casillaRaton = devolverRaton();
        int fila = casillaRaton.getFila();
        int columna = casillaRaton.getColumna();

        int[] poisblesFiles = {-1, -1, 1, 1};
        int[] posiblesColumnes = {-1, 1, -1, 1};

        for (int i = 0; i < poisblesFiles.length; i++) {

            int nuevaFila = fila + poisblesFiles[i];
            int nuevaColumna = columna + posiblesColumnes[i];

            if (esPosicionValida(nuevaFila, nuevaColumna)) {

                return false;

            }

        }

        return true;

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

        return new Casilla(fila,columna,tablero[fila][columna].getFicha());

    }

    private boolean esPosicionValida(int fila, int columna) {

        if (fila >= 0 && fila < 8 && columna >= 0 && columna < 8){

            Ficha ficha = tablero[fila][columna].getFicha();

            return ficha == null;
        }

        return false;
    }

    @Override
    public Casilla getCasilla(int filaOrigen, int columnaOrigen) {
        return tablero[filaOrigen][columnaOrigen];
    }

    @Override
    public String saberJuego() {
        return "gato y raton";
    }

    @Override
    public Casilla[][] getTablero() {
        return t.getTablero();
    }
}
