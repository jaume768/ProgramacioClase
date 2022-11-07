package com.company;

public class player {

    private int vida;
    private int ataque;

    public player(int vida, int ataque){

        this.vida = vida;
        this.ataque = ataque;

    }

    public int getAtaque() {
        return ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
