import java.util.Scanner;

public class pedir {

    public float precioAcciones;
    float dineroPorAcion;
    String nombreEmpresa;
    float inversion;
    float inversionConApalancamiento;
    float numeroApalancamiento;
    int  apalancamiento;
    Scanner leer = new Scanner(System.in);

    public void pedir(){

        System.out.println("Dime el nombre de la empresa: ");
        nombreEmpresa = leer.nextLine();

        System.out.println("Que precio tienen sus acciones? ");
        precioAcciones = leer.nextFloat();

        System.out.println("Cuanto dinero dan por accion? ");
        dineroPorAcion = leer.nextFloat();

        System.out.println("Dime tu inversión inicial: ");
        inversion = leer.nextFloat();



    }

    public void pedirapalancamiento(){

        System.out.println("Quieres apalancamiento? (si = 1 o no = 2)");
        apalancamiento = leer.nextInt();

        if (apalancamiento == 1){

            System.out.println("Dime el nivel de apalancamiento: (2 o 5)");
            numeroApalancamiento = leer.nextFloat();

            inversion = inversion * numeroApalancamiento;

        } else {

            System.out.println("Sin apalancamiento. ");

        }

    }

}
