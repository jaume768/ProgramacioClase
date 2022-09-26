public class Ejercicio8 {

    public static void main(String[] args) {

        int[] intArray = new int[]{ 1,2,3,4,5 };
        int[] arraInvertida = new int[intArray.length];
        for (int i = 0; i < intArray.length;i++){

            arraInvertida[i] = intArray[intArray.length-1-i];

        }

        intArray = arraInvertida;
        for (int x = 0; x < intArray.length;x++){

            System.out.print(intArray[x]);

        }


    }
}
