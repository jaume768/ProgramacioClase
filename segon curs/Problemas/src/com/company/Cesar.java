package com.company;

public class Cesar {

    public static void main(String[] args) {

        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

        String frase = "hol-azwy";
        int posicion = 2;

        String texto = codificar(letras, frase,posicion);
        System.out.println("Texto codificado: " + texto);

        texto = descodificar(letras, texto,posicion);
        System.out.println("Texto descodificado: " + texto);

    }

    public static String codificar(String letras, String texto,int posicion){
        String textoCodificado = "";

        texto = texto.toUpperCase();

        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);

            int pos = letras.indexOf(caracter);

            if(pos == -1){
                textoCodificado += caracter;
            }else{
                textoCodificado += letras.charAt( (pos + posicion) % letras.length() );
            }

        }

        return textoCodificado;
    }

    public static String descodificar(String letras, String texto,int posicion){
        String textoDescodificado = "";

        texto = texto.toUpperCase();

        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);

            int pos = letras.indexOf(caracter);

            if(pos == -1){
                textoDescodificado += caracter;
            }else{
                if(pos - posicion < 0){
                    textoDescodificado += letras.charAt( letras.length() + (pos - posicion) );
                }else{
                    textoDescodificado += letras.charAt( (pos - posicion) % letras.length() );
                }
            }

        }

        return textoDescodificado;
    }
}
