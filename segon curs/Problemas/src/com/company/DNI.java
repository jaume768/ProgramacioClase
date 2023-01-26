package com.company;
import java.util.Scanner;

public class DNI {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Dime tu DNI: ");
        int DNI = leer.nextInt();

        System.out.println("La teva lletra del DNI es: " + LletraDNI(DNI));

    }

    public static char LletraDNI(int DNI){

        char[] Lletres = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        int residu = DNI % 23;

        return Lletres[residu];

    }

}
