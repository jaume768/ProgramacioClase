public class Ejercicio9 {

    public static void main(String[] args) {

        int[] intArray = new int[]{ 1,2,3,4,5 };
        int pedir = 3;
        int num = 0;
        int posicion = 0;
        for (int i = 0; i < intArray.length;i++){

            if (intArray[i] == pedir){

                posicion = i;
                num = pedir;

            } else if (num != pedir){

                num = -1;

            }

        }

        System.out.println("el nombre " + pedir + "es troba a la posicio: " + posicion);
        System.out.println("el valor es: " + num);
    }


}
