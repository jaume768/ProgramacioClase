package com.company;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Ascensor ascensor = new Ascensor();

        SubirOBajarPisos(ascensor);

    }

    public static void SubirOBajarPisos(Ascensor ascensor){

        int Decision = 0;

        while (Decision != 3) {

            Decision = PedirMenu();

            // Caso Salir ascensor
            if (Decision == 3){
                System.out.println("Saliendo del ascensor.....");
                continue;
            }

            // Caso Principal
            if (Decision < 3 && Decision > 0){

                System.out.println("Piso actual: " + CalcularPisoActual(ascensor,Decision));
                System.out.println("---------------------");

            } else {

                System.out.println("Eliga una opción del menu valida!!");

            }


        }

    }

    public static int CalcularPisoActual(Ascensor ascensor, int Decision){

        switch (Decision){

            case 1:

                ascensor.Subir();
                return ascensor.GetPisoActual();

            case 2:

                ascensor.Bajar();
                return ascensor.GetPisoActual();

            default:

                return -1;

        }

    }

    public static int PedirMenu(){

        System.out.println("Que quieres hacer?");
        System.out.println("1- Subir de piso");
        System.out.println("2- Bajar de piso");
        System.out.println("3- Salir del ascensor");

        return sc.nextInt();

    }

}
