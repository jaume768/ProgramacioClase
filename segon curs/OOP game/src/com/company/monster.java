package com.company;

public class monster {

    private int vida;
    private int ataque;

    public monster(int vida, int ataque){

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
