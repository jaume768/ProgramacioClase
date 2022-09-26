public class Ejercici10 {

    public static void main(String[] args) {

        int[] intArray = new int[]{ 1,2,3,4,5 };
        int suma = 0;
        int largoArray = intArray.length;
        int media = 0;
        int valorCercano = 0;
        for (int i = 0; i < intArray.length;i++){

            suma += intArray[i];

        }

        media = suma/largoArray;

        for (int i = 0; i < intArray.length;i++){

            if (intArray[i] < media){

                valorCercano = intArray[i];

            }

        }

        System.out.println("La media es: " + media);
        System.out.println("El valor mas cercano a la media es: " + valorCercano);
    }
}
