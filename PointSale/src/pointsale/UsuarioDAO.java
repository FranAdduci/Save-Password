/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pointsale;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

public class UsuarioDAO {

    public void insert(Usuario usr) throws SQLException {

        //PreparedStatement instruccion = null;
        //String sql = "INSERT INTO usuario (idUsr, nameUsr, pwUsr, emailUsr) VALUES (?,?,?,?)";
        String sql = "INSERT INTO usuario (idUsr, nameUsr, pwUsr, emailUsr) VALUES ('" + usr.getIdUsr() + "','" + usr.getNameUsr() + "','" + usr.getPwUsr() + "','"+usr.getEmailUsr()+"')";
        conectBD con = new conectBD();
        con.getConexion();
        Statement instruccion = null;//Es la variable para hacer consultas

        ResultSet conjuntoResultados = null;//Menaja los resultados

        instruccion = con.createStatement();

        instruccion.executeUpdate(sql);
        
        /*
        try {
           
            
            //Connection con = conectBD.getConexion;
            
            instruccion = con.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);

            instruccion.setInt(1, usr.getIdUsr());
            instruccion.setString(2, usr.getNameUsr());
            instruccion.setString(3, usr.getPwUsr());
            instruccion.setString(4, usr.getEmailUsr());

            int rtdo = instruccion.executeUpdate();

            if (rtdo == 1) {
                // recupero el id
                ResultSet rs = instruccion.getGeneratedKeys();
                if (rs.next()) {
                    // asignamos el id que se genero
                    int id = rs.getInt(1);
                    usr.setIdUsr(id);
                }
            } else {
                throw new RuntimeException("Error en insert");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        } finally {
            try {
                if (instruccion != null) {
                    instruccion.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                throw new RuntimeException(e2);
            }
        }*/
    }

}
    