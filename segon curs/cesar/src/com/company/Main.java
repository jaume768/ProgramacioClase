package com.company;

public class Main {

    public static void main(String[] args) {

        String text = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        System.out.println(Cifrar(6,text));

    }

    public static String cambiarLletra(int desplazamiento,int posicion, String text){

        String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        char actual = text.charAt(posicion);
        int cambio = ((text.length()-1)+desplazamiento) - text.length()-1;
        char desplazo = ' ';
        if (cambio >= 0){
            desplazo = (posicion + desplazamiento) < abc.length() ? text.charAt((posicion + desplazamiento)) : text.charAt(cambio);
        } else {
            desplazo = actual;
        }
        String textCod = "";
        boolean major = (posicion + desplazamiento) > text.length();


        for (int i = 0; i < text.length(); i++) {

            if (i == posicion){
                textCod += desplazo;
            } else if ( i == (posicion + desplazamiento) && !major){
                textCod += actual;
            } else if (major && i == cambio){
                textCod += actual;
            } else {
                textCod += text.charAt(i);
            }

        }

        return textCod;

    }

    public static String Cifrar(int desplazamiento, String text){

        for (int i = 0; i < text.length(); i++) {

            text = cambiarLletra(desplazamiento,i,text);

        }

        return text;

    }

}
