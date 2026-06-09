/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.McbProduto;
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
public class daoMcbProduto extends daoAbstract {

    @Override
    public void insert(Object object) {

        McbProduto mcbProduto = (McbProduto) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url, user, password;

            url = "jdbc:mysql://10.7.0.51:33062/db_mikaela_bataglin";
            user = "mikaela_bataglin";
            password = "mikaela_bataglin";

            Connection cnt;

            cnt = DriverManager.getConnection(url, user, password);

            String sql = "insert into mcb_produto values (?,?,?,?,?,?,?)";

            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, mcbProduto.getMcbIdProduto());
            pst.setString(2, mcbProduto.getMcbNome());
            pst.setString(3, mcbProduto.getMcbDescricao());
            pst.setString(4, mcbProduto.getMcbPreco());
            pst.setString(5, mcbProduto.getMcbEstoque());
            pst.setString(6, mcbProduto.getMcbStatus());
            pst.setInt(7, mcbProduto.getMcbIdFornecedor());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(daoMcbProduto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(daoMcbProduto.class.getName()).log(Level.SEVERE, null, ex);
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