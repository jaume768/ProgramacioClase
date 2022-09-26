
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Calculo {

    public static void main (String args[]){

        List<String> lista_recordatorios = new ArrayList<String>();
        int decision = 0;
        float numeroApalancamiento;
        double dineroMensual;
        double añosInteres;
        double resultado = 0;
        double inversion;
        double aumentoPorcentaje = 1.90;
        int contadorInteres = 1;
        pedir comunicador = new pedir();
        Scanner leer = new Scanner(System.in);

        while (decision != 4){
            System.out.println("Que quieres hacer? 1 = Enseñar lista, 2 = Crear dividendos, 3 = interes compuesto, 4 = salir");
            decision = leer.nextInt();
            switch (decision){
                case 1:
                    System.out.println(lista_recordatorios);
                    break;
                case 2:
                    System.out.println("Cuantas empresas quieres hacer? ");
                    int num_listas = leer.nextInt();
                    int contador = 0;
                    while (contador < num_listas) {
                        System.out.println("Vamos a crear tu dividendo: ");
                        comunicador.pedir();
                        comunicador.pedirapalancamiento();
                        String Dividendos = "[" + comunicador.nombreEmpresa + " : " + (((comunicador.inversion/comunicador.precioAcciones)*comunicador.dineroPorAcion)/12 + "€ al mes]");
                        lista_recordatorios.add(Dividendos);
                        System.out.println("Metido en la lista! ");
                        ++contador;
                    }
                    break;
                case 3:
                    System.out.println("Cuanto dinero quieres invertir? ");
                    inversion = leer.nextInt();
                    System.out.println("cuanto dinero ganas cada mes? ");
                    dineroMensual = leer.nextInt();
                    System.out.println("Cuantos años quieres hacer interes compuesto");
                    añosInteres = leer.nextInt();
                    double mesesinteres = añosInteres*12;
                    for (int i = 0; i < mesesinteres; i++ ){
                        if (contadorInteres % 2 != 0){
                            inversion += dineroMensual;
                            resultado = inversion * 1.9;
                        }
                    }
                    System.out.println("Dinero generado despues de " + añosInteres + " años, es de: " + resultado);
                    break;
            }
        }

    }
}
