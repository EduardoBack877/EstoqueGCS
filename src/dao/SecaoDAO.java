
package dao;
import apoio.IDAOT;
import apoio.ConexaoBD;
import entidade.Secao;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import tela.IfrCadastroSecoes;

public class SecaoDAO implements IDAOT<Secao>  {
        
    ResultSet resultadoQ = null;
    ResultSet resultadoQ1 = null;

    @Override
    public boolean salvar(Secao s) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = "";
            
             if (s.getId() == 0) {
                  sql = "INSERT INTO secao VALUES ( "
                    + "default, "
                    + "'" + s.getDescricao() + "'"
                    + ")";
                  
             } else {
                 sql = "UPDATE secao "
                        + "SET descricao = '" + s.getDescricao() + "'"
                        + "WHERE id = " + s.getId();
            }
             

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return resultado > 0;

        } catch (Exception e) {
            System.out.println("Erro ao salvar seção: " + e);
            return false;
        }
    }
    
    public void popularTabela (JTable tabela, String criterio) {
        String sql2 = "";
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
                    + "FROM secao " 
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
        System.out.println(sql2);

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
    public boolean atualizar(Secao o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE FROM secao "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir Seção: " + e);
            return false;
        }
    }

    @Override
    public ArrayList<Secao> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Secao> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Secao consultarId(int id) {
        Secao secao = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM secao "
                    + "WHERE id = " + id;

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                secao = new Secao();

                secao.setId(resultadoQ.getInt("id"));
                secao.setDescricao(resultadoQ.getString("descricao"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar seção: " + e);
        }

        return secao;
    }


    
    
}
