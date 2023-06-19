package Juegos;
import Casillas.Casilla;
import Fichas.*;
import Tableros.Tablero;

public class Ajedrez extends JuegoAbs implements Juego  {

    Casilla[][] tablero = t.getTablero();

    public Ajedrez(Tablero t) {
        super(t);
    }

    @Override
    public void iniciarJuego() {

        inicializarTablero();
        t.imprimirTablero();
    }

    public void imprimirTablero(){
        t.imprimirTablero();
    }


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

    @Override
    public boolean hayGanador() {
        Casilla casillaReiBlanco = devolverFicha('K',"b",tablero,1);

        Casilla casillaReiNegro = devolverFicha('K',"n",tablero,1);

        return (casillaReiNegro == null || casillaReiBlanco == null);
    }

    public void moverFicha(Casilla casillaOrigen, Casilla casillaDestino) {

        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();
        Ficha fichaOrigen = casillaOrigen.getFicha();

        Ficha ficha = casillaOrigen.getFicha();
        char peon = 'P';

        if (ficha.getTipo() == peon && filaDestino == 0 && ficha.getColor().equals("b")){
            tablero[filaDestino][columnaDestino] = new Casilla(filaDestino,columnaDestino,new Reina(filaDestino,columnaDestino,"b"));
            tablero[casillaOrigen.getFila()][casillaOrigen.getColumna()] = new Casilla(casillaOrigen.getFila(),casillaOrigen.getColumna(),null);
        } else if (ficha.getTipo() == peon && filaDestino == 7 && ficha.getColor().equals("n")){
            tablero[filaDestino][columnaDestino] = new Casilla(filaDestino,columnaDestino,new Reina(filaDestino,columnaDestino,"n"));
            tablero[casillaOrigen.getFila()][casillaOrigen.getColumna()] = new Casilla(casillaOrigen.getFila(),casillaOrigen.getColumna(),null);
        } else {
            tablero[filaDestino][columnaDestino] = new Casilla(filaDestino,columnaDestino,fichaOrigen);
            tablero[casillaOrigen.getFila()][casillaOrigen.getColumna()] = new Casilla(casillaOrigen.getFila(),casillaOrigen.getColumna(),null);
        }

    }

    @Override
    public Casilla getCasilla(int filaOrigen, int columnaOrigen) {
        return tablero[filaOrigen][columnaOrigen];
    }

    @Override
    public String saberJuego() {
        return "ajedrez";
    }

    @Override
    public Casilla[][] getTablero() {
        return t.getTablero();
    }

    public void inicializarTablero() {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                tablero[i][j] = new Casilla(i,j,null);

            }

        }

        // Peons negres
        for (int i = 0; i < 8; i++) {
            tablero[1][i] = new Casilla(1,i,new Peon(1,i,"n"));
        }

        // Peons blancs

        for (int i = 0; i < 8; i++) {
            tablero[6][i] = new Casilla(6,i,new Peon(6,i,"b"));
        }


        tablero[0][0] = new Casilla(0,0,new Torre(0,0,"n"));
        tablero[0][7] = new Casilla(0,7,new Torre(0,7,"n"));

        // Inicializar torres blancas
        tablero[7][0] = new Casilla(7,0,new Torre(7,0,"b"));
        tablero[7][7] = new Casilla(7,7,new Torre(7,7,"b"));


        // Inicializar caballos negros
        tablero[0][1] = new Casilla(0,1,new Caballo(0,1,"n"));
        tablero[0][6] = new Casilla(0,6,new Caballo(0,6,"n"));


        // Inicializar caballos blancos
        tablero[7][1] = new Casilla(7,1,new Caballo(7,1,"b"));
        tablero[7][6] = new Casilla(7,6,new Caballo(7,6,"b"));


        // Inicializar alfiles negros
        tablero[0][2] = new Casilla(0,2,new Alfil(0,2,"n"));
        tablero[0][5] = new Casilla(0,5,new Alfil(0,5,"n"));

        // Inicializar alfiles blancos
        tablero[7][2] = new Casilla(7,2,new Alfil(7,2,"b"));
        tablero[7][5] = new Casilla(7,5,new Alfil(7,5,"b"));


        // Inicializar reina negra
        tablero[0][3] = new Casilla(0,3,new Reina(0,3,"n"));

        // Inicializar reina blanca
        tablero[7][3] = new Casilla(7,3,new Reina(7,3,"b"));


        // Inicializar rey negro
        tablero[0][4] = new Casilla(0,4,new Rei(0,4,"n"));

        // Inicializar rey blanco
        tablero[7][4] = new Casilla(7,4,new Rei(7,4,"b"));

    }
}
