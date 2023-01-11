package com.company;

public class Main {

    public static void main(String[] args) {



    }

    public static int PosicionMasCercano(int[] numeros, int num) {
        int cercano = 0;
        int diferencia = Integer.MAX_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                return i;
            } else {
                if(Math.abs(numeros[i]-num)<diferencia){
                    cercano=i;
                    diferencia = Math.abs(numeros[i]-num);
                }
            }
        }
        return cercano;
    }

    public static int contarNumeroArraysANumero(int[] i,int numero,int buscar){

        int contador = 0;
        int PosicionMasCercana = PosicionMasCercano(i,numero);

        if (numero > buscar){
            for (int j = PosicionMasCercana; j < i.length; j++) {

                contador++;

            }
        }

        return contador;

    }


}
