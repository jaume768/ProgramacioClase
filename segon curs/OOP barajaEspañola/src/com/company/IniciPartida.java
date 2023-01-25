package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class IniciPartida {

    public static void GenerarPrincipi(ArrayList<Carta> Baraja, ArrayList<Carta> jugador1, ArrayList<Carta> jugador2){

        String[] tipos = {"espada","basto","oro","copas"};
        generarBaraja(Baraja,tipos);
        mezclarBaraja(Baraja);

        ActualizarMano(Baraja,jugador1,3);
        ActualizarMano(Baraja, jugador2, 3);

    }

    public static void generarBaraja(ArrayList<Carta> Baraja, String[] tipos){

        int[] puntuacio = {11,0,10,0,0,0,0,0,0,2,3,4};

        for (int i = 0; i < tipos.length; i++) {

            for (int j = 0; j < puntuacio.length; j++) {

                Baraja.add(j,new Carta(j,tipos[i],puntuacio[j]));

            }

        }

        for (int i = 0; i < Baraja.size(); i++) {

            if (Baraja.get(i).getNumero() == 7){
                Baraja.remove(i);
                Baraja.remove(i);
            }

        }

    }

    public static void mezclarBaraja(ArrayList<Carta> Baraja){

        for (int i = 0; i < 200; i++) {

            int numeroRandom1 = (int)(Math.random()*Baraja.size());
            int numeroRandom2 = (int)(Math.random()*Baraja.size());

            Collections.swap(Baraja,numeroRandom1,numeroRandom2);

        }

    }

    public static void ActualizarMano(ArrayList<Carta> Baraja,ArrayList<Carta> ManoJugador,int CartasACoger){

        for (int i = 0; i < CartasACoger; i++) {

            ManoJugador.add(Baraja.get(i));
            Baraja.remove(0);

        }

    }

    public static void Imprimir(ArrayList<Carta> Baraja){

        for (int i = 0; i < Baraja.size(); i++) {

            System.out.println("Numero: " + (Baraja.get(i).getNumero()+1) + ", puntos: " + Baraja.get(i).getPuntos() + " Tipo: " + Baraja.get(i).getTipo());

        }

    }

}
