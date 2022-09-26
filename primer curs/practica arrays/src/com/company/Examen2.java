package com.company;
import java.util.Scanner;

public class Examen2 {

    public static void main(String[] args) {

        int[][] A = {{1,0,0},{3,4,2}};
        int[][] B = {{2,1},{0,3},{1,0}};
        int[] NombreConcret = {1,5,9,81,356,925,5589,15238,17889,19000};
        String paraula = "antoniz";

        System.out.println("-------Exercici cesar--------------------");
        Cesar(paraula);
        System.out.println();
        System.out.println("-------Exersici nombre mitat-------------");
        TrobarPuntMitj(NombreConcret);
        System.out.println();
        System.out.println("-------Exercici multiplicació arrays-----");
        MultipicacioArray(A,B);

    }

    public static void Cesar(String paraula){

        String novaParaula = "";
        String novaParaula2 = "";
        int suma;
        int resta;
        int xifratge = 2;
        char[] abacadari = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for (int i = 0; i < paraula.length(); i++) {

            for (int j = 0; j < abacadari.length; j++) {

                if (paraula.charAt(i) == abacadari[j]){

                    if ((j+xifratge)< abacadari.length){
                        novaParaula += abacadari[j+xifratge];
                    } else{

                        suma = j+xifratge;
                        suma = suma - abacadari.length;
                        novaParaula += abacadari[suma];

                    }

                }

            }

        }

        System.out.println("paraula xifrada:" + novaParaula);

        for (int m = 0; m < novaParaula.length(); m++) {

            for (int n = 0; n < abacadari.length; n++) {

                if (novaParaula.charAt(m) == abacadari[n]){

                    if ((n-xifratge)>= 0){
                        novaParaula2 += abacadari[n-xifratge];
                    } else if((n-xifratge)< 0){

                        resta = n-xifratge;
                        resta = abacadari.length + resta;
                        novaParaula2 += abacadari[resta];

                    }
                }

            }

        }

        System.out.println("paraula desxifrada:" + novaParaula2);

    }



    public static void TrobarPuntMitj(int[] NombreConcret){

        //int[] NombreConcret = {1,5,9,81,356,925,5589,15238,17889,19000};
        int NombreASercar= 15238;
        int inici = NombreConcret.length/2;
        int trobat = 0;
        int finalarray = NombreConcret.length;
        int nombreMitat;
        int voltes = 0;


        while(trobat != 1){

            nombreMitat = (inici >= NombreConcret.length) ? NombreConcret[inici-1]:NombreConcret[inici];

            if (NombreASercar == nombreMitat){

                trobat = 1;
                System.out.println("nombre trobat, posicio: " + inici);

            }

            if (NombreASercar > nombreMitat){

                finalarray = finalarray/2;
                inici += finalarray;

            }

            if (NombreASercar < nombreMitat){

                finalarray = finalarray/2;
                inici = inici- finalarray;

            }

            if (voltes == NombreConcret.length && NombreASercar != nombreMitat){

                trobat = 1;
                System.out.println("no hi ha el nombre a l'array");

            }

            voltes++;

        }



    }

    public static void MultipicacioArray(int[][] a,int[][] b){

        int[][] c = new int[a.length][b[0].length];
        int saMultiplica = 0;
        try{
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }catch (Exception e){

            System.out.println("no sa poden multiplicar les arrays ");
            saMultiplica = 1;

        }

        if (saMultiplica == 0){
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c.length; j++) {

                    System.out.print(c[i][j] + " | ");

                }
                System.out.println();

            }
        }

    }

}
