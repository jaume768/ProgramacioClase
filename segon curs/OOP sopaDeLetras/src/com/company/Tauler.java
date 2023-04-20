package com.company;

import java.util.Arrays;

public class Tauler {

    private Lletra[][] lletres;
    private final int Files = 14;
    private final int Columnes = 14;
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

                lletres[i][j] = new Lletra('-');

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

            // Aqui comprovam si la paraula se pot inserir de manera horitzontal i vertical
            while (!sePot){
                RandomFila = NumRandom(lletres.length, 0);
                RandomColumna = NumRandom(lletres.length, 0);
                sePot = esPotInserir(paraula,RandomFila,RandomColumna);
            }

            int NumRandomPerPosicionarParaules = NumRandom(3, 1);

            // Aqui se decideix si se inverteix la paraula
            int DecidirInvertir = NumRandom(2, 1);
            paraula = (DecidirInvertir == 2) ? InvertirParaula(paraula) : paraula;

            if (NumRandomPerPosicionarParaules == 1){

                // Aqui miram si sa pot posar la paraula en diagonal, sino deim que la posi de manera horitzontal
                if (calcularTamDiagonal(RandomFila,RandomColumna,Files,Columnes) > paraula.length()){
                    inserirLletres(NumRandomPerPosicionarParaules,RandomFila,RandomColumna,paraula);
                } else {
                    NumRandomPerPosicionarParaules = 2;
                }
            }

            if (NumRandomPerPosicionarParaules == 2 || NumRandomPerPosicionarParaules == 3){
                inserirLletres(NumRandomPerPosicionarParaules,RandomFila,RandomColumna,paraula);
            }

            contadorParaules++;

        }

    }

    // teorema de pitagores per treure la distancia de les diagonals desde una Fila i una Columna donada
    public int calcularTamDiagonal(int fila, int columna, int tam_filas, int tam_columnas) {
        int dx = tam_columnas - columna - 1; // Distancia a la última columna
        int dy = tam_filas - fila - 1; // Distancia a la última fila
        return (int) Math.sqrt(dx * dx + dy * dy) + 1; // Tamaño de la diagonal
    }

    public void inserirLletres(int posicio,int Fila,int Columna, String paraula) {

        for (int j = 0; j < paraula.length(); j++) {

            lletres[Fila][Columna] = new Lletra(paraula.charAt(j));
            if (posicio == 1){
                Columna++;
                Fila++;
            } else if (posicio == 3){
                Columna++;
            } else if (posicio == 2){
                Fila++;
            }

        }
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
            if (lletres[fila][columna+j].getLletra() != '-') {
                return false;
            }
        }

        // Lo mateix que abans pero en vertical
        for (int i = 0; i < tam_paraula; i++) {
            if (lletres[fila+i][columna].getLletra() != '-') {
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

    public int NumRandom(int tamanyMaxim,int suma){

        return (int)Math.floor(Math.random()*tamanyMaxim+suma);

    }

    public void imprimir(){

        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_RESET = "\u001B[0m";

        for (int i = 0; i < lletres.length; i++) {
            for (int j = 0; j < lletres.length; j++) {

                if (lletres[i][j].getLletra() != '-'){
                    System.out.print(ANSI_PURPLE + lletres[i][j].getLletra()+ ANSI_RESET);
                } else {
                    System.out.print(lletres[i][j].getLletra());
                }


            }

            System.out.println();

        }

    }
}
