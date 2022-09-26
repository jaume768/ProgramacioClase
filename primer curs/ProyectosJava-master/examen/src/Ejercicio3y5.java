public class Ejercicio3y5 {

    public static void main(String[] args) {

        int[] intArray = new int[]{ 1,2,3,4,5 };
        int max = 0;
        int min = 0;
        for (int i = 0; i < intArray.length; i++) {

            if(intArray[i]>max){

                max=i;

            }

            if(intArray[i]<min){

                min=i;

            }

        }

        System.out.println("posicion del numero maximo: " + max);
        System.out.println("posicion del numero minimo: " + min);

    }
}
