import java.util.Scanner;

public class CompararNombres {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Dime en primer nombre: ");
        String nombre1 = leer.nextLine();
        System.out.println("Dime el segundo nombre: ");
        String nombre2 = leer.nextLine();

        if (nombre1.equals(nombre2)){

            System.out.println("Son iguales");

        } else if (nombre1 != nombre2) {

            System.out.println("Son diferentes");

        }

    }

}
