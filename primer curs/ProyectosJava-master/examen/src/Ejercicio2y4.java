public class Ejercicio2y4 {

    public static void main(String[] args) {

        int[] intArray = new int[]{ 8,3,4,1,2 };
        int max = 0;
        int min = 8;
        for (int i = 0; i < intArray.length; i++) {

            if(intArray[i]>max){

                max=intArray[i];

            }

            if(intArray[i]<min){

                min=intArray[i];

            }

        }

        System.out.println("maximo: " + max);
        System.out.println("minimo: " + min);
    }

}
