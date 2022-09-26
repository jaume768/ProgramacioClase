package com.company;
import java.util.Scanner;

public class entradas {

    Scanner entrada = new Scanner (System.in);

    public int kilos(){

        int kilos = 0;
        System.out.println("Dime los kilos");
        kilos = entrada.nextInt();

        return kilos;

    }

    public int tamaño(){

        int tamaño = 0;
        System.out.println("Dime el tamaño");
        tamaño = entrada.nextInt();

        return tamaño;

    }
}
