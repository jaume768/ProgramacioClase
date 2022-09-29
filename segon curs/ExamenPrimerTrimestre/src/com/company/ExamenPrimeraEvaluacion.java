package com.company;

import java.util.Locale;

public class ExamenPrimeraEvaluacion {

    public static void main(String[] args) {

        String provaExecucio = "Una noia anomenada Anna va anar a cercar al b)osc un home, alla hi va trobar un cec que intentava trobar un figura de metall d'un cuc ben rar. Astorada li va dir que si no ho intentava amb un radar no crec que el trobis. Amb un aparell d'aquests que fan pipiripip segur que el trobraras encara que estigui ben tapat !";

        char[] Delimitadors = {' ',',','-','.','!','?'};

        //System.out.println(ParaulaAPartirDelIndex(MatriuDeChars(provaExecucio),4));

        System.out.println(EsPalindroma(ParaulaAPartirDelIndex(MatriuDeChars(provaExecucio),19)));

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
        int posicioDonada = 3;

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

}
