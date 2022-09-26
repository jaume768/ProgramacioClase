import java.util.Scanner;

public class MirarPares {

    public static void main(String[] args) {
        //Programa que pida que se introduzcan dos números enteros A y B por teclado y muestre los números pares que hay entre A y B.
        // A debe ser menor que B. Si no es así se mostrará un mensaje indicándolo y se vuelven a introducir.
        Scanner leer = new Scanner(System.in);

        int num1,num2,i;
        int x = 0;

        System.out.println("El primer numero tiene que ser menor que el segundo");

        do {
            System.out.println("Dime el primer numero: ");
            num1 = leer.nextInt();
            System.out.println("Dime el segundo numero: ");
            num2 = leer.nextInt();
            if (num1 > num2){
                System.out.println("El primer numero tiene que ser menor que el segundo! vuelve a repetirlo");
            }

        } while (num1 > num2);

        int array[] = new int[num2];

        System.out.print("[");

        for (i = num1; i < num2; i++){
            if (i % 2 == 0){
                array[i] = i;
                System.out.print(array[i] + ",");
            }
        }

        System.out.println("]");
    }
}
