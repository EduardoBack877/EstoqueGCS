
package dao;
import apoio.IDAOT;
import apoio.ConexaoBD;
import entidade.Prateleira;
import entidade.Secao;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import tela.IfrCadastroPrateleira;
import tela.IfrCadastroSecoes;

public class PrateleiraDAO implements IDAOT<Prateleira>  {
        
    ResultSet resultadoQ = null;
    ResultSet resultadoQ1 = null;

    @Override
    public boolean salvar(Prateleira s) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = "";
            
             if (s.getId() == 0) {
                  sql = "INSERT INTO prateleira VALUES ( "
                    + "default) ";
                  
             } 
            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return resultado > 0;

        } catch (Exception e) {
            System.out.println("Erro ao salvar prateleira: " + e);
            return false;
        }
    }
    
    public void popularTabela (JTable tabela, String criterio) {
        int numColunas = 1;
        Prateleira s = new Prateleira();
        IfrCadastroPrateleira is = new IfrCadastroPrateleira();
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[numColunas];
        cabecalho[0] = "Id";
        
        int lin = 0;
        String sql2 = "'";
        if (criterio.isEmpty()) {
            criterio = "*";
        } else {
            criterio = criterio;
        }
        //efetua consulta na tabela
        try {
            if (criterio == "*") {
                resultadoQ = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
  ResultSet.CONCUR_READ_ONLY).executeQuery(sql2=""
                    + "SELECT * "
                    + "FROM prateleira " 
                    + " ORDER BY id");
            } else {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
  ResultSet.CONCUR_READ_ONLY).executeQuery(sql2=""
                    + "SELECT * "
                    + "FROM prateleira " 
                    + "WHERE id =  " + criterio 
                    + " ORDER BY id");
            }
            
             System.out.println(resultadoQ);
            // vai para o ultima linha do RS
            // captura a linha = num de registros
            // retorna para o inicio
  
              resultadoQ.last();
            int numRegistros = resultadoQ.getRow();
            resultadoQ.beforeFirst();
            
            dadosTabela = new Object[numRegistros][numColunas];
         
            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                      lin++;}
         
            
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
            System.out.println(sql2);
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

                if (column == 1) {
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
      criterio = "";
    }
        
    
    @Override
    public boolean atualizar(Prateleira o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE FROM prateleira "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir prateleira: " + e);
            return false;
        }
    }

    @Override
    public ArrayList<Prateleira> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Prateleira> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Prateleira consultarId(int id) {
        Prateleira prat = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM prateleira "
                    + "WHERE id = " + id;
            System.out.println("CONSULTA PRATELEIRA");
            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                prat = new Prateleira();

                prat.setId(resultadoQ.getInt("id"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar seção: " + e);
        }

        return prat;
    }


    
    
}
