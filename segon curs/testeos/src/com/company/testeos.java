package com.company;

public class testeos {

    public static void main(String[] args) {


    }
    //1- Calcula els nombres primers menors d’un nombre donat emprant el sedaç d’Erastótenes. El mètode ens ha de
    //retornar una matriu amb tots els nombres primers menors del nombre donat. ( 3 punts )

    public static boolean[] erastotenes (int n) {
        //cream matriu de booleans
        boolean[] primers = new boolean[n + 1];
        {


            // el 1 es perque començam per 1
            // si for menor a "n" seria ==> n = 0 ..... n-1==> length -1
            for (int k = 0; k < primers.length; k++)
                primers[k] = true;
            primers[0] = false;
            primers[1] = false;

            for (int i = 2; i < primers.length; i++) {
                if (primers[i]) {
                    for (int j = 2 * i; j < primers.length; j += i)
                        primers[j] = false;

                }

            }
        }
        return primers;
    }

    public static int [] primersMenorsOIgualsQue(boolean [] erastotenes){
        boolean[] primaris= erastotenes(10);
        for (int i = 0; i < erastotenes.length; i++) {
            // if (erastotenes[i] == true) &&(true == primaris);
        }




    }




}

