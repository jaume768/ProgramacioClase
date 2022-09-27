package com.company;

public class ballena {

    private int kilos;
    private int tamaño;

    public ballena (int kilos, int tamaño){

        this.kilos = kilos;
        this.tamaño = tamaño;

    }

    public void setKilos(int kg){
        kilos = kg;
    }

    public int getKilos(){
        return kilos;
    }

    public void settamaño(int tm){
        tamaño = tm;
    }

    public int gettamaño(){
        return tamaño;
    }

}
