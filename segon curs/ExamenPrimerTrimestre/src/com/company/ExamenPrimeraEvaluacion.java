package com.company;

import java.util.Locale;

public class ExamenPrimeraEvaluacion {

    public static void main(String[] args) {

        String provaExecucio = "Una noia anomenada Anna va anar a cercar al b)osc un home, alla hi va trobar un cec que intentava trobar un figura de metall d'un cuc ben rar. Astorada li va dir que si no ho intentava amb un radar no crec que el trobis. Amb un aparell d'aquests que fan pipiripip segur que el trobraras encara que estigui ben tapat !";

        char[] Delimitadors = {' ',',','-','.','!','?'};

    }

    public static char[] MatriuDeChars(String prova){

        String Minuscules = prova.toLowerCase(Locale.ROOT);
        char[] ArrayChars = new char[Minuscules.length()];

        for (int i = 0; i < Minuscules.length(); i++) {

            ArrayChars[i] = Minuscules.charAt(i);

        }

        return ArrayChars;

    }

    public static void ImprimirArrayChars(char[] ArrayChars){

        for (int i = 0; i < ArrayChars.length; i++) {

            System.out.print(ArrayChars[i]);

        }

    }

    public static boolean EsDelimitador(char[] ArrayChars,char[] Delimitadors){

        boolean EsDelimitador = false;
        int posicioDonada = 57; //es una coma en el text

        for (int i = 0; i < Delimitadors.length; i++) {

            if (Delimitadors[i] == ArrayChars[posicioDonada]){

                EsDelimitador = true;

            }

        }

        return EsDelimitador;


    }

    public static boolean EsIniciDeParaula(char[] ArrayChars,int PosicioDonada){

        boolean EsIniciDeParaula = false;

        if (PosicioDonada > 0 && ArrayChars[PosicioDonada-1] == ' '){

            EsIniciDeParaula = true;

        } else if (PosicioDonada == 0){

            EsIniciDeParaula = true;

        }

        return EsIniciDeParaula;

    }

    public static int LongitudParaula(char[] ArrayChars, int PosicioDonada){

        int longitud = 0;

        for (int i = PosicioDonada; i < ArrayChars.length; i++) {

            if (ArrayChars[i] != ' '){

                longitud++;

            } else {

                i = ArrayChars.length;

            }

        }

        return longitud;

    }

    public static String ParaulaAPartirDelIndex(char[] ArrayChars,int PosicioDonada){

        String Paraula = "";

        if (EsIniciDeParaula(ArrayChars,PosicioDonada)){

            for (int i = PosicioDonada; i < ArrayChars.length; i++) {

                if (ArrayChars[i] != ' '){

                    Paraula += ArrayChars[i];

                } else {

                    i = ArrayChars.length;

                }

            }

        }

        return Paraula;

    }

    public static boolean EsPalindroma(String Paraula){

        boolean EsPalindroma = false;
        String ParaulaInversa = "";

        for (int i = Paraula.length(); i > 0; i--) {

            char Lletra = Paraula.charAt(i-1);

            ParaulaInversa += Character.toString(Lletra);

        }

        if (Paraula.equals(ParaulaInversa)){

            EsPalindroma = true;

        }


        return EsPalindroma;

    }

    public static int NombreParaulesPalindromes(String Frase){

        int NombrePalindromes = 0;
        char[] TextCodificat = MatriuDeChars(Frase);
        String Paraula = "";

        for (int i = 0; i < TextCodificat.length; i++) {

            if (EsIniciDeParaula(TextCodificat,i)){

                Paraula = ParaulaAPartirDelIndex(TextCodificat,i);

                if (EsPalindroma(Paraula)){

                    ++NombrePalindromes;

                }

            }

        }

        return NombrePalindromes;

    }

    public static String[] ArrayDePalindromes(String Frase){

        String[] ArrayPalindromes = new String[NombreParaulesPalindromes(Frase)];
        char[] ArrayChar = MatriuDeChars(Frase);
        String Paraula = "";
        int NombrePolindromes = 0;

        for (int i = 0; i < ArrayChar.length; i++) {

            if (EsIniciDeParaula(ArrayChar,i)){

                Paraula = ParaulaAPartirDelIndex(ArrayChar,i);

                if (EsPalindroma(Paraula)){

                    ArrayPalindromes[NombrePolindromes] = Paraula;
                    ++NombrePolindromes;

                }

            }

        }

        return ArrayPalindromes;

    }

    public static void ImprimirArrayStrings(String[] ArrayStrings){

        for (int i = 0; i < ArrayStrings.length; i++) {

            System.out.println(ArrayStrings[i]);

        }

    }

    /*public static int CombinacionsDeLletres(char[] ArrayChars,String Frase){

        int NombreAparicions = 0;
        ArrayChars = MatriuDeChars(Frase);
        char[] ArrayAbecedario = {'a','b','c','d'};
        int[][] NombreAnex = new int[ArrayAbecedario.length][ArrayAbecedario.length];


        return NombreAparicions;

    }
     */

    public static String[] OrdenarArrayStrings(String[] ArrayDesordenada){

        String temp = "";

        for(int i=1; i<=ArrayDesordenada.length; i++) {
            for(int j=0; j<ArrayDesordenada.length-i; j++) {
                if( ArrayDesordenada[j].compareTo( ArrayDesordenada[j+1] ) > 0 ) {

                    temp   = ArrayDesordenada[j];
                    ArrayDesordenada[j]  = ArrayDesordenada[j+1];
                    ArrayDesordenada[j+1]= temp;

                }
            }
        }

        return ArrayDesordenada;

    }

    public static void ImprimirArrayStringsVerticals(String[] Array){

        String Paraula = "";

        for (int i = 0; i < Array.length; i++) {

            Paraula = Array[i];
            char[] ParaulaChar = MatriuDeChars(Paraula);

            for (int j = 0; j < ParaulaChar.length; j++) {

                for (int k = 0; k < i; k++) {

                    System.out.print(" ");

                }

                System.out.println(ParaulaChar[j]);

            }


        }

        // No funciona del tot be

    }

}
