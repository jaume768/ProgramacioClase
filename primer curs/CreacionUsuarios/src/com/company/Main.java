package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String[] Usuarios = new String[5];
        int opcion;
        int salir = 0;
        int usuarioEliminar;
        String nombreUsuarios;


        while (salir != 1){

            System.out.println("Elige una opción");
            System.out.println("1 crear usuarios, 2 eliminar, 3 imprimir, 4 salir");
            opcion = leer.nextInt();

            if (opcion == 1){

                for (int i = 0; i < Usuarios.length; i++){


                    nombreUsuarios = DemanarUsuaris();
                    Usuarios[i] = nombreUsuarios;

                }


            }

            if (opcion == 2){

                for (int i = 0; i < Usuarios.length; i++) {

                    System.out.print(Usuarios[i] + " | ");

                }

                System.out.println("Que usuario quieres eliminar? ");
                usuarioEliminar = leer.nextInt();

                Usuarios[usuarioEliminar] = "";

            }

            if (opcion == 3){

                for (int i = 0; i < Usuarios.length; i++) {

                    System.out.print(Usuarios[i] + " | ");

                }

                System.out.println();

            }

            if (opcion == 4){

                salir = 1;

            }

            if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4){

                System.out.println("opcion incorrecta, vuelve a decir una opción ");

            }

        }


    }

    public static String DemanarUsuaris(){

        Scanner leer = new Scanner(System.in);

        System.out.println("Dime el nombre de usuario: ");
        String nombreUsuarios = leer.nextLine();

        return  nombreUsuarios;

    }
}
