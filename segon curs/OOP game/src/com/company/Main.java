package com.company;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        player jugador = new player(10,5);
        monster monstruo = new monster(20,3);

        Batalla(jugador,monstruo);

    }

    public static void Batalla(player jugador, monster monstruo){

        while (jugador.getVida() > 0 && monstruo.getVida() > 0){

            System.out.println();
            InfoTotal(jugador,monstruo);

            switch (menu()){

                case 1:
                    PlayerAtaque(jugador,monstruo);
                    break;
                case 2:
                    Curacion(jugador);
                    break;

            }

            if (monstruo.getVida() <= 0){

                System.out.println("Has vencido al monstruo!!");

            } else {

                System.out.println("El monstruo te ataca!!");
                MonstruoAtaca(jugador,monstruo);

            }

            if (jugador.getVida() <= 0){

                System.out.println("El monstruo te ha vencido :(");

            }

            System.out.println();

        }

    }

    public static boolean Probabilidad(int probabilidad){

        int probabilidadFinal = 10 - (probabilidad/10);

        int numero = (int)(Math.random()*10+1);

        return numero > probabilidadFinal;

    }

    public static void Curacion(player jugador){

        boolean TeCuras = Probabilidad(80);

        if (TeCuras){

            jugador.setVida(jugador.getVida() + 5);
            System.out.println("Te has curado!");
            System.out.println("Ahora tu vida es de: " + jugador.getVida());

        } else {

            System.out.println("Curación fallida");

        }
    }

    public static void PlayerAtaque(player jugador,monster monstruo){

        monstruo.setVida(monstruo.getVida() - jugador.getAtaque());
        System.out.println("Ahora la vida del monstruo es de: " + monstruo.getVida());

    }

    public static void MonstruoAtaca(player jugador,monster monstruo){

        boolean TeAtaca = Probabilidad(35);

        if (TeAtaca){

            jugador.setVida(jugador.getVida() - monstruo.getAtaque());
            System.out.println("Ahora tu vida se ha reducido, vida actual: " + jugador.getVida());

        } else {

            System.out.println("Ataque del monstruo fallido...");

        }

    }

    public static int menu(){

        System.out.println("Que quieres hacer? ");
        System.out.println("1- Atacar");
        System.out.println("2- Curarte");

        return sc.nextInt();

    }

    public static void InfoTotal(player jugador,monster monstruo){

        System.out.println("-------------------------------------");
        System.out.println("Tu vida es de: " + jugador.getVida());
        System.out.println("La vida del monstruo es de: " + monstruo.getVida());
        System.out.println("-------------------------------------");

    }
}
