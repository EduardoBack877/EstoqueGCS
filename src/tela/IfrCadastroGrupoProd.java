/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.GrupoProdDAO;
import dao.SecaoDAO;
import entidade.GrupoProduto;
import entidade.Secao;
import javax.swing.JOptionPane;

/**
 *
 * @author dudub
 */
public class IfrCadastroGrupoProd extends javax.swing.JInternalFrame {
        
        
    public IfrCadastroGrupoProd() {
        initComponents();
        setarTfdIdEditable();
        tfdIdGrupo.setText("0");
    }
            

    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabelPesquisarSecoes = new javax.swing.JLabel();
        tfdPesquisarGrupo = new javax.swing.JTextField();
        btnPesquisarGrupo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TGrupo = new javax.swing.JTable();
        btnEditarGrupo = new javax.swing.JButton();
        btnExcluirGrupo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelDescricaoSecao = new javax.swing.JLabel();
        tfdDescricaoGrupo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSalvarGrupo = new javax.swing.JButton();
        btnFecharGrupo = new javax.swing.JButton();
        jLabelConsultaSecao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfdIdGrupo = new javax.swing.JTextField();
        btnLimparCampos = new javax.swing.JButton();

        jLabelPesquisarSecoes.setText("Pesquisar:");

        tfdPesquisarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdPesquisarGrupoActionPerformed(evt);
            }
        });

        btnPesquisarGrupo.setText("Pesquisar");
        btnPesquisarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarGrupoActionPerformed(evt);
            }
        });

        TGrupo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TGrupo);

        btnEditarGrupo.setText("Editar");
        btnEditarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarGrupoActionPerformed(evt);
            }
        });

        btnExcluirGrupo.setText("Excluir");
        btnExcluirGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirGrupoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Grupo");

        jLabelDescricaoSecao.setText("Descrição");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        btnSalvarGrupo.setText("Salvar");
        btnSalvarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarGrupoActionPerformed(evt);
            }
        });

        btnFecharGrupo.setText("Fechar");
        btnFecharGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharGrupoActionPerformed(evt);
            }
        });

        jLabelConsultaSecao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelConsultaSecao.setText("Consulta de Grupo");

        jLabel3.setText("Id");

        tfdIdGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdIdGrupoActionPerformed(evt);
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
                        .addComponent(btnEditarGrupo)
                        .addGap(34, 34, 34)
                        .addComponent(btnExcluirGrupo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimparCampos)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFecharGrupo)
                            .addComponent(btnSalvarGrupo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPesquisarSecoes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdPesquisarGrupo)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisarGrupo))
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
                                .addComponent(tfdDescricaoGrupo)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfdIdGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(tfdPesquisarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesquisarSecoes)
                    .addComponent(btnPesquisarGrupo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarGrupo)
                    .addComponent(btnExcluirGrupo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(tfdIdGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricaoSecao)
                    .addComponent(tfdDescricaoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarGrupo)
                    .addComponent(btnLimparCampos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnFecharGrupo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setarTfdIdEditable () {
        tfdIdGrupo.setEditable(false);
    }

    private void tfdPesquisarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdPesquisarGrupoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfdPesquisarGrupoActionPerformed

    private void btnSalvarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarGrupoActionPerformed
        GrupoProduto g = new GrupoProduto();
        GrupoProdDAO gDAO = new GrupoProdDAO();
        String a = tfdDescricaoGrupo.getText();
        String b = tfdIdGrupo.getText();
        int baux = Integer.parseInt(b);
        tfdIdGrupo.setEditable(false);
        if (a.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O preenchimento do campo de descrição é obrigatório");
        } else {
            g.setId(baux);
            g.setDescricao(tfdDescricaoGrupo.getText());
            if (new GrupoProdDAO().salvar(g))  {
                if (baux == 0) {
                    JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Registro editado com sucesso!"); 
                }
            
            tfdIdGrupo.setText("0");
            tfdDescricaoGrupo.setText("");
            tfdDescricaoGrupo.requestFocus();
            gDAO.popularTabela(TGrupo, tfdPesquisarGrupo.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar registro!");                                          
        }
        }

    }//GEN-LAST:event_btnSalvarGrupoActionPerformed

    private void btnPesquisarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarGrupoActionPerformed
       new GrupoProdDAO().popularTabela(TGrupo,tfdPesquisarGrupo.getText());
    }//GEN-LAST:event_btnPesquisarGrupoActionPerformed

    private void btnExcluirGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirGrupoActionPerformed
            tfdIdGrupo.setEditable(false);
         // falta validação checar google docs
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {
            
            
            String idString = String.valueOf(TGrupo.getValueAt(TGrupo.getSelectedRow(), 0));
                System.out.println(idString);
            int idExclusao = Integer.parseInt(idString);

            GrupoProdDAO gDAO = new GrupoProdDAO();
            
            if (gDAO.excluir(idExclusao)) {
                JOptionPane.showMessageDialog(null, "Grupo excluído com sucesso!");
                gDAO.popularTabela(TGrupo, tfdPesquisarGrupo.getText());
            
            
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir grupo.");
            }
        }
            
    }//GEN-LAST:event_btnExcluirGrupoActionPerformed

    private void btnEditarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarGrupoActionPerformed
        String idString = String.valueOf(TGrupo.getValueAt(TGrupo.getSelectedRow(), 0));
     
        int idS = Integer.parseInt(idString);
        tfdIdGrupo.setEditable(false);
        // criar instancia SecaoDAO
        GrupoProdDAO grupoDAO = new GrupoProdDAO();

        // criar instancia Secao
        GrupoProduto grupo = grupoDAO.consultarId(idS);

        if (grupo != null) {

            // define os valores do obj nos campos da tela
            tfdIdGrupo.setText(""+grupo.getId());
            tfdDescricaoGrupo.setText(grupo.getDescricao());
            //popula tabela
            grupoDAO.popularTabela(TGrupo, tfdPesquisarGrupo.getText());

            // mudar de aba
            //jTabbedPane1.setSelectedIndex(0);
            // definir o foco
            tfdDescricaoGrupo.requestFocus();
        }
    }//GEN-LAST:event_btnEditarGrupoActionPerformed

    private void tfdIdGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdIdGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdIdGrupoActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
            tfdIdGrupo.setText("0");
            tfdDescricaoGrupo.setText("");
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnFecharGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharGrupoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharGrupoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TGrupo;
    private javax.swing.JButton btnEditarGrupo;
    private javax.swing.JButton btnExcluirGrupo;
    private javax.swing.JButton btnFecharGrupo;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnPesquisarGrupo;
    private javax.swing.JButton btnSalvarGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelConsultaSecao;
    private javax.swing.JLabel jLabelDescricaoSecao;
    private javax.swing.JLabel jLabelPesquisarSecoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfdDescricaoGrupo;
    private javax.swing.JTextField tfdIdGrupo;
    private javax.swing.JTextField tfdPesquisarGrupo;
    // End of variables declaration//GEN-END:variables
}
