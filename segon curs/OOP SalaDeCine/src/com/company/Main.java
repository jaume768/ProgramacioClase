package com.company;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        usuarios[][] SalaCine = new usuarios[9][8];
        SalaCine = AsientosVacios(SalaCine);
        SalaCine = Final(SalaCine,30);
        imprimirArray(SalaCine);
        System.out.println();
        System.out.println("Sillas ocupadas: " + contadorOcupadas(SalaCine));

    }

    public static void imprimirArray(usuarios[][] array){

        char letra = 'A';

        System.out.println();

        for (int i = array.length-1; i >= 0; i--) {
            for (int j = array[0].length-1; j >= 0; j--) {

                String ocupada = (array[i][j].isOcupada()) ? "(Y) " : "(N) ";

                System.out.print((i+1));
                System.out.print(letra + ocupada);
                letra++;

            }

            System.out.println();
            letra = 'A';

        }

    }

    public static usuarios[][] AsientosVacios(usuarios[][] SalaCine){

        int contador = 0;

        for (int i = 0; i < SalaCine.length; i++) {
            for (int j = 0; j < SalaCine[0].length; j++) {

                SalaCine[i][j] = new usuarios(contador,false);
                contador++;

            }

        }

        return SalaCine;
    }

    public static usuarios[][] InsertarUsuario(usuarios[][] array,int Fila, int Columna){

        array[Fila][Columna].setOcupada(true);

        return array;
    }

    public static usuarios[][] Final(usuarios[][] array, int NumeroDeUsuarios){

        int Fila;
        int Columna;
        
        for (int i = 0; i < NumeroDeUsuarios;) {

            Fila = (int)Math.floor(Math.random()*9);
            Columna = (int)Math.floor(Math.random()*8);

            if (!array[Fila][Columna].isOcupada()){

                array = InsertarUsuario(array,Fila,Columna);
                i++;

            }

        }

        return array;

    }

    public static int contadorOcupadas(usuarios[][] array){

        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

                if (array[i][j].isOcupada()){
                    contador++;
                }

            }

        }

        return contador;
    }

}
