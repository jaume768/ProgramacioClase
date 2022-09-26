package com.company;
import java.util.Scanner;

public class ArrayNotesAlumnes {

    public static void main(String[] args) {
        //Construir un programa que declare 2 matrices unidimensionales, una en la que se
        //almacenen nombres de alumnos y otra que contenga sus notas. Ambas matrices ser ́an
        //de 10 elementos. El propio programa debe inicializar las matrices de nombres y de
        //notas. El programa debe imprimir la lista de nombres con su nota al lado. Despu ́es
        //se debe introducir en una nueva matriz llamada alumnosAprobados los alumnos
        //que hayan aprobado e imprimir esta matriz.

        String[] NomAlumnes = new String[10];
        int[] NotesAlumnes = new int[10];

        RellenarMatrius(NomAlumnes,NotesAlumnes);
    }

    public static String DemanarNomAlumne(){

        Scanner leer = new Scanner(System.in);
        String alumnes;

        System.out.println("Dim el Nom de l'alumne: ");
        alumnes = leer.nextLine();

        return alumnes;

    }

    public static void RellenarMatrius(String[] NomAlumnes,int[] NotesAlumnes){

        Scanner leer = new Scanner(System.in);
        String alumnes;
        int Notes;

        for (int i = 0; i < NomAlumnes.length; i++) {

            NomAlumnes[i] = DemanarNomAlumne();

            System.out.println("Dim la nota de l'alumne " + NomAlumnes[i]);
            Notes = leer.nextInt();
            NotesAlumnes[i] = Notes;

        }

        for (int i = 0; i < NomAlumnes.length; i++) {

            System.out.print(NomAlumnes[i] + ": " + NotesAlumnes[i] + " | ");

        }

        System.out.println();
        System.out.println("Alumnes aprovats: ");

        for (int i = 0; i < NomAlumnes.length; i++) {

            if (NotesAlumnes[i] > 5){

                System.out.print(NomAlumnes[i] + ":" + NomAlumnes[i] + " | ");

            }

        }

    }
}
