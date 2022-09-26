package com.company;
import java.util.Scanner;

public class SinusCosinus {

    public static void main(String[] args) {


        final double diferencia = 0.001;
        Scanner leer = new Scanner(System.in);

        System.out.println("Dime X: ");
        long x = leer.nextInt();

        System.out.println(Total(x,diferencia));

    }

    public static long Factorial(long x) {
        long resultat = 1;
        for (int i = 2; i <= x; i++) {

            resultat = resultat * i;

        }

        return resultat;
    }

    public static long Elevat(long num, long elevat){

        long resposta = 1;
        for(int i = 1; i<= elevat; i++){
            resposta = resposta*num;
        }
        /*if(num > 0 && elevat==0){
            return resposta;
        }
        else if(num == 0 && elevat>=1){
            return 0;
        }
        else{
            for(int i = 1; i<= elevat; i++){
                resposta = resposta*num;
            }
            return resposta;*/

        return resposta;
    }

    public static double Total(long x,double diferencia){

        boolean EsMenor = false;
        long i = 0;
        double Primer = 0,Segon,Sumatori = 0;


        do{

            Segon = Primer;
            Primer = Math . pow (x , i )/Factorial(i);

            Sumatori = Sumatori + Primer;

            i ++;

        }while (Math.abs(Primer-Segon) >= 0.001);

        return Sumatori;

    }
}
