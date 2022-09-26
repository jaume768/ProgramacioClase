import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Main {

    public static void main(String[] args) {

        marco comunicador = new marco();
        comunicador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class Conectar{
    String driver = "com.mysql.jdbc.Driver";
    Connection conn;
    public Conectar(){
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba_programa","mysql","");
            if (conn != null){
                System.out.println("conexión correcta");
            }
        } catch (ClassNotFoundException | SQLException error) {
            System.out.println("Error al concetar " + error);
        }
    }

    public Connection getConnection(){
        return conn;
    }
}

class marco extends JFrame {

    public marco(){
        setSize(500,500);
        setLocation(500,500);
        setTitle("Primera interfaz");
        LaminaTexto miLamina = new LaminaTexto();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaTexto extends JPanel{

    Conectar con;
    public LaminaTexto(){

        JButton boton1 = new JButton("conectar");
        add(boton1);

        DameTexto evento = new DameTexto();
        boton1.addActionListener(evento);
    }

    class DameTexto implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            con = new Conectar();
            Connection reg = con.getConnection();

        }

    }
}

