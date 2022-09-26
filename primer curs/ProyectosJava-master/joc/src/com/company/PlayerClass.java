package com.company;
import java.util.Random;

public class PlayerClass {

    Random rand = new Random();
    int vidaPlayer;
    int ataquePlayer;

    public int generarVida(){

        //generar vida monstruo, entre 10 y 20 puntos.
        vidaPlayer = rand.nextInt(5)+10;

        return vidaPlayer;

    }

    public int generarAtaque(){

        //generar ataque monstruo, entre 5 y 10 puntos.
        ataquePlayer = rand.nextInt(5)+5;

        return ataquePlayer;
    }


    public void generarTodo(){

        generarVida();
        generarAtaque();
        System.out.println("vida player = " + vidaPlayer);
        System.out.println("ataque player = " + ataquePlayer);

    }


}
