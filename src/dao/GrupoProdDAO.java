
package dao;
import apoio.IDAOT;
import apoio.ConexaoBD;
import entidade.Secao;
import entidade.GrupoProduto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import tela.IfrCadastroSecoes;

public class GrupoProdDAO implements IDAOT<GrupoProduto>  {
        
    ResultSet resultadoQ = null;
    ResultSet resultadoQ1 = null;


    public boolean salvar(GrupoProduto g) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = "";
            
             if (g.getId() == 0) {
                  sql = "INSERT INTO grupoproduto VALUES ( "
                    + "default, "
                    + "'" + g.getDescricao() + "'"
                    + ")";
                  
             } else {
                 sql = "UPDATE grupoproduto "
                        + "SET descricao = '" + g.getDescricao() + "'"
                        + "WHERE id = " + g.getId();
            }
             

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return resultado > 0;

        } catch (Exception e) {
            System.out.println("Erro ao salvar Grupo: " + e);
            return false;
        }
    }
    
    public void popularTabela (JTable tabela, String criterio) {
        int numColunas = 2;
        Secao s = new Secao();
        IfrCadastroSecoes is = new IfrCadastroSecoes();
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[numColunas];
        cabecalho[0] = "Id";
        cabecalho[1] = "Descrição";
        
        int lin = 0;
        
       
        //efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
  ResultSet.CONCUR_READ_ONLY).executeQuery(""
                    + "SELECT * "
                    + "FROM grupoproduto " 
                    + "WHERE descricao ILIKE '%" + criterio + "%'"
                    + "ORDER BY id");
            

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
    public boolean atualizar(GrupoProduto o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE FROM grupoproduto "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir grupo: " + e);
            return false;
        }
    }

    @Override
    public ArrayList<GrupoProduto> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<GrupoProduto> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GrupoProduto consultarId(int id) {
        GrupoProduto GrupoProduto = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM grupoproduto "
                    + "WHERE id = " + id;
            System.out.println("CONSULTA GRUPO");
            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                GrupoProduto = new GrupoProduto();

                GrupoProduto.setId(resultadoQ.getInt("id"));
                GrupoProduto.setDescricao(resultadoQ.getString("descricao"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar grupo: " + e);
        }

        return GrupoProduto;
    }


    
    
}
