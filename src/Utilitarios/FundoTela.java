/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import GUI.Principal;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 * The type Fundo tela.
 *
 * @author Java
 */
public class FundoTela extends JDesktopPane{
    
    private Image imagem;

    /**
     * Instantiates a new Fundo tela.
     *
     * @param imagem the imagem
     */
    public FundoTela(String imagem) {
       
        this.imagem = new ImageIcon(Principal.class.getResource(imagem)).getImage();
       
    }

    /**
     * Paint component.
     *
     * @param g the g
     */
    @Override
    public void paintComponent(Graphics g) {
       
        g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
    }
   
   

}
