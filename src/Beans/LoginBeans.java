package Beans;

/**
 * The type Login beans.
 *
 * @author Java
 */
public class LoginBeans {

    /**
     * The Usuario.
     */
    public static String $usuario, /**
     * The Senha.
     */
    $senha, /**
     * The Funcionario.
     */
    $funcionario;

    /**
     * Get funcionario string.
     *
     * @return the string
     */
    public static String get$funcionario() {
        return $funcionario;
    }

    /**
     * Set funcionario.
     *
     * @param $funcionario the funcionario
     */
    public static void set$funcionario(String $funcionario) {
        LoginBeans.$funcionario = $funcionario;
    }

    /**
     * The Permissao.
     */
    public static int $permissao;
    /**
     * The Ativo.
     */
    public static boolean $ativo;

    /**
     * Is ativo boolean.
     *
     * @return the boolean
     */
    public boolean is$ativo() {
        return $ativo;
    }

    /**
     * Set ativo.
     *
     * @param $ativo the ativo
     */
    public void set$ativo(boolean $ativo) {
        this.$ativo = $ativo;
    }

    /**
     * Get usuario string.
     *
     * @return the string
     */
    public  String get$usuario() {
        return $usuario;
    }

    /**
     * Set usuario.
     *
     * @param $usuario the usuario
     */
    public void set$usuario(String $usuario) {
        LoginBeans.$usuario = $usuario;
    }

    /**
     * Get senha string.
     *
     * @return the string
     */
    public String get$senha() {
        return $senha;
    }

    /**
     * Set senha.
     *
     * @param $senha the senha
     */
    public void set$senha(String $senha) {
        LoginBeans.$senha = $senha;
    }

    /**
     * Get permissao int.
     *
     * @return the int
     */
    public int get$permissao() {
        return $permissao;
    }


    /**
     * Set permissao.
     *
     * @param $permissao the permissao
     */
    public void set$permissao(int $permissao) {
        this.$permissao = $permissao;
    }


    /**
     * Instantiates a new Login beans.
     */
    public LoginBeans(){
        
    }

}
