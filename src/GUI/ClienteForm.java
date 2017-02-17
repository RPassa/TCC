package GUI;

import Beans.ClienteBeans;
import Controller.ClienteController;
import Controller.Controlar;
import DAO.BairroDAO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The type Clientes form.
 */
public class ClienteForm extends javax.swing.JInternalFrame{

    
    MaskFormatter FormatoTel;
    
    MaskFormatter FormatoDoc;

    SimpleDateFormat FormatoData;

    Date DataAtual;

    ClienteBeans ClienteB;

    ClienteController ClienteC;

    
    DefaultTableModel Modelo;

    /**
     * The Cidades.
     */
    List<String> Cidades;
    /**
     * The Id cidade.
     */
    List<Integer> IdCidade;

    /**
     * The Bairros.
     */
    List<String> Bairros;
    /**
     * The Id bairro.
     */
    List<Integer> IdBairro;

    /**
     * The Ordem.
     */
    List<Integer> Ordem;

    /**
     * The Bairro b.
     */
    BairroDAO BairroB = new BairroDAO();

    /**
     * Instantiates a new Clientes form.
     */
    public ClienteForm() {
        initComponents();
        HabilitarCampos(false);
        setBackground(Color.LIGHT_GRAY);
        
        frameEnderecos.setVisible(false);
        
        btnNovo.requestFocus();

        ClienteB = new ClienteBeans();
        ClienteC = new ClienteController();

        Modelo = (DefaultTableModel) tblCliente.getModel();
        
        Ordem = new ArrayList<>();

        ClienteC.controlePesquisa(Modelo);
        
        btnNCli.setVisible(false);
        
        Cidades = new ArrayList<>();
        IdCidade = new ArrayList<>();
        Bairros = new ArrayList<>();
        IdBairro = new ArrayList<>();
      
    }

    
    public void setPosicao() {
        
    Dimension d = this.getPreferredSize().getSize();
    this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
}
    
    final void popularClienteBeans() {

        ClienteB.setCodigo(Integer.parseInt(edtID.getText()));
        ClienteB.setNome(edtNome.getText());
        ClienteB.setBairro(IdBairro.get(cbbBairro.getSelectedIndex()));
        ClienteB.setEndereco(edtEndereco.getText());
        ClienteB.setDataCad(edtData.getText());
//        ClienteB.setTelefone(edtTelefone.getText());
        ClienteB.setCelular(edtCelular.getText());
        ClienteB.setEmail(edtEmail.getText());
        ClienteB.setAtivo(chbAtivo.isSelected());
        ClienteB.setCpf(edtCPF.getText());
        ClienteB.setRg(edtRG.getText());
        

    }

    /**
     * Habilitar campos.
     *
     * @param valor the valor
     */
    final void HabilitarCampos(boolean valor) {

        cbbBairro.setEnabled(valor);
        cbbCidade.setEnabled(valor);
        edtData.setEnabled(valor);
        btnEndereco.setEnabled(valor);
        edtEndereco.setEnabled(valor);
//        edtTelefone.setEnabled(valor);
        edtNome.setEnabled(valor);
        edtID.setEnabled(valor);
        edtCelular.setEnabled(valor);
        edtEmail.setEnabled(valor);
        chbAtivo.setEnabled(valor);
        chbAtivo.setSelected(valor);
        edtCPF.setEnabled(valor);
        edtRG.setEnabled(valor);
    }

    /**
     *
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        pnlPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edtData = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnBusscar = new javax.swing.JButton();
        btnMTudo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnNCli = new javax.swing.JButton();
        lblCel = new javax.swing.JLabel();
        try {
            FormatoTel = new MaskFormatter("##/##/####");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        edtCelular = new JFormattedTextField(FormatoTel)
        ;
        lblEmail = new javax.swing.JLabel();
        edtEmail = new javax.swing.JTextField();
        chbAtivo = new javax.swing.JCheckBox();
        try {
            FormatoDoc = new MaskFormatter("##.###.###-A");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        edtRG = new JFormattedTextField(FormatoDoc)
        ;
        lblCel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        try {         
            FormatoDoc = new MaskFormatter("###.###.###-##");                
        } catch (Exception e) {           
            JOptionPane.showMessageDialog(null, e.getMessage());         }
        edtCPF = new JFormattedTextField(FormatoDoc) ;
        btnEndereco = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        edtSobrenome = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        edtReferencia = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        frameEnderecos = new javax.swing.JInternalFrame();
        btnSair1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        btnSalvar1 = new javax.swing.JButton();
        btnNovo1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        edtID1 = new javax.swing.JTextField();
        edtNome1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edtEndereco = new javax.swing.JTextField();
        cbbCidade = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        edtData1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbbBairro = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setForeground(java.awt.Color.lightGray);
        setTitle("Cadastro de Clientes");
        setAutoscrolls(true);
        setNextFocusableComponent(this);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("false"), this, org.jdesktop.beansbinding.BeanProperty.create("closable"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("false"), this, org.jdesktop.beansbinding.BeanProperty.create("maximizable"));
        bindingGroup.addBinding(binding);

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(null);

        pnlPrincipal.setLayout(null);

        jLabel1.setText("Código");
        pnlPrincipal.add(jLabel1);
        jLabel1.setBounds(21, 20, 40, 16);

        edtID.setEditable(false);
        edtID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        edtID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtIDFocusGained(evt);
            }
        });
        edtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtIDKeyPressed(evt);
            }
        });
        pnlPrincipal.add(edtID);
        edtID.setBounds(87, 14, 89, 28);

        jLabel2.setText("Nome");
        pnlPrincipal.add(jLabel2);
        jLabel2.setBounds(21, 62, 34, 16);

        edtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtNomeFocusGained(evt);
            }
        });
        edtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edtNomeMouseClicked(evt);
            }
        });
        edtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtNomeKeyPressed(evt);
            }
        });
        pnlPrincipal.add(edtNome);
        edtNome.setBounds(87, 56, 145, 28);

        jLabel5.setText("Telefone");
        pnlPrincipal.add(jLabel5);
        jLabel5.setBounds(313, 110, 48, 16);

        jLabel6.setText("Data de Cadastro");
        pnlPrincipal.add(jLabel6);
        jLabel6.setBounds(265, 199, 97, 16);

        edtData.setEditable(false);
        edtData.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtDataFocusGained(evt);
            }
        });
        edtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtDataKeyPressed(evt);
            }
        });
        pnlPrincipal.add(edtData);
        edtData.setBounds(380, 193, 157, 28);
        pnlPrincipal.add(jSeparator1);
        jSeparator1.setBounds(2, 303, 594, 6);
        pnlPrincipal.add(jSeparator2);
        jSeparator2.setBounds(2, 497, 594, 2);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/inserir2.png"))); // NOI18N
        btnNovo.setToolTipText("Novo Cliente");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnNovo);
        btnNovo.setBounds(55, 511, 92, 76);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/salvar.png"))); // NOI18N
        btnSalvar.setToolTipText("Cadastrar/Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setDisabledIcon(null);
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnSalvar);
        btnSalvar.setBounds(159, 511, 92, 76);

        btnBusscar.setBackground(new java.awt.Color(183, 28, 28));
        btnBusscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBusscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/filtro2.png"))); // NOI18N
        btnBusscar.setText("Filtrar Clientes");
        btnBusscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusscarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnBusscar);
        btnBusscar.setBounds(85, 315, 144, 36);

        btnMTudo.setBackground(new java.awt.Color(224, 224, 224));
        btnMTudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/semfiltro1.png"))); // NOI18N
        btnMTudo.setText("Remover Filtro");
        btnMTudo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMTudoActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnMTudo);
        btnMTudo.setBounds(291, 315, 136, 36);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cancel-1.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setDisabledIcon(null);
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCancelar);
        btnCancelar.setBounds(263, 511, 92, 76);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sair-1.png"))); // NOI18N
        btnSair.setToolTipText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setDisabledIcon(null);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnSair);
        btnSair.setBounds(435, 511, 87, 76);

        tblCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Endereço", "Bairro", "Telefone", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCliente.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tblCliente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblClienteMousePressed(evt);
            }
        });
        tblCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblClienteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblClienteKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblCliente);

        pnlPrincipal.add(jScrollPane2);
        jScrollPane2.setBounds(2, 357, 594, 128);

        btnNCli.setBackground(new java.awt.Color(176, 190, 197));
        btnNCli.setForeground(new java.awt.Color(51, 51, 51));
        btnNCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/novobtn1.png"))); // NOI18N
        btnNCli.setText("Novo");
        btnNCli.setToolTipText("<html>\nAo clicar no botão novo, você poderá duplicar o cadastro atual\n</html>");
        btnNCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNCliActionPerformed(evt);
            }
        });
        btnNCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnNCliKeyPressed(evt);
            }
        });
        pnlPrincipal.add(btnNCli);
        btnNCli.setBounds(188, 6, 94, 44);

        lblCel.setText("Data Nasc");
        pnlPrincipal.add(lblCel);
        lblCel.setBounds(15, 199, 60, 16);

        edtCelular.setToolTipText("Cadastre a data de nascimento do cliente DD/MM/AAAA");
        edtCelular.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtCelularFocusGained(evt);
            }
        });
        edtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtCelularKeyPressed(evt);
            }
        });
        pnlPrincipal.add(edtCelular);
        edtCelular.setBounds(87, 193, 145, 28);

        lblEmail.setText("E-mail");
        pnlPrincipal.add(lblEmail);
        lblEmail.setBounds(21, 165, 38, 16);

        edtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtEmailFocusGained(evt);
            }
        });
        edtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtEmailKeyPressed(evt);
            }
        });
        pnlPrincipal.add(edtEmail);
        edtEmail.setBounds(87, 159, 145, 28);

        chbAtivo.setSelected(true);
        chbAtivo.setText("Ativo");
        chbAtivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbAtivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chbAtivoFocusGained(evt);
            }
        });
        chbAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbAtivoActionPerformed(evt);
            }
        });
        chbAtivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chbAtivoKeyPressed(evt);
            }
        });
        pnlPrincipal.add(chbAtivo);
        chbAtivo.setBounds(460, 279, 47, 18);

        edtRG.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtRG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtRGFocusGained(evt);
            }
        });
        edtRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtRGKeyPressed(evt);
            }
        });
        pnlPrincipal.add(edtRG);
        edtRG.setBounds(87, 233, 145, 28);

        lblCel1.setText("RG");
        pnlPrincipal.add(lblCel1);
        lblCel1.setBounds(21, 245, 18, 16);

        jLabel11.setText("Endereço");
        pnlPrincipal.add(jLabel11);
        jLabel11.setBounds(21, 110, 54, 16);

        jLabel7.setText("CPF");
        pnlPrincipal.add(jLabel7);
        jLabel7.setBounds(337, 239, 24, 16);

        edtCPF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtCPFFocusGained(evt);
            }
        });
        edtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtCPFKeyPressed(evt);
            }
        });
        pnlPrincipal.add(edtCPF);
        edtCPF.setBounds(380, 233, 157, 28);

        btnEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/view3.png"))); // NOI18N
        btnEndereco.setText("Ver Endereços");
        btnEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnderecoActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnEndereco);
        btnEndereco.setBounds(87, 96, 145, 45);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/view3.png"))); // NOI18N
        jButton1.setText("Ver Telefones");
        pnlPrincipal.add(jButton1);
        jButton1.setBounds(379, 96, 158, 45);

        jLabel12.setText("Sobrenome");
        pnlPrincipal.add(jLabel12);
        jLabel12.setBounds(296, 62, 65, 16);
        pnlPrincipal.add(edtSobrenome);
        edtSobrenome.setBounds(379, 56, 158, 28);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("GUI/Bundle"); // NOI18N
        jLabel13.setText(bundle.getString("EnderecoForm.jLabel1.text")); // NOI18N
        pnlPrincipal.add(jLabel13);
        jLabel13.setBounds(300, 20, 60, 16);

        edtReferencia.setToolTipText("<html> Referência:<br> Utilize essa seção para criar um alias(Referência) ao endereço que está sendo cadastrado.<br> Lembrando que não é possível duplicar o alias para esse ou qualquer outro registro.<br> Exemplos de como utilizar essa secção: Residência do Fulano, Tio do Ciclano, Comercio/Residência Beltrano. </html>");
        pnlPrincipal.add(edtReferencia);
        edtReferencia.setBounds(379, 14, 158, 28);

        jLabel15.setText("Cad. Por");
        pnlPrincipal.add(jLabel15);
        jLabel15.setBounds(313, 165, 48, 16);
        pnlPrincipal.add(jTextField1);
        jTextField1.setBounds(380, 159, 157, 28);

        getContentPane().add(pnlPrincipal);
        pnlPrincipal.setBounds(0, 0, 605, 641);

        frameEnderecos.setTitle("Cadastros de Endereços");
        frameEnderecos.setVisible(false);

        btnSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/finalizar-1.png"))); // NOI18N
        btnSair1.setToolTipText(bundle.getString("ClientesEnderecoForm.btnSair.toolTipText")); // NOI18N
        btnSair1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });

        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cancel-1.png"))); // NOI18N
        btnCancelar1.setToolTipText(bundle.getString("ClientesEnderecoForm.btnCancelar.toolTipText")); // NOI18N
        btnCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar1.setDisabledIcon(null);
        btnCancelar1.setEnabled(false);
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        btnSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/salvar.png"))); // NOI18N
        btnSalvar1.setToolTipText(bundle.getString("ClientesEnderecoForm.btnSalvar.toolTipText")); // NOI18N
        btnSalvar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar1.setDisabledIcon(null);
        btnSalvar1.setEnabled(false);
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        btnNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cadastro-banco2.png"))); // NOI18N
        btnNovo1.setToolTipText(bundle.getString("ClientesEnderecoForm.btnNovo.toolTipText")); // NOI18N
        btnNovo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Código");

        edtID1.setEditable(false);
        edtID1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        edtID1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtID1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtID1FocusGained(evt);
            }
        });
        edtID1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtID1KeyPressed(evt);
            }
        });

        edtNome1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtNome1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtNome1FocusGained(evt);
            }
        });
        edtNome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edtNome1MouseClicked(evt);
            }
        });
        edtNome1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtNome1KeyPressed(evt);
            }
        });

        jLabel4.setText("Nome");

        jLabel3.setText("Endereço");

        edtEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtEnderecoFocusGained(evt);
            }
        });
        edtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtEnderecoKeyPressed(evt);
            }
        });

        cbbCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbbCidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbCidadeItemStateChanged(evt);
            }
        });
        cbbCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbbCidadeFocusGained(evt);
            }
        });
        cbbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCidadeActionPerformed(evt);
            }
        });
        cbbCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbbCidadeKeyPressed(evt);
            }
        });

        jLabel8.setText("Cidade");

        jLabel14.setText("Data");

        edtData1.setEditable(false);
        edtData1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtData1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtData1FocusGained(evt);
            }
        });
        edtData1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtData1KeyPressed(evt);
            }
        });

        jLabel9.setText("Bairro");

        cbbBairro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbbBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbbBairroFocusGained(evt);
            }
        });
        cbbBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbbBairroKeyPressed(evt);
            }
        });

        jCheckBox1.setSelected(true);
        jCheckBox1.setText(bundle.getString("ClientesEnderecoForm.jCheckBox1.text")); // NOI18N
        jCheckBox1.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(edtID1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(edtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(21, 21, 21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtNome1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(cbbBairro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(edtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10))
                    .addComponent(edtID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4))
                    .addComponent(edtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(cbbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)
                        .addGap(26, 26, 26))))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout frameEnderecosLayout = new javax.swing.GroupLayout(frameEnderecos.getContentPane());
        frameEnderecos.getContentPane().setLayout(frameEnderecosLayout);
        frameEnderecosLayout.setHorizontalGroup(
            frameEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameEnderecosLayout.createSequentialGroup()
                .addGroup(frameEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frameEnderecosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frameEnderecosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnNovo1)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar1)
                        .addGap(12, 12, 12)
                        .addComponent(btnCancelar1)
                        .addGap(87, 87, 87)
                        .addComponent(btnSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frameEnderecosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        frameEnderecosLayout.setVerticalGroup(
            frameEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameEnderecosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo1)
                    .addComponent(btnSalvar1)
                    .addComponent(btnCancelar1)
                    .addComponent(btnSair1))
                .addGap(17, 17, 17))
        );

        getContentPane().add(frameEnderecos);
        frameEnderecos.setBounds(604, 0, 0, 0);

        getAccessibleContext().setAccessibleName("frmClientes");

        bindingGroup.bind();

        setBounds(0, 0, 616, 632);
    }// </editor-fold>//GEN-END:initComponents


    /**
     * Habilitar button.
     *
     * @param valor the valor
     */
    final void HabilitarButton(boolean valor) {

        btnNovo.setEnabled(!valor);
        btnSalvar.setEnabled(valor);
        btnBusscar.setEnabled(!valor);
        btnMTudo.setEnabled(!valor);
        btnCancelar.setEnabled(valor);        
        if(!edtNome.getText().equals("")){
            btnNCli.setVisible(valor);
        } else {
            btnNCli.setVisible(!valor); 
        }
      
    }

    /**
     * Limpar campos.
     */
    final void LimparCampos() {
        
        edtData.setText(null);
        edtEndereco.setText(null);
        edtID.setText(null);
        edtNome.setText("");
//        edtTelefone.setText(null);
        edtCelular.setText(null);
        edtEmail.setText(null);
        chbAtivo.setSelected(true);
        chbAtivo.setText("Ativo");
        edtCPF.setText(null);
        edtRG.setText(null);
        cbbBairro.removeAllItems();
        cbbCidade.removeAllItems();
        
    }

    /**
     * Desabilitar button.
     *
     * @param valor the valor
     */
    final void DesabilitarButton(boolean valor) {

        btnNovo.setEnabled(!valor);
        btnSalvar.setEnabled(valor);
        btnBusscar.setEnabled(!valor);
        btnMTudo.setEnabled(!valor);
        btnCancelar.setEnabled(valor);
        

    }

    private void BusscarRegistros() {
        
        Cidades.clear();
        IdCidade.clear();
        
        BairroB.busscarCidade(Cidades, IdCidade,Ordem);
        Cidades.forEach((i) -> {
            cbbCidade.addItem(i);
        });
        
        cbbCidade.setSelectedIndex(Ordem.indexOf(1));
        
    }
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        HabilitarCampos(true);
        LimparCampos();
        edtNome.requestFocus();

        HabilitarButton(true);

        
        
        FormatoData = new SimpleDateFormat("dd/MM/yyyy");
        DataAtual = new Date();
        edtData.setText(FormatoData.format(DataAtual));
        Modelo.setNumRows(0);

        edtID.setText(ClienteC.controleID());

        BusscarRegistros();

    }//GEN-LAST:event_btnNovoActionPerformed

    /**
     * Salvar cliente.
     */
    public void salvarCliente() {
        popularClienteBeans();
      

        if (ClienteC.verificarDados(ClienteB, IdBairro.size())) {
            HabilitarCampos(false);
            DesabilitarButton(false);
            LimparCampos();
            ClienteC.controlePesquisa(Modelo);
        }
    }
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        salvarCliente();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnBusscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusscarActionPerformed

        ClienteC.controleBussca(Modelo);

    }//GEN-LAST:event_btnBusscarActionPerformed

    private void btnMTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMTudoActionPerformed

        ClienteC.controlePesquisa(Modelo);
    }//GEN-LAST:event_btnMTudoActionPerformed

    /**
     * Cancelar operacao.
     */
    public void cancelarOperacao() {
      
        Object[] options = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(null, "Deseja Cancelar a inclusão?", "Abortar Operação", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);

        if (resp == 0) {
            HabilitarCampos(false);
            DesabilitarButton(false);
            ClienteC.controlePesquisa(Modelo);
            LimparCampos();
            btnNCli.setVisible(false);
            chbAtivo.setText("Ativo");
        } else {
            edtNome.requestFocus();
        }
    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        cancelarOperacao();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        sairForm();
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * Acao tbl.
     */
    public void acaoTbl() {
        ClienteB = ClienteC.controlePreencherCampos(Integer.parseInt(Modelo.getValueAt(tblCliente.getSelectedRow(), 0).toString()),Bairros,Cidades);
        HabilitarCampos(true);
        LimparCampos();
        

        edtID.setText(Integer.toString(ClienteB.getCodigo()));
        edtNome.setText(ClienteB.getNome());
        edtEndereco.setText(ClienteB.getEndereco());                
        BusscarRegistros();
        BusscarBairro();

        
        cbbCidade.setSelectedItem(ClienteB.getBairro());
        cbbCidade.setSelectedItem(ClienteB.getBairro());
         
//        edtTelefone.setText(ClienteB.getTelefone());
        edtData.setText(ClienteB.getDataCad());
        edtEmail.setText(ClienteB.getEmail());
        edtCelular.setText(ClienteB.getCelular());
        chbAtivo.setSelected(ClienteB.getAtivo());
        if (chbAtivo.isSelected()) {
            chbAtivo.setText("Ativo");
        } else {
            chbAtivo.setText("Inativo");
        }
        edtRG.setText(ClienteB.getRg());
        edtCPF.setText(ClienteB.getCpf());
        HabilitarButton(true);
    }

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked


    }//GEN-LAST:event_tblClienteMouseClicked

   
    
    private void tblClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClienteKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            HabilitarCampos(false);
            LimparCampos();
            ClienteC.controlePesquisa(Modelo);
            DesabilitarButton(false);
            btnNCli.setVisible(false);
         
        }

    }//GEN-LAST:event_tblClienteKeyPressed

    private void tblClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClienteKeyReleased

        acaoTbl();
    }//GEN-LAST:event_tblClienteKeyReleased

    private void tblClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMousePressed

        acaoTbl();
    }//GEN-LAST:event_tblClienteMousePressed

    private void edtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtNomeKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            cancelarOperacao();
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            edtEndereco.requestFocus();
        }
    }//GEN-LAST:event_edtNomeKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

            sairForm();

        }
    }//GEN-LAST:event_formKeyPressed

    /**
     * Sair form.
     */
    public void sairForm(){
        if (Controlar.fecharForm()) {
            dispose();
        }
    }
    
    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

            sairForm();

        }
    }//GEN-LAST:event_formKeyReleased

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

            sairForm();

        }
    }//GEN-LAST:event_formKeyTyped

    private void btnNCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNCliActionPerformed
        
        Object[] options = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(null, "É um novo cliente?", "Mudar Cliente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);

        if (resp == 0) {
            edtID.setText(ClienteC.controleID());
            btnNCli.setVisible(false);
            btnNovo.setEnabled(false);
        }
        
       
    }//GEN-LAST:event_btnNCliActionPerformed

    private void edtNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edtNomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNomeMouseClicked

    /**
     * Zerar tabela.
     */
    public void zerarTabela(){
        Modelo.setNumRows(0);
        DesabilitarButton(true);
        
    }
    private void edtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtNomeFocusGained
       
        zerarTabela();
    }//GEN-LAST:event_edtNomeFocusGained

    private void edtIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtIDFocusGained
       
    }//GEN-LAST:event_edtIDFocusGained

    private void edtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

            cancelarOperacao();

        }
    }//GEN-LAST:event_edtIDKeyPressed

    private void edtDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtDataKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

            cancelarOperacao();
        }
    }//GEN-LAST:event_edtDataKeyPressed

    private void edtCelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtCelularFocusGained
       
        zerarTabela();
    }//GEN-LAST:event_edtCelularFocusGained

    private void edtCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCelularKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

            cancelarOperacao();
        }
    }//GEN-LAST:event_edtCelularKeyPressed

    private void chbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbAtivoActionPerformed
        
        if (chbAtivo.isSelected()) {
            chbAtivo.setText("Ativo");
        } else {
            chbAtivo.setText("Inativo");
        }
        
    }//GEN-LAST:event_chbAtivoActionPerformed

    private void edtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtEmailFocusGained
        zerarTabela();
    }//GEN-LAST:event_edtEmailFocusGained

    private void edtDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtDataFocusGained
        zerarTabela();
    }//GEN-LAST:event_edtDataFocusGained

    private void chbAtivoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chbAtivoFocusGained
        zerarTabela();
    }//GEN-LAST:event_chbAtivoFocusGained

    private void chbAtivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chbAtivoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

            cancelarOperacao();
        }
    }//GEN-LAST:event_chbAtivoKeyPressed

    private void edtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtEmailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

            cancelarOperacao();
        }
    }//GEN-LAST:event_edtEmailKeyPressed

    private void btnNCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNCliKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

            cancelarOperacao();
        }
    }//GEN-LAST:event_btnNCliKeyPressed

    private void edtRGFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtRGFocusGained
        // TODO add your handling code here:
        zerarTabela();
    }//GEN-LAST:event_edtRGFocusGained

    private void edtRGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtRGKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

            cancelarOperacao();
        }
    }//GEN-LAST:event_edtRGKeyPressed

    private void edtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCPFKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

            cancelarOperacao();
        }
    }//GEN-LAST:event_edtCPFKeyPressed

    private void edtCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtCPFFocusGained
        // TODO add your handling code here:
        zerarTabela();
    }//GEN-LAST:event_edtCPFFocusGained

    /**
     * Busscar bairro.
     */
    public void BusscarBairro(){
        if(edtNome.isEnabled()){
        
            Bairros.clear();
            IdBairro.clear();
            cbbBairro.removeAllItems();

            BairroB.busscarBairro(IdCidade.get(cbbCidade.getSelectedIndex()), Bairros, IdBairro);
            Bairros.forEach((i) -> {
                cbbBairro.addItem(i);
            });

        }
    }
    void inserirEnderecos(){
        edtNome1.setText(edtNome.getText());
    }
    
    private void btnEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnderecoActionPerformed
        // TODO add your handling code here:
        if (!edtNome.getText().equals("")) {
            pnlPrincipal.setVisible(false);
       
           EnderecoForm ends = new EnderecoForm();
           ends.setVisible(true);
           getContentPane().add(ends);
           
           inserirEnderecos();
        } else {
            JOptionPane.showMessageDialog(null, "Antes de continuar, você deve inserir o nome do cliente");
            edtNome.requestFocus();
        }
       
        
    }//GEN-LAST:event_btnEnderecoActionPerformed

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo1ActionPerformed

    }//GEN-LAST:event_btnNovo1ActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed

        //salvarCliente();
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed

        //cancelarOperacao();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed

        //sairForm();
        pnlPrincipal.setVisible(true);
        frameEnderecos.setVisible(false);
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void edtID1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtID1FocusGained

    }//GEN-LAST:event_edtID1FocusGained

    private void edtID1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtID1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

            //cancelarOperacao();

        }
    }//GEN-LAST:event_edtID1KeyPressed

    private void edtNome1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtNome1FocusGained

        //zerarTabela();
    }//GEN-LAST:event_edtNome1FocusGained

    private void edtNome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edtNome1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNome1MouseClicked

    private void edtNome1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtNome1KeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            //cancelarOperacao();
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            edtEndereco.requestFocus();
        }
    }//GEN-LAST:event_edtNome1KeyPressed

    private void edtEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtEnderecoFocusGained

        zerarTabela();
    }//GEN-LAST:event_edtEnderecoFocusGained

    private void edtEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtEnderecoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            cancelarOperacao();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbbCidade.requestFocus();
        }
    }//GEN-LAST:event_edtEnderecoKeyPressed
    
    private void cbbCidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbCidadeItemStateChanged
        // TODO add your handling code here:

        BusscarBairro();
    }//GEN-LAST:event_cbbCidadeItemStateChanged

    private void cbbCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbbCidadeFocusGained
        // TODO add your handling code here:
        zerarTabela();
    }//GEN-LAST:event_cbbCidadeFocusGained

    private void cbbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbCidadeActionPerformed

    private void cbbCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbbCidadeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            cancelarOperacao();
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbbBairro.requestFocus();
        }
    }//GEN-LAST:event_cbbCidadeKeyPressed

    private void edtData1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtData1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_edtData1FocusGained

    private void edtData1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtData1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtData1KeyPressed

    private void cbbBairroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbbBairroFocusGained
        // TODO add your handling code here:
        zerarTabela();
    }//GEN-LAST:event_cbbBairroFocusGained

    private void cbbBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbbBairroKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            cancelarOperacao();
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            edtTelefone.requestFocus();
        }
    }//GEN-LAST:event_cbbBairroKeyPressed

    public void vsbPnl(boolean b){
        pnlPrincipal.setEnabled(b);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEndereco;
    private javax.swing.JButton btnMTudo;
    private javax.swing.JButton btnNCli;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnNovo1;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JComboBox<String> cbbBairro;
    private javax.swing.JComboBox<String> cbbCidade;
    private javax.swing.JCheckBox chbAtivo;
    private javax.swing.JTextField edtCPF;
    private javax.swing.JTextField edtCelular;
    private javax.swing.JTextField edtData;
    private javax.swing.JTextField edtData1;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtEndereco;
    private javax.swing.JTextField edtID;
    private javax.swing.JTextField edtID1;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtNome1;
    private javax.swing.JTextField edtRG;
    private javax.swing.JTextField edtReferencia;
    private javax.swing.JTextField edtSobrenome;
    private javax.swing.JInternalFrame frameEnderecos;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTable tblCliente;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
