package com.company;
import java.util.Random;
public class Juego {

    Random Rand = new Random();
    int probabilidad50;

    public int probabilidad5(){

        probabilidad50 = Rand.nextInt(100);
        return  probabilidad50;

    }
}
