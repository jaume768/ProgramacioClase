package com.company;

public class palindroma {

    public static void main(String[] args) {

        String Palindroma = "tommot";
        System.out.println(esPalindroma(Palindroma));

    }

    public static boolean esPalindroma(String palabra){

        String PalabraInvertida = "";

        for (int i = palabra.length(); i > 0; i--) {

            PalabraInvertida += palabra.charAt(i-1);

        }

        return PalabraInvertida.equals(palabra);

    }
}
