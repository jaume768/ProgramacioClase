public class Ejercicio1 {

    public static void main(String[] args) {

        int[] intArray = new int[]{ 1,2,3,4,5 };
        int suma = 0;
        int media = 0;
        int largoArray = intArray.length;

        suma += intArray[0];
        suma += intArray[1];
        suma += intArray[2];
        suma += intArray[3];
        suma += intArray[4];

        media = suma/largoArray;

        System.out.println(media);

    }
}
