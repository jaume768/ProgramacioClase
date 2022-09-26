package com.company;
import java.util.Scanner;

public class ArraysBiConcatenar {

    public static void main(String[] args) {

        //Construir un programa que cree dos matrices bidimensionales, una de tipo String y
        //otra de tipo int. Cada matriz debe ser de 3x2. El programa debe leer por teclado
        //los elementos de ambas matrices. Despu ́es, deber ́a imprimir ambas matrices. A con-
        //tinuaci ́on deber ́a sumar un n ́umero, que se introducir ́a por teclado, a cada elemento
        //de la matriz de enteros y concatenar una palabra, que tambi ́en se introducir ́a por
        //teclado, a los elementos de la matriz cadena. Finalmente, se volver ́a a imprimir ca-
        //da matriz. Deber ́a utilizarse un m ́etodo para cada una de las tareas que realiza el
        //programa.

        int[][] ArrayInt = new int[3][3];
        String[][] ArrayString = new String[3][3];

        ImprimirYModificarInt(ArrayInt);
        imprimirYModificarString(ArrayString);

    }


    public static int[][] RellenarInt(int[][] ArrayInt){

        Scanner leer = new Scanner(System.in);
        int valor;

        for (int files = 0; files < ArrayInt.length; files++) {

            for (int colums = 0; colums < ArrayInt.length; colums++) {

                System.out.println("dime el valor: ");
                valor = leer.nextInt();
                ArrayInt[files][colums] = valor;

            }

        }

        System.out.println("* Tabla completada *");

        return ArrayInt;

    }


    public static String[][] RellenarString(String[][] ArrayString){

        Scanner leer = new Scanner(System.in);
        String valor;

        for (int files = 0; files < ArrayString.length; files++) {

            for (int colums = 0; colums < ArrayString.length; colums++) {

                System.out.println("dime la primera palabra: ");
                valor = leer.nextLine();
                ArrayString[files][colums] = valor;

            }


        }

        System.out.println("* Tabla completada *");

        return ArrayString;

    }

    public static void imprimirYModificarString(String[][] ArrayString){

        String[][] ArrayString2 = RellenarString(ArrayString);
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < ArrayString2.length; i++) {

            for (int j = 0; j < ArrayString2.length; j++) {

                System.out.print(ArrayString2[i][j] + " | ");

            }

            System.out.println();

        }

        System.out.println("Dime la palabra que quieras concatenar: ");
        String Paraula = leer.nextLine();

        System.out.println("Tabla modificada: ");

        for (int i = 0; i < ArrayString2.length; i++) {

            for (int j = 0; j < ArrayString2.length; j++) {

                ArrayString2[i][j] = ArrayString2[i][j] + Paraula;
                System.out.print(ArrayString2[i][j] + " | ");

            }

            System.out.println();

        }

    }

    public static void ImprimirYModificarInt(int[][] ArrayInt){

        int[][] ArrayInt2 = RellenarInt(ArrayInt);
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < ArrayInt2.length; i++) {

            for (int j = 0; j < ArrayInt2.length; j++) {

                System.out.print(ArrayInt2[i][j] + " | ");

            }

            System.out.println();

        }

        System.out.println("Dime el valor que quieras sumar: ");
        int valor = leer.nextInt();

        System.out.println("Tabla modificada: ");

        for (int i = 0; i < ArrayInt2.length; i++) {

            for (int j = 0; j < ArrayInt2.length; j++) {

                ArrayInt2[i][j] = ArrayInt2[i][j] + valor;
                System.out.print(ArrayInt2[i][j] + " | ");

            }

            System.out.println();

        }


    }
}
