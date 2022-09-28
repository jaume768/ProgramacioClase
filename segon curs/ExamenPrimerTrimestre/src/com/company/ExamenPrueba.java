package com.company;

public class ExamenPrueba {

    public static void main(String[] args) {

        int[] matriu = {12,13,54,23,12,354,34,3};
        //Exercici1(matriu);
        //Exercici2(matriu);
        //Exercici3(matriu);
        // Els ejercicis 4 i 5 es el mateix que els 2 i 3 pero invertit els resultats
        //Exercici6(matriu);
        //Exercici7(matriu); crec que no esta correcte
        //Exercici8(matriu);
        //Exercici9(matriu);

        // Demanar exercici 10

        //Exercici11(matriu);
        //Exercici12(matriu);

    }

    public static void Exercici1(int[] matriu){

        int media = 0;

        for (int i = 0; i < matriu.length; i++) {

            media += matriu[i];

        }

        System.out.println(media/matriu.length);

    }

    public static void Exercici2(int[] matriu){

        int valorMinim = matriu[0];

        for (int i = 0; i < matriu.length; i++) {

            valorMinim = valorMinim > matriu[i] ? matriu[i] : valorMinim;

        }

        System.out.println(valorMinim);

    }

    public static void Exercici3(int[] matriu){

        int valorMinim = matriu[0];

        for (int i = 0; i < matriu.length; i++) {

            valorMinim = valorMinim > matriu[i] ? i : matriu[i];

            /*

            Mateixa solució pero mes visible la resolució

            if (valorMinim > matriu[i]){
                valorMinim = i;
            }

            */

        }

        System.out.println(valorMinim);

    }

    public static void Exercici6(int[] matriu){

        int nombre = matriu[0];
        boolean ascandent = false;

        for (int i = 0; i < matriu.length; i++) {

            if (nombre < matriu[i]){

                ascandent = true;

            } else {
                ascandent = false;
            }

        }

        System.out.println(ascandent);

    }

    public static void Exercici7(int[] matriu){

        int nombre = matriu[0];
        boolean descendent = false;

        for (int i = 0; i < matriu.length; i++) {

            if (nombre > matriu[i] || i % 2 == 0){

                descendent = true;

            } else {
                descendent = false;
            }

        }

        System.out.println(descendent);

    }

    public static void Exercici8(int[] matriu){

        int[] novaMatriu = {12,13,54,23,12,354,34,3};
        int contadorInvers = matriu.length-1;
        int temp1 = 0;
        int temp2 = 0;

        for (int i = 0; i < matriu.length/2; i++) {

            temp1 = matriu[contadorInvers];
            temp2 = matriu[i];
            novaMatriu[i] = temp1;
            novaMatriu[contadorInvers] = temp2;

            contadorInvers--;

        }

        for (int i = 0; i < novaMatriu.length; i++) {

            System.out.print(novaMatriu[i] + ",");

        }

    }

    public static void Exercici9(int[] matriu){

        int NombreASercar = 13;

        for (int i = 0; i < matriu.length; i++) {

            if (NombreASercar == matriu[i]){

                NombreASercar = i;
                i = matriu.length;

            } else if (i == matriu.length-1){

                NombreASercar = -1;

            }

        }

        System.out.println("Nombre a sercar: " + NombreASercar);

    }

    public static void Exercici10(int[] matriu){

        int Mitjana = 0;
        int NombreProper = 0;

        for (int i = 0; i < matriu.length; i++) {

            Mitjana += matriu[i];

        }

        Mitjana = Mitjana/matriu.length;

        

        System.out.println("La mitjana es:" + Mitjana);
        System.out.println("El nombre mes proper de l'array es: " + NombreProper);

    }

    public static void Exercici11(int[] matriu){

        int Posicio = 2;
        int temp1;

        for (int i = 0; i < matriu.length; i++) {

            if (matriu[Posicio] < matriu[i]){

                temp1 = matriu[Posicio];
                matriu[Posicio] = matriu[i];
                matriu[i] = temp1;

                i = matriu.length;

            }

        }

        for (int i = 0; i < matriu.length; i++) {

            System.out.print(matriu[i] + ",");

        }

    }

    public static void Exercici12(int[] matriu){

        int n=matriu.length;
        int temp;

        for(int j = 0;j<n;j++){

            for (int i = 0;i<(n-1)-j;i++) {

                if (matriu[i] > matriu[i+1]) {

                    temp = matriu[i];
                    matriu[i] = matriu[i+1];
                    matriu[i+1] = temp;

                }
            }
        }

        for (int i = 0; i < matriu.length; i++) {

            System.out.print(matriu[i] + ",");

        }

    }

}
