/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.cadastroShow;
import DAO.cadastroDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author laien_000
 */
public class TelaPesquisa extends javax.swing.JFrame {

    /**
     * Creates new form TelaPesquisa
     */
    public TelaPesquisa() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        DefaultTableModel modelo = (DefaultTableModel) eventoData.getModel();
        eventoData.setRowSorter(new TableRowSorter(modelo));

        DataPesquisa.setDate(new java.util.Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        eventoData = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        DataPesquisa = new com.toedter.calendar.JDateChooser();
        Pesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cantorBandaPrincipal = new javax.swing.JTextField();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eventoData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "iD", "Nome Cantor / Banda", "Data Show", "Valor Pago pelo Show", "Horario Inicio Show", "Horario Fim Show", "Genero Show", "Show Principal", "Informação Geral"
            }
        ));
        eventoData.setPreferredSize(new java.awt.Dimension(1035, 600));
        eventoData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventoDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(eventoData);
        if (eventoData.getColumnModel().getColumnCount() > 0) {
            eventoData.getColumnModel().getColumn(0).setResizable(false);
            eventoData.getColumnModel().getColumn(0).setPreferredWidth(4);
        }

        jToggleButton1.setText("Voltar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        Pesquisar.setText("Pesquisar");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantor / Banda Principal:");

        cantorBandaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantorBandaPrincipalActionPerformed(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("Lista de Eventos por Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(DataPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantorBandaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(408, 408, 408))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cantorBandaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pesquisar))
                    .addComponent(DataPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        telaPrincipal home = new telaPrincipal();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        // TODO add your handling code here:
        cadastroShow cadastroPesquisa = new cadastroShow();
        cadastroPesquisa.setDataPesquisa(DataPesquisa.getDate());

        listarShow(cadastroPesquisa.getDataPesquisa());


    }//GEN-LAST:event_PesquisarActionPerformed

    private void cantorBandaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantorBandaPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantorBandaPrincipalActionPerformed

    private void eventoDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventoDataMouseClicked
        try {
            // TODO add your handling code here:
            cadastroShow cadastro = new cadastroShow();
            cadastro = setaTextFilds();
            TelaCadastroShow tela = new TelaCadastroShow();
            tela.preencherTela(cadastro);
            tela.setVisible(true);
            dispose();
        } catch (ParseException ex) {
            Logger.getLogger(TelaPesquisa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eventoDataMouseClicked

    public void listarShow(Date dataPesquisa) {
        DefaultTableModel modelo = (DefaultTableModel) eventoData.getModel();
        modelo.setRowCount(0);
        cadastroDAO cadastro = new cadastroDAO();

        try {
            for (cadastroShow m : cadastro.listarData(dataPesquisa)) {
                modelo.addRow(new Object[]{
                    m.getIdAgenda(),
                    m.getNome(),
                    m.getData(),
                    m.getValor(),
                    m.getHorarioInicio(),
                    m.getHorarioFim(),
                    m.getGeneroShow(),
                    m.getShowPrincipal(),
                    m.getInformacaoGeral()

                });
                if (m.getShowPrincipal() == true) {

                    cantorBandaPrincipal.setText(m.getNome().toString());
                }

            }
            eventoData.getRowSorter().toggleSortOrder(1);

        } catch (SQLException ex) {
            System.err.println("Erro ao listar eventos na tela inicial. " + ex);
            ex.printStackTrace();
        }
    }

    public cadastroShow setaTextFilds() throws ParseException {
        cadastroShow preencherTela = new cadastroShow();
        int linha = eventoData.getSelectedRow();
        preencherTela.setIdAgenda(Integer.parseInt(eventoData.getValueAt(linha, 0).toString()));
        preencherTela.setNome(eventoData.getValueAt(linha, 1).toString());
        preencherTela.setData((Date) eventoData.getValueAt(linha, 2));
        preencherTela.setValor(Double.parseDouble(eventoData.getValueAt(linha, 3).toString()));
        preencherTela.setHorarioInicio(eventoData.getValueAt(linha, 4).toString());
        preencherTela.setHorarioFim(eventoData.getValueAt(linha, 5).toString());
        preencherTela.setGeneroShow(eventoData.getValueAt(linha, 6).toString());
        preencherTela.setShowPrincipal(Boolean.valueOf(eventoData.getValueAt(linha, 7).toString()));
        preencherTela.setInformacaoGeral(eventoData.getValueAt(linha, 8).toString());

        //chamar o metodo preencher formulario no telaCadastroShow
        return preencherTela;
    }
    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     // */
        //try {
    //    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //       if ("Nimbus".equals(info.getName())) {
    //            javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //            break;
    //        }
    //    }
    //} catch (ClassNotFoundException ex) {
    //    java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //} catch (InstantiationException ex) {
    //    java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //} catch (IllegalAccessException ex) {
    //    java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //} catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //    java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //}
    //</editor-fold>

    /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
    //  public void run() {
    //        new TelaPesquisa().setVisible(true);
    //  }
    //  });
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DataPesquisa;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JTextField cantorBandaPrincipal;
    private javax.swing.JTable eventoData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

}