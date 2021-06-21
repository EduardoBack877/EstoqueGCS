/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.PrateleiraDAO;
import dao.SecaoDAO;
import entidade.Prateleira;
import entidade.Secao;
import javax.swing.JOptionPane;

/**
 *
 * @author dudub
 */
public class IfrCadastroPrateleira extends javax.swing.JInternalFrame {
        
        
    public IfrCadastroPrateleira() {
        initComponents();
        setarTfdIdEditable();
        tfdIdPrateleira.setText("0");
    }
            

    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabelPesquisarSecoes = new javax.swing.JLabel();
        tfdPesquisarPrateleira = new javax.swing.JTextField();
        btnPesquisarPrateleira = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TPrateleira = new javax.swing.JTable();
        btnExcluirSecoes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalvarPrateleira = new javax.swing.JButton();
        btnFecharSecao = new javax.swing.JButton();
        jLabelConsultaSecao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfdIdPrateleira = new javax.swing.JTextField();
        btnLimparCampos = new javax.swing.JButton();

        jLabelPesquisarSecoes.setText("Pesquisar:");

        tfdPesquisarPrateleira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdPesquisarPrateleiraActionPerformed(evt);
            }
        });

        btnPesquisarPrateleira.setText("Pesquisar");
        btnPesquisarPrateleira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPrateleiraActionPerformed(evt);
            }
        });

        TPrateleira.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Id"
            }
        ));
        jScrollPane1.setViewportView(TPrateleira);

        btnExcluirSecoes.setText("Excluir");
        btnExcluirSecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirSecoesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Prateleira");

        btnSalvarPrateleira.setText("Salvar");
        btnSalvarPrateleira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPrateleiraActionPerformed(evt);
            }
        });

        btnFecharSecao.setText("Fechar");
        btnFecharSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharSecaoActionPerformed(evt);
            }
        });

        jLabelConsultaSecao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelConsultaSecao.setText("Consulta de Prateleira");

        jLabel3.setText("Id");

        tfdIdPrateleira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdIdPrateleiraActionPerformed(evt);
            }
        });

        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(214, 214, 214))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirSecoes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimparCampos)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFecharSecao)
                            .addComponent(btnSalvarPrateleira)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPesquisarSecoes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdPesquisarPrateleira)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisarPrateleira))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelConsultaSecao)
                                .addGap(167, 167, 167))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel3)
                        .addGap(54, 54, 54)
                        .addComponent(tfdIdPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConsultaSecao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdPesquisarPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesquisarSecoes)
                    .addComponent(btnPesquisarPrateleira))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirSecoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(tfdIdPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarPrateleira)
                    .addComponent(btnLimparCampos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnFecharSecao)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setarTfdIdEditable () {
        tfdIdPrateleira.setEditable(false);
    }

    private void tfdPesquisarPrateleiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdPesquisarPrateleiraActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfdPesquisarPrateleiraActionPerformed

    private void btnSalvarPrateleiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPrateleiraActionPerformed
        Prateleira s = new Prateleira();
        PrateleiraDAO sDAO = new PrateleiraDAO();
        String b = tfdIdPrateleira.getText();
        int baux = Integer.parseInt(b);
        tfdIdPrateleira.setEditable(false);
            s.setId(baux);
            if (new PrateleiraDAO().salvar(s))  {
                if (baux == 0) {
                    JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
                }
            
            tfdIdPrateleira.setText("0");
            tfdIdPrateleira.requestFocus();
            sDAO.popularTabela(TPrateleira, tfdPesquisarPrateleira.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar registro!");                                          
        }
        

    }//GEN-LAST:event_btnSalvarPrateleiraActionPerformed

    private void btnPesquisarPrateleiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPrateleiraActionPerformed
       new PrateleiraDAO().popularTabela(TPrateleira,tfdPesquisarPrateleira.getText());
    }//GEN-LAST:event_btnPesquisarPrateleiraActionPerformed

    private void btnExcluirSecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirSecoesActionPerformed
            tfdIdPrateleira.setEditable(false);
         // falta validação checar google docs
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {
            
            
            String idString = String.valueOf(TPrateleira.getValueAt(TPrateleira.getSelectedRow(), 0));
                System.out.println(idString);
            int idExclusao = Integer.parseInt(idString);

            PrateleiraDAO sDAO = new PrateleiraDAO();
            
            if (sDAO.excluir(idExclusao)) {
                JOptionPane.showMessageDialog(null, "Prateleira excluída com sucesso!");
                sDAO.popularTabela(TPrateleira, tfdPesquisarPrateleira.getText());
            
            
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir agendamento.");
            }
        }
            
    }//GEN-LAST:event_btnExcluirSecoesActionPerformed

    private void tfdIdPrateleiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdIdPrateleiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdIdPrateleiraActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
            tfdIdPrateleira.setText("0");
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnFecharSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharSecaoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharSecaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TPrateleira;
    private javax.swing.JButton btnExcluirSecoes;
    private javax.swing.JButton btnFecharSecao;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnPesquisarPrateleira;
    private javax.swing.JButton btnSalvarPrateleira;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelConsultaSecao;
    private javax.swing.JLabel jLabelPesquisarSecoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfdIdPrateleira;
    private javax.swing.JTextField tfdPesquisarPrateleira;
    // End of variables declaration//GEN-END:variables
}
