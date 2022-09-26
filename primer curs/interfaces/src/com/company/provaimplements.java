package com.company;

public class provaimplements implements car{

    public void encender(){

        System.out.println("Encendiendo cotxe....");

    }

    public void apagar() {

        System.out.println("apagando cotxe....");

    }

    @Override
    public void averia() {

        System.out.println("tienes una averia...");

    }
}
