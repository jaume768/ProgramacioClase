package com.company;

public class ExamenPrueba {

    public static void main(String[] args) {

        int[] matriu = {12,13,54,23,12,354,34,3};

        System.out.println(SercarNombre(matriu,2));

    }

    public static int MitjanaAritmetica(int[] matriu){

        int media = 0;

        for (int i = 0; i < matriu.length; i++) {

            media += matriu[i];

        }

        return media/matriu.length;

    }

    public static int ValorMinim(int[] matriu){

        int valorMinim = matriu[0];

        for (int i = 0; i < matriu.length; i++) {

            valorMinim = valorMinim > matriu[i] ? matriu[i] : valorMinim;

        }

        return valorMinim;

    }

    public static int IndexValorMinim(int[] matriu){

        int valorMinim = matriu[0];

        for (int i = 0; i < matriu.length; i++) {

            valorMinim = valorMinim > matriu[i] ? i : matriu[i];

        }

        return valorMinim;

    }

    public static boolean MatriuOrdenadaAsc(int[] matriu){

        int nombre = matriu[0];
        boolean ascandent = false;

        for (int i = 0; i < matriu.length; i++) {

            if (nombre < matriu[i]){

                ascandent = true;

            } else {
                ascandent = false;
            }

        }

        return ascandent;

    }

    public static boolean MatriuOrdenadaDesc(int[] matriu){

        int nombre = matriu[0];
        boolean descendent = false;

        for (int i = 0; i < matriu.length; i++) {

            if (nombre > matriu[i] || i % 2 == 0){

                descendent = true;

            } else {
                descendent = false;
            }

        }

        return descendent;

    }

    public static int[] MatriuInversa(int[] matriu){

        int[] novaMatriu = {12,13,54,23,12,354,34,3};
        int contadorInvers = matriu.length-1;
        int temp1;
        int temp2;

        for (int i = 0; i < matriu.length/2; i++) {

            temp1 = matriu[contadorInvers];
            temp2 = matriu[i];
            novaMatriu[i] = temp1;
            novaMatriu[contadorInvers] = temp2;

            contadorInvers--;

        }

        return novaMatriu;

    }

    public static int SercarNombre(int[] matriu, int NombreASercar){

        for (int i = 0; i < matriu.length; i++) {

            if (NombreASercar == matriu[i]){

                NombreASercar = i;
                i = matriu.length;

            } else if (i == matriu.length-1){

                NombreASercar = -1;

            }

        }

        return NombreASercar;

    }

    public static int NombreProperMitjana(int[] matriu){

        int Mitjana = MitjanaAritmetica(matriu);
        int PosicoIndex = 0;
        int Diferencia = 0;
        int temp1 = matriu[0] - Mitjana;

        for (int i = 0; i < matriu.length; i++) {

            if (matriu[i] - Mitjana > temp1){

                temp1 = matriu[i] - Mitjana;

                if (temp1 > matriu[PosicoIndex] - Mitjana) {

                    Diferencia = matriu[PosicoIndex] - Mitjana;

                }

                PosicoIndex = i;

            }

        }

        return Diferencia;

    }

    public static int[] IntercanviarValors(int[] matriu,int Posicio){

        int temp1;

        for (int i = 0; i < matriu.length; i++) {

            if (matriu[Posicio] < matriu[i]){

                temp1 = matriu[Posicio];
                matriu[Posicio] = matriu[i];
                matriu[i] = temp1;

                i = matriu.length;

            }

        }

        return matriu;

    }

    public static int[] OrdenacioArray(int[] matriu){

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

        return matriu;

    }

    public static void ImprimirArray(int[] matriu){

        for (int i = 0; i < matriu.length; i++) {

            System.out.print(matriu[i] + ",");

        }

    }

}
