
package Controller;

import DAO.BairroDAO;
import DAO.FuncionarioDAO;
import java.util.List;
import javax.swing.JComboBox;


/**
 * The type Funcionario controller.
 */
public class FuncionarioController {

    /**
     * The Funcionario d.
     */
    FuncionarioDAO FuncionarioD = new FuncionarioDAO();
    /**
     * The Bairro d.
     */
    BairroDAO BairroD = new BairroDAO();

    /**
     * Busscar cargo.
     *
     * @param Lista the lista
     */
    public void busscarCargo(List<String> Lista){
        FuncionarioD.busscarCargo(Lista);
    }

    /**
     * Busscar cidade.
     *
     * @param Lista  the lista
     * @param Cidade the cidade
     * @param Ordem  the ordem
     */
    public void busscarCidade(List<String> Lista, List<Integer> Cidade, List<Integer> Ordem){
        BairroD.busscarCidade(Lista, Cidade, Ordem);
    }

    /**
     * Busscar bairro.
     *
     * @param Bairro   the bairro
     * @param Pesquisa the pesquisa
     * @param Ordem    the ordem
     */
    public void busscarBairro(int Bairro, List<String> Pesquisa, List<Integer> Ordem) {
        BairroD.busscarBairro(Bairro, Pesquisa, Ordem);
    }

}
