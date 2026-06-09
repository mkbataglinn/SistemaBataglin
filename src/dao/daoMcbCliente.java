/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.McbCliente;
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
public class daoMcbCliente extends daoAbstract {

    @Override
    public void insert(Object object) {

        McbCliente mcbCliente = (McbCliente) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url, user, password;

            url = "jdbc:mysql://10.7.0.51:33062/db_mikaela_bataglin";
            user = "mikaela_bataglin";
            password = "mikaela_bataglin";

            Connection cnt;

            cnt = DriverManager.getConnection(url, user, password);

            String sql = "insert into mcb_cliente values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, mcbCliente.getMcbIdCliente());
            pst.setString(2, mcbCliente.getMcbNome());
            pst.setString(3, mcbCliente.getMcbCpf());
            pst.setString(4, mcbCliente.getMcbRg());
            pst.setString(5, mcbCliente.getMcbDataNascimento());
            pst.setString(6, mcbCliente.getMcbEmail());
            pst.setString(7, mcbCliente.getMcbTelefone());
            pst.setString(8, mcbCliente.getMcbEndereco());
            pst.setString(9, mcbCliente.getMcbCep());
            pst.setString(10, mcbCliente.getMcbBairro());
            pst.setString(11, mcbCliente.getMcbCidade());
            pst.setString(12, mcbCliente.getMcbEstado());
            pst.setString(13, mcbCliente.getMcbTipoCliente());
            pst.setString(14, mcbCliente.getMcbStatus());
            pst.setString(15, mcbCliente.getMcbSenha());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(daoMcbCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(daoMcbCliente.class.getName()).log(Level.SEVERE, null, ex);
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