package com.company;
import java.util.*;

public class integerInvertido {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numeroAInvertir = leer.nextInt();

        System.out.println(NumeroInvertido(numeroAInvertir));

    }

    public static int NumeroInvertido(int numero){

        String num = Integer.toString(numero);
        String numInvert = "";

        for (int i = num.length()-1; i > -1; i--) {

            numInvert += num.charAt(i);

        }

        return Integer.parseInt(numInvert);

    }
}
