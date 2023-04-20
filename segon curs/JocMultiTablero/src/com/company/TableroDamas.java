package com.company;

public class TableroDamas extends Tablero{

    public TableroDamas(){
        this.casillas = new Pieza[8][8];
    }

    @Override
    public void moverPieza(Pieza pieza, int filaDestino, int columnaDestino) {

    }

    @Override
    public boolean esEmpate() {
        return false;
    }

    public void rellenarTablero(){

        int contador = 0;

        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas.length; j++) {

                if (contador % 2 == 0){
                    casillas[i][j] = new PiezaDamas(i,j);
                }

                contador++;

            }

        }
    }

    public void ImprimirTablero(){

        PiezaDamas com = new PiezaDamas(0,0);

        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas.length; j++) {

                if (com.hayPieza()){
                    System.out.print("[O]");
                } else {
                    System.out.print("[] ");
                }


            }

            System.out.println();

        }

    }
}
