package com.company;

import java.util.Scanner;

public class inputs {

    Scanner leer = new Scanner(System.in);

    public int NombreClients(){

        int NumClients;
        System.out.println("Cuantos clientes quieres?");
        NumClients = leer.nextInt();

        return  NumClients;
    }

    public int DobesClients(){

        int DineroCliente;
        System.out.println("Cuanto dinero tiene el cliente?");
        DineroCliente = leer.nextInt();

        return  DineroCliente;
    }

    public int TriarInformacioUsuaris(){

        System.out.println("Que información quieres de los usuarios?");
        System.out.println("1- imprimir Nombres, 2- Nombres y dinero:");
        int triar = leer.nextInt();

        return triar;

    }

    public int ClientModificar(){

        System.out.println("Quin client vols modificar? ");
        int clientTriat = leer.nextInt()-1;

        return clientTriat;

    }



}
