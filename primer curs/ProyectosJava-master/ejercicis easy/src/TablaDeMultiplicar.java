import java.util.Scanner;
public class TablaDeMultiplicar {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Dime el numero:");
        int numero = leer.nextInt();
        System.out.println("Hasta que numero lo multiplico");
        int tabla = leer.nextInt();
        int i;

        for (i = 1; i < tabla+1; i++){

            System.out.println(i + " x " + numero + " = " + numero*i);

        }
    }
}
