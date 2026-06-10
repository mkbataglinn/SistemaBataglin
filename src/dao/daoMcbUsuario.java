/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.McbUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

            String url = "jdbc:mysql://10.7.0.51:33062/db_mikaela_bataglin";
            String user = "mikaela_bataglin";
            String password = "mikaela_bataglin";

            Connection cnt = DriverManager.getConnection(url, user, password);

            String sql = "insert into mcb_usuarios values (?,?,?,?,?,?,?,?)";

            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, mcbUsuarios.getMcbIdUsuarios());
            pst.setString(2, mcbUsuarios.getMcbNome());
            pst.setString(3, mcbUsuarios.getMcbApelido());
            pst.setString(4, mcbUsuarios.getMcbCpf());
            pst.setDate(5, null);
            pst.setInt(6, mcbUsuarios.getMcbNivel());
            pst.setString(7, mcbUsuarios.getMcbSenha());
            pst.setString(8, mcbUsuarios.getMcbAtivo());

            pst.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public McbUsuarios login(String usuario, String senha) {

        McbUsuarios mcbUsuarios = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url, user, password;

            url = "jdbc:mysql://10.7.0.51:33062/db_mikaela_bataglin";
            user = "mikaela_bataglin";
            password = "mikaela_bataglin";

            Connection cnt = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM mcb_usuarios WHERE mcb_apelido=? AND mcb_senha=? AND mcb_ativo='S'";

            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setString(1, usuario);
            pst.setString(2, senha);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                mcbUsuarios = new McbUsuarios();
                mcbUsuarios.setMcbIdUsuarios(rs.getInt("mcb_idusuarios"));
                mcbUsuarios.setMcbNome(rs.getString("mcb_nome"));
                mcbUsuarios.setMcbApelido(rs.getString("mcb_apelido"));
                mcbUsuarios.setMcbNivel(rs.getInt("mcb_nivel"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return mcbUsuarios;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean autenticar(String usuario, String senha) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://10.7.0.51:33062/db_mikaela_bataglin";
            String user = "mikaela_bataglin";
            String password = "mikaela_bataglin";

            Connection cnt = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM mcb_usuario";

            PreparedStatement pst = cnt.prepareStatement(sql);

            java.sql.ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                if (rs.getString("mcb_apelido").equals(usuario)
                        && rs.getString("mbc_senha").equals(senha)) {

                    return true;
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return false;
    }
}
