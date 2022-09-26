package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int vidaM = 0;
        int ataqueM = 0;
        int contadorTurnos = 1;
        int contador = 1;

        PlayerClass player = new PlayerClass();
        Juego caracteristicas = new Juego();
        MonstruoClass monstruo = new MonstruoClass(vidaM,ataqueM);
        monstruo.generarTodo();
        player.generarTodo();
        System.out.println("------------------------------------");
        System.out.println("El monstruo te ataca cada 2 turnos");

        while (monstruo.vidaMonstruo > 0){
            System.out.println("-----------------------------------");
            System.out.println("Turno: " + contadorTurnos);
            System.out.println("Que quieres hacer? 1 = atacar, 2 = curarte (5 de vida), 3 = defenderte (50% de probabilidad)");
            int decision = leer.nextInt();
            if (decision == 1){

                monstruo.vidaMonstruo = monstruo.vidaMonstruo - player.ataquePlayer;

                if (contador%2 == 0){

                    System.out.println("El monstruo te ataca !!");
                    player.vidaPlayer = player.vidaPlayer - monstruo.ataqueMonstruo;
                    System.out.println("ahora tu vida es de " + player.vidaPlayer + " puntos");
                    contador = 0;

                }
                if (player.vidaPlayer <= 0){

                    System.out.println("te han matado, se acaba el juedo");
                    monstruo.vidaMonstruo = -1;
                    System.exit(0);

                }
                if (monstruo.vidaMonstruo > 0){

                    System.out.println("vida monstruo = " + monstruo.vidaMonstruo);

                }
            } else if (decision == 2){

                player.vidaPlayer = player.vidaPlayer + 5;
                System.out.println("te has curado, ahora tu vida es de " + player.vidaPlayer + " puntos");
                if (contador%2 == 0){

                    System.out.println("El monstruo te ataca !!");
                    player.vidaPlayer = player.vidaPlayer - monstruo.ataqueMonstruo;
                    System.out.println("ahora tu vida es de " + player.vidaPlayer + " puntos");
                    contador = 0;

                }
                if (player.vidaPlayer <= 0){

                    System.out.println("te han matado, se acaba el juedo");
                    monstruo.vidaMonstruo = -1;
                    System.exit(0);

                }
            } else if (decision == 3){

                caracteristicas.probabilidad5();
                if (caracteristicas.probabilidad50 > 50 ){

                    System.out.println("Enhorabuena, te has defendido, el monstruo no te ataca");

                } else {

                    System.out.println("no te has podido defender, el monstruo te ataca");
                    player.vidaPlayer = player.vidaPlayer - monstruo.ataqueMonstruo;
                    System.out.println("ahora tu vida es de " + player.vidaPlayer + " puntos");

                    if (player.vidaPlayer <= 0){

                        System.out.println("te han matado, se acaba el juedo");
                        monstruo.vidaMonstruo = -1;
                        System.exit(0);

                    }
                }
            } else {

                System.out.println("numero elegido incorrecto, vuelve a elegir: ");

            }

            contadorTurnos++;
            contador++;
        }

        System.out.println("Enhorabuena!!! Has matado al monstruo!!");
        System.out.println("FIN DEL JUEGO");
        System.out.println("-----------------------------------------");

    }
}
