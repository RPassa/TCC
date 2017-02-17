
package DAO;

import Utilitarios.Conexao;
import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 * The type Bairro dao.
 */
public class BairroDAO {

    /**
     * Busscar bairro.
     *
     * @param Bairro   the bairro
     * @param Pesquisa the pesquisa
     * @param Ordem    the ordem
     */
    public void busscarBairro(int Bairro, List<String> Pesquisa, List<Integer> Ordem) {
        
        try {
            String SQLSelect = "SELECT bairros.nome as nome, bairros.id as id FROM bairros INNER JOIN cidades on cidades.id = bairros.id_cidade\n" +
                    "WHERE cidades.id = ? and bairros.ativo = ? order by bairros.nome Asc";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelect);
            st.setInt(1, Bairro);
            st.setBoolean(2, true);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
               

                //-----------------------------------------------------------------
                Pesquisa.add(rs.getString("nome"));
                    
                Ordem.add(rs.getInt("id"));
                //-----------------------------------------------------------------
           
              
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    null, 0, new ImageIcon("imagens/Error-2.png"));
        }

        Conexao.fecharConexao();
        
    }

    /**
     * Busscar cidade.
     *
     * @param Lista  the lista
     * @param Cidade the cidade
     * @param Ordem  the ordem
     */
    public void busscarCidade(List<String> Lista, List<Integer> Cidade, List<Integer> Ordem) {
        
        try {
            String SQLSelect = "SELECT cidades.id as id, cidades.nome as nome, cidades.padrao as padrao,"
                    + "uf.nome as uf FROM cidades INNER JOIN uf on uf.id = cidades.id_uf WHERE cidades.ativo = ? order by cidades.nome Asc";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelect);
            st.setBoolean(1, true);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
               

                //-----------------------------------------------------------------
                Lista.add(rs.getString("nome") + " - (" + rs.getString("uf") + ")");
                Ordem.add(rs.getInt("padrao"));
                Cidade.add(rs.getInt("id"));
                //-----------------------------------------------------------------
           
              
            }
            
            //cbbcidade.setSelectedIndex(Ordem.indexOf(1));
            //JOptionPane.showMessageDialog(null, (Ordem.indexOf(1)));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    null, 0, new ImageIcon("imagens/Error-2.png"));
        }

        Conexao.fecharConexao();
    }

}
