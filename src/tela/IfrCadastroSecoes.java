/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.SecaoDAO;
import entidade.Secao;
import javax.swing.JOptionPane;

/**
 *
 * @author dudub
 */
public class IfrCadastroSecoes extends javax.swing.JInternalFrame {
        
        
    public IfrCadastroSecoes() {
        initComponents();
        setarTfdIdEditable();
        tfdIdSecao.setText("0");
    }
            

    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabelPesquisarSecoes = new javax.swing.JLabel();
        tfdPesquisarSecoes = new javax.swing.JTextField();
        btnPesquisarSecoes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TSecao = new javax.swing.JTable();
        btnEditarSecoes = new javax.swing.JButton();
        btnExcluirSecoes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelDescricaoSecao = new javax.swing.JLabel();
        tfdDescricaoSecao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSalvarSecao = new javax.swing.JButton();
        btnFecharSecao = new javax.swing.JButton();
        jLabelConsultaSecao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfdIdSecao = new javax.swing.JTextField();
        btnLimparCampos = new javax.swing.JButton();

        jLabelPesquisarSecoes.setText("Pesquisar:");

        tfdPesquisarSecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdPesquisarSecoesActionPerformed(evt);
            }
        });

        btnPesquisarSecoes.setText("Pesquisar");
        btnPesquisarSecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarSecoesActionPerformed(evt);
            }
        });

        TSecao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(TSecao);

        btnEditarSecoes.setText("Editar");
        btnEditarSecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSecoesActionPerformed(evt);
            }
        });

        btnExcluirSecoes.setText("Excluir");
        btnExcluirSecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirSecoesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Seção");

        jLabelDescricaoSecao.setText("Descrição");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        btnSalvarSecao.setText("Salvar");
        btnSalvarSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarSecaoActionPerformed(evt);
            }
        });

        btnFecharSecao.setText("Fechar");
        btnFecharSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharSecaoActionPerformed(evt);
            }
        });

        jLabelConsultaSecao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelConsultaSecao.setText("Consulta de Seção");

        jLabel3.setText("Id");

        tfdIdSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdIdSecaoActionPerformed(evt);
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
                        .addComponent(btnEditarSecoes)
                        .addGap(34, 34, 34)
                        .addComponent(btnExcluirSecoes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimparCampos)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFecharSecao)
                            .addComponent(btnSalvarSecao)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPesquisarSecoes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdPesquisarSecoes)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisarSecoes))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelConsultaSecao)
                                .addGap(167, 167, 167))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescricaoSecao)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfdDescricaoSecao)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfdIdSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                    .addComponent(tfdPesquisarSecoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesquisarSecoes)
                    .addComponent(btnPesquisarSecoes))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarSecoes)
                    .addComponent(btnExcluirSecoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(tfdIdSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricaoSecao)
                    .addComponent(tfdDescricaoSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarSecao)
                    .addComponent(btnLimparCampos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnFecharSecao)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setarTfdIdEditable () {
        tfdIdSecao.setEditable(false);
    }

    private void tfdPesquisarSecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdPesquisarSecoesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfdPesquisarSecoesActionPerformed

    private void btnSalvarSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSecaoActionPerformed
        Secao s = new Secao();
        SecaoDAO sDAO = new SecaoDAO();
        String a = tfdDescricaoSecao.getText();
        String b = tfdIdSecao.getText();
        int baux = Integer.parseInt(b);
        tfdIdSecao.setEditable(false);
        if (a.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O preenchimento do campo de descrição é obrigatório");
        } else {
            s.setId(baux);
            s.setDescricao(tfdDescricaoSecao.getText());
            if (new SecaoDAO().salvar(s))  {
                if (baux == 0) {
                    JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Registro editado com sucesso!"); 
                }
            
            tfdIdSecao.setText("0");
            tfdDescricaoSecao.setText("");
            tfdDescricaoSecao.requestFocus();
            sDAO.popularTabela(TSecao, tfdPesquisarSecoes.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar registro!");                                          
        }
        }

    }//GEN-LAST:event_btnSalvarSecaoActionPerformed

    private void btnPesquisarSecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarSecoesActionPerformed
       new SecaoDAO().popularTabela(TSecao,tfdPesquisarSecoes.getText());
    }//GEN-LAST:event_btnPesquisarSecoesActionPerformed

    private void btnExcluirSecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirSecoesActionPerformed
            tfdIdSecao.setEditable(false);
         // falta validação checar google docs
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {
            
            
            String idString = String.valueOf(TSecao.getValueAt(TSecao.getSelectedRow(), 0));
                System.out.println(idString);
            int idExclusao = Integer.parseInt(idString);

            SecaoDAO sDAO = new SecaoDAO();
            
            if (sDAO.excluir(idExclusao)) {
                    JOptionPane.showMessageDialog(null, "Seção excluída com sucesso!");
                sDAO.popularTabela(TSecao, tfdPesquisarSecoes.getText());
            
            
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir Seção.");
            }
        }
            
    }//GEN-LAST:event_btnExcluirSecoesActionPerformed

    private void btnEditarSecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSecoesActionPerformed
        String idString = String.valueOf(TSecao.getValueAt(TSecao.getSelectedRow(), 0));
     
        int idS = Integer.parseInt(idString);
        tfdIdSecao.setEditable(false);
        // criar instancia SecaoDAO
        SecaoDAO secaoDAO = new SecaoDAO();

        // criar instancia Secao
        Secao secao = secaoDAO.consultarId(idS);

        if (secao != null) {

            // define os valores do obj nos campos da tela
            tfdIdSecao.setText(""+secao.getId());
            tfdDescricaoSecao.setText(secao.getDescricao());
            //popula tabela
            secaoDAO.popularTabela(TSecao, tfdPesquisarSecoes.getText());

            // mudar de aba
            //jTabbedPane1.setSelectedIndex(0);
            // definir o foco
            tfdDescricaoSecao.requestFocus();
        }
    }//GEN-LAST:event_btnEditarSecoesActionPerformed

    private void tfdIdSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdIdSecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdIdSecaoActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
            tfdIdSecao.setText("0");
            tfdDescricaoSecao.setText("");
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnFecharSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharSecaoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharSecaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TSecao;
    private javax.swing.JButton btnEditarSecoes;
    private javax.swing.JButton btnExcluirSecoes;
    private javax.swing.JButton btnFecharSecao;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnPesquisarSecoes;
    private javax.swing.JButton btnSalvarSecao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelConsultaSecao;
    private javax.swing.JLabel jLabelDescricaoSecao;
    private javax.swing.JLabel jLabelPesquisarSecoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfdDescricaoSecao;
    private javax.swing.JTextField tfdIdSecao;
    private javax.swing.JTextField tfdPesquisarSecoes;
    // End of variables declaration//GEN-END:variables
}
