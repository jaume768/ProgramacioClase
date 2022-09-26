import java.util.Scanner;

class Datos{

    public String Datos = "";
    public String NombreTabla = "";
    public int NumeroDeDatos = 0;
    Scanner scan = new Scanner(System.in);

    public String PedirNombreTablas(){

        System.out.println("Nombre de la tabla? ");
        NombreTabla = scan.nextLine();

        return NombreTabla;

    }

    public int PedirNumeroColumnas(){

        System.out.println("Cuantas columnas de datos quieres meter?");
        NumeroDeDatos = scan.nextInt();

        return NumeroDeDatos;
    }

    public String PedirDatosTablas(){

        System.out.println("Dime los datos con los valores:");
        Datos = scan.nextLine();

        return Datos;
    }

}

