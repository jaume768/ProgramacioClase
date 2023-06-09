package com.company;

import java.util.Scanner;

public class Juego {

    public void jugar(){
        Tablero tablero = new Tablero();
        Scanner sc = new Scanner(System.in);

        while (!tablero.ganador()){

            System.out.println("Dime la Fila: ");
            int fila = sc.nextInt();

            System.out.println("Dime la columna: ");
            int columna = sc.nextInt();

            System.out.println("Destapar == 1");
            System.out.println("Bandera == 2");

            int decision = sc.nextInt();

            if (decision == 1){

                tablero.destaparFicha(fila,columna);

                if (tablero.bombaExplotada(fila,columna)){
                    System.out.println("Bomba explotada");
                    tablero.imprimirTablero();
                    break;
                }
            } else if (decision == 2){
                tablero.ponerBandera(fila,columna);
            }

            tablero.imprimirTablero();

        }
    }
}
