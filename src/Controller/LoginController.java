/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.LoginBeans;
import DAO.LoginDAO;
import GUI.Login;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * The type Login controller.
 *
 * @author Java
 */
public class LoginController {
    
    private LoginDAO LoginD;
    private Login Login;

    /**
     * Gets login d.
     *
     * @return the login d
     */
    public LoginDAO getLoginD() {
        return LoginD;
    }

    /**
     * Sets login d.
     *
     * @param LoginD the login d
     */
    public void setLoginD(LoginDAO LoginD) {
        this.LoginD = LoginD;
    }

    /**
     * Gets login.
     *
     * @return the login
     */
    public Login getLogin() {
        return Login;
    }

    /**
     * Sets login.
     *
     * @param Login the login
     */
    public void setLogin(Login Login) {
        this.Login = Login;
    }

    /**
     * Instantiates a new Login controller.
     */
    public LoginController(){
   
        Login = new Login();
        LoginD = new LoginDAO();
    }


    /**
     * Acesso sistema boolean.
     *
     * @param Login the login
     * @return the boolean
     */
    public boolean acessoSistema(LoginBeans Login){
        
       
        
        if(Login.get$usuario().equals("")){
            JOptionPane.showMessageDialog(null, "O Campo LOGIN não pode estar vazio",
                    "Atenção", 0, new ImageIcon("imagens/Error-2.png"));
            return false;
        }
      
        if(Login.get$senha().equals("")){
            JOptionPane.showMessageDialog(null, "O Campo SENHA não pode estar vazio",
                    null, 0, new ImageIcon("imagens/Error-2.png"));
            return false;
        }
      
        
       
        if(LoginD.busscarLogin(Login)){
            return true;
        }
       
        return false;
    }

}
