package com.company;
import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String url= "jdbc:mysql://localhost:3306/marvel_mcoc";
        String username = "root";
        String password = "";

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statment = connection.createStatement();
            PreparedStatement ps = null;

            ps = connection.prepareStatement("insert into personatge (Nom) values (?)");
            ps.setString(1,"tomeu");
            ps.executeUpdate();

            ps.setString(1,"2tomeu");
            ps.executeUpdate();

            /*
            while (resultSet.next()){
                System.out.println(resultSet.getString("idPersonatge") + " " + resultSet.getString("Nom"));
            }*/

            connection.close();
            statment.close();
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
