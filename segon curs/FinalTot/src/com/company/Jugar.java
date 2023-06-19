package com.company;

import Factory.JuegoFactory;
import Factory.JuegoFactoryImpl;
import Juegos.Juego;
import Jugadores.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugar {

    public ArrayList<String> joc(){
        Scanner sc = new Scanner(System.in);
        Inputs in = new Inputs();
        Outputs ou = new Outputs();
        int turno = 1;

        JuegoFactory juegoFactory = new JuegoFactoryImpl();
        ou.Menu();
        String jugarJuego = in.PedirJuego();
        Juego juego = juegoFactory.crearJuego(jugarJuego);

        juego.iniciarJuego();
        juego.imprimirTablero();

        Jugador jugador1 = new Jugador("b");
        Jugador jugador2 = new Jugador("n");

        ArrayList<String> movimientos = new ArrayList<>();

        while (!juego.hayGanador()){

            ou.Torn(turno);

            ou.PedirFicha();
            int filaOrigen = in.PedirFila();
            int columnaOrigen = in.PedirColumna();

            ou.PedirMover();
            int filaDestino = in.PedirFila();
            int columnaDestino = in.PedirColumna();

            String movimiento = filaOrigen + "-" + columnaOrigen + " a " + filaDestino + "-" + columnaDestino;

            if (turno == 1) {
                if (jugador1.moverFicha(juego, filaOrigen, columnaOrigen, filaDestino, columnaDestino)){
                    turno = 2;
                    movimientos.add(movimiento);
                } else {
                    ou.MovimientoInvalido();
                    juego.imprimirTablero();
                }
            } else if (turno == 2) {
                if (jugador2.moverFicha(juego, filaOrigen, columnaOrigen, filaDestino, columnaDestino)){
                    turno = 1;
                    movimientos.add(movimiento);
                }else {
                    ou.MovimientoInvalido();
                    juego.imprimirTablero();
                }
            }

        }

        return movimientos;
    }

}
