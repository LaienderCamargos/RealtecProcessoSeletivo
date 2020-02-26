/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controle.cadastroShow;
import DAO.cadastroDAO;
import java.sql.SQLException;

/**
 *
 * @author laien_000
 */
public class cadastroShowController {

    public static boolean persistir(cadastroShow cadastro) throws Exception {
        return cadastroDAO.persistir(cadastro);
    }

    public static cadastroShow pesquisa(cadastroShow cadastro) {
        return cadastroDAO.buscaShowPrincipal(cadastro);
    }

    public static void atualizar(cadastroShow atualizarCadastro) {
        cadastroDAO.atualizarShow(atualizarCadastro);

    }

    public static void detetar(int idEvento) throws SQLException {
        cadastroDAO.delete(idEvento);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
