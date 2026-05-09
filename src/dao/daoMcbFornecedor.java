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
            pst.setString(2, mcbFornecedor.getMcbNome());
            pst.setString(3, mcbFornecedor.getMcbBairro());
            pst.setString(4, mcbFornecedor.getMcbCpf());
            pst.setString (5, mcbFornecedor.getMcbDataNascimento());
            pst.setString(6, mcbFornecedor.getMcbCep());
            pst.setString(6, mcbFornecedor.getMcbCidade());
            pst.setString(7, mcbFornecedor.getMcbEmail());
            pst.setString(8, mcbFornecedor.getMcbEndereco());
            pst.setString(9, mcbFornecedor.getMcbEstado());
            pst.setString(10, mcbFornecedor.getMcbRg());
            pst.setString(11, mcbFornecedor.getMcbSenha());
            pst.setString (12, mcbFornecedor.getMcbStatus());
            pst.setString(13, mcbFornecedor.getMcbTelefone());
            pst.setString(14, mcbFornecedor.getMcbTipoFornecedor());
        

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
