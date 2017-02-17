
package Utilitarios;


import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import org.gjt.mm.mysql.Driver;



/**
 * The type Conexao.
 */
public class Conexao {
    
    /* MySQL Connect
    private final String $link = "mysql";
    private final String $host = "localhost";
    private final String $port = "3306";
    private final String $bank = "pizzaria";
    
    private final String $driver = "org.gjt.mm.mysql.Driver";
    
    private final String $driver = "org.gjt.mm.mysql.Driver";
    
    private final String $user = "root";
    private final String $pass = "";
    */
    
    // Remote PostgreSQL Connect
    private final String $link = "postgresql";
    private final String $host = "deagol.autsites.com";
    private final String $port = "5432";
    private final String $bank = "tcc_pizzaria";
    
    private final String $driver = "org.postgresql.Driver";
    
    private final String $user = "tcc";
    private final String $pass = "postgres123";
    
    
   
    //Properties Config = new Properties();

       /* Etec PostgreSQL Connect
    private String $link = "postgresql";
    private  String $host = "localhost";
    private  String $port = "5432";
    private  String $bank = "pizzaria";
    
    private  String $driver = "org.postgresql.Driver";
    
    private  String $user = "postgres";
    private  String $pass = "etecjau";
    */
    
    private  String $juntar = "jdbc:"+$link+"://"+$host+":"+$port+"/"+$bank;

    /**
     * The Conectar.
     */
    public static Connection $conectar;

    /**
     * Instantiates a new Conexao.
     */
    public Conexao()  {
              
       
        try {
        
            $conectar = DriverManager.getConnection($juntar,$user,$pass);
            $conectar.setAutoCommit(false);
           
           
        } catch (Exception e) {
       
            JOptionPane.showMessageDialog(null, e.getMessage(),null,0);
           
        }

    }

    /**
     * Gets connection.
     *
     * @return the connection
     */
    public static Connection getConnection() {
        if ($conectar == null) {

            try {
                new Conexao();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                
            }

        }
       
        return $conectar;
    }

    /**
     * Fechar conexao.
     */
    public static void fecharConexao() {
       
        try {
            if (!$conectar.isClosed()) {
                $conectar.close();
                $conectar = null;
                
            }
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),null,0);
        }
    }

}

