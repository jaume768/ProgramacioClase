package com.company;
import java.sql.*;

public class Main {

    static String url = "jdbc:mysql://root:gyMogcKppkfwlb8cUhXh@containers-us-west-41.railway.app:8022/railway";
    static String username = "root";
    static String password = "gyMogcKppkfwlb8cUhXh";

    static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        System.out.println();
        saberEntrenosConAumentos();

    }

    public static String saberNombreEntreno(int id_entreno){
        String nombre = "";

        try {

            String query = "select Nombre from entrenamientos where id = " + id_entreno;

            // create the java statement
            Statement st = connection.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                nombre = rs.getString("Nombre");

            }

            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nombre;
    }

    public static int saberNumeroEntrenos(){

        int numeroDeEntrenos = 0;

        try {

            String query = "select count(id) from entrenamientos";

            // create the java statement
            Statement st = connection.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                numeroDeEntrenos = (rs.getInt("COUNT(id)"));

            }

            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return numeroDeEntrenos;

    }

    public static int saberPorcentajeAumentoEjercicio(int id_entreno) {

        int contador = 0;
        int valorInicio = 0;
        int kilosFinal = 0;
        String nombre = "";
        int porcentajeAumento = 0;

        try {

            String query = "select entrenamientos.Nombre,horario.Kilos,horario.Repes from horario, entrenamientos where horario.id_entrenamiento = entrenamientos.id and horario.id_entrenamiento = "+ id_entreno +";";

            // create the java statement
            Statement st = connection.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                if (contador == 0){
                    valorInicio = rs.getInt("Kilos");
                    contador++;
                }

                kilosFinal = rs.getInt("Kilos");

            }

            if (valorInicio != 0){
                porcentajeAumento = ((kilosFinal*100)/valorInicio)-100;
            }

            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return porcentajeAumento;

    }

    public static int saberNumeroEntrenosConAumentos(){

        int numeroDeEntrenos = saberNumeroEntrenos();
        int numeroDeEntrenosConAumento = 0;

        for (int i = 1; i < numeroDeEntrenos; i++) {

            if (saberPorcentajeAumentoEjercicio(i) != 0){
                numeroDeEntrenosConAumento++;
            }

        }

        return numeroDeEntrenosConAumento;

    }

    public static void saberEntrenosConAumentos(){

        int numeroDeEntrenos = saberNumeroEntrenos();
        int numeroDeEntrenosConAumento = saberNumeroEntrenosConAumentos();


        int[] IdEntrenosConAumento = new int[numeroDeEntrenos];

        for (int i = 1; i < numeroDeEntrenos; i++) {

            if (saberPorcentajeAumentoEjercicio(i) > 0){
                IdEntrenosConAumento[i] = i;
            }

        }

        int[] porcentajes = new int[numeroDeEntrenosConAumento];
        int contador = 0;
        for (int i = 0; i < IdEntrenosConAumento.length; i++) {

            if (IdEntrenosConAumento[i] != 0){
                porcentajes[contador] = saberPorcentajeAumentoEjercicio(i);
                contador++;
            }

        }

        int contador2 = 0;
        for (int i = 0; i < IdEntrenosConAumento.length; i++) {

            if (IdEntrenosConAumento[i] != 0){
                System.out.println("De " + saberNombreEntreno(i) + " has mejorado un " + porcentajes[contador2] + "%");
                contador2++;
            }

        }

    }

}
