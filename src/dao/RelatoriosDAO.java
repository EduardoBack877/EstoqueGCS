/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import apoio.ConexaoBD;
import entidade.Produto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import tela.IfrCadastroSecoes;
import tela.IfrConsultaEstoque;
import tela.MainWindow;

/**
 *
 * @author Back
 */
public class RelatoriosDAO {
     ResultSet resultadoQ = null;
     ResultSet resultadoQ2 = null;
    public void geraRelatorioItensNoEstoque() {
        Connection connection = null;
        try {
            // Obtém a conexão com o banco de dados
            connection = ConexaoBD.getInstance().getConnection();

            // Compilar o relatório do formato XML gerando um objeto JasperReport
            JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/relatorios/Itens_noestoque.jrxml"));
            // Cria uma lista de parâmetros para o relatório
            Map param = new HashMap();

            // Gera o relatório efetivamente
            JasperPrint print;
            print = JasperFillManager.fillReport(relatorio, param, connection);

            // Exibir o relatório
            JasperViewer.viewReport(print, false);

        } catch (JRException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       public void geraRelatorioItensPorCategoria() {
        Connection connection = null;
        try {
            // Obtém a conexão com o banco de dados
            connection = ConexaoBD.getInstance().getConnection();

            // Compilar o relatório do formato XML gerando um objeto JasperReport
            JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/relatorios/ItensporGrupoNoEstoque.jrxml"));
            // Cria uma lista de parâmetros para o relatório
            Map param = new HashMap();

            // Gera o relatório efetivamente
            JasperPrint print;
            print = JasperFillManager.fillReport(relatorio, param, connection);

            // Exibir o relatório
            JasperViewer.viewReport(print, false);

        } catch (JRException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
       
      public void geraRelatorioMovEstoque (String parametros) {
        Connection connection = null;
        try {
            // Obtém a conexão com o banco de dados
            connection = ConexaoBD.getInstance().getConnection();

            // Compilar o relatório do formato XML gerando um objeto JasperReport
            JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/relatorios/RelMov.jrxml"));
            // Cria uma lista de parâmetros para o relatório
            Map param = new HashMap();

            
            //adiciona parametros
          //  param.put("parametros",parametros);

              
            
            // Gera o relatório efetivamente
            JasperPrint print;
            print = JasperFillManager.fillReport(relatorio, param, connection);

            // Exibir o relatório
            JasperViewer.viewReport(print, false);

        } catch (JRException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    
    
    
    
    public void popularTabela (JTable tabela, String datainicial, String datafinal, String horainicial, String horafinal,  int codgrupo, int codoper) {
        int numColunas = 5;
        String aux = "";
        String aux1 = "";
        if (codoper == 1) {
            aux = "'Entrada'";
            aux1 = "'E'";
        }
        if (codoper == 2) {
            aux = "'Saída'";
            aux1 = "'S'";
        }
        String periodoinicial = "'" + datainicial + " " + horainicial + "'";
        String periodofinal = "'" + datafinal + " " + horafinal + "'";
        Produto s = new Produto();
        IfrConsultaEstoque is = new IfrConsultaEstoque();
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[numColunas];
        cabecalho[0] = "Periodo";
        cabecalho[1] = "Produto";
        cabecalho[2] = "Grupo";
        cabecalho[3] = "Operação";
        cabecalho[4] = "Quantidade";
        

        
        int lin = 0;
        
        
       String auxiliar =  "SELECT m.periodo AS periodo, p.descricao AS produto, g.descricao AS grupo, " + aux + " as operacao"
                    + " FROM produto p " 
                    + "LEFT JOIN grupoproduto G ON p.codgrupo = G.id "
                    + "LEFT JOIN movestoque M ON M.codprod = P.id "
                    + "WHERE m.periodo BETWEEN " + periodoinicial + " AND " + periodofinal + " AND g.id = " + codgrupo + " AND m.operacao = " + "" + aux1 + " "
                    + "ORDER BY m.periodo ASC";
       
        System.out.println(auxiliar);
            
       
        
        try {
            if (codoper == 1 ) {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
  ResultSet.CONCUR_READ_ONLY).executeQuery(""
                    + "SELECT m.periodo AS periodo, p.descricao AS produto, g.descricao AS grupo, " + aux + " as operacao, m.qtd as quantidade"
                    + " FROM produto p " 
                    + "LEFT JOIN grupoproduto G ON p.codgrupo = G.id "
                    + "LEFT JOIN movestoque M ON M.codprod = P.id "
                    + "WHERE m.periodo BETWEEN " + periodoinicial + " AND " + periodofinal + " AND g.id = " + codgrupo + " AND m.operacao = " + "" + aux1 + " "
                    + "ORDER BY m.periodo ASC");
            
            } 
            if (codoper == 2) {
                resultadoQ = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
  ResultSet.CONCUR_READ_ONLY).executeQuery(""
                    + "SELECT m.periodo AS periodo, p.descricao AS produto, g.descricao AS grupo, " + aux + " as operacao, m.qtd as quantidade"
                    + " FROM produto p " 
                    + "LEFT JOIN grupoproduto G ON p.codgrupo = G.id "
                    + "LEFT JOIN movestoque M ON M.codprod = P.id "
                    + "WHERE m.periodo BETWEEN " + periodoinicial + " AND " + periodofinal + " AND g.id = " + codgrupo + " AND m.operacao = " + "" + aux1 + " "
                    + "ORDER BY m.periodo ASC");
            }
           
            
            // vai para o ultima linha do RS
            // captura a linha = num de registros
            // retorna para o inicio
  
              resultadoQ.last();
            int numRegistros = resultadoQ.getRow();
            resultadoQ.beforeFirst();
            
            dadosTabela = new Object[numRegistros][numColunas];
         
            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getString("periodo");
                dadosTabela[lin][1] = resultadoQ.getString("produto");
                dadosTabela[lin][2] = resultadoQ.getString("grupo");
                dadosTabela[lin][3] = resultadoQ.getString("operacao");
                dadosTabela[lin][4] = resultadoQ.getString("quantidade");
             
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
}
