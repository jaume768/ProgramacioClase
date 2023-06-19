package com.company;

public class Outputs {

    public void Menu(){
        System.out.println("Que juego quieres jugar?");
        System.out.println(" - ajedrez \n - damas \n - damas chinas \n - gato y raton");
    }

    public void PedirFicha(){
        System.out.println("Que ficha quieres mover?");
    }

    public void PedirMover(){
        System.out.println("Donde la quieres mover? ");
    }

    public void MovimientoInvalido(){
        System.out.println("movimiento invalido, vuelve a intentarlo!!");
    }

    public void Torn(int turno){
        System.out.println("Turno del jugador " + turno);
    }
}
