/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.McbCompras;
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
public class daoMcbCompras extends daoAbstract {

    @Override
    public void insert(Object object) {
        McbCompras mcbCompras = new McbCompras ();
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url, user, password;

            url = "jdbc:mysql://10.7.0.51:33062/db_mikaela_bataglin";
            user = "mikaela_bataglin";
            password = "mikaela_bataglin";

            Connection cnt;

            cnt = DriverManager.getConnection(url, user, password);

            String sql = "insert into mcb_compras values (?,?,?,?,?,?,?)";

            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, mcbCompras.getMcbIdCompras());
            pst.setInt(2, mcbCompras.getMcbIdProdutos());
            pst.setInt(3, mcbCompras.getMcbIdFornecedor());
            pst.setInt(4, mcbCompras.getMcbQuantidade());
            pst.setDouble(5, mcbCompras.getMcbValorTotal());
            pst.setString(6, mcbCompras.getMcbStatus());
            pst.setString(7, mcbCompras.getMcbData());
        

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {

            Logger.getLogger(daoMcbCompras.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {

            Logger.getLogger(daoMcbCompras.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    @Override
    public Object list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object listAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}


