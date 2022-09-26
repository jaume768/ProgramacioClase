package com.company;
import java.util.Scanner;

public class TresEnRaya2 {

    public static void main(String[] args) {

        String[][] ArrayTotal = new String[3][3];

        RellenarPrimerArray(ArrayTotal);
        ImprimirArray(ArrayTotal);
        InsetarValors(ArrayTotal);
    }

    public static void ImprimirArray(String[][] ArrayTotal){


        for (int i = 0; i < ArrayTotal.length; i++) {

            for (int j = 0; j < ArrayTotal.length; j++) {

                if (ArrayTotal[i][j] == null){

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
        boolean JaTeValor = false;

        System.out.println("Quieres jugar solo (contra la maquina) o contra alguien? 1 = maquina, 2 = amb algu");
        int Jugar = leer.nextInt();

        while (!ComprovarFiles(ArrayTotal,posicio_x,posicio_y) && !ComprovarColumnes(ArrayTotal,posicio_x,posicio_y) && !ComprovarEnCreu(ArrayTotal,posicio_x,posicio_y) && !ComprovarEmpate(ArrayTotal)){

            if (Jugar == 2){

                System.out.println("------ Equip X -----------");

                posicio_y = PedirPosicionY();

                posicio_x = PedirPosicionX();

                EquipX(ArrayTotal,posicio_x,posicio_y,JaTeValor);

                if (!ComprovarFiles(ArrayTotal,posicio_x,posicio_y) && !ComprovarColumnes(ArrayTotal,posicio_x,posicio_y) && !ComprovarEnCreu(ArrayTotal,posicio_x,posicio_y) && !ComprovarEmpate(ArrayTotal)){

                    System.out.println("------ Equip O -----------");

                    posicio_y = PedirPosicionY();

                    posicio_x = PedirPosicionX();

                    EquipO(ArrayTotal,posicio_x,posicio_y,JaTeValor);

                }
            } else if(Jugar == 1){

                EquipX(ArrayTotal,posicio_x,posicio_y,JaTeValor);

                if (!ComprovarFiles(ArrayTotal,posicio_x,posicio_y) && !ComprovarColumnes(ArrayTotal,posicio_x,posicio_y) && !ComprovarEnCreu(ArrayTotal,posicio_x,posicio_y) && !ComprovarEmpate(ArrayTotal)){

                    EquipO(ArrayTotal,posicio_x,posicio_y,JaTeValor);

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

    public static boolean ComprovarEmpate(String[][] ArrayTotal){

        boolean completa = false;
        int suma = 0;

        for (int i = 0; i < ArrayTotal.length; i++) {
            for (int j = 0; j < ArrayTotal.length; j++) {

                if (ArrayTotal[i][j] != "-"){

                    suma ++;

                }

                if (suma == 9){

                    completa = true;

                }

            }

        }

        return completa;

    }

    public static int PedirPosicionX(){

        Scanner leer = new Scanner(System.in);

        System.out.println("Dime la columna ");
        int posicio_x = leer.nextInt();

        return  posicio_x;

    }

    public static int PedirPosicionY(){

        Scanner leer = new Scanner(System.in);

        System.out.println("Dime la fila ");
        int posicio_y = leer.nextInt();

        return  posicio_y;
    }

    public static void EquipX(String[][] ArrayTotal,int posicio_x, int posicio_y, boolean JaTeValor){

        while(JaTeValor != true){

            if (ArrayTotal[posicio_y-1][posicio_x-1].equals("X") || ArrayTotal[posicio_y-1][posicio_x-1].equals("O")){

                System.out.println("Ja hi ha un valor anteriorment, dim un altre posicio");

            } else {

                JaTeValor = true;

            }
        }

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

        ComprovarEmpate(ArrayTotal);

        if (ComprovarEmpate(ArrayTotal)){

            System.out.println("Empate");

        }

    }

    public static void EquipO(String[][] ArrayTotal,int posicio_x, int posicio_y, boolean JaTeValor){

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

        ComprovarEmpate(ArrayTotal);

        if (ComprovarEmpate(ArrayTotal)){

            System.out.println("Empate");

        }

    }

}