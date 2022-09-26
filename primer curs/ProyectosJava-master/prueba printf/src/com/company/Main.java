package com.company;
import java . util . Locale ;
import java . util . Scanner ;

public class Main {

    public static void main(String[] args) {
        // Declaracion de variables
        double grados_C , grados_F ;
        final double NUEVE_QUINTOS =9.0/5.0;
        final double TREINTAYDOS =32.0;
        Scanner leer = new Scanner ( System . in );
        leer . useLocale ( Locale . US );
        // Entrada de datos
        System . out . println ( " Introduzca la temperatura " +
                " en grados centigrados : " );

        grados_C = leer . nextDouble ();
        // Aplicacion del algoritmo de conversion
        grados_F = grados_C * NUEVE_QUINTOS + TREINTAYDOS ;
        // Salida de informacion
        System . out . printf ( Locale . US , "La temperatura en " + " Fahrenheit es : %.4f F " , grados_F );

    }
}
