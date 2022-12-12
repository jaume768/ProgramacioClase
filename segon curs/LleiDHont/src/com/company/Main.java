package com.company;

public class Main {

    public static void main(String[] args) {

        int[] votacionsPerPartits = {120000,100000,40000,5000,2500};

        votacionsPerPartits = Barrera(votacionsPerPartits);

    }

    public static int votsMinims(int[] array){

        int SumaTotsElsVots = 0;
        int percentatge = 3;

        for (int i = 0; i < array.length; i++) {
            SumaTotsElsVots += array[i];

        }

        return (SumaTotsElsVots * percentatge)/100;

    }

    public static int PartitsSuperiorsAVotsMinims(int votsMinims,int[] array){

        int contador = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > votsMinims){
                ++contador;
            }

        }

        return contador;

    }

    public static int[] Barrera(int[] array){

        int PartitsSuperiosAVotsMinims = PartitsSuperiorsAVotsMinims(votsMinims(array),array);
        int votsMinims = votsMinims(array);

        int[] PartitsAmbLaBarrera = new int[PartitsSuperiosAVotsMinims];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > votsMinims){

                PartitsAmbLaBarrera[i] = array[i];

            }

        }

        return PartitsAmbLaBarrera;

    }

    public static void Escons(int[] array){



    }

}
