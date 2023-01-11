package com.company;

public class Main {

    public static void main(String[] args) {

        String[] tipos = {"espada","basto","oro","copas"};
        Carta[] Baraja = new Carta[40];

        Baraja = generarBaraja(Baraja,tipos);

        Imprimir(Baraja);

    }

    public static Carta[] generarBaraja(Carta[] Baraja,String[] tipos){

        int prova = 0;
        int contador = 0;

        for (int i = 0; i < tipos.length; i++) {

            for (int j = prova; j < 40; j++) {

                if (contador == 7 || contador == 8 || contador == 9){
                    if (contador == 7)
                        Baraja[j] = new Carta(((contador)+2),tipos[i],2);
                    if (contador == 8)
                        Baraja[j] = new Carta(((contador)+2),tipos[i],3);
                    if (contador == 9)
                        Baraja[j] = new Carta(((contador)+2),tipos[i],4);
                } else {
                    if (contador == 0){
                        Baraja[j] = new Carta(contador,tipos[i],11);
                    } else if (contador == 2){
                        Baraja[j] = new Carta((contador),tipos[i],10);
                    } else {
                        Baraja[j] = new Carta((contador),tipos[i],0);
                    }
                }

                if (j == 9 || j == 19 || j == 29 || j == 39){
                    break;
                }

                contador++;

            }

            prova = prova + 10;
            contador = 0;

        }

        return Baraja;

    }

    public static void Imprimir(Carta[] Baraja){

        for (int i = 0; i < Baraja.length; i++) {

            if (i == 0 || i == 10 || i == 20 || i == 30){
                System.out.println(Baraja[i].getTipo() + ": ");
            }

            System.out.println("Numero: " + (Baraja[i].getNumero()+1) + ", puntos: " + Baraja[i].getPuntos());

        }

    }

}
