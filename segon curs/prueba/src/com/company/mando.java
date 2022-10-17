package com.company;

public class mando {

    private String Color;
    private int NumeroDeTeclas;
    private int Tamaño;

    public mando(String Color,int NumeroDeTeclas,int Tamaño){

        this.Color = Color;
        this.NumeroDeTeclas = NumeroDeTeclas;
        this.Tamaño = Tamaño;

    }

    public void ImprimirValores(){

        System.out.println("Color del mando: " + Color);

    }

}
