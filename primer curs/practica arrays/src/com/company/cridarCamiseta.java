package com.company;

public class cridarCamiseta {

    public static void main(String[] args) {

        camiseta comunicador1 = new camiseta("blau","Llarga",12,"M");
        camiseta comunicador2 = new camiseta("vermell","curt",2,"M");

        comunicador1.total();
        comunicador2.total();
    }
}
