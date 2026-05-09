/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.McbVendasProduto;
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
public class daoMcbVendasProduto extends daoAbstract {

    @Override
    public void insert(Object object) {
        McbVendasProduto mcbVendasProduto = new McbVendasProduto ();
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url, user, password;

            url = "jdbc:mysql://10.7.0.51:33062/db_mikaela_bataglin";
            user = "mikaela_bataglin";
            password = "mikaela_bataglin";

            Connection cnt;

            cnt = DriverManager.getConnection(url, user, password);

            String sql = "insert into mcb_vendas_produto values (?,?,?,?,?,?,?,?)";

            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, mcbVendasProduto.getMcbIdVendasProdutos());
            pst.setInt(2, mcbVendasProduto.getMcbIdVendas());
            pst.setInt(3, mcbVendasProduto.getMcbIdProdutos());
            pst.setInt(4, mcbVendasProduto.getMcbIdFornecedor());
            pst.setInt(5, mcbVendasProduto.getMcbQuantidade());
            pst.setDouble(6, mcbVendasProduto.getMcbValorUnitario());
            pst.setDouble(7, mcbVendasProduto.getMcbDesconto());
            pst.setDouble(8, mcbVendasProduto.getMcbSubtotal());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {

            Logger.getLogger(daoMcbVendasProduto.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {

            Logger.getLogger(daoMcbVendasProduto.class.getName()).log(Level.SEVERE, null, ex);

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



