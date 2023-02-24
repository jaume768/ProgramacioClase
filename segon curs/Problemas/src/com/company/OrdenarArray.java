package com.company;
import java.util.Locale;
import java.util.Scanner;

public class OrdenarArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Dime cuantos numeros quieres ordenar: ");
        int numerosAOrdenar = sc.nextInt();

        int[] ArrayDesordenada = new int[numerosAOrdenar];
        ArrayDesordenada = PedirNumeros(ArrayDesordenada);

        System.out.println("""
                La quieres ordenada de Mayor a menor, o de menor a Mayor?\s
                Mayor a menor (escribir la palabra Mayor)\s
                Menor a mayor (escribir la palabra Menor)""");

        String ordenar = sc.next();

        ordenar(ArrayDesordenada,ordenar.toLowerCase(Locale.ROOT));

    }
    public static int[] PedirNumeros(int[] array){

        for (int i = 0; i < array.length; i++) {

            int num = sc.nextInt();
            array[i] = num;

        }

        return array;
    }

    public static void ordenar(int[] ArrayDesordenada,String ordenar){

        int[] arrayFinal;

        if(ordenar.equals("mayor")){
            arrayFinal = MayorAMenor(ArrayDesordenada);
        } else {
            arrayFinal = MenorAMayor(ArrayDesordenada);
        }

        // imprimir array
        for (int i = 0; i < arrayFinal.length; i++) {

            System.out.println(arrayFinal[i]);

        }

    }

    public static int[] MayorAMenor(int[] Desordenada){
        for (int x = 0; x < Desordenada.length; x++) {
            for (int i = 0; i < Desordenada.length-x-1; i++) {
                if(Desordenada[i] < Desordenada[i+1]){
                    int tmp = Desordenada[i+1];
                    Desordenada[i+1] = Desordenada[i];
                    Desordenada[i] = tmp;
                }
            }
        }

        return Desordenada;
    }

    public static int[] MenorAMayor(int[] Desordenada){
        for (int x = 0; x < Desordenada.length; x++) {
            for (int i = 0; i < Desordenada.length-x-1; i++) {
                if(Desordenada[i+1] < Desordenada[i]){
                    int tmp = Desordenada[i+1];
                    Desordenada[i+1] = Desordenada[i];
                    Desordenada[i] = tmp;
                }
            }
        }

        return Desordenada;
    }

}
