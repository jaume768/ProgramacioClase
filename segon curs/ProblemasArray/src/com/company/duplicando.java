package com.company;

public class duplicando {

    public static void main(String[] args) {

        int dies = 30;
        int Moneda = 1;

        for (int i = 0; i < dies; i++) {

            Moneda *= 2;
            System.out.println(Moneda);

        }

        System.out.println("Final: " + Moneda);

    }
}
