import java.util.ArrayList;
import java.util.Scanner;

public class alberto {
    public static void main(String[] args) {
        tresEnRaya();

    }

    public static void tresEnRaya () {
        char[][] tablero = {

            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '},

        };
        boolean hayGanador = false;

        for (int i = 1; i < 10 ;i++ ){

            if (i % 2 == 0 ){
                char opcion = 'X';
                imprimirTextoJuego(tablero, i, opcion);
                anadirValores(tablero, opcion);
            } else {
                char opcion = '0';
                imprimirTextoJuego(tablero, i,opcion);
                anadirValores(tablero,opcion);
            }


            if (comprobarTablero(tablero)){
                hayGanador = true;
                imprimirTablero(tablero);
                break;
            }
        }
        if (!hayGanador){
            imprimirTablero(tablero);
            System.out.println("No hay ganadores. Esto es un empate. Vuelve a intentarlo.");
        }
    }


    public static char[][] anadirValores (char [][] tablero, char opcion){
        boolean noCorrecto = true;
        while (noCorrecto){
            Scanner selectFila = new Scanner(System.in);
            System.out.println("\nSOLO SE ACEPTAN VALORES ENTRE EL 1 Y EL 3!! No me seas subnormal.");
            System.out.print("Selecciona la columna: ");
            int col = Integer.parseInt(selectFila.next()); //Si pones una letra peta
            System.out.println("\nHaz seleccionado esta columna: " + col);
            System.out.print("Selecciona la fila: ");
            int fila = Integer.parseInt(selectFila.next()); //Si pones una letra peta
            System.out.print("\n Haz seleccionado esta fila: " + fila +"\n\n");

            --fila;
            --col;

            if ((fila == 0 || fila == 1 || fila == 2) && (col == 0 || col == 1 || col == 2) ){
                if (tablero[fila][col] == ' '){
                    tablero[fila][col] = opcion;
                    noCorrecto = false;
                } else {
                    System.out.println("La casilla ya tiene un valor. Porfavor selecciona otra casilla.");
                }
            }
        }

        return tablero;
    }

    public static boolean comprobarTablero (char[][] tablero){
        //Columnas

        char ganador = ' ';

        for (int i = 0; i < 3 ; i++){
            boolean enRayaColumna = true;
            char primerValor = tablero[0][i];

            if (esValido(primerValor)){
                for (int k = 0; k < 3 ; k++ ){
                    if (primerValor == tablero[k][i] && enRayaColumna){
                        enRayaColumna = true;
                        ganador = tablero[k][i];
                    } else {
                        enRayaColumna = false;
                        break;
                    }
                }

                if (enRayaColumna){
                    System.out.println("El ganador es " + ganador );
                    return true;
                }
            }
        }

        //Filas

        for (int i = 0; i < 3 ; i++){
            boolean enRayaFila = true;
            char primerValor = tablero[i][0];

            if (esValido(primerValor)){
                for (int k = 0; k < 3 ; k++ ){
                    if (primerValor == tablero[i][k] && enRayaFila){
                        enRayaFila = true;
                        ganador = tablero[i][k];
                    } else {
                        enRayaFila = false;
                        break;
                    }
                }

                if (enRayaFila){
                    System.out.println("El ganador es " + ganador );
                    return true;
                }
            }
        }

        //Inclinados


        if (tablero[0][0] != ' ' && tablero[1][1] != ' ' && tablero[2][2] != ' '){
            if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]){
                System.out.println("El ganador es " + tablero[1][1]);
                return true;
            }
        }

        if (tablero[0][2] != ' ' && tablero[1][1] != ' ' && tablero[2][0] != ' ' ){
            if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]){
                System.out.println("El ganador es " + tablero[1][1]);
                return true;
            }
        }

        return false;
    }

    public static boolean esValido (char i){
            return (i == 'X' || i == '0');
    }

    public static void imprimirTextoJuego (char[][] tablero, int turno, char opcion){

        System.out.print("          ");
        System.out.println("\n 3 en Ralla ");
        imprimirTablero(tablero);
        System.out.println("\nTe encuentras en el turno " + turno + "." + "  Eres el simbolo " + opcion);
    }


    public static void imprimirTablero (char[][] tablero){
        System.out.print("          ");
        System.out.println("___________________");
        for (int fila = 0; fila < 3 ; fila++){
            System.out.print("          |");
            for (int col = 0; col < 3; col++ ){
                if (col == 2 ){
                    System.out.println( "  " + tablero[fila][col] + "  |");
                } else {
                    System.out.print( "  " + tablero[fila][col] + "  |");
                }
            }
        }
        System.out.print("          ");
        System.out.println("___________________");

    }


}