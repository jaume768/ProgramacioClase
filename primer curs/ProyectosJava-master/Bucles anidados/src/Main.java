import java.io.File;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Cuantas columnas? ");
        int columnas = scan.nextInt();
        System.out.println("Cuantas filas? ");
        int filas = scan.nextInt();

        for (int i = 0; i < columnas; i++){
            for (int x = 0; x < filas; x++){
                System.out.print("[]");
            }
            System.out.println("");
        }
    }
}
