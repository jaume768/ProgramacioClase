package com.company;

import java.util.Arrays;

public class FizzBuzz {

        public static void main(String[] args) {

            int[] fizz = fizzBuzz(100,3);
            int[] buzz = fizzBuzz(100,5);
            int[] fizzBuzz = fizzBuzz(100,15);

            System.out.println("Nombres Fizz: ");
            System.out.println(Arrays.toString(fizz));
            System.out.println();
            System.out.println("Nombres buzz: ");
            System.out.println(Arrays.toString(buzz));
            System.out.println();
            System.out.println("Nombres fizzBuzz: ");
            System.out.println(Arrays.toString(fizzBuzz));
            System.out.println();

        }

        public static int[] fizzBuzz (int n,int multiple){

            int contadorMultiples = 0;

            for (int i = 0; i <= n; i++) {

                if (i % multiple == 0){
                    contadorMultiples++;
                }

            }

            int[] fizz = new int[contadorMultiples];
            int contador = 0;

            for (int i = 0; i <= n; i++) {

                if (i % multiple == 0){
                    fizz[contador] = i;
                    contador++;
                }

            }

            return fizz;
        }

}
