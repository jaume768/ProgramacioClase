package com.company;
import java.util.Scanner;

public class SustituirElements {

    public static void main(String[] args) {

        //Escribir un programa que dada una matriz que contenga los diez primeros enteros
        //mayores que cero, permita sustituir un elemento de una determinada posici ́on de
        //la matriz por otro introducido por teclado. Esta operaci ́on se debe realizar usando
        //un m ́etodo. Construir otro m ́etodo que devuelva la suma de todos los elementos de
        //la matriz modificada. En el m ́etodo principal imprimir la matriz modificada y su
        //suma. El programa debe indicar si se ha introducido una posici ́on de la matriz no
        //v ́alida.


        int[] matriu = new int[10];

        for (int i = 0; i < matriu.length; i++) {

            matriu[i] = i+1;
            System.out.print(matriu[i] + " | ");

        }

        sustituci0(matriu);
    }

    public static void sustituci0(int[] matriu){

        Scanner leer = new Scanner(System.in);
        int sumatori = 0;

        System.out.println();
        System.out.println("Quina posicio vols modificar? ");
        int posicio = leer.nextInt();

        System.out.println("Quin valor nou vols insertar? ");
        int NouValor = leer.nextInt();

        matriu[posicio] = NouValor;

        System.out.println("Nova taula modificada: ");

        for (int i = 0; i < matriu.length; i++) {

            System.out.print(matriu[i] + " | ");

        }

        for (int i = 0; i < matriu.length; i++) {

            sumatori += matriu[i];

        }

        System.out.println();
        System.out.println("La suma de tots els valors actualment es de: " + sumatori);


    }
}
