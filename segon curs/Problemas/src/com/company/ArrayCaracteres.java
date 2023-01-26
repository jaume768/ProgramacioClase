package com.company;

public class ArrayCaracteres {

    public static void main(String[] args) {

        char[] Abacedari = RellenarArray();

        ImprimirArray(Abacedari);

    }

    public static char[] RellenarArray(){

        char mayusculas[] = new char[52];
        int contadorAbecedari = 65;

        for (int i = 0; i < mayusculas.length; i++) {

            mayusculas[i] = (char) contadorAbecedari;

            contadorAbecedari = contadorAbecedari == 90 ? 96 : contadorAbecedari++;

            /*if (contadorAbecedari == 90){
                contadorAbecedari = 96;
            }*/

            contadorAbecedari++;

        }

        return mayusculas;

    }

    public static void ImprimirArray(char[] Array){

        for (int i = 0; i < Array.length; i++) {

            System.out.print(Array[i] + ",");
            if (i == 25){
                System.out.println();
            }

        }

    }

}
