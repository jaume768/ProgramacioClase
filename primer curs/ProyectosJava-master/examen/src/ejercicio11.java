public class ejercicio11 {

    public static void main(String[] args) {

        int[] intArray = new int[]{ 1,2,3,4,5 };
        int numMayor = 0;
        int posicion = 3;
        int posicionNumMayor = 0;
        for (int i = 0; i < intArray.length;i++){

            if (i < posicion){

                if (numMayor < intArray[i]){

                    posicionNumMayor = i;
                    numMayor = intArray[i];
                    intArray[posicionNumMayor] = intArray[posicion];

                }

            }

        }

        intArray[posicion] = numMayor;

        for (int i = 0; i < intArray.length;i++){

            System.out.print(intArray[i]);

        }
    }
}
