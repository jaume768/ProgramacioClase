package com.company;

import java.util.Scanner;

public class Main {

    /*
    1 Crear una clase principal que permita la selección del juego a jugar y la creación del tablero correspondiente a ese juego.
    2 Crear una clase para cada juego que herede de una clase abstracta "Juego" que contenga los métodos comunes a todos los juegos.
    3 Crear una clase para el tablero de ajedrez que tenga la lógica del juego y permita mover las piezas, validar los movimientos, detectar cuando se ha ganado o perdido la partida, etc.
    4 Crear clases para cada tipo de pieza que hereden de una clase abstracta "Pieza" y tengan su lógica específica de movimiento.
    5 Crear una clase para el jugador que tenga su nombre y color de piezas.


    Crear una clase concreta "Damas" que herede de la clase abstracta "Juego" y que implemente los métodos específicos de las damas.
    Crear una clase concreta "Ajedrez" que herede de la clase abstracta "Juego" y que implemente los métodos específicos del ajedrez.
    Crear las clases concretas para cada tipo de pieza de las damas (fichas) y del ajedrez (peon, torre, caballo, alfil, reina, rey) que hereden de la clase abstracta "Pieza" y tengan su lógica específica de movimiento.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el juego a jugar: ");
        System.out.println("1. Ajedrez ");
        System.out.println("2. Damas ");
        int opcion = scanner.nextInt();

        Juego juego = null;

        if (opcion == 2){
            juego = new Damas();
        }

        juego.iniciarJuego();

    }
}
