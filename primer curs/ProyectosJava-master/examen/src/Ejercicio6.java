public class Ejercicio6 {

    public static void main(String[] args) {

        int[] intArray = new int[]{ 1,2,3,4,5 };
        int num = intArray[0];
        boolean ascendente = false;

        for (int i = 0; i < intArray.length;i++){

            if (num < intArray[i]){

                ascendente = true;

            }

            if (num > intArray[i]){

                ascendente = false;

            }

        }

        System.out.println("Es ascendente? " + ascendente);

    }
}
