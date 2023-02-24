package com.company;

import java.util.Arrays;

public class Tauler {

    private Lletra[][] lletres;
    private final int Files = 10;
    private final int Columnes = 10;
    private Paraula[] paraules;

    public Tauler(){

        this.lletres = new Lletra[Files][Columnes];
        this.paraules = new Paraula[] {
                new Paraula("ESCOLA"),
                new Paraula("BIBLIOTECA"),
                new Paraula("ESTUDIS"),
                new Paraula("AULA"),
                new Paraula("FUTUR")
        };

        for (int i = 0; i < lletres.length; i++) {
            for (int j = 0; j < lletres.length; j++) {

                lletres[i][j] = new Lletra('X');

            }

        }

        this.ordenarParaules();
        this.inserir();

    }

    private void ordenarParaules(){

        for (int i = 0; i < paraules.length - 1; i++) {
            for (int j = 0; j < paraules.length - i - 1; j++) {
                if (paraules[j].getLletres().length < paraules[j + 1].getLletres().length) {
                    Paraula aux = paraules[j + 1];
                    paraules[j + 1] = paraules[j];
                    paraules[j] = aux;
                }
            }
        }

    }

    public void inserir(){

        int contadorParaules = 0;

        for (int i = 0; i < 5; i++) {

            String paraula = paraules[contadorParaules].TornarParaula();

            int RandomFila = 0;
            int RandomColumna = 0;
            boolean sePot = false;

            while (!sePot){
                RandomFila = NumRandom(lletres.length, 0);
                RandomColumna = NumRandom(lletres.length, 0);
                sePot = esPotInserir(paraula,RandomFila,RandomColumna);
            }

            int NumRandomPerPosicionarParaules = NumRandom(3, 1);
            int prova = NumRandom(2, 1);

            if (prova == 2){

                paraula = InvertirParaula(paraula);

            }

            if (NumRandomPerPosicionarParaules == 1){
                int tam_filas = lletres.length;
                int tam_columnas = lletres[0].length;
                if (calcularTamDiagonal(RandomFila,RandomColumna,tam_filas,tam_columnas) > paraula.length()){
                    for (int j = 0; j < paraula.length(); j++) {

                        lletres[RandomFila][RandomColumna] = new Lletra(paraula.charAt(j));
                        RandomFila++;
                        RandomColumna++;

                    }
                } else {
                    NumRandomPerPosicionarParaules = 2;
                }
            } else if (NumRandomPerPosicionarParaules == 2){
                for (int j = 0; j < paraula.length(); j++) {

                    lletres[RandomFila][RandomColumna] = new Lletra(paraula.charAt(j));
                    RandomFila++;

                }
            } else if (NumRandomPerPosicionarParaules == 3){
                for (int j = 0; j < paraula.length(); j++) {

                    lletres[RandomFila][RandomColumna] = new Lletra(paraula.charAt(j));
                    RandomColumna++;

                }
            }

            contadorParaules++;

        }

    }

    // teorema de pitagores
    public int calcularTamDiagonal(int fila, int columna, int tam_filas, int tam_columnas) {
        int dx = tam_columnas - columna - 1; // Distancia a la última columna
        int dy = tam_filas - fila - 1; // Distancia a la última fila
        return (int) Math.sqrt(dx * dx + dy * dy) + 1; // Tamaño de la diagonal
    }

    public boolean esPotInserir(String paraula,int fila,int columna){

        int tam_filas = lletres.length;
        int tam_columnas = lletres[0].length;
        int tam_paraula = paraula.length();

        // Verificar si la paraula entre de manera horitzontal i vertical
        if (fila + tam_paraula > tam_filas || columna + tam_paraula > tam_columnas) {
            return false;
        }

        // Per no posar una paraula sobre un altre de maner horitzontal
        for (int j = 0; j < tam_paraula; j++) {
            if (lletres[fila][columna+j].getLletra() != 'X') {
                return false;
            }
        }

        // Lo mateix que abans pero en vertical
        for (int i = 0; i < tam_paraula; i++) {
            if (lletres[fila+i][columna].getLletra() != 'X') {
                return false;
            }
        }

        // si pasa tot, se pot insertar
        return true;
    }

    public String InvertirParaula(String paraula){

        String ParaulaInvertida = "";
        for (int indice = paraula.length() - 1; indice >= 0; indice--) {
            ParaulaInvertida += paraula.charAt(indice);
        }

        return ParaulaInvertida;
    }

    public static int NumRandom(int tamanyMaxim,int suma){

        return (int)Math.floor(Math.random()*tamanyMaxim+suma);

    }

    public void imprimir(){

        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_RESET = "\u001B[0m";

        for (int i = 0; i < lletres.length; i++) {
            for (int j = 0; j < lletres.length; j++) {

                if (lletres[i][j].getLletra() != 'X'){
                    System.out.print(ANSI_PURPLE + lletres[i][j].getLletra()+ ANSI_RESET);
                } else {
                    System.out.print(lletres[i][j].getLletra());
                }


            }

            System.out.println();

        }

    }
}
