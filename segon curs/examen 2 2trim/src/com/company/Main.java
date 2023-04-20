package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] parties = {"Party A", "Party B", "Party C"};  // Nombres de partidos
        int[] votes = {120000, 100000, 40000};  // Votos de cada partido
        int seats = 8;  // Número de escaños a repartir

        int[] allocatedSeats = sainteLague(parties, votes, seats);
        System.out.println(Arrays.toString(allocatedSeats));

        FIFO lista = new FIFO();

        lista.add("elemento");
        lista.remove();
        lista.remove();

        LIFO cola = new LIFO();

    }

    public static int[] buble(int[] arr){

        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1])
                    arr[j] ^= arr[j + 1] ^= arr[j] ^= arr[j + 1];

        return arr;
    }

    public static int[] sainteLague(String[] parties, int[] votes, int seats) {
        int numParties = parties.length;
        int[] allocatedSeats = new int[numParties];  // Inicializar arreglo de escaños

        // Calcular coeficientes de división
        double[] divisors = new double[2 * seats];
        for (int i = 0; i < divisors.length; i++) {
            divisors[i] = 2 * i + 1;
        }

        // Repartir los escaños
        for (int s = 0; s < seats; s++) {
            int maxIndex = 0;
            double maxQuotient = Double.NEGATIVE_INFINITY;

            // Calcular los cocientes de los partidos
            for (int i = 0; i < numParties; i++) {
                double quotient = votes[i] / divisors[2 * allocatedSeats[i] + 1];
                if (quotient > maxQuotient) {
                    maxQuotient = quotient;
                    maxIndex = i;
                }
            }

            // Asignar el escaño al partido con el cociente máximo
            allocatedSeats[maxIndex]++;
        }

        return allocatedSeats;
    }
}
