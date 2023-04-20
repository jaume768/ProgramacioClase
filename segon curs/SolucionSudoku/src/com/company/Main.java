package com.company;

public class Main {

    public static void main(String[] args) {

        int[][] array = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        int[] arrayNumeros = {1,2,3,4,5,6,7,8,9};

        imprimirCuadrado(array,0,3);
    }

    public static boolean EsNumEstaHoritzontal(int[][] array, int numero,int Fila){

        for (int i = Fila; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if (array[i][j] == numero){
                    return true;
                }

            }

            return false;

        }

        return false;

    }

    public static boolean EsNumEstaVertical(int[][] array, int numero,int Columna){

        for (int i = 0; i < array.length; i++) {

            if (array[i][Columna] == numero){
                return true;
            }

        }

        return false;

    }

    public static void imprimirCuadrado(int[][] array,int Fila, int columna){

        int contadorFiles = 0;
        int contadorColumnes = 0;

        Fila = (Fila == 1 || Fila == 2) ? 0 : Fila;
        columna = (columna == 1 || columna == 2) ? 0 : columna;


        for (int i = Fila; i < array.length; i++) {
            for (int j = columna; j < array.length; j++) {

                System.out.print(array[i][j]);
                contadorFiles++;
                if (contadorFiles == 3){
                    j = array.length;
                    contadorFiles = 0;
                }
            }

            System.out.println();

            contadorColumnes++;
            i = (contadorColumnes == 3) ? array.length : i;
        }
    }

    public static void imprimir(int[][] array){

        int contador = 0;
        int contadorAbajo = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                System.out.print(array[i][j] + " ");
                if (contador == 2){
                    System.out.print("| ");
                    contador = -1;
                }
                contador++;
            }

            contadorAbajo++;
            System.out.println();
            if (contadorAbajo == 3){
                int contadorEspais = 0;
                for (int j = 0; j < array.length; j++) {

                    System.out.print("- ");
                    contadorEspais++;
                    if (contadorEspais == 3){
                        System.out.print("  ");
                        contadorEspais = 0;
                    }

                }
                System.out.println();
                contadorAbajo = 0;
            }



        }

    }
}
