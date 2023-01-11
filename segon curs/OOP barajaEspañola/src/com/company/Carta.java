package com.company;

public class Carta {

    private int Numero;
    private String tipo;
    private int Puntos;

    public Carta(int numero, String tipo,int Puntos) {
        this.Numero = numero;
        this.tipo = tipo;
        this.Puntos = Puntos;
    }

    public int getNumero() {
        return Numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int puntos) {
        Puntos = puntos;
    }
}
