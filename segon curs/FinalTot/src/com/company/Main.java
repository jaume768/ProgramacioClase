package com.company;
import java.util.Scanner;

import Factory.JuegoFactory;
import Factory.JuegoFactoryImpl;
import Juegos.Juego;
import Jugadores.Jugador;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        JuegoFactory juegoFactory = new JuegoFactoryImpl();
        System.out.println("Que juego quieres jugar?");
        System.out.println(" - ajedrez \n - damas \n - damas chinas \n - gato y raton");
        String jugarJuego = sc.nextLine();
        Juego juego = juegoFactory.crearJuego(jugarJuego);

        juego.iniciarJuego();
        System.out.println();

        Jugador jugador1 = new Jugador("b");
        Jugador jugador2 = new Jugador("n");

        while (!juego.hayGanador()){
            System.out.println("Que ficha quieres mover?");
            System.out.println("Fila? ");
            int filaOrigen = sc.nextInt();
            System.out.println("Columna? ");
            int columnaOrigen = sc.nextInt();

            System.out.println("Donde la quieres mover? ");
            System.out.println("Fila? ");
            int filaDestino = sc.nextInt();
            System.out.println("Columna? ");
            int columnaDestino = sc.nextInt();

            jugador1.moverFicha(juego,filaOrigen,columnaOrigen,filaDestino,columnaDestino);

        }

    }
}
