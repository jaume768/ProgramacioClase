package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class DescomposicioFactorial {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Primer nombre: ");
        int Num1 = leer.nextInt();

        System.out.println("Dime el segundo numero: ");
        int Num2 = leer.nextInt();

        descomposicio(Num1,Num2);

    }

    public static void descomposicio(int Num1, int Num2){

        System.out.println("Divisores de " + Num1 + ":");

        int divisor = 2;
        int divisor2 = 2;

        while (Num1 != 1){

            if (Num1 % divisor == 0){

                System.out.println(divisor + " ");
                Num1 = Num1/divisor;

            } else{

                divisor++;
            }

        }

        System.out.println("Divisores de " + Num2 + ":");

        while (Num2 != 1){

            if (Num2 % divisor2 == 0){

                System.out.println(divisor2 + " ");
                Num2 = Num2/divisor2;

            } else{

                divisor2++;
            }

        }

    }

}
