package com.company;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // hacer una biblioteca, con un numero de estantes (arrays de objetos), los estantes tienen que tener libros (objetos)

        Libros[] estanteria1 = new Libros[3];
        estanteria1 = Rellenar(estanteria1);

    }

    public static Libros[] Rellenar(Libros[] estanteria){

        int NumPaginas;
        String Nombre;
        String Autor;

        for (int i = 0; i < estanteria.length; i++) {

            System.out.println("Dime el Autor: ");
            Autor = sc.nextLine();
            System.out.println("Dime el Nombre: ");
            Nombre = sc.nextLine();
            System.out.println("Dime el Numero de paginas: ");
            NumPaginas = sc.nextInt();

            estanteria[i] = new Libros(NumPaginas,Nombre,Autor);

        }

        return estanteria;

    }

}
