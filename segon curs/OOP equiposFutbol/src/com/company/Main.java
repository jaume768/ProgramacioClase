package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        team equip1 = new team(1,"PSG");

        equip1.setPlayers(1,"Tomeu",1,equip1.getName(),2);
        equip1.setPlayers(2,"Fran",4,equip1.getName(),3);
        equip1.setPlayers(3,"Paco",11,equip1.getName(),1);
        equip1.setPlayers(4,"Mbape",10,equip1.getName(),7);

        team equip2 = new team(2,"Madrid");

        equip2.setPlayers(1,"Cristiano",5,equip1.getName(),3);
        equip2.setPlayers(2,"Tombi",8,equip1.getName(),6);
        equip2.setPlayers(3,"Alex",10,equip1.getName(),2);
        equip2.setPlayers(4,"Manuel",12,equip1.getName(),1);

        System.out.println("---------------------------------------------------------------");
        System.out.println("Llista de jugadors de cada equipo, ordenats per nombre de gols.");
        System.out.println("---------------------------------------------------------------");

        System.out.println("Equip: " + equip1.getName());
        System.out.println();
        getRankedPlayers(ArrayGols(equip1),equip1);

        System.out.println();

        System.out.println("Equip: " + equip2.getName());
        System.out.println();
        getRankedPlayers(ArrayGols(equip2),equip2);

    }

    public static int[] ArrayGols(team equip1){

        int[] GolsJugadors = new int[equip1.getPlayers().size()];
        int[] GolsJugadorsOrdenats = new int[GolsJugadors.length];
        int contador = 0;


        for (int i = 0; i < equip1.getPlayers().size(); i++) {

            int gols = equip1.getPlayers().get(i).getgoals();
            GolsJugadors[i] = gols;

        }

        Arrays.sort(GolsJugadors);

        // Invertir array
        for (int i = GolsJugadors.length-1; i > -1; i--) {

            GolsJugadorsOrdenats[contador] = GolsJugadors[i];
            contador++;

        }

        return GolsJugadorsOrdenats;

    }

    public static void getRankedPlayers(int[] gols,team equip1){

        String[] NomJugadorsPerGols = new String[equip1.getPlayers().size()];

        // ordenar es noms des jugadors mirant es gols

        for (int i = 0; i < gols.length; i++) {
            for (int j = 0; j < gols.length; j++) {

                if (equip1.getPlayers().get(j).getgoals() == gols[i]){

                    NomJugadorsPerGols[i] = equip1.getPlayers().get(j).getName();

                }

            }

        }

        for (int i = 0; i < NomJugadorsPerGols.length; i++) {

            System.out.println(NomJugadorsPerGols[i] + " te un total de gols: " + gols[i]);

        }

    }

}
