/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.McbFornecedor;
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
public class daoMcbFornecedor extends daoAbstract {

    @Override
    public void insert(Object object) {
        McbFornecedor mcbFornecedor = new McbFornecedor ();
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url, user, password;

            url = "jdbc:mysql://10.7.0.51:33062/db_mikaela_bataglin";
            user = "mikaela_bataglin";
            password = "mikaela_bataglin";

            Connection cnt;

            cnt = DriverManager.getConnection(url, user, password);

            String sql = "insert into mcb_fornecedor values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, mcbFornecedor.getMcbIdFornecedor());
            pst.setString(2, mcbFornecedor.getMcbTipoPessoa());
            pst.setString(3, mcbFornecedor.getMcbDocumento());
            pst.setString(4, mcbFornecedor.getMcbNomeEmpresa());
            pst.setString(5, mcbFornecedor.getMcbNomeContato());
            pst.setString(6, mcbFornecedor.getMcbEmail());
            pst.setString(7, mcbFornecedor.getMcbCelular());
            pst.setString(8, mcbFornecedor.getMcbTelefone());
            pst.setString(9, mcbFornecedor.getMcbEndereco());
            pst.setString(10, mcbFornecedor.getMcbCep());
            pst.setString(11, mcbFornecedor.getMcbTipoPagamento());
            pst.setString(12, mcbFornecedor.getMcbBairro());
            pst.setString(13, mcbFornecedor.getMcbCidade());
            pst.setString(14, mcbFornecedor.getMcbEstado());
            pst.setString(15, mcbFornecedor.getMcbStatus());
        

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {

            Logger.getLogger(daoMcbFornecedor.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {

            Logger.getLogger(daoMcbFornecedor.class.getName()).log(Level.SEVERE, null, ex);

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
