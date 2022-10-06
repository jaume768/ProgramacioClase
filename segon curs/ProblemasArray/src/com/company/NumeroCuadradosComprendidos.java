package com.company;
import java.util.Scanner;


public class NumeroCuadradosComprendidos {

    public static void main(String[] args) {

       /*Escribir un programa que calcule la suma de los cuadrados comprendidos entre 1 y
        N donde N es un entero que se lee por teclado.*/

        Scanner leer = new Scanner(System.in);
        int inicio = 1;
        System.out.println("Dime el numero: ");
        int NumeroFinal = leer.nextInt();
        int cuadrado = 0;

        while (inicio < NumeroFinal){

            cuadrado += inicio*inicio;

            inicio++;

        }

        System.out.println(cuadrado);
    }

}
