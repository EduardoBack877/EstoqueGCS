
package dao;
import apoio.IDAOT;
import apoio.ConexaoBD;
import entidade.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import tela.IfrCadastroSecoes;

public class ProdutoDAO implements IDAOT<Produto>  {
        
    ResultSet resultadoQ = null;
    ResultSet resultadoQ1 = null;
    ResultSet resultadoQ3 = null;
    ResultSet resultadoQ4 = null;
    ResultSet resultadoQ5 = null;
    
    List<String> lista = new ArrayList<String>();


    public boolean salvar(Produto g) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = "";
            int aux = 0;
             if (g.getId() == 0) {
                  sql = "INSERT INTO produto VALUES ( "
                    + "default, "
                    + "'" + g.getDescricao() + "',"
                    + "'" + g.getCor() + "',"
                    + "'" + g.getMarca() + "',"
                    + "'" + g.getTamanho() + "',"
                    + "'" + aux + "',"  
                    + "'" + g.getCodsecao() + "',"
                    + "'" + g.getCodgrupo()+ "',"
                    + "'" + g.getCodprat() + "'"
                    + ")";
                  
             } else {
                 sql = "UPDATE produto "
                    + "SET descricao = '" + g.getDescricao() + "',"
                    + "cor = '" + g.getCor() + "',"
                    + "marca = '" + g.getMarca() + "',"
                    + "tamanho ='" + g.getTamanho() + "',"
                    + "qtd = '" + g.getQtd() + "',"  
                    + "codsecao = '" + g.getCodsecao() + "',"
                    + "codgrupo = '" + g.getCodgrupo()+ "',"
                    + "codprat = '" + g.getCodprat() + "' "
                    + "WHERE id = " + g.getId();
            }
             
            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);
            System.out.println("teste ok");
            
            return resultado > 0;

        } catch (Exception e) {
            System.out.println("Erro ao salvar produto: " + e);
            return false;
        }
    }
    
        
  
    
   
    public void popularComboSecao (JComboBox combo) {
        try {
            Statement st2 = ConexaoBD.getInstance().getConnection().createStatement();
            String sql3 = "SELECT descricao FROM secao";
            resultadoQ3 = st2.executeQuery(sql3);
            combo.removeAllItems();
            combo.addItem("Selecione");
            while (resultadoQ3.next()) {
               combo.addItem(resultadoQ3.getString("descricao"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    public void popularComboGrupo (JComboBox combo) {
        try {
            Statement st2 = ConexaoBD.getInstance().getConnection().createStatement();
            String sql4 = "SELECT descricao FROM grupoproduto";
            resultadoQ4 = st2.executeQuery(sql4);
            combo.removeAllItems();
            combo.addItem("Selecione");
            while (resultadoQ4.next()) {
               combo.addItem(resultadoQ4.getString("descricao"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
     public void popularComboPrateleira (JComboBox combo) {
        try {
            Statement st2 = ConexaoBD.getInstance().getConnection().createStatement();
            String sql5 = "SELECT id FROM prateleira";
            resultadoQ5 = st2.executeQuery(sql5);
            combo.removeAllItems();
            combo.addItem("Selecione");
            while (resultadoQ5.next()) {
               combo.addItem(resultadoQ5.getString("id"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    
    
    
    
    public void popularTabela (JTable tabela, String criterio) {
        int numColunas = 9;
        Produto s = new Produto();
        IfrCadastroSecoes is = new IfrCadastroSecoes();
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[numColunas];
        cabecalho[0] = "Id";
        cabecalho[1] = "Descrição";
        cabecalho[2] = "Cor";
        cabecalho[3] = "Marca";
        cabecalho[4] = "Tamanho";
        cabecalho[5] = "Quantidade";
        cabecalho[6] = "Seção";
        cabecalho[7] = "Grupo";
        cabecalho[8] = "Prateleira";
        
        
        
        int lin = 0;
        String teste = "SELECT p.id, p.descricao, p.cor, p.marca, p.tamanho, p.qtd, S.descricao AS secao, G.descricao AS grupo, PR.id as prateleira "
                    + "FROM produto p " 
                    + "LEFT JOIN grupoproduto G ON p.codgrupo = G.id "
                    + "LEFT JOIN secao S ON p.codsecao = S.id "
                    + "LEFT JOIN prateleira PR ON p.codprat = PR.id "
                    + "WHERE p.descricao ILIKE '%" + criterio + "%'"
                    + "ORDER BY p.id;";
        
        
       
        //efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
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
                dadosTabela[lin][2] = resultadoQ.getString("cor");
                dadosTabela[lin][3] = resultadoQ.getString("marca");
                dadosTabela[lin][4] = resultadoQ.getString("tamanho");
                dadosTabela[lin][5] = resultadoQ.getString("qtd");
                dadosTabela[lin][6] = resultadoQ.getString("secao");
                dadosTabela[lin][7] = resultadoQ.getString("grupo");
                dadosTabela[lin][8] = resultadoQ.getString("prateleira");
                
             
                      lin++;}
            

         
            
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
        
    
    @Override
    public boolean atualizar(Produto o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE FROM produto "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir grupo: " + e);
            return false;
        }
    }
    
     public void consulta () { // consulta feita para pegar os nomes de grupo, secao e prateleira que estão como int só com o codigo na tabela de produto
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(""
                            + "SELECT G.descricao AS grupo, S.descricao AS secao, PR.id as prateleira  "
                            + "FROM produto p "
                            + "LEFT JOIN grupoproduto G ON p.codgrupo = G.id "
                            + "LEFT JOIN secao S ON p.codsecao = S.id "
                            + "LEFT JOIN prateleira PR ON p.codprat = PR.id ");
        } catch (SQLException ex) {
            Logger.getLogger(MovestoqueDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

    @Override
    public ArrayList<Produto> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Produto> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto consultarId(int id) {
        Produto Produto = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM produto p "
                    + "LEFT JOIN grupoproduto G ON p.codgrupo = G.id "
                    + "LEFT JOIN secao S ON p.codsecao = S.id "
                    + "LEFT JOIN prateleira PR ON p.codprat = PR.id "
                    + "WHERE p.id = " + id;
            System.out.println("CONSULTA GRUPO");
            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                Produto = new Produto();

                Produto.setId(resultadoQ.getInt("id"));
                Produto.setDescricao(resultadoQ.getString("descricao"));
                Produto.setCor(resultadoQ.getString("cor"));
                Produto.setMarca(resultadoQ.getString("marca"));
                Produto.setTamanho(resultadoQ.getString("tamanho"));
                Produto.setQtd(resultadoQ.getInt("qtd"));
                Produto.setCodsecao(resultadoQ.getInt("codsecao"));
                Produto.setCodgrupo(resultadoQ.getInt("codgrupo"));
                Produto.setCodprat(resultadoQ.getInt("codprat"));
                
                
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar produto: " + e);
        }

        return Produto;
    }

    
    public Produto consultarIdAux (int id) {
        Produto Produto = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT p.id, p.descricao, p.cor, p.marca, p.tamanho, p.qtd, S.descricao AS secao, G.descricao as grupo, PR.id as prateleira "
                    + "FROM produto p "
                    + "LEFT JOIN grupoproduto G ON p.codgrupo = G.id "
                    + "LEFT JOIN secao S ON p.codsecao = S.id "
                    + "LEFT JOIN prateleira PR ON p.codprat = PR.id "
                    + "WHERE p.id = " + id;
            System.out.println("CONSULTA GRUPO");
            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                Produto = new Produto();

                Produto.setId(resultadoQ.getInt("id"));
                Produto.setDescricao(resultadoQ.getString("descricao"));
                Produto.setCor(resultadoQ.getString("cor"));
                Produto.setMarca(resultadoQ.getString("marca"));
                Produto.setTamanho(resultadoQ.getString("tamanho"));
                Produto.setQtd(resultadoQ.getInt("qtd"));
                Produto.setSecao(resultadoQ.getString("secao"));
                Produto.setGrupo(resultadoQ.getString("grupo"));
                Produto.setPrateleira(resultadoQ.getString("prateleira"));
                
                
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar produto: " + e);
        }

        return Produto;
    }

    
    
}
