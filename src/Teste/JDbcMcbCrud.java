/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teste;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 * * @author u07788816108
 */
public class JDbcMcbCrud {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_mikaela_bataglin";
            user = "mikaela_bataglin";
            password = "mikaela_bataglin";
            
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            Statement stm = cnt.createStatement();

            PreparedStatement pst = cnt.prepareStatement(
                "delete from mcb_usuarios where mcb_idusuarios=?"
            );

            pst.setInt(1, 508);
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDbcMcbCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDbcMcbCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Executou");
    }
}