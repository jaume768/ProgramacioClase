package com.company;

public class Main {

    public static void main(String[] args) {

        ImprimirNumerosPerfectos(3);

    }

    // exercici 1

    // parte A
    public static boolean EsPerfecte( int n){

        int suma = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0){

                suma += i;

            }

        }

        return (suma == n);

    }

    // parte B
    public static void ImprimirNumerosPerfectos(int numeroADesear){

        int i = 0;
        int contador = 1;

        while(i < numeroADesear){

            if (EsPerfecte(contador)){
                System.out.println(contador);
                i++;
            }

            contador++;

        }

    }

    // exercici 2

    public static int[][] MultiplicarMatrizes(int[][] a, int[][] b){

        if (a.length != b[0].length){
            return null;
        }

        int[][] c = new int[a.length][b[0].length];
        // se comprueba si las matrices se pueden multiplicar
        if (a[0].length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        // aquí se multiplica la matriz
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }

        return c;

    }

    // exercici 4

    public static boolean Panagrama(String text){

        boolean EsPanagrama = true;
        char[] Alfabet = {'a','b','c','d','e','f','g','h'}; /*pereza copiar el alfabeto */

        for (int i = 0; i < Alfabet.length; i++) {
            for (int j = 0; j < text.length(); j++) {

                if (text.charAt(j) == Alfabet[i]) {
                    EsPanagrama = true;
                    break;
                } else {
                    EsPanagrama = false;
                }

            }

            if (!EsPanagrama) {
                return false;
            }

        }

        return true;

    }

    // exercici 3

    public static int conversio(char LletraRomana){

        int nombre = 0;
        char[] lletresRomanes = {'i','V','X','L','C','D','M'};
        int[] nombres = {1,5,10,50,100,500,1000};

        for (int i = 0; i < lletresRomanes.length; i++) {

            if (lletresRomanes[i] == LletraRomana){
                nombre = nombres[i];
            }

        }

        return nombre;

    }

    public static int[] ArrayAmbConversio(String NombresRomans){

        int[] array = new int[NombresRomans.length()];

        for (int i = 0; i < array.length; i++) {

            array[i] = conversio(NombresRomans.charAt(i));

        }

        return array;

    }

    public static int NombreFinal(String NombresRomans){

        int[] Nombres = ArrayAmbConversio(NombresRomans);
        int Suma = 0;

        if (Nombres.length > 1){

            for (int i = 0; i <= Nombres.length; i++) {

                if (i < Nombres.length-1){
                    if (Nombres[i] >= Nombres[i+1]){
                        Suma += Nombres[i];
                    } else {
                        Suma -= Nombres[i];
                    }
                } else if (i == Nombres.length){
                    Suma += Nombres[i-1];
                }

            }

        } else {
            Suma = Nombres[0];
        }

        return Suma;

        // XXIV = 24
        // 10,20,19,24

    }

}
