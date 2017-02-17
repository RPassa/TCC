
package DAO;

import Utilitarios.Conexao;
import static Utilitarios.Corretor.ConverterStatusJava;
import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 * The type Funcionario dao.
 */
public class FuncionarioDAO {


    /**
     * Busscar cargo.
     *
     * @param Lista the lista
     */
    public void busscarCargo(List<String> Lista) {

        try {
            String SQLSelect = "SELECT cargofix, cargo FROM config order by cargofix Asc";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelect);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Array matriz = rs.getArray("cargofix");
               
                Array c = rs.getArray("cargo");
                
                String[] m = (String[]) matriz.getArray();


                Arrays.sort(m);
              

                for (String m1 : m) {
                    //-----------------------------------------------------------------
                    Lista.add(m1);
                    //-----------------------------------------------------------------
                }
                
                if(c != null){
                    String[] cargo = (String[]) c.getArray();
                    
                    for (String cargo1 : cargo) {
                        //-----------------------------------------------------------------
                        Lista.add(cargo1);
                        //-----------------------------------------------------------------
                    }
                    Collections.sort(Lista);
                }
              
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    null, 0, new ImageIcon("imagens/Error-2.png"));
        } finally{
       
             Conexao.fecharConexao();
        }

       
    }

}
