package com.company;
import java.util.Scanner;

public class Inputs {

    Scanner sc = new Scanner(System.in);

    public int PedirFila(){

        System.out.println("Fila?");
        return sc.nextInt();

    }

    public int PedirColumna(){

        System.out.println("Columna?");
        return sc.nextInt();

    }

    public String PedirJuego(){
        return sc.nextLine();
    }

}
