package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class sistema {

    inputs input = new inputs();
    Scanner leer = new Scanner(System.in);
    ArrayList<client> clients = new ArrayList<>();

    public void CrearClientes(){

        int NumClientes = input.NombreClients();

        for (int i = 0; i < NumClientes; i++) {

            System.out.println("Dime el Nombre de la persona: ");
            String NomClient = leer.nextLine();
            int DineroCliente = input.DobesClients();

            client customer = new client(i, NomClient, DineroCliente);

            clients.add(customer);

        }
    }

    public void ImprimirNombreClients(int triar){

        System.out.println("------------ Nombre de clients --------------");
        System.out.print("|");
        for (int i = 0; i < clients.size(); i++) {

            if (triar == 1){
                System.out.print(clients.get(i).getNomClient() + "|");
            } else if (triar == 2){
                System.out.println(clients.get(i).getNomClient() + ": " + clients.get(i).getCantidadDobes()  + "|");
                if (i < clients.size()-1){
                    System.out.print("|");
                }
            }
        }

        System.out.println();

    }

    public void TreureDobesClient(int clientTriat){

        int DobesClient = clients.get(clientTriat).getCantidadDobes();

        System.out.println("Quanto dinero quiere sacar? ");
        int sacar = leer.nextInt();

        int restaTotal = DobesClient - sacar;

        clients.get(clientTriat).setCantidadDobes(restaTotal);

    }

}
