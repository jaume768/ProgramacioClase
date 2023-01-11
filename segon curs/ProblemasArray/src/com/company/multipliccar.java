package com.company;
import java.util.Scanner;

public class multipliccar {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz;

        System.out.println("Dime la tabla de multiplicar: ");
        int tablaMultiplicar = sc.nextInt();
        int columnas = 11;
        if (tablaMultiplicar > columnas){
            columnas = tablaMultiplicar+1;
        }

        matriz=generaMatriz(tablaMultiplicar+1,columnas);
        muestraMatriz(matriz);
    }

    static int[][] generaMatriz(int filas, int columnas){
        int i,j;
        int[][] matriz = new int[filas][columnas];

        //Relleno la primera fila y la primera columna de la matriz
        for (i=0 ; i < matriz.length ; i++){
            matriz[i][0]=i;
            matriz[0][i]=i;
        }
        //Ahora relleno el resto de la matriz
        for (i=1 ; i < matriz.length ; i++){
            for (j=1 ; j < matriz[i].length ; j++){
                matriz[i][j]=i*j;
            }
        }
        return matriz;
    }

    static void muestraMatriz(int[][] matriz){
        int i,j;
        for (i=0; i < matriz.length ; i++){
            for (j=0 ; j < matriz[i].length ; j++){
                if (i > 0){
                    System.out.printf("%4d", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

}
