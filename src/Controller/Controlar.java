
package Controller;

import javax.swing.JOptionPane;

/**
 * The type Controlar.
 *
 * @author Java
 */
public class Controlar {

    /**
     * The Titulo.
     */
    static final String $titulo = "Pizzaria Zeo";

    /**
     * Get titulo string.
     *
     * @return the string
     */
    public static String get$titulo() {
        return $titulo;
    }


    /**
     * Fechar form boolean.
     *
     * @return the boolean
     */
    public static boolean fecharForm(){
        
        Object[] options = {"Sim", "Não"};
        

        if (JOptionPane.showOptionDialog(null, "Deseja Fechar a Janela?", "Fechar Operação",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]) 
                == 0) {
            return true;
        }
        
        return false;
    }
    

}
