package Juegos;

import Casillas.Casilla;
import Fichas.DamaChina;
import Fichas.Ficha;
import Tableros.Tablero;

public class DamasChinas extends JuegoAbs implements Juego{

    Casilla[][] tablero = t.getTablero();

    public DamasChinas(Tablero t) {
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
    public boolean hayGanador() {
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

    @Override
    public Casilla getCasilla(int filaOrigen, int columnaOrigen) {
        return tablero[filaOrigen][columnaOrigen];
    }

    @Override
    public String saberJuego() {
        return "damas chinas";
    }

    @Override
    public Casilla[][] getTablero() {
        return t.getTablero();
    }
}
