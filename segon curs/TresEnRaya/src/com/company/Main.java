package com.company;
import java.util.Scanner;

public class Main {

    static fichas comunicador = new fichas();

    public static void main(String[] args) {

        fichas[][] tablero = rellenarTablero(3,3);
        int ronda = 1;

        partida(tablero,ronda);
    }

    public static fichas[][] rellenarTablero(int filas,int columnas){

        fichas arrayFichas[][] = new fichas[filas][columnas];

        for (int i = 0; i < arrayFichas.length; i++) {

            for (int j = 0; j < arrayFichas[0].length; j++) {

                arrayFichas[i][j] = new fichas(' ');

            }

        }

        return arrayFichas;

    }

    public static void imprimirTablero(fichas[][] tablero){

        System.out.println("   1   2   3");

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {

                if (j == 0)
                    System.out.print((i+1));
                System.out.print(" [" + tablero[i][j].getTipo() + "]");

            }

            System.out.println();

        }

    }

    public static boolean comprovacioLateral(fichas[][] tablero,int ronda){

        int contador = 0;
        char tipo = (ronda % 2 == 0) ? 'X': 'O';

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {

                if (tablero[i][j].getTipo() == tipo){
                    contador++;
                }

            }

            if (contador == 3){
                return true;
            } else {
                contador = 0;
            }

        }

        return false;

    }

    public static boolean comprovacioColumnes(fichas[][] tablero,int ronda){

        int contador = 0;
        char tipo = (ronda % 2 == 0) ? 'X': 'O';

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                if (tablero[j][i].getTipo() == tipo){
                    contador++;
                }

            }

            if (contador == 3){
                return true;
            } else {
                contador = 0;
            }

        }

        return false;

    }
    
    public static boolean comprovacioDiagonal(fichas[][] tablero,int ronda){
        
        int contador = 0;
        char tipo = (ronda % 2 == 0) ? 'X': 'O';

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                if (tablero[i][j].getTipo() == tipo){
                    contador++;
                }

                i++;
                
            }

            if (contador == 3){
                return true;
            } else {
                contador = 0;
            }
            
        }

        contador = 0;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = tablero.length-1; j > -1; j--) {

                if (tablero[i][j].getTipo() == tipo){
                    contador++;
                }

                i++;

            }

            if (contador == 3){
                return true;
            } else {
                contador = 0;
            }

        }

        return false;
    }

    public static boolean tableroCompleto(fichas[][] tablero){

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                if (tablero[i][j].getTipo() == ' '){
                    return false;
                }

            }

        }

        return true;

    }

    public static boolean ganador(fichas[][] tablero,int ronda){

        char tipo = (ronda % 2 == 0) ? 'X': 'O';

        if (comprovacioLateral(tablero,ronda) || comprovacioColumnes(tablero,ronda) || comprovacioDiagonal(tablero,ronda)){

            System.out.println();
            System.out.println("Ganador el equipo: " + tipo);
            return true;

        }

        if (tableroCompleto(tablero) && !comprovacioDiagonal(tablero,ronda) && !comprovacioColumnes(tablero,ronda) && !comprovacioDiagonal(tablero,ronda)){

            System.out.println();
            System.out.println("Empate");
            return true;

        }

        return false;

    }

    public static void partida(fichas[][] tablero,int ronda){

        Scanner sc = new Scanner(System.in);

        imprimirTablero(tablero);
        System.out.println();
        boolean partida = false;

        while(!partida){
            System.out.println("Ronda " + ronda);
            char tipo = (ronda % 2 == 0) ? 'X': 'O';

            System.out.println("Dime done insertar la " + tipo);
            int fila = sc.nextInt()-1;
            int columna = sc.nextInt()-1;

            if (tablero[fila][columna].getTipo() == ' '){
                tablero[fila][columna].setTipo(tipo);
                imprimirTablero(tablero);
                partida = ganador(tablero,ronda);
                ++ronda;
            } else {
                System.out.println("No puedes insertar la ficha en esa posicion, vuelve a intentarlo");
            }

        }

    }

}
