/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Controle.cadastroShow;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import persistencia.Conexao;

/**
 *
 * @author laien_000
 */
public class cadastroDAO {

    public static boolean persistir(cadastroShow cadastro) {
        try {
            Conexao conect = new Conexao();
            String sql;
            java.sql.Date dataEvento = new java.sql.Date(cadastro.getData().getTime());

            sql = "INSERT INTO evento (nome_cantor, valor, data, hora_inicio,"
                    + " hora_fim, genero_show, show_principal, informacao_geral)"
                    + " values (?, ?, ?, ?, ?, ?, ?, ? )";

            PreparedStatement st = conect.getConnection().prepareStatement(sql);
            st.setString(1, cadastro.getNome());
            st.setDouble(2, cadastro.getValor());
            st.setDate(3, dataEvento);
            st.setString(4, cadastro.getHorarioInicio());
            st.setString(5, cadastro.getHorarioFim());
            st.setString(6, cadastro.getGeneroShow());
            st.setBoolean(7, cadastro.getShowPrincipal());
            st.setString(8, cadastro.getInformacaoGeral());
            st.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro SQL ao salvar o show no cadastroDAO " + e);
            e.printStackTrace();
        } catch (Exception erro) {
            System.err.println("Erro ao Salvar o evento DAO" + erro);
            erro.printStackTrace();
        }
        return false;
    }

    public static void atualizarShow(cadastroShow atualizarCadastro) {

        if (atualizarCadastro == null) {
            JOptionPane.showMessageDialog(null, "Não a Cadastro para ser Atualizado.");
        }

        try {
            Conexao conect = new Conexao();
            String sql;
            java.sql.Date dataShow = new java.sql.Date(atualizarCadastro.getData().getTime());

            sql = "UPDATE evento SET nome_cantor =?, valor =?, data =?,"
                    + "hora_inicio =?, hora_fim =?, genero_show =?,"
                    + "show_principal =?, informacao_geral =? "
                    + "WHERE id =?";
            PreparedStatement st = conect.getConnection().prepareStatement(sql);
            st.setString(1, atualizarCadastro.getNome());
            st.setDouble(2, atualizarCadastro.getValor());
            st.setDate(3, dataShow);
            st.setString(4, atualizarCadastro.getHorarioInicio());
            st.setString(5, atualizarCadastro.getHorarioFim());
            st.setString(6, atualizarCadastro.getGeneroShow());
            st.setBoolean(7, atualizarCadastro.getShowPrincipal());
            st.setString(8, atualizarCadastro.getInformacaoGeral());
            st.setInt(9, atualizarCadastro.getIdAgenda());
            st.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cadastro Atualizado com Sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro SQL ao Atualizar o cadastro. " + e);
            e.printStackTrace();
        } catch (Exception erro) {
            System.err.println("Erro ao Atualizar o Cadastro ." + erro);
            erro.printStackTrace();
        }
    }

    public ArrayList<cadastroShow> listar() throws SQLException {
        ArrayList<cadastroShow> cadastro = new ArrayList<cadastroShow>();

        try {
            Conexao conect = new Conexao();
            PreparedStatement st = conect.getConnection().prepareStatement("SELECT * FROM evento ");

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                cadastroShow cadastroBusca = new cadastroShow();
                cadastroBusca.setIdAgenda(rs.getInt("evento.id"));
                cadastroBusca.setNome(rs.getString("evento.nome_cantor"));
                cadastroBusca.setData(rs.getDate("evento.data"));
                cadastroBusca.setValor(rs.getDouble("evento.valor"));
                cadastroBusca.setHorarioInicio(rs.getString("evento.hora_inicio"));
                cadastroBusca.setHorarioFim(rs.getString("evento.hora_fim"));
                cadastroBusca.setGeneroShow(rs.getString("evento.genero_show"));
                cadastroBusca.setShowPrincipal(rs.getBoolean("evento.show_principal"));
                cadastroBusca.setInformacaoGeral(rs.getString("evento.informacao_geral"));

                cadastro.add(cadastroBusca);
            }
            conect.fecharConexao();
        } catch (SQLException erro) {
            System.err.println("Erro SQL ao listar os Show da agenda. (cadastro DAO)");
            erro.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro ao listar os Show da agenda. (cadastro DAO)");
            e.printStackTrace();
        }
        return cadastro;
    }

    public static cadastroShow buscaShowPrincipal(cadastroShow novoCadastro) {
        if (novoCadastro == null) {
            JOptionPane.showMessageDialog(null, "Dasdos para pesquisa vazio");
        }
        cadastroShow cadastro = new cadastroShow();
        try {
            Conexao conect = new Conexao();

            java.sql.Date dataEvento = new java.sql.Date(novoCadastro.getData().getTime());
            PreparedStatement st = conect.getConnection().prepareStatement("SELECT * FROM evento WHERE data = ? AND show_principal = ?");

            st.setDate(1, dataEvento);
            st.setBoolean(2, novoCadastro.getShowPrincipal());
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                cadastro = new cadastroShow();
                cadastro.setIdAgenda(rs.getInt("id"));
                cadastro.setNome(rs.getString("nome_cantor"));
                cadastro.setShowPrincipal(rs.getBoolean("show_principal"));
                cadastro.setData(rs.getDate("data"));
                cadastro.setValor(rs.getDouble("valor"));
                cadastro.setHorarioInicio(rs.getString("hora_inicio"));
                cadastro.setHorarioFim(rs.getString("hora_fim"));
                cadastro.setGeneroShow(rs.getString("genero_show"));
                cadastro.setInformacaoGeral(rs.getString("informacao_geral"));
            }

            conect.fecharConexao();

        } catch (SQLException e) {
            System.err.println("Erro oa pesquisar se ja existe o show principal." + e);
            e.printStackTrace();
        }
        return cadastro;

    }

    public ArrayList<cadastroShow> listarData(Date dataPesquisa) throws SQLException {

        ArrayList<cadastroShow> cadastro = new ArrayList<cadastroShow>();

        try {
            java.sql.Date dataEvento = new java.sql.Date(dataPesquisa.getTime());
            Conexao conect = new Conexao();
            PreparedStatement st = conect.getConnection().prepareStatement("SELECT * FROM evento WHERE data = ?");
            st.setDate(1, dataEvento);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                cadastroShow cadastroBusca = new cadastroShow();
                cadastroBusca.setIdAgenda(rs.getInt("evento.id"));
                cadastroBusca.setNome(rs.getString("evento.nome_cantor"));
                cadastroBusca.setData(rs.getDate("evento.data"));
                cadastroBusca.setValor(rs.getDouble("evento.valor"));
                cadastroBusca.setHorarioInicio(rs.getString("evento.hora_inicio"));
                cadastroBusca.setHorarioFim(rs.getString("evento.hora_fim"));
                cadastroBusca.setGeneroShow(rs.getString("evento.genero_show"));
                cadastroBusca.setShowPrincipal(rs.getBoolean("evento.show_principal"));
                cadastroBusca.setInformacaoGeral(rs.getString("evento.informacao_geral"));

                cadastro.add(cadastroBusca);
            }
            conect.fecharConexao();
        } catch (SQLException erro) {
            System.err.println("Erro SQL ao listar os Show da agenda. (cadastro DAO)");
            erro.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro ao listar os Show da agenda. (cadastro DAO)");
            e.printStackTrace();
        }
        return cadastro;
    }

    public static void delete(int idCadastro) throws SQLException {
        try {
            Conexao conect = new Conexao();
            String sql = "DELETE FROM evento WHERE id =?";

            PreparedStatement st = conect.getConnection().prepareStatement(sql);
            st.setInt(1, idCadastro);
            st.executeUpdate();
            conect.fecharConexao();
        } catch (SQLException e) {
            System.err.println("Erro SQL ao Deletar o evento." + e);
            e.printStackTrace();

        } catch (Exception erro) {
            System.err.println("Erro ao Deletar o Evento. " + erro);
            erro.printStackTrace();
        }
    }

}
