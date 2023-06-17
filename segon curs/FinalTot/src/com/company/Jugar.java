package com.company;

import Factory.JuegoFactory;
import Factory.JuegoFactoryImpl;
import Juegos.Juego;
import Jugadores.Jugador;

import java.util.Scanner;

public class Jugar {

    public void joc(){
        Scanner sc = new Scanner(System.in);
        Inputs in = new Inputs();
        Outputs ou = new Outputs();
        int turno = 1;

        JuegoFactory juegoFactory = new JuegoFactoryImpl();
        ou.Menu();
        String jugarJuego = sc.nextLine();
        Juego juego = juegoFactory.crearJuego(jugarJuego);

        juego.iniciarJuego();
        juego.imprimirTablero();
        System.out.println();

        Jugador jugador1 = new Jugador("b");
        Jugador jugador2 = new Jugador("n");

        while (!juego.hayGanador()){

            System.out.println("Turno del jugador " + turno);

            ou.PedirFicha();
            int filaOrigen = in.PedirFila();
            int columnaOrigen = in.PedirColumna();

            ou.PedirMover();
            int filaDestino = in.PedirFila();
            int columnaDestino = in.PedirColumna();

            if (turno == 1) {
                if (jugador1.moverFicha(juego, filaOrigen, columnaOrigen, filaDestino, columnaDestino)){
                    turno = 2;
                } else {
                    System.out.println("movimiento invalido, vuelve a intentarlo!!");
                    juego.imprimirTablero();
                }
            } else if (turno == 2) {
                if (jugador2.moverFicha(juego, filaOrigen, columnaOrigen, filaDestino, columnaDestino)){
                    turno = 1;
                }else {
                    System.out.println("movimiento invalido, vuelve a intentarlo!!");
                    juego.imprimirTablero();
                }
            }

        }
    }

}
