package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(MediaFinal());

    }

    public static int SacarMedia(){

        int nota1 = 2;
        int nota2 = 5;
        int nota3 = 5;

        int media = (nota1 + nota2 + nota3)/3;

        return media;

    }

    public static int MediaFinal(){

        int MediaFinal = SacarMedia() + 2;

        return MediaFinal;

    }

}

