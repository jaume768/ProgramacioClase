package com.company;

public class patronArray {

    public static void main(String[] args) {

        char[] lletres = {'A','B','C','D','E'};
        int[] Nombres = {1,2,3,4,5,6,7,8,9,10};
        int lletresLlarg = lletres.length, nombresLlarg = Nombres.length;

        patro1(lletres, Nombres,lletresLlarg,nombresLlarg);
        System.out.println("-------------------------------");
        patro2(lletres, Nombres,lletresLlarg,nombresLlarg);
        System.out.println("-------------------------------");
        patro3(lletres);

    }

    public static void patro1(char[] lletres,int[] Nombres,int lletresLlarg,int nombresLlarg){

        //I want to output the following pattern:
        //A1 A2 A3 A4 A5 A6 A7 A8 A9 A10
        //B1 B2 B3 B4 B5 B6 B7 B8 B9 B10
        //C1 C2 C3 C4
        //D1 D2 D3 D4 D5 D6 D7 D8 D9 D10
        //E1 E2 E3 E4 E5 E6 E7 E8 E9 E10
        //Write a nested for loop to implement this.

        for (int i = 0; i < lletresLlarg; i++) {
            for (int j = 0; j < nombresLlarg; j++) {

                if (PosicioCorrecte(i,j)){

                    break;

                } else {

                    System.out.print("(" + lletres[i] + Nombres[j] + ") ");

                }

            }

            System.out.println();

        }
    }

    public static boolean PosicioCorrecte(int i, int j){

        int fila = 2, columna = 4;

        return i == fila && j == columna;

    }

    public static void patro2(char[] lletres,int[] Nombres,int lletresLlarg,int nombresLlarg){

        //Write a program which will output the following pattern:
        //(A,1) (A,2) (A,3) (A,4)
        //(B,1) (B,2) (B,3) (B,4)
        //(C,1) (C,2) (C,3) (C,4)
        //(D,1) (D,2) (D,3) (D,4)
        //(E,1) (E,2) (E,3) (E,4)

        for (int i = 0; i < lletresLlarg; i++) {

            for (int j = 0; j < nombresLlarg; j++) {

                System.out.print("(" + lletres[i] + "," + Nombres[j] + ") ");

            }

            System.out.println();

        }

    }

    public static void patro3(char[] lletres){

        //A
        //AB
        //ABC
        //ABCD
        //ABCDE
        //ABCD
        //ABC
        //AB
        //A

        int n = lletres.length;
        String acumulaoor = "";

        for (int j = 0; j < n; j++) {

            acumulaoor += lletres[j];
            System.out.println(acumulaoor);

            if (j == n-1){

                for (int i = n; i > 0 ; i--) {

                    acumulaoor = acumulaoor.substring(0,i);
                    System.out.println(acumulaoor);

                }

            }

        }

    }
}
