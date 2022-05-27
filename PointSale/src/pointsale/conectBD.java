/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pointsale;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author fran
 */
public class conectBD {
    //parametros de la conexion.

    public static final String URL = "jdbc:mysql://localhost:3306/pointsale";
    public static final String USER = "root";
    public static final String CLAVE = "";
    private static Connection con =null;

    public Connection getConexion() {

        try {
            if (con == null || con.isClosed()) {
                //levanto el drive a memoria
                Class.forName("com.mysql.cj.jdbc.Driver");

                //establezco la conexion
                con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
                //Verifico si la conexión esta establecida.
                System.out.println(con.getClass().getName());

            }
            JOptionPane.showMessageDialog(null, "Conexión establecida con éxito");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexión no establecida: " + e.getMessage());
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }

    //INSERT INTO `usuario` (`id_usr`, `nombre_usr`, `pw_usr`, `email_usr`) VALUES ('2', 'Sergio', '1234', 'asd@hotmail.com');
    public int insertBD(String strSentenciaSQL) {//Creo una variable de tipo String que luego la voy a invicar con el Insert

        try {
            //creo una variarble PreStamente para procesar la sentencia y "con" es mi variable de conexión
            PreparedStatement pstm = con.prepareStatement(strSentenciaSQL);
            //Ejecuto la sentencia
            pstm.execute();

            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }

    }

    //Método para obtener la información y devolverla.
    public ResultSet consultarRegistros(String strSentenciaSQL) {

        try {
             //creo una variarble PreStamente para procesar la sentencia y "con" es mi variable de conexión
            PreparedStatement pstm = con.prepareStatement(strSentenciaSQL);
            //Ejecuto la sentencia de consulta
            ResultSet respuesta = pstm.executeQuery();
            //Retorno la consulta en respuesta.
            return respuesta;
            
        } catch (Exception e) {
            System.out.println(e);
            //Si no hay información tira null;
            return null;
        }
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
