package com.company;
import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/hospital";
        String username = "root";
        String password = "";

        BDD(url,username,password);

    }

    public static void BDD(String url, String username, String password){

        try{

            Connection connection = DriverManager.getConnection(url,username,password);

            PreparedStatement stmt = connection.prepareStatement("Insert into especialidad(codi,nom) values (?,?)");

            stmt.setInt(1,3);
            stmt.setString(2,"Forense");

            stmt.executeUpdate();

            connection.close();


        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());

        }


    }

}
