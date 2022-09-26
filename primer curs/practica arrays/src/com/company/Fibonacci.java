package com.company;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Dime el numero de la secuencia: ");
        int secuencia = leer.nextInt();

        int anterior1 = 0,anterior2 = 1,nombre;

        for (int i = 0; i <= secuencia; i++) {

            if (i <= 1) {

                nombre = i;
                System.out.print(nombre + ",");

            } else if (i >= 2){

                nombre = anterior1 + anterior2;
                anterior1 = anterior2;
                anterior2 = nombre;
                System.out.print(nombre + ",");

            }

        }

    }
}
