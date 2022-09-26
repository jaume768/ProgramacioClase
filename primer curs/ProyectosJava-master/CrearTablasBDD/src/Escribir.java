import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class Escribir{

    public void Escirbir(){

        Scanner scan = new Scanner(System.in);
        System.out.println("nombre del fitxero: ");
        String NombreFile = scan.nextLine() +".sql";
        Datos comunicadorDatos= new Datos();
        File f;
        FileWriter w;
        PrintWriter wr;
        BufferedWriter br;

        try{
            f = new File(NombreFile);
            w = new FileWriter(f);
            br = new BufferedWriter(w);
            wr = new PrintWriter(br);

            System.out.println("Que nombre quieres en la base de datos? ");
            String NombreBDD = scan.nextLine();
            System.out.println("Cuantas tablas quieres crear aproximadamente? ");
            int NumeroTablas = scan.nextInt();

            wr.write("create database " + NombreBDD + "; \r\n");
            wr.write("\r\n");

            for (int i = 0; i < NumeroTablas; i++){

                System.out.println("------------------------------------------------");
                System.out.println("------------------------------------------------");
                comunicadorDatos.PedirNombreTablas();
                wr.write("create table " + comunicadorDatos.NombreTabla + "( \r\n");
                wr.write("\r\n");
                comunicadorDatos.PedirNumeroColumnas();
                for (int x = 0; x < comunicadorDatos.NumeroDeDatos+1; x++){

                    comunicadorDatos.PedirDatosTablas();
                    if (x == comunicadorDatos.NumeroDeDatos){
                        wr.write("\t" + comunicadorDatos.Datos );
                        wr.write("\r\n");
                    } else {
                        wr.write("\t" + comunicadorDatos.Datos + ",");
                        wr.write("\r\n");
                    }

                }
                wr.write(");");
                wr.write("\r\n");
                wr.write("\r\n");
            }

            wr.write("commit;");
            wr.close();
            br.close();

        }catch (Exception error){
            System.out.println("El error es: " + error);
        }
    }

}
