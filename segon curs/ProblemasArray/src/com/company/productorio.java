package com.company;

public class productorio {

    public static void main(String[] args) {

        float Numero = 5.8F;

        int Productorio = (int) Numero * SacarDecimales(Numero);

        System.out.println(Productorio);

    }

    public static int SacarDecimales(float Numero){


        float NumeroSoloDecimales = Numero - (int) Numero;

        float Decimales = NumeroSoloDecimales * 10;

        return (int) Decimales;

    }
}
