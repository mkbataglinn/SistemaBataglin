/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.McbVendedor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 07788816108
 */
public class daoMcbVendedor extends daoAbstract {

    @Override
    public void insert(Object object) {

        McbVendedor mcbVendedor = (McbVendedor) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url, user, password;

            url = "jdbc:mysql://10.7.0.51:33062/db_mikaela_bataglin";
            user = "mikaela_bataglin";
            password = "mikaela_bataglin";

            Connection cnt;

            cnt = DriverManager.getConnection(url, user, password);

            String sql = "insert into mcb_vendedor values (?,?,?,?,?,?,?)";

            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, mcbVendedor.getMcbIdVendedor());
            pst.setString(2, mcbVendedor.getMcbNome());
            pst.setString(3, mcbVendedor.getMcbCpf());
            pst.setString(4, mcbVendedor.getMcbDataContratado());
            pst.setString(5, mcbVendedor.getMcbTelefone());
            pst.setString(6, mcbVendedor.getMcbEmail());
            pst.setString(7, mcbVendedor.getMcbStatus());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(daoMcbVendedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(daoMcbVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public Object list(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public Object listAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}