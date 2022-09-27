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

        //Demanar es Exercici 9



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


}
