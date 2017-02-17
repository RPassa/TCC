package DAO;

import Beans.ClienteBeans;
import Utilitarios.Conexao;
import Utilitarios.Corretor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import static Utilitarios.Corretor.ConverterStatusJava;
import java.io.IOException;
import java.util.List;

/**
 * The type Cliente dao.
 */
public class ClienteDAO {

    /**
     * The Cliente b.
     */
    ClienteBeans ClienteB;

    /**
     * Instantiates a new Cliente dao.
     */
    public ClienteDAO() {

    }

    /**
     * Existe id boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public boolean existeID(int id) {
        
        String SQLSelecao = "SELECT id  FROM clientes where id = ?";
        
        try {

            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelecao);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();


            if (rs.next()) {

                return true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null, 
                    e.getMessage(),
                    null, 
                    0, 
                    new ImageIcon("imagens/Error-2.png"));

        }

        Conexao.fecharConexao();
        return false;
    }

    /**
     * Listar cliente cliente beans.
     *
     * @param id     the id
     * @param Bairro the bairro
     * @param Cidade the cidade
     * @return the cliente beans
     */
    public ClienteBeans listarCliente(int id, List<String> Bairro, List<String> Cidade) {

        ClienteB = new ClienteBeans();

        String SQLSelecao = "SELECT clientes.*, bairros.nome as bairro, cidades.id as cidade, cidades.nome as cidnome\n" +
                "FROM clientes INNER JOIN bairros on clientes.id_bairro = bairros.id\n" +
                "INNER JOIN cidades ON bairros.id_cidade = cidades.id where clientes.id = ?";

        try {

            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelecao);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                //-------------------------------------------------------------------------------------------------
                ClienteB.setCodigo(rs.getInt("id"));                                                        //|
                ClienteB.setNome(rs.getString("nome"));                                                     //|
                ClienteB.setEndereco(rs.getString("endereco"));                                             //|
                ClienteB.setOrdemBairro(rs.getInt("id_bairro"));                                            //|
                Bairro.add(rs.getString("bairro"));                                                         //|
                ClienteB.setOrdemCidade(rs.getInt("cidade"));                                               //|
                Cidade.add(rs.getString("cidnome"));                                                        //|
                ClienteB.setTelefone(rs.getString("telefone"));                                             //|
                ClienteB.setCelular(rs.getString("celular"));                                               //|
                ClienteB.setEmail(rs.getString("email"));                                                   //|
                ClienteB.setDataCad(Corretor.ConverterDataJava(rs.getString("data_cad")));                //|
                ClienteB.setAtivo(rs.getBoolean("ativo"));                                                  //|
                ClienteB.setCpf(rs.getString("cpf"));                                                       //|
                ClienteB.setRg(rs.getString("rg"));                                                         //|
                //-------------------------------------------------------------------------------------------------

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    null, 0, new ImageIcon("imagens/Error-2.png"));

        }
        //||||||||||||||||||||||||
        //|||||||||||||||||||||||
        Conexao.fecharConexao();
        //-----------------------*
        return ClienteB;
        //||||||||||||||||||||||||
        //|||||||||||||||||||||||

    }

    /**
     * Atualizar cliente.
     *
     * @param Cliente the cliente
     */
    public void atualizarCliente(ClienteBeans Cliente) {

        try {
            String SQLInsert = "UPDATE clientes set nome = ?,endereco = ?,id_bairro = ?,telefone = ?, celular = ?, email = ?, ativo = ?, rg = ?, cpf = ? where id = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsert);
            //-------------------------------------------------
            st.setString(1, Cliente.getNome());         //|
            st.setString(2, Cliente.getEndereco());     //|
            st.setInt(3, Cliente.getBairro());       //|
            st.setString(4, Cliente.getTelefone());     //|
            st.setString(5, Cliente.getCelular());      //|
            st.setString(6, Cliente.getEmail());        //|
            st.setBoolean(7, Cliente.getAtivo());       //|
            st.setString(8, Cliente.getRg());           //|
            st.setString(9, Cliente.getCpf());          //|
            st.setInt(10, Cliente.getCodigo());         //|
            //-------------------------------------------------
            st.executeUpdate();
            // ||||||||||||||||||||||||||||||||
            Conexao.getConnection().commit();
            // ||||||||||||||||||||||||||||||||


            JOptionPane.showMessageDialog(null, "Alterado com Sucesso", null, 0, new ImageIcon("imagens/Success-2.png"));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, 0, new ImageIcon("imagens/Error-2.png"));
        }

        //||||||||||||||||||||||||
        //|||||||||||||||||||||||
        Conexao.fecharConexao();
        //||||||||||||||||||||||||
        //|||||||||||||||||||||||

    }

    /**
     * Cadastrar cliente.
     *
     * @param Cliente the cliente
     */
    public void cadastrarCliente(ClienteBeans Cliente)  {

        try {
            String SQLInsert = "INSERT INTO clientes(nome,endereco,id_bairro,telefone,data_cad,celular,email,ativo,rg,cpf) VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsert);
            //--------------------------------------------------------------------------
            st.setString(1, Cliente.getNome());                                  //|
            st.setString(2, Cliente.getEndereco());                              //|
            st.setInt(3, Cliente.getBairro());                                //|
            st.setString(4, Cliente.getTelefone());                              //|
            st.setString(5, Corretor.ConverterDataSQL(Cliente.getDataCad()));  //|
            st.setString(6, Cliente.getCelular());                               //|
            st.setString(7, Cliente.getEmail());                                 //|
            st.setBoolean(8, Cliente.getAtivo());                                //|
            st.setString(9, Cliente.getRg());                                    //|
            st.setString(10, Cliente.getCpf());                                  //|
            //--------------------------------------------------------------------------
            st.execute();
            // ||||||||||||||||||||||||||||||||
            Conexao.getConnection().commit();
            // ||||||||||||||||||||||||||||||||

            JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso", null, 0, new ImageIcon("imagens/Success-2.png"));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, 0, new ImageIcon("imagens/Error-2.png"));
        }

        //||||||||||||||||||||||||
        //|||||||||||||||||||||||
        Conexao.fecharConexao();
        //||||||||||||||||||||||||
        //|||||||||||||||||||||||

    }

    /**
     * Proximo id int.
     *
     * @return the int
     */
    public int proximoID()  {

        String SQLSelecao = "SELECT max(id) as id FROM clientes";
        int id = 0;
        try {

            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelecao);
            ResultSet rs = st.executeQuery();
            Conexao.fecharConexao();
            if (rs.next()) {
                //--------------------------------------------------------------
                id = (rs.getInt("id"));
                if(id > 0){
                    id += (rs.getInt("id"));           //|
                    return id;                                               //|
                } else {
                    return 1;
                }
                //--------------------------------------------------------------    
            } else {
                return 1;
            }
            
           

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    null, 0, new ImageIcon("imagens/Error-2.png"));

            return 0;
        }
        
        //||||||||||||||||||||||||
        //|||||||||||||||||||||||
         
        //-----------------------*
        
        //||||||||||||||||||||||||
        //|||||||||||||||||||||||
    }

    /**
     * Busscar clientes.
     *
     * @param Modelo the modelo
     */
    public void busscarClientes(DefaultTableModel Modelo)  {

        try {
            String SQLSelect = "SELECT clientes.id as id, clientes.nome as nome,"
                    + "clientes.endereco as endereco, bairros.nome as bairro, clientes.telefone as telefone,"
                    + "clientes.ativo as ativo FROM clientes INNER JOIN bairros on clientes.id_bairro = bairros.id order by id DESC";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelect);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                //-----------------------------------------------------------------
                Modelo.addRow(new Object[]{                                  //|
                        rs.getString("id"),                                 //|
                        rs.getString("nome"),                               //|
                        rs.getString("endereco"),                           //|
                        rs.getString("bairro"),                             //|
                        rs.getString("telefone"),                           //|
                        ConverterStatusJava(rs.getBoolean(("ativo")))       //|
                });                                                     //|
                //-----------------------------------------------------------------
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    null, 0, new ImageIcon("imagens/Error-2.png"));
        }

        Conexao.fecharConexao();
    }

    /**
     * Refinar ativo.
     *
     * @param Pesquisa the pesquisa
     * @param Condicao the condicao
     * @param Modelo   the modelo
     */
    public void refinarAtivo(Boolean Pesquisa, String Condicao, DefaultTableModel Modelo) {


        boolean acesso = false;

        try {
            String SQLSelect = "SELECT clientes.id as id, clientes.nome as nome,"
                    + "clientes.endereco as endereco, bairros.nome as bairro, clientes.telefone as telefone,"
                    + "clientes.ativo as ativo FROM clientes INNER JOIN bairros on clientes.id_bairro = bairros.id where  ativo = ? ORDER BY id ASC";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelect);
            st.setBoolean(1,(Pesquisa));
            ResultSet rs = st.executeQuery();


            Modelo.setNumRows(0);
            while (rs.next()) {
                //-----------------------------------------------------------------
                Modelo.addRow(new Object[]{                                  //|
                        rs.getString("id"),                                 //|
                        rs.getString("nome"),                               //|
                        rs.getString("endereco"),                           //|
                        rs.getString("bairro"),                             //|
                        rs.getString("telefone"),                           //|
                        ConverterStatusJava(rs.getBoolean(("ativo")))       //|
                });                                                     //|
                //-----------------------------------------------------------------
                acesso = true;

            }

            if (!acesso) {
                JOptionPane.showMessageDialog(null, "Sua pesquisa não retornou nenhum resultado, tente novamente");

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    null, 0, new ImageIcon("imagens/Error-2.png"));
        }

        Conexao.fecharConexao();

    }

    /**
     * Refinar bussca id.
     *
     * @param Pesquisa the pesquisa
     * @param Condicao the condicao
     * @param Modelo   the modelo
     */
    public void refinarBusscaID(int Pesquisa, String Condicao, DefaultTableModel Modelo)  {

        boolean acesso = false;

        try {
            String SQLSelect = "SELECT clientes.id as id, clientes.nome as nome,"
                    + "clientes.endereco as endereco, bairros.nome as bairro, clientes.telefone as telefone,"
                    + "clientes.ativo as ativo FROM clientes INNER JOIN bairros on clientes.id_bairro = bairros.id where  id = ? ORDER BY id ASC";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelect);
            st.setInt(1, Pesquisa);

            ResultSet rs = st.executeQuery();

            if (Pesquisa > 0) {
                Modelo.setNumRows(0);
                while (rs.next()) {
                    //-----------------------------------------------------------------
                    Modelo.addRow(new Object[]{                                  //|
                            rs.getString("id"),                                 //|
                            rs.getString("nome"),                               //|
                            rs.getString("endereco"),                           //|
                            rs.getString("bairro"),                             //|
                            rs.getString("telefone"),                           //|
                            ConverterStatusJava(rs.getBoolean(("ativo")))       //|
                    });                                                     //|
                    //-----------------------------------------------------------------
                    acesso = true;

                }

                if (!acesso) {
                    JOptionPane.showMessageDialog(null, "Sua pesquisa não retornou nenhum resultado, tente novamente");
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    null, 0, new ImageIcon("imagens/Error-2.png"));
        }

        Conexao.fecharConexao();

    }

    /**
     * Refinar bussca.
     *
     * @param Pesquisa the pesquisa
     * @param Condicao the condicao
     * @param Modelo   the modelo
     */
    public void refinarBussca(String Pesquisa, String Condicao, DefaultTableModel Modelo)  {

        boolean acesso = false;

        try {
            String SQLSelect = "SELECT clientes.id as id, clientes.nome as nome,"
                    + "clientes.endereco as endereco, bairros.nome as bairro, clientes.telefone as telefone,"
                    + "clientes.ativo as ativo FROM clientes INNER JOIN bairros on clientes.id_bairro = bairros.id where "+Condicao+" LIKE '%"+Pesquisa+"%' ORDER BY id ASC";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelect);
            ResultSet rs = st.executeQuery();

            if (!Pesquisa.equals("")) {
                Modelo.setNumRows(0);
                while (rs.next()) {
                    //-----------------------------------------------------------------
                    Modelo.addRow(new Object[]{                                  //|
                            rs.getString("id"),                                 //|
                            rs.getString("nome"),                               //|
                            rs.getString("endereco"),                           //|
                            rs.getString("bairro"),                             //|
                            rs.getString("telefone"),                           //|
                            ConverterStatusJava(rs.getBoolean(("ativo")))       //|
                    });                                                     //|
                    //-----------------------------------------------------------------
                    acesso = true;

                }

                if (!acesso) {
                    JOptionPane.showMessageDialog(null, "Sua pesquisa não retornou nenhum resultado, tente novamente");
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    null, 0, new ImageIcon("imagens/Error-2.png"));
        }

        Conexao.fecharConexao();

    }



}
