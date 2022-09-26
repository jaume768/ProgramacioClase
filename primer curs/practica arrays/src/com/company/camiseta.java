package com.company;

public class camiseta {

    private String color;
    private String tipus;
    private int preu;
    private String mida;

    public camiseta(String color, String tipus, int preu, String mida){

        this.color = color;
        this.tipus = tipus;
        this.preu = preu;
        this.mida = mida;

    }

    public void total(){

        System.out.println(color);
        System.out.println(tipus);
        System.out.println(preu);
        System.out.println(mida);

    }

}
