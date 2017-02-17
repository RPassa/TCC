/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.LoginBeans;
import Utilitarios.Conexao;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

/**
 * The type Login dao.
 *
 * @author Java
 */
public class LoginDAO {

    /**
     * Instantiates a new Login dao.
     */
    public LoginDAO() {

    }

    /**
     * Busscar login boolean.
     *
     * @param LoginB the login b
     * @return the boolean
     */
    public boolean busscarLogin(LoginBeans LoginB)  {

       
        String SQLSelect = "SELECT login.usuario as usuario, login.senha as senha, login.ativo as ativo, login.id_permissao as permissao,\n" +
                "  funcionarios.nome as funcionarios FROM login \n" +
                "  INNER JOIN funcionarios ON login.id_funcionario = funcionarios.id WHERE  usuario = ? and senha = ?";
        //JOptionPane.showMessageDialog(null, SQLSelect);
        try {

            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelect);
            
            st.setString(1, LoginB.get$usuario());
            st.setString(2, LoginB.get$senha());
            ResultSet rs = st.executeQuery();
            
            Conexao.getConnection().commit();

            LoginB.set$usuario("");
            LoginB.set$senha("");
            
            while (rs.next()) {

                LoginB.set$usuario(rs.getString("usuario"));
                LoginB.set$senha(rs.getString("senha"));
                LoginB.set$ativo(rs.getBoolean("ativo"));
                LoginB.set$permissao(rs.getInt("permissao"));
                LoginB.set$funcionario(rs.getString("funcionarios"));

            }

            if (!LoginB.get$usuario().equals("") && !LoginB.get$senha().equals("")) {

                if (LoginB.is$ativo()) {
                    //Enquanto for 0 <- Usuário Básico (Cadastros de Clientes, Registrar Pedidos, Acesso à Caixa, Consultar Pedidos)
                    //Enquanto for 1 <- Usuário Avançado([Usuário Básico], Todos os Cadastros - Usuários, Todas as Consultas - Usuários )
                    
                    //Enquanto for 2 <- Moderador ([Usuário Básico], Todos os Cadastros, Add ou Remover Usuários, Relatórios, Gerenciar Pedidos e Estoques, Gerenciar Cozinha)
                   
                    //Enquanto for 3 <- Cozinha Básica (Gerenciar Pedidos, Consultar Receitas)
                    //Enquanto for 4 <- Cozinha Avançado ([Cozinha Básica], Gerenciar Estoques, Relatórios)
                    
                    //Enquanto for 5 <- Administrador (Todas as Funções)
                    
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário inativo, contate o administrador", "Aviso", 0, new ImageIcon("imagens/User-2.png"));
                    Conexao.fecharConexao();
                    return false;
                }
            } else {

                JOptionPane.showMessageDialog(null, "Usuário ou senha inválido", "Erro", 0, new ImageIcon("imagens/User-1.png"));
                Conexao.fecharConexao();
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    null, 0, new ImageIcon("imagens/Error-128.png"));

            return false;
        }

    }

}
