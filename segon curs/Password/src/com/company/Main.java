package com.company;

public class Main {

    public static void main(String[] args) {

        char[] AbecedarioYNumeros = new char[62];

        System.out.println("Contraseña fuerte: " + generarPasswordFuerte(AbecedarioYNumeros,10));

    }

    public static char[] RellenarArray(char[] AbecedarioYNumeros){

        char[] Final = new char[AbecedarioYNumeros.length];

        int min_num = 48;
        int max_num = 58;
        int min_mayus = 65;
        int max_mayus = 91;
        int min_minus = 97;
        int max_minus = 123;

        for (int i = 0; i < Final.length; i++) {

            if (min_num != max_num){

                Final[i] = (char) (min_num);

                min_num++;

            } else if (min_mayus != max_mayus){

                Final[i] = (char) (min_mayus);

                min_mayus++;

            } else if (min_minus != max_minus){

                Final[i] = (char) (min_minus);

                min_minus++;

            }

        }

        return Final;

    }

    public static String generarPassword(int Longitud, char[] ArrayRellenada){

        String Password = "";

        for (int i = 0; i < Longitud; i++) {

            int numeroAleatorio = (int) (Math.random()*62);

            Password += ArrayRellenada[numeroAleatorio];

        }

        return Password;

    }

    public static boolean esFuerte(String password){

        char[] ArrayMinucules = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] ArrayMayuscules = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'k', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] Numeros = {'0','1','2','3','4','5','6','7','8','9'};

        int minuscules = 0;
        int mayuscules = 0;
        int numeros = 0;

        for (int i = 0; i < password.length(); i++) {

            char Letra = password.charAt(i);

            for (int j = 0; j < ArrayMinucules.length; j++) {

                if (Letra == ArrayMinucules[j]){

                    minuscules++;

                }

            }

            for (int j = 0; j < ArrayMayuscules.length; j++) {

                if (Letra == ArrayMayuscules[j]){

                    mayuscules++;

                }

            }

            for (int j = 0; j < Numeros.length; j++) {

                if (Letra == Numeros[j]){

                    numeros++;

                }

            }

        }

        return (minuscules > 1 && mayuscules > 3 && numeros > 5);

    }

    public static String generarPasswordFuerte(char[] AbecedarioYNumeros,int longitud){

        String password = generarPassword(longitud,RellenarArray(AbecedarioYNumeros));
        int contador = 1;

        while (!esFuerte(password)){

            password = generarPassword(longitud,RellenarArray(AbecedarioYNumeros));
            System.out.println("Contraseña generada nuemro: " + contador);
            contador++;

        }

        return password;

    }

}
