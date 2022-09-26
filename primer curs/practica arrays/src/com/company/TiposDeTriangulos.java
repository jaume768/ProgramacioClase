package com.company;
import java.util.Scanner;

public class TiposDeTriangulos {

    public static void main(String[] args) {

        //Escribir un programa que determine el tipo de un tri ́angulo dada la longitud de sus
        //tres lados. El programa deber ́a incluir los siguientes m ́etodos que devuelven un valor
        //l ́ogico indicando el tipo del tri ́angulo:
            //es rectangulo (para tri ́angulos rect ́angulos)
            //es escaleno (todos los lados distintos)
            //es isosceles (dos lados iguales y el otro distinto)
            //es equilatero (los tres lados iguales)

        int NumeroCostats = 3;
        int[] Costats = new int[NumeroCostats];

        deduir(Costats);

        // a^2 = b^2 + c^2 (rectangle)
    }

    public static int[] asignarCostats(int[] Costats){

        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < Costats.length; i++) {

            System.out.println("Dim es costat numero " + (i+1) + ":");
            Costats[i] = leer.nextInt();

        }

        return Costats;

    }

    public static void deduir(int[] Costats){

        int[] Costatsfinal = asignarCostats(Costats);

        if (Costatsfinal[0] != Costatsfinal[1] && Costatsfinal[0] != Costatsfinal[2] &&  Costatsfinal[1] != Costatsfinal[2] ){

            System.out.println("Es escaleno");

        } else if (Costatsfinal[0] == Costatsfinal[1] && Costatsfinal[0] != Costatsfinal[2] ||  Costatsfinal[1] == Costatsfinal[2] && Costatsfinal[1] != Costatsfinal[0]){

            System.out.println("Es isosceles");

        } else if (Costatsfinal[0] == Costatsfinal[1] && Costatsfinal[0] == Costatsfinal[2]){

            System.out.println("Es equilater");

        }
    }

}
