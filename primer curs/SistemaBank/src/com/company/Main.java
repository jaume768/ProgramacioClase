package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        sistema comunicador = new sistema();
        inputs input = new inputs();
        int respuesta = 0;

        while (respuesta != 4){

            System.out.println("Que quieres hacer?");
            System.out.println("1- Crear Usuarios, 2- Imprimir usuarios,  3- Modificar Dobes Clients 4- Salir");
            respuesta = leer.nextInt();

            if (respuesta == 1){
                comunicador.CrearClientes();
            } else if (respuesta == 2){
                comunicador.ImprimirNombreClients(input.TriarInformacioUsuaris());
            } else if (respuesta == 3) {
                comunicador.TreureDobesClient(input.ClientModificar());
            }
        }

    }
}
