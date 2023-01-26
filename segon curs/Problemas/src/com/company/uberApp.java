package com.company;

public class uberApp {

    public static void main(String[] args) {

        /*

            Crearemos una applicación para uber, tu credito = 20,

            uberx, uberXL, UberPlus, UberBlack, uberPlus

            1 km = [0.3,0.5,0.7,1,1.3]

            teneis que sacar que coche es mas chulo para la distancia establecida

            solucion(1,coches) = "UberBlack"

         */

        int credito = 20;
        String[] coches = {"uberx", "uberXL", "UberPlus", "UberBlack", "uberPlus"};
        double[] PrecioPorKilometro = {0.3,0.5,0.7,1,1.3};

        System.out.println(coches[Solucion(credito,coches,PrecioPorKilometro,80)]);


    }

    public static int Solucion(int credito, String[] coches, double[] PrecioPorKilometro,double kilometros){

        for (int i = 0; i < coches.length; i++) {

            if(PrecioPorKilometro[i] * kilometros > credito){
                if (i == 0){
                    return i;
                } else {
                    return (i-1);
                }
            }

        }

        return coches.length-1;
    }



}
