import java.util.Scanner;
public class lista {

    Scanner leer = new Scanner(System.in);
    public String nombre_recordatorio;
    public void NombreLista(){

        System.out.println("Que nombre quieres intoducir a tu recordatorio? ");
        nombre_recordatorio = leer.nextLine();

    }
}
