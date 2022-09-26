import java.util.Scanner;

public class SumaConBucle {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int i;
        int A;

        for (i = 0; i < 10; i++){

            System.out.println("Dime el numero: ");
            A = leer.nextInt();
            suma += A;

        }

        System.out.println("La suma es: " + suma);

    }
}
