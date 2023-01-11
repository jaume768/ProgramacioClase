package com.company;

public class BucleInfinitoFormulaMatematica {

    public static void main(String[] args) {

        int numero = 123;

        for (int i = numero; i != 1;) {

            if (!esPar(i)){
                i = (i*3)+1;
            } else {
                i = i/2;
            }

            System.out.println(i);

        }

    }

    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
