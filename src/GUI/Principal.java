package GUI;

import Beans.LoginBeans;
import Controller.Controlar;
import Utilitarios.FundoTela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * The type Principal.
 *
 * @author Java
 */
public class Principal extends javax.swing.JFrame {


    /**
     * The Tela.
     */
    public FundoTela tela;
    /**
     * The Cliente.
     */
    public ClienteForm cliente;
    /**
     * The Creditos.
     */
    public CreditoForm creditos;
    /**
     * The Funcionarios.
     */
    public FuncionarioForm funcionarios;


    /**
     * Instantiates a new Principal.
     */
    public Principal() {
        componentesPrincipal();
        iconTela();
        sessionConfig();
    }

    /**
     * Session config.
     */
    public final void sessionConfig() {
        LoginBeans LoginB = new LoginBeans();
        lblUsr.setText(LoginB.get$funcionario().toUpperCase());
    }

    /**
     * Componentes principal.
     */
    public final void componentesPrincipal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setLayout(new GridLayout());
        
        menuSair.setMnemonic(27);

        
    }

    
    private void iconTela() {
        Toolkit kit = Toolkit.getDefaultToolkit();  
        Dimension tamTela = kit.getScreenSize(); 
        tela = new FundoTela("/Icones/pizza-fundo1.png");
        getContentPane().add(tela,BorderLayout.CENTER);
       
        tela.add(BorderLayout.WEST, pnlInfo);
      
        pnlInfo.setSize(170, tamTela.height);
       
        ImageIcon icone;
        icone = new javax.swing.ImageIcon(getClass().getResource("/Icones/icone.png"));
        setIconImage(icone.getImage());
        
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblUsr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuClientes = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuCreditos = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmPrincipal"); // NOI18N
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        pnlInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        pnlInfo.setName("pnlInfo"); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/operadorDetalhes.png"))); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        lblUsr.setBackground(new java.awt.Color(51, 51, 51));
        lblUsr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsr.setText("<Usuário>");
        lblUsr.setName("lblUsr"); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/dataHoje.png"))); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        lblData.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblData.setText("<Data>");
        lblData.setName("lblData"); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/horaHoje.png"))); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        lblHora.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setText("<Hora>");
        lblHora.setName("lblHora"); // NOI18N

        org.jdesktop.layout.GroupLayout pnlInfoLayout = new org.jdesktop.layout.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlInfoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(lblUsr, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .add(lblData, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblHora, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlInfoLayout.createSequentialGroup()
                .add(48, 48, 48)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblUsr)
                .add(18, 18, 18)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblData)
                .add(18, 18, 18)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblHora)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        getContentPane().add(pnlInfo);
        pnlInfo.setBounds(0, 0, 170, 420);

        menuPrincipal.setName("menuPrincipal"); // NOI18N

        menuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/create-cad1.png"))); // NOI18N
        menuCadastros.setToolTipText("Cadastros");
        menuCadastros.setName("menuCadastros"); // NOI18N

        menuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        menuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/clientes-1.png"))); // NOI18N
        menuClientes.setText("Clientes");
        menuClientes.setName("menuClientes"); // NOI18N
        menuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesActionPerformed(evt);
            }
        });
        menuCadastros.add(menuClientes);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/func-1.png"))); // NOI18N
        jMenuItem2.setText("Funcionários/Usuários");
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem2);

        menuPrincipal.add(menuCadastros);

        menuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/help-1.png"))); // NOI18N
        menuAjuda.setToolTipText("Ajuda");
        menuAjuda.setName("menuAjuda"); // NOI18N

        menuCreditos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        menuCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/java-8.png"))); // NOI18N
        menuCreditos.setText("Créditos");
        menuCreditos.setName("menuCreditos"); // NOI18N
        menuCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCreditosActionPerformed(evt);
            }
        });
        menuAjuda.add(menuCreditos);

        menuPrincipal.add(menuAjuda);

        menuPrincipal.add(Box.createHorizontalGlue());
        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/logout-2.png"))); // NOI18N
        menuSair.setToolTipText("Sair");
        menuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSair.setName("menuSair"); // NOI18N
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuSair);

        setJMenuBar(menuPrincipal);

        getAccessibleContext().setAccessibleName("frmPrincipal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        metodoSair();
    }//GEN-LAST:event_menuSairMouseClicked

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
        // TODO add your handling code here:
        cliente = new ClienteForm();
        
        tela.add(cliente);
    
        cliente.setVisible(true);
        cliente.setLocation(170, 0);
        
    }//GEN-LAST:event_menuClientesActionPerformed

   

    private void menuCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCreditosActionPerformed
        // TODO add your handling code here:
        creditos = new CreditoForm();
        tela.add(creditos);
        creditos.setVisible(true); 
        creditos.setLocation(450,70); 
    }//GEN-LAST:event_menuCreditosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Date dataSistema = new Date();
        SimpleDateFormat fmtData = new SimpleDateFormat("dd/MM/yyyy");
        lblData.setText(fmtData.format(dataSistema));

        Timer timer = new Timer(100, new hora());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // TODO add your handling code here:
        metodoSair();
    }//GEN-LAST:event_menuSairActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        funcionarios = new FuncionarioForm();
        tela.add(funcionarios);
        funcionarios.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblUsr;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuClientes;
    private javax.swing.JMenuItem menuCreditos;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menuSair;
    private javax.swing.JPanel pnlInfo;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo sair.
     */
    public void metodoSair() {
        if (Controlar.fecharForm()) {
            System.exit(0);
        }
    }

    /**
     * The type Hora.
     */
    class hora implements ActionListener {
        /**
         * Action performed.
         *
         * @param ae the ae
         */
        @Override
        public void actionPerformed(ActionEvent ae) {
            Calendar now = Calendar.getInstance();
            lblHora.setText(String.format("%1$tH:%1$tM:%1$tS",now));
        }
    }
}
