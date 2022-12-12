package com.company;

public class SalaCine {

    private int Files;
    private int Columnes;

    public SalaCine(int Files,int Columnes){
        this.Files = Files;
        this.Columnes = Columnes;
    }

    public boolean[][] crearSala(){

        boolean[][] sala = new boolean[Files][Columnes];

        return sala;
    }

    public static boolean SaberSiEstaReservada(boolean[][] SalaCine,int Fila, int Columna){

        return SalaCine[Fila][Columna];

    }

}
