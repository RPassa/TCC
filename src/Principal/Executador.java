/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import GUI.Login;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * The type Executador.
 *
 * @author Java
 */
public class Executador {


    /**
     * Main.
     *
     * @param args the args
     * @throws ClassNotFoundException the class not found exception
     */
    public static void main(String args[]) throws ClassNotFoundException {

        try {
            // SETA LOOK AND FEEL
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Executador.class.getName()).log(Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);

        });


    }

}
