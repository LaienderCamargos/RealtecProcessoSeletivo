/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author laien_000
 */
public class Conexao {

    private com.mysql.jdbc.Connection con;
    public Statement st;
    private String url = "jdbc:mysql://localhost:3306/agenda_realtec";
    private String user = "root";
    private String pass = "";
    public ResultSet rs;

    public Conexao() throws SQLException {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            this.con = (com.mysql.jdbc.Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            this.st = (Statement) this.con.createStatement();

        } catch (SQLException e) {
            System.err.println("Erro SQL ao salvar o evento conexao " + e);
            e.printStackTrace();
        } catch (Exception erro) {
            System.err.println("Erro na Conexao" + erro.getMessage());
            erro.printStackTrace();
        }
    }

    public boolean fecharConexao() throws SQLException {
        try {
            con.close();
            st.close();
            return true;
        } catch (Exception e) {
            System.err.println("Erro ao fechar a conexao do BD." + e);
            return false;
        }

    }

    public com.mysql.jdbc.Connection getCon() {
        return this.con;
    }

    public void setCon(com.mysql.jdbc.Connection con) {
        this.con = con;
    }

    public Statement getSt() {
        return this.st;
    }

    public void setSt(com.mysql.jdbc.Statement st) {
        this.st = (Statement) st;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Connection getConnection() {
        return this.con;
    }

}
