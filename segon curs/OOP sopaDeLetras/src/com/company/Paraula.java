package com.company;

public class Paraula {

    private Lletra[] lletres;

    public Paraula(Lletra[] lletres) {
        this.lletres = lletres;
    }

    public Paraula(String paraula){

        this.lletres = new Lletra[paraula.length()];

        for (int i = 0; i < lletres.length; i++) {

            this.lletres[i] = new Lletra(paraula.charAt(i));

        }

    }

    public Lletra[] getLletres() {
        return lletres;
    }

    public String TornarParaula(){

        String paraula = "";

        for (int i = 0; i < lletres.length; i++) {

            paraula += lletres[i].getLletra();

        }

        return paraula;

    }

}
