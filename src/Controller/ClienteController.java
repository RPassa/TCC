package Controller;

import Beans.ClienteBeans;
import DAO.ClienteDAO;
import java.awt.Component;
import java.awt.Dimension;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 * The type Cliente controller.
 */
public class ClienteController {

    /**
     * The Cliente d.
     */
    ClienteDAO ClienteD;
    /**
     * The Formater.
     */
    MaskFormatter formater;

    /**
     * Instantiates a new Cliente controller.
     */
    public ClienteController() {
        ClienteD = new ClienteDAO();

    }

    /**
     * Verificar dados boolean.
     *
     * @param Cliente  the cliente
     * @param Verifica the verifica
     * @return the boolean
     */
    public boolean verificarDados(ClienteBeans Cliente, int Verifica) {

        if (Cliente.getNome().equals("")) {

            JOptionPane.showMessageDialog(null, "O Campo Nome não pode estar vazio",
                    null, 0, new ImageIcon("imagens/Error-128.png"));
            return false;
        }

        if (Cliente.getEndereco().equals("")) {

            JOptionPane.showMessageDialog(null, "O Campo Endereço não pode estar vazio",
                    null, 0, new ImageIcon("imagens/Error-128.png"));
            return false;
        }

        if (Verifica < 1) {

            JOptionPane.showMessageDialog(null, "Selecione um Bairro",
                    null, 0, new ImageIcon("imagens/Error-128.png"));
            return false;
        }
       
        if ((Cliente.getTelefone().equals("(  )     -    ")) && (Cliente.getCelular().equals("(  )       -    "))) {

            JOptionPane.showMessageDialog(null, "Ou o Campo Telefone ou o Campo Celular não pode estar vazio",
                    null, 0, new ImageIcon("imagens/Error-128.png"));
            return false;
        }
        /* 
           if (Cliente.getCpf().equals("   .   .   -  ")) {

            JOptionPane.showMessageDialog(null, "O Campo CPF não pode estar vazio",
                    null, 0, new ImageIcon("imagens/Error-128.png"));
            return false;
        }
        if (Cliente.getRg().equals("  .   .   - ")) {

            JOptionPane.showMessageDialog(null, "O Campo RG não pode estar vazio",
                    null, 0, new ImageIcon("imagens/Error-128.png"));
            return false;
        }

         */

        if (ClienteD.existeID(Cliente.getCodigo())) {

            ClienteD.atualizarCliente(Cliente);

        } else {

            ClienteD.cadastrarCliente(Cliente);
        }
        return true;
    }

    /**
     * Controle id string.
     *
     * @return the string
     */
    public String controleID() {

        return Integer.toString(ClienteD.proximoID());
    }

    /**
     * Controle pesquisa.
     *
     * @param Modelo the modelo
     */
    public void controlePesquisa(DefaultTableModel Modelo) {
        Modelo.setNumRows(0);
        ClienteD.busscarClientes(Modelo);

    }

    /**
     * Controle bussca.
     *
     * @param Modelo the modelo
     */
    @SuppressWarnings("empty-statement")
    public void controleBussca(DefaultTableModel Modelo) {

        String Condicao = "";
        String Pesquisa = "";

        Object[] opcoes = {"Código", "Nome", "Endereço", "Bairro", "Telefone", "Celular", "RG", "CPF", "E-mail", "Data de Cadastro", "Status"};
        Object[] status = {"Ativo", "Inativo"};
        String res = (String) JOptionPane.showInputDialog(null, "Filtrar por:", "Refinar Busca",
                JOptionPane.PLAIN_MESSAGE, null, opcoes, "");

        if (res != null) {

            if (res == opcoes[10]) {

                Condicao = "ativo";

                res = (String) JOptionPane.showInputDialog(null, "Filtrar por:", "Refinar Status",
                        JOptionPane.PLAIN_MESSAGE, null, status, "");

                if (res == status[0]) {
                    ClienteD.refinarAtivo(true, Condicao, Modelo);
                } else {
                    ClienteD.refinarAtivo(false, Condicao, Modelo);
                }

            } else {
                if (res == opcoes[6]) {
                    try {
                        this.formater = new MaskFormatter("##.###.###-A");
                        JFormattedTextField rgFormat = new JFormattedTextField(formater);
                        rgFormat.setPreferredSize(new Dimension(110, 30));
                        rgFormat.requestFocus();
                        JPanel rgF = new JPanel();
                        rgF.add(rgFormat);
                        JOptionPane.showMessageDialog(null, rgF, "Alteração de Data:", JOptionPane.PLAIN_MESSAGE);
                        Pesquisa = rgFormat.getText();
                        Condicao = "rg";
                    } catch (ParseException ex) {
                        Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    if (res == opcoes[7]) {
                        try {
                            this.formater = new MaskFormatter("###.###.###-##");
                            JFormattedTextField cpfFormat = new JFormattedTextField(formater);
                            cpfFormat.setPreferredSize(new Dimension(110, 30));
                            cpfFormat.requestFocus();
                            JPanel cpfF = new JPanel();
                            cpfF.add(cpfFormat);
                            JOptionPane.showMessageDialog(null, cpfF, "Alteração de Data:", JOptionPane.PLAIN_MESSAGE);
                            Pesquisa = cpfFormat.getText();
                            Condicao = "cpf";
                        } catch (ParseException ex) {
                            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else if (res == opcoes[9]) {
                        try {
                            this.formater = new MaskFormatter("##/##/####");
                            JFormattedTextField dataForm = new JFormattedTextField(formater);
                            dataForm.setPreferredSize(new Dimension(110, 30));
                            dataForm.requestFocus();
                            JPanel rgF = new JPanel();
                            rgF.add(dataForm);
                            JOptionPane.showMessageDialog(null, rgF, "Alteração de Data:", JOptionPane.PLAIN_MESSAGE);
                            Pesquisa = dataForm.getText();
                            Condicao = "data_cad";
                        } catch (ParseException ex) {
                            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        Pesquisa = JOptionPane.showInputDialog("Digite a palavra-chave da sua pesquisa");
                        if (res == opcoes[0]) {

                            Condicao = "id";
                            ClienteD.refinarBusscaID(Integer.parseInt(Pesquisa), Condicao, Modelo);

                        } else {
                            if (res == opcoes[1]) {
                                Condicao = "nome";
                            } else if (res == opcoes[2]) {
                                Condicao = "endereco";
                            } else if (res == opcoes[3]) {
                                Condicao = "bairro";
                            } else if (res == opcoes[4]) {
                                Condicao = "telefone";
                            } else if (res == opcoes[5]) {
                                Condicao = "celular";
                            } else if (res == opcoes[8]) {
                                Condicao = "email";
                            }

                        }

                    }
                }

            }
            ClienteD.refinarBussca(Pesquisa, Condicao, Modelo);

        }

    }

    /**
     * Controle preencher campos cliente beans.
     *
     * @param id     the id
     * @param Bairro the bairro
     * @param Cidade the cidade
     * @return the cliente beans
     */
    public ClienteBeans controlePreencherCampos(int id, List<String> Bairro, List<String> Cidade) {
        return ClienteD.listarCliente(id, Bairro, Cidade);

    }

}
