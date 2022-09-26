package com.company;
import java.util.Scanner;

public class TresEnRaya {

    public static void main(String[] args) {

        String[][] ArrayTotal = new String[3][3];

        RellenarPrimerArray(ArrayTotal);
        ImprimirArray(ArrayTotal);
        InsetarValors(ArrayTotal);
    }

    public static void ImprimirArray(String[][] ArrayTotal){


        for (int i = 0; i < ArrayTotal.length; i++) {

            for (int j = 0; j < ArrayTotal.length; j++) {

                if (ArrayTotal[i][j].equals("-")){

                    System.out.print("[ ] ");

                }else {

                    System.out.print( "[" + ArrayTotal[i][j] + "] ");
                }


            }

            System.out.println();

        }

    }

    public static void RellenarPrimerArray(String[][] ArrayTotal){

        for (int i = 0; i < ArrayTotal.length; i++) {
            for (int j = 0; j < ArrayTotal.length; j++) {

                ArrayTotal[i][j] = "-";

            }

        }

    }

    public static void InsetarValors(String[][] ArrayTotal){

        Scanner leer = new Scanner(System.in);

        int posicio_x = 0;
        int posicio_y = 0;

        while (!ComprovarFiles(ArrayTotal,posicio_x,posicio_y) && !ComprovarColumnes(ArrayTotal,posicio_x,posicio_y) && !ComprovarEnCreu(ArrayTotal,posicio_x,posicio_y)){

            System.out.println("------ Equip X -----------");
            System.out.println("Dime la fila a la qual insertar el valor ");
            posicio_y = leer.nextInt();

            System.out.println("Dime la columna ");
            posicio_x = leer.nextInt();

            ArrayTotal[posicio_y-1][posicio_x-1] = "X";

            ImprimirArray(ArrayTotal);
            ComprovarFiles(ArrayTotal,posicio_x,posicio_y);
            if (!ComprovarFiles(ArrayTotal,posicio_x,posicio_y)){

                ComprovarColumnes(ArrayTotal,posicio_x,posicio_y);

            }

            if(!ComprovarColumnes(ArrayTotal,posicio_x,posicio_y)){

                ComprovarEnCreu(ArrayTotal,posicio_x,posicio_y);

            }

            if (ComprovarColumnes(ArrayTotal,posicio_x,posicio_y) || ComprovarFiles(ArrayTotal,posicio_x,posicio_y) || ComprovarEnCreu(ArrayTotal,posicio_x,posicio_y)){

                System.out.println("Guaña el equip X");

            }


            if (!ComprovarFiles(ArrayTotal,posicio_x,posicio_y) && !ComprovarColumnes(ArrayTotal,posicio_x,posicio_y) && !ComprovarEnCreu(ArrayTotal,posicio_x,posicio_y)){

                System.out.println("------ Equip O -----------");
                System.out.println("Dime la fila a la qual insertar el valor ");
                posicio_y = leer.nextInt();

                System.out.println("Dime la columna ");
                posicio_x = leer.nextInt();

                ArrayTotal[posicio_y-1][posicio_x-1] = "O";

                ImprimirArray(ArrayTotal);
                ComprovarFiles(ArrayTotal,posicio_x,posicio_y);
                if (!ComprovarFiles(ArrayTotal,posicio_x,posicio_y)){

                    ComprovarColumnes(ArrayTotal,posicio_x,posicio_y);

                }

                if(!ComprovarColumnes(ArrayTotal,posicio_x,posicio_y)){

                    ComprovarEnCreu(ArrayTotal,posicio_x,posicio_y);

                }

                if (ComprovarColumnes(ArrayTotal,posicio_x,posicio_y) || ComprovarFiles(ArrayTotal,posicio_x,posicio_y) || ComprovarEnCreu(ArrayTotal,posicio_x,posicio_y)){

                    System.out.println("Guaña el equip O");

                }

            }

        }

    }

    public static boolean ComprovarFiles(String[][] ArrayTotal, int posicio_x, int posicio_y){

        boolean acabat = false;

        for (int files = 0; files < ArrayTotal.length; files++) {
            for (int columnes = 0; columnes < ArrayTotal.length; columnes++) {

                if (posicio_x-1 == 1){

                    if (ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y-1][posicio_x])  && ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y-1][posicio_x-2]) ){

                        acabat = true;

                    }

                }

                if (posicio_x-1 == 0){

                    if (ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y-1][posicio_x]) && ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y-1][posicio_x+1])){

                        acabat = true;

                    }

                }

                if (posicio_x-1 == 2){

                    if (ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y-1][posicio_x-2]) && ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y-1][posicio_x-3])){

                        acabat = true;

                    }

                }

            }

        }

        return acabat;

    }

    public static boolean ComprovarColumnes(String[][] ArrayTotal, int posicio_x, int posicio_y){

        boolean acabat = false;

        for (int files = 0; files < ArrayTotal.length; files++) {
            for (int columnes = 0; columnes < ArrayTotal.length; columnes++) {

                if (posicio_y-1 == 0){

                    if (ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y][posicio_x-1]) && ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y+1][posicio_x-1])){

                        acabat = true;

                    }

                }

                if (posicio_y-1 == 1){

                    if (ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y][posicio_x-1]) && ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y-2][posicio_x-1])){

                        acabat = true;

                    }

                }

                if (posicio_y-1 == 2){

                    if (ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y-2][posicio_x-1]) && ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y-3][posicio_x-1])){

                        acabat = true;

                    }

                }

            }

        }

        return acabat;

    }

    public static boolean ComprovarEnCreu(String[][] ArrayTotal, int posicio_x, int posicio_y) {

        boolean acabat = false;

        if (posicio_y-1 == 0 && posicio_x-1 == 0){

            if (ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y][posicio_x]) && ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y+1][posicio_x+1])){

                acabat = true;

            }

        }

        if (posicio_y-1 == 0 && posicio_x-1 == 2){

            if (ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y][posicio_x-2]) && ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y+1][posicio_x-3])){

                acabat = true;

            }

        }

        if (posicio_y-1 == 1 && posicio_x-1 == 1){

            if (ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y-2][posicio_x-2]) && ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y][posicio_x])){

                acabat = true;

            }

        }

        if (posicio_y-1 == 1 && posicio_x-1 == 1){

            if (ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y-2][posicio_x]) && ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y][posicio_x-2])){

                acabat = true;

            }

        }

        if (posicio_y-1 == 2 && posicio_x-1 == 0){

            if (ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y-2][posicio_x]) && ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y-3][posicio_x+1])){

                acabat = true;

            }

        }

        if (posicio_y-1 == 2 && posicio_x-1 == 2){

            if (ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y-2][posicio_x-2]) && ArrayTotal[posicio_y-1][posicio_x-1].equals(ArrayTotal[posicio_y-3][posicio_x-3])){

                acabat = true;

            }

        }

        return acabat;

    }

}
