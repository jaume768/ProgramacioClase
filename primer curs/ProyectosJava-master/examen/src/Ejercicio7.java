public class Ejercicio7 {

    public static void main(String[] args) {

        int[] intArray = new int[]{ 5,4,3,2,1};
        int num = intArray[0];
        boolean ascendente = false;

        for (int i = 0; i < intArray.length;i++){

            if (intArray[i] % 2 == 0){

                if (num < intArray[i]){

                    ascendente = false;

                }

                if (num > intArray[i]){

                    ascendente = true;

                }
            }

        }

        System.out.println("Es ascendente? " + ascendente);

    }
}
