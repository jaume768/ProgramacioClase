import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        lista miLista = new lista();
        int decision = 0;
        List<String> lista_recordatorios = new ArrayList<String>();
        while (decision != 3){
            System.out.println("Que quieres hacer? 1 = Enseñar lista, 2 = Crear recordatorio, 3 = salir");
            decision = leer.nextInt();
            switch (decision){
                case 1:
                    System.out.println(lista_recordatorios);
                    break;
                case 2:
                    System.out.println("Cuantos recordatorios quieres crear? ");
                    int num_listas = leer.nextInt();
                    int contador = 0;
                    while (contador < num_listas) {
                        System.out.println("Vamos a crear tu recordatorio: ");
                        miLista.NombreLista();
                        System.out.println("A continuación vas a introducir la hora, dia y mes del recordatorio");
                        System.out.println("A que hora quieres tu recordatorio? ");
                        int hora_recordatorio = leer.nextInt();
                        String hora = String.valueOf(hora_recordatorio);
                        System.out.println("Que dia quieres tu recordatorio? (numero del dia)");
                        int dia_recordatorio = leer.nextInt();
                        String dia = String.valueOf(dia_recordatorio);
                        System.out.println("Que mes quieres el recordatotio? ");
                        int mes_recordatorio = leer.nextInt();
                        String mes = String.valueOf(mes_recordatorio);
                        String recordatorio = miLista.nombre_recordatorio + ": " + hora + ":00" + "-" + dia + "-" + mes + "-" + "2021";
                        lista_recordatorios.add(recordatorio);
                        System.out.println("Recordatorio incluido perfectamente!");
                        ++contador;
                    }
            }
        }

    }
}
