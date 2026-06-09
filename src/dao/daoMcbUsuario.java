/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.McbUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u07788816108
 */

public class daoMcbUsuario extends daoAbstract {

    @Override
    public void insert(Object object) {

        McbUsuarios mcbUsuarios = (McbUsuarios) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url, user, password;

            url = "jdbc:mysql://10.7.0.51:33062/db_mikaela_bataglin";
            user = "mikaela_bataglin";
            password = "mikaela_bataglin";

            Connection cnt;

            cnt = DriverManager.getConnection(url, user, password);

            String sql = "insert into mcb_usuarios values (?,?,?,?,?,?,?,?)";

            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, mcbUsuarios.getMcbIdUsuarios());
            pst.setString(2, mcbUsuarios.getMcbNome());
            pst.setString(3, mcbUsuarios.getMcbApelido());
            pst.setString(4, mcbUsuarios.getMcbCpf());
            pst.setInt(5, mcbUsuarios.getMcbNivel());
            pst.setString(6, mcbUsuarios.getMcbSenha());
            pst.setString(7, mcbUsuarios.getMcbAtivo());
            pst.setString(8, mcbUsuarios.getMcbAtivo());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(daoMcbUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(daoMcbUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;
    }
    @Override
    public void delete(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void update(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}