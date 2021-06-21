/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import apoio.ConexaoBD;
import entidade.Movestoque;
import entidade.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import tela.IfrCadastroProduto;
import tela.IfrCadastroSecoes;
import tela.IfrMovEstoque;

/**
 *
 * @author Back
 */
public class MovestoqueDAO {
    
    ResultSet resultadoQ = null;
    ResultSet resultadoQ2 = null;
    ResultSet resultadoQ3 = null;
    
    
    public boolean atualizaEstoque (int qtd, int tipo, int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = "";
            int aux = 0;
             if (tipo == 2) {
                  sql = "UPDATE produto "
                    + "SET qtd = qtd - " + qtd
                    + " WHERE id = " + id;
            } else {
              sql = "UPDATE produto "
              + "SET qtd = qtd + " + qtd
              + " WHERE id = " + id;
             }
             

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return resultado > 0;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar produto: " + e);
            return false;
        }
    }
    
    public boolean salvar(String periodo, String hora, int qtd, int codprod, int tipo) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = "";
            int aux = 0;
             if (tipo == 2) {
                  sql = "INSERT INTO movestoque VALUES ( "
                    + "default, "
                    + "'" + periodo + " " + hora + "',"
                    + "'S',"
                    + qtd + ","
                    + codprod
                    + ")";
            } else {
                    sql = "INSERT INTO movestoque VALUES ( "
                    + "default, "
                    + "'" + periodo + " " + hora + "',"
                    + "'E',"
                    + qtd + ","
                    + codprod
                    + ")";
             }
             

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return resultado > 0;

        } catch (Exception e) {
            System.out.println("Erro ao salvar movimentação: " + e);
            return false;
        }
    }
    
    
    public boolean consultaEstoque (int idprod, int quant) {
        int aux = 0;
        boolean retorna = true;
        try {
            resultadoQ3 = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
  ResultSet.CONCUR_READ_ONLY).executeQuery(""
                    + "SELECT p.qtd  "
                    + "FROM produto p " 
                    + "WHERE p.id = "+ idprod
                    + "ORDER BY p.id");
            
            while (resultadoQ3.next()) {
                aux = resultadoQ3.getInt("qtd");
            }
            if (aux >= quant) {
                retorna = true;
            } else {
                retorna = false;
            }
          
            } catch (Exception e) {
                System.out.println("problemas para consultar estoque...");
                System.out.println(e);
        }
        return retorna;
    }
    
    
    
    public void popularTabela (JTable tabela, String criterio) {
        int numColunas = 4;
        Produto s = new Produto();
        IfrCadastroProduto is = new IfrCadastroProduto();
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[numColunas];
        cabecalho[0] = "Id";
        cabecalho[1] = "Produto";
        cabecalho[2] = "Grupo";
        cabecalho[3] = "Quantidade em Estoque";
        
        
        
        int lin = 0;
        
       
        //efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
  ResultSet.CONCUR_READ_ONLY).executeQuery(""
                    + "SELECT p.id, p.descricao, G.descricao AS grupo, p.qtd  "
                    + "FROM produto p " 
                    + "LEFT JOIN grupoproduto G ON p.codgrupo = G.id "
                    + "WHERE p.descricao ILIKE '%" + criterio + "%'"
                    + "ORDER BY p.id");
            
            resultadoQ2 = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
  ResultSet.CONCUR_READ_ONLY).executeQuery(""
                    + "SELECT p.id, p.descricao, p.cor, p.marca, p.tamanho, p.qtd, S.descricao AS secao, G.descricao AS grupo, PR.id as prateleira "
                    + "FROM produto p " 
                    + "LEFT JOIN grupoproduto G ON p.codgrupo = G.id "
                    + "LEFT JOIN secao S ON p.codsecao = S.id "
                    + "LEFT JOIN prateleira PR ON p.codprat = PR.id "
                    + "WHERE p.descricao ILIKE '%" + criterio + "%'"
                    + "ORDER BY p.id");
            // vai para o ultima linha do RS
            // captura a linha = num de registros
            // retorna para o inicio
  
              resultadoQ.last();
            int numRegistros = resultadoQ.getRow();
            resultadoQ.beforeFirst();
            
            dadosTabela = new Object[numRegistros][numColunas];
         
            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("descricao");
                dadosTabela[lin][2] = resultadoQ.getString("grupo");
                dadosTabela[lin][3] = resultadoQ.getString("qtd");
                      lin++;
            }
         
            
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
                /*  
                 if (column == 3) {  // apenas a coluna 3 sera editavel
                 return true;
                 } else {
                 return false;
                 }
                 */
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 2) {
//                    return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
//                case 2:
//                    column.setPreferredWidth(14);
//                    break;
            }
        }
        // renderizacao das linhas da tabela = mudar a cor
//        tabela.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//
//            @Override
//            public Component getTableCellRendererComponent(JTable table, Object value,
//                    boolean isSelected, boolean hasFocus, int row, int column) {
//                super.getTableCellRendererComponent(table, value, isSelected,
//                        hasFocus, row, column);
//                if (row % 2 == 0) {
//                    setBackground(Color.GREEN);
//                } else {
//                    setBackground(Color.LIGHT_GRAY);
//                }
//                return this;
//            }
//        });
    }
    
   
    

    
}
