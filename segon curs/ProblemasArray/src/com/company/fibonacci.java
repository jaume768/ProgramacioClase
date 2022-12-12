package com.company;

public class fibonacci {

    public static void main(String[] args) {

        int nombre = 20;
        int segundoNumeroAnterior = 1;
        int primerNumeroAnterior = 0;
        int fibonacci;

        for (int i = 0; i < nombre; i++) {

            fibonacci = segundoNumeroAnterior + primerNumeroAnterior;
            segundoNumeroAnterior = primerNumeroAnterior;
            primerNumeroAnterior = fibonacci;
            System.out.println(fibonacci);

        }

    }

}
