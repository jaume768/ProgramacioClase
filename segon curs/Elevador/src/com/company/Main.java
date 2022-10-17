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

        int PisosMaximo = 5;

        //Caso 1
        if (Decision == 2 && ascensor.GetPisoActual() == 0){

            System.out.println("No se puede bajar mas del piso 0");
            return ascensor.GetPisoActual();

        }

        //Caso 2
        if (Decision == 1 && ascensor.GetPisoActual() == PisosMaximo){

            System.out.println("No se puede subir mas del piso maximo");
            return ascensor.GetPisoActual();

        }

        // Caso Principal
        if (Decision == 2 && ascensor.GetPisoActual() > 0){

            ascensor.Bajar();
            return ascensor.GetPisoActual();

        } else if (Decision == 1 && ascensor.GetPisoActual() < PisosMaximo){

            ascensor.Subir();
            return ascensor.GetPisoActual();

        }

        return -1;

    }

    public static int PedirMenu(){

        System.out.println("Que quieres hacer?");
        System.out.println("1- Subir de piso");
        System.out.println("2- Bajar de piso");
        System.out.println("3- Salir del ascensor");

        return sc.nextInt();

    }

}
