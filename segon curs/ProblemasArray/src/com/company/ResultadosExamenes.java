package com.company;
import java.util.Scanner;

public class ResultadosExamenes {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Dime cuantos alumnos tienes: ");
        int NombreAlumnes = leer.nextInt();

        int Notas[] = NotasAlumnos(NombreAlumnes);

        System.out.println("Numero de alumnos: " + Notas.length);
        System.out.println("La media de las Notas es: " + Media(Notas));
        System.out.println("La nota maxima de los examenes es: " + NotaMaxima(Notas));

    }

    public static int[] NotasAlumnos(int NombreAlumnes){

        int[] Notas = new int[NombreAlumnes];

        for (int i = 0; i < Notas.length; i++) {

            System.out.println("Dime la nota del alumno " +(i+1));
            Notas[i] = leer.nextInt();

        }

        return Notas;

    }

    public static int Media(int[] Notas){

        int media = 0;

        for (int i = 0; i < Notas.length; i++) {

            media += Notas[i];

        }

        return media/Notas.length;
    }

    public static int NotaMaxima(int[] Notas){

        int NotaMaxima = 0;

        for (int i = 0; i < Notas.length; i++) {

            if (Notas[i] > NotaMaxima){

                NotaMaxima = Notas[i];

            }

        }

        return NotaMaxima;
    }

}
