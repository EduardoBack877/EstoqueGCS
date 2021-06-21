/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import dao.Md5;
import entidade.Secao;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import tela.IfrCadastroSecoes;
import tela.IfrCadastroUsuario;

/**
 *
 * @author Eduardo Back
 */
public class UsuarioDAO implements IDAOT<Usuario> {
    ResultSet resultadoQ = null;
    ResultSet resultadoQ1 = null;
    ResultSet resultadoQ2 = null;
    public boolean autenticar(String login, String senha) {

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM usuario "
                    + "WHERE "
                    + "login = '" + login + "' AND "
                    + "senha = '" + senha + "'";

            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            return resultadoQ.next();

        } catch (Exception e) {
            System.out.println("Erro ao autenticar: " + e);
            return false;
        }
    }
    
    
    
    
    
    
    
     public String retornasenha(int id) {
         String senhaaux = null;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT senha "
                    + "FROM usuario "
                    + "WHERE "
                    + "id = " + id;

       //     System.out.println("SQL: " + sql);

            resultadoQ2 = st.executeQuery(sql);

            if (resultadoQ2.next()) {
                senhaaux = resultadoQ2.getString("senha");
            };
            return senhaaux;
            
        } catch (Exception e) {
            System.out.println("Erro ao retornar senha: " + e);
            return "";
        }
    }
    
    public boolean salvarsemmd5 (Usuario u) {
           try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = "";
            
           
                 sql = "UPDATE usuario "
                        + "SET login = '" + u.getUsername() + "',"
                        + "senha = ('" + u.getPassword()  + "'),"
                        + "status =" + u.getStatus() + " "
                        + "WHERE id = " + u.getId();
           
            System.out.println("SQL: " + sql);

            int resultado1 = st.executeUpdate(sql);

            return resultado1 > 0;

        } catch (Exception e) {
            System.out.println("Erro ao salvar seção: " + e);
            return false;
        }
     
    }
     
     
     
     
     

    @Override
    public boolean salvar(Usuario u) {
           try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = "";
            
             if (u.getId() == 0) {
                  sql = "INSERT INTO usuario VALUES ( "
                    + "default, "
                    + "'" + u.getUsername() + "',"
                    + " md5('" + u.getPassword() + "'),"
                    + "'" + u.getStatus() + "'"  
                    + ")";
                  
             } else {
                 sql = "UPDATE usuario "
                        + "SET login = '" + u.getUsername() + "',"
                        + "senha = md5('" + u.getPassword()  + "'),"
                        + "status =" + u.getStatus() + " "
                        + "WHERE id = " + u.getId();
            }
             

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return resultado > 0;

        } catch (Exception e) {
            System.out.println("Erro ao salvar seção: " + e);
            return false;
        }
    
    }

    @Override
    public boolean atualizar(Usuario o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE FROM usuario "
                    + "WHERE id = " + id;

            System.out.println("SQL: " + sql);

            st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir agendamento: " + e);
            return false;
        }
    }

    @Override
    public ArrayList<Usuario> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Usuario> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario consultarId(int id) {
        Usuario u = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            System.out.println("aqu");
            String sql1 = "SELECT * "
                    + "FROM usuario "
                    + "WHERE id = " + id;
            System.out.println("CONSULTA USUARIO");
            System.out.println("SQL: " + sql1);
            //int aux = Integer.parseInt(resultadoQ1.getString("status"));
            resultadoQ1 = st.executeQuery(sql1);
            
            if (resultadoQ1.next()) {
                u = new Usuario();
                System.out.println("1");
                u.setId(resultadoQ1.getInt("id"));
                u.setUsername(resultadoQ1.getString("login"));
                u.setPassword(resultadoQ1.getString("senha"));
                u.setStatus(resultadoQ1.getInt("status"));
            }
             
        } catch (Exception e) {
            System.out.println("Erro ao consultar usuário: " + e);
        }

        return u;
    }
    
    
    public void popularTabela (JTable tabela, String criterio) {
    int numColunas = 3;
        Usuario u = new Usuario();
        IfrCadastroUsuario ifru = new IfrCadastroUsuario();
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[numColunas];
        cabecalho[0] = "Id";
        cabecalho[1] = "Login";
        cabecalho[2] = "Status";
        
        int lin = 0;
        
       
        //efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
  ResultSet.CONCUR_READ_ONLY).executeQuery(""
                    + "SELECT id, "
                    + "login, "
                    + "status "
                    + "FROM usuario " 
                    + "WHERE login ILIKE '%" + criterio + "%'"
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
                dadosTabela[lin][1] = resultadoQ.getString("login");
                dadosTabela[lin][2] = resultadoQ.getString("status");

                
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
   

  