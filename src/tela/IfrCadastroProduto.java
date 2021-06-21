/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.ProdutoDAO;
import dao.SecaoDAO;
import entidade.Produto;
import entidade.Secao;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author dudub
 */
public class IfrCadastroProduto extends javax.swing.JInternalFrame {
        
        
    public IfrCadastroProduto() {
        ProdutoDAO prodDAO = new ProdutoDAO();
        initComponents();
        setarTfdIdEditable();
        tfdIdProd.setText("0");
        prodDAO.popularComboSecao(jComboSecao);
        prodDAO.popularComboGrupo(jComboGrupo);
        prodDAO.popularComboPrateleira(jComboPrateleira);
        TProduto.setDefaultEditor(Object.class, null);
        
    }
    
            

    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabelPesquisarSecoes = new javax.swing.JLabel();
        tfdPesquisarProduto = new javax.swing.JTextField();
        btnPesquisarSecoes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TProduto = new javax.swing.JTable();
        btnEditarProduto = new javax.swing.JButton();
        btnExcluirSecoes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelDescricaoSecao = new javax.swing.JLabel();
        tfdDescricaoProd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSalvarProduto = new javax.swing.JButton();
        btnFecharSecao = new javax.swing.JButton();
        jLabelConsultaSecao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfdIdProd = new javax.swing.JTextField();
        btnLimparCampos = new javax.swing.JButton();
        jLabelDescricaoSecao1 = new javax.swing.JLabel();
        jLabelDescricaoSecao2 = new javax.swing.JLabel();
        jLabelDescricaoSecao3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelDescricaoSecao5 = new javax.swing.JLabel();
        jLabelDescricaoSecao6 = new javax.swing.JLabel();
        jLabelDescricaoSecao7 = new javax.swing.JLabel();
        tfdCorProd = new javax.swing.JTextField();
        tfdMarcaProd = new javax.swing.JTextField();
        tfdTamanhoProd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboPrateleira = new javax.swing.JComboBox<>();
        jComboGrupo = new javax.swing.JComboBox<>();
        jComboSecao = new javax.swing.JComboBox<>();

        jLabelPesquisarSecoes.setText("Pesquisar:");

        tfdPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdPesquisarProdutoActionPerformed(evt);
            }
        });

        btnPesquisarSecoes.setText("Pesquisar");
        btnPesquisarSecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarSecoesActionPerformed(evt);
            }
        });

        TProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Descrição", "Cor", "Marca", "Tamanho", "Quantidade", "Seção", "Grupo", "Prateleira"
            }
        ));
        jScrollPane1.setViewportView(TProduto);

        btnEditarProduto.setText("Editar");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });

        btnExcluirSecoes.setText("Excluir");
        btnExcluirSecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirSecoesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("                                                                  Cadastro de Produto");

        jLabelDescricaoSecao.setText("Descrição");

        tfdDescricaoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdDescricaoProdActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        btnFecharSecao.setText("Fechar");
        btnFecharSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharSecaoActionPerformed(evt);
            }
        });

        jLabelConsultaSecao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelConsultaSecao.setText("Consulta de Produtos");

        jLabel3.setText("Id");

        tfdIdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdIdProdActionPerformed(evt);
            }
        });

        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        jLabelDescricaoSecao1.setText("Cor");

        jLabelDescricaoSecao2.setText("Marca");

        jLabelDescricaoSecao3.setText("Tamanho");

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*");

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("*");

        jLabelDescricaoSecao5.setText("Seção");

        jLabelDescricaoSecao6.setText("Grupo");

        jLabelDescricaoSecao7.setText("Prateleira");

        tfdCorProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdCorProdActionPerformed(evt);
            }
        });

        tfdMarcaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdMarcaProdActionPerformed(evt);
            }
        });

        tfdTamanhoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdTamanhoProdActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("*");

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*");

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");

        jComboPrateleira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        jComboPrateleira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPrateleiraActionPerformed(evt);
            }
        });

        jComboGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        jComboGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboGrupoActionPerformed(evt);
            }
        });

        jComboSecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        jComboSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSecaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabelPesquisarSecoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdPesquisarProduto)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarSecoes))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabelDescricaoSecao3)
                                    .addGap(22, 22, 22))
                                .addComponent(jLabelDescricaoSecao2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDescricaoSecao)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabelDescricaoSecao1)
                                    .addComponent(jLabelDescricaoSecao6)
                                    .addComponent(jLabelDescricaoSecao5)
                                    .addComponent(jLabelDescricaoSecao7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfdMarcaProd, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdCorProd, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdDescricaoProd, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdTamanhoProd, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnLimparCampos)
                                        .addGap(36, 36, 36)
                                        .addComponent(btnSalvarProduto)))
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfdIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(645, 645, 645)
                                        .addComponent(btnFecharSecao)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEditarProduto)
                                .addGap(29, 29, 29)
                                .addComponent(btnExcluirSecoes))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310)
                .addComponent(jLabelConsultaSecao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(tfdPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesquisarSecoes)
                    .addComponent(btnPesquisarSecoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditarProduto)
                    .addComponent(btnExcluirSecoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdDescricaoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricaoSecao)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdCorProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricaoSecao1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdMarcaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricaoSecao2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdTamanhoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricaoSecao3)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelDescricaoSecao5)
                    .addComponent(jComboSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricaoSecao6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricaoSecao7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparCampos)
                    .addComponent(btnSalvarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFecharSecao)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setarTfdIdEditable () {
        tfdIdProd.setEditable(false);
    }

    private void tfdPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdPesquisarProdutoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfdPesquisarProdutoActionPerformed

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        Produto s = new Produto();
        ProdutoDAO sDAO = new ProdutoDAO();
        String a = tfdDescricaoProd.getText(); 
        String b = tfdIdProd.getText();
        String c = tfdCorProd.getText();
        String d = tfdMarcaProd.getText();
        String e = tfdTamanhoProd.getText();
        int g = jComboSecao.getSelectedIndex();
        int h = jComboGrupo.getSelectedIndex();
        int i = jComboPrateleira.getSelectedIndex();
        int baux = Integer.parseInt(b);
        if (g == 0) {
            
        }
        tfdIdProd.setEditable(false);
        if (a.isEmpty() || c.isEmpty() || d.isEmpty() || e.isEmpty() || g == 0 || h == 0 || i == 0) {
            JOptionPane.showMessageDialog(this, "O preenchimento de todos os campos são obrigatórios");
        } else {
            s.setId(baux);
            s.setDescricao(a);
            s.setCor(c);
            s.setMarca(d);
            s.setTamanho(e);
            s.setCodsecao(g);
            s.setCodgrupo(h);
            s.setCodprat(i);
            if (new ProdutoDAO().salvar(s))  {
                if (baux == 0) {
                    JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Registro editado com sucesso!"); 
                }
            
            tfdIdProd.setText("0");
            tfdDescricaoProd.setText("");
            tfdDescricaoProd.requestFocus();
            tfdCorProd.setText("");
            tfdMarcaProd.setText("");
            tfdTamanhoProd.setText("");
            jComboGrupo.setSelectedIndex(0);
            jComboPrateleira.setSelectedIndex(0);
            jComboSecao.setSelectedIndex(0);
                
               
            sDAO.popularTabela(TProduto, tfdPesquisarProduto.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar registro!");                                          
        }
        }

    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void btnPesquisarSecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarSecoesActionPerformed
       new ProdutoDAO().popularTabela(TProduto,tfdPesquisarProduto.getText());
       
    }//GEN-LAST:event_btnPesquisarSecoesActionPerformed

    private void btnExcluirSecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirSecoesActionPerformed
            tfdIdProd.setEditable(false);
         // falta validação checar google docs
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {
            
            
            String idString = String.valueOf(TProduto.getValueAt(TProduto.getSelectedRow(), 0));
                System.out.println(idString);
            int idExclusao = Integer.parseInt(idString);

            ProdutoDAO sDAO = new ProdutoDAO();
            
            if (sDAO.excluir(idExclusao)) {
                    JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
                sDAO.popularTabela(TProduto, tfdPesquisarProduto.getText());
            
            
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir produto.");
            }
        }
            
    }//GEN-LAST:event_btnExcluirSecoesActionPerformed

    
    
    
    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        String idString = String.valueOf(TProduto.getValueAt(TProduto.getSelectedRow(), 0));
     
        int idS = Integer.parseInt(idString);
        tfdIdProd.setEditable(false);
        // criar instancia ProdutoDAO
        ProdutoDAO prodDAO = new ProdutoDAO();

        // criar instancia Produto
        Produto produto = prodDAO.consultarId(idS);

        if (produto != null) {
            
            // define os valores do obj nos campos da tela
            tfdIdProd.setText(""+produto.getId());
            tfdDescricaoProd.setText(produto.getDescricao());
            tfdCorProd.setText(produto.getCor());
            int aux;
            aux = produto.getCodsecao();
            System.out.println(aux);
            tfdMarcaProd.setText(produto.getMarca());
            tfdTamanhoProd.setText(produto.getTamanho());
            jComboSecao.setSelectedIndex(produto.getCodsecao());
            jComboGrupo.setSelectedIndex(produto.getCodgrupo());
            jComboPrateleira.setSelectedIndex(produto.getCodprat());
            //popula tabela
            prodDAO.popularTabela(TProduto, tfdPesquisarProduto.getText());

            // mudar de aba
            //jTabbedPane1.setSelectedIndex(0);
            // definir o foco
            tfdDescricaoProd.requestFocus();
        }
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void tfdIdProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdIdProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdIdProdActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
            tfdIdProd.setText("0");
            tfdDescricaoProd.setText("");
            tfdDescricaoProd.requestFocus();
            tfdCorProd.setText("");
            tfdMarcaProd.setText("");
            tfdTamanhoProd.setText("");
            jComboGrupo.setSelectedIndex(0);
            jComboPrateleira.setSelectedIndex(0);
            jComboSecao.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnFecharSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharSecaoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharSecaoActionPerformed

    private void tfdDescricaoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdDescricaoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdDescricaoProdActionPerformed

    private void tfdCorProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdCorProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdCorProdActionPerformed

    private void tfdMarcaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdMarcaProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdMarcaProdActionPerformed

    private void tfdTamanhoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdTamanhoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdTamanhoProdActionPerformed

    private void jComboPrateleiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPrateleiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboPrateleiraActionPerformed

    private void jComboSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboSecaoActionPerformed

    private void jComboGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboGrupoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TProduto;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnExcluirSecoes;
    private javax.swing.JButton btnFecharSecao;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnPesquisarSecoes;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JComboBox<String> jComboGrupo;
    private javax.swing.JComboBox<String> jComboPrateleira;
    private javax.swing.JComboBox<String> jComboSecao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelConsultaSecao;
    private javax.swing.JLabel jLabelDescricaoSecao;
    private javax.swing.JLabel jLabelDescricaoSecao1;
    private javax.swing.JLabel jLabelDescricaoSecao2;
    private javax.swing.JLabel jLabelDescricaoSecao3;
    private javax.swing.JLabel jLabelDescricaoSecao5;
    private javax.swing.JLabel jLabelDescricaoSecao6;
    private javax.swing.JLabel jLabelDescricaoSecao7;
    private javax.swing.JLabel jLabelPesquisarSecoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfdCorProd;
    private javax.swing.JTextField tfdDescricaoProd;
    private javax.swing.JTextField tfdIdProd;
    private javax.swing.JTextField tfdMarcaProd;
    private javax.swing.JTextField tfdPesquisarProduto;
    private javax.swing.JTextField tfdTamanhoProd;
    // End of variables declaration//GEN-END:variables
}
