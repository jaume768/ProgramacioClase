package com.company;
import java.util.Random;

public class MonstruoClass {

    PlayerClass player = new PlayerClass();
    Random rand = new Random();
    int vidaMonstruo;
    int ataqueMonstruo;
    int resultado = 40;

    public MonstruoClass(int ataqueM, int vidaM){

        this.ataqueMonstruo = ataqueM;
        this.vidaMonstruo = vidaM;

    }

    public int generarVida(){

        //generar vida monstruo, entre 10 y 20 puntos.
        vidaMonstruo = rand.nextInt(10)+15;

        return vidaMonstruo;

    }

    public int generarAtaque(){

        //generar ataque monstruo, entre 5 y 10 puntos.
        ataqueMonstruo = rand.nextInt(5)+5;

        return ataqueMonstruo;
    }


    public void generarTodo(){

        generarVida();
        generarAtaque();
        System.out.println("vida monstruo = " + vidaMonstruo);
        System.out.println("ataque monstruo = " + ataqueMonstruo);

    }

    public int recibirAtaque(){

        player.generarAtaque();
        resultado = vidaMonstruo - player.ataquePlayer;

        return resultado;

    }
}
