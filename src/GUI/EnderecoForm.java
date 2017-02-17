
package GUI;

import java.awt.event.KeyEvent;


public class EnderecoForm extends javax.swing.JInternalFrame {

    
    public EnderecoForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel1 = new javax.swing.JLabel();
        edtRef = new javax.swing.JTextField();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("GUI/Bundle"); // NOI18N
        setTitle(bundle.getString("EnderecoForm.title")); // NOI18N
        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(598, 595));

        btnSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/finalizar-1.png"))); // NOI18N
        btnSair1.setToolTipText(bundle.getString("EnderecoForm.btnSair1.toolTipText")); // NOI18N
        btnSair1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair1.setName("btnSair1"); // NOI18N
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });

        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cancel-1.png"))); // NOI18N
        btnCancelar1.setToolTipText(bundle.getString("EnderecoForm.btnCancelar1.toolTipText")); // NOI18N
        btnCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar1.setDisabledIcon(null);
        btnCancelar1.setEnabled(false);
        btnCancelar1.setName("btnCancelar1"); // NOI18N
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        btnSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/salvar.png"))); // NOI18N
        btnSalvar1.setToolTipText(bundle.getString("EnderecoForm.btnSalvar1.toolTipText")); // NOI18N
        btnSalvar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar1.setDisabledIcon(null);
        btnSalvar1.setEnabled(false);
        btnSalvar1.setName("btnSalvar1"); // NOI18N
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        btnNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cadastro-banco2.png"))); // NOI18N
        btnNovo1.setToolTipText(bundle.getString("EnderecoForm.btnNovo1.toolTipText")); // NOI18N
        btnNovo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo1.setName("btnNovo1"); // NOI18N
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });

        jSeparator3.setName("jSeparator3"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel10.setText(bundle.getString("EnderecoForm.jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        edtID1.setEditable(false);
        edtID1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        edtID1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtID1.setName("edtID1"); // NOI18N
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
        edtNome1.setName("edtNome1"); // NOI18N
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

        jLabel4.setText(bundle.getString("EnderecoForm.jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel3.setText(bundle.getString("EnderecoForm.jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        edtEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtEndereco.setName("edtEndereco"); // NOI18N
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
        cbbCidade.setName("cbbCidade"); // NOI18N
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

        jLabel8.setText(bundle.getString("EnderecoForm.jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel14.setText(bundle.getString("EnderecoForm.jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N

        edtData1.setEditable(false);
        edtData1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtData1.setName("edtData1"); // NOI18N
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

        jLabel9.setText(bundle.getString("EnderecoForm.jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        cbbBairro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbbBairro.setName("cbbBairro"); // NOI18N
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
        jCheckBox1.setText(bundle.getString("EnderecoForm.jCheckBox1.text")); // NOI18N
        jCheckBox1.setEnabled(false);
        jCheckBox1.setName("jCheckBox1"); // NOI18N

        jLabel1.setText(bundle.getString("EnderecoForm.jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        edtRef.setText(bundle.getString("EnderecoForm.edtRef.text")); // NOI18N
        edtRef.setToolTipText("<html>\nReferência:<br>\nUtilize essa seção para criar um alias(Referência) ao endereço que está sendo cadastrado.<br>\nLembrando que não é possível duplicar o alias para esse ou qualquer outro registro.<br>\nExemplos de como utilizar essa secção: Residência do Fulano, Tio do Ciclano, Comercio/Residência Beltrano.\n</html>");
        edtRef.setName("edtRef"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel10)
                .add(18, 18, 18)
                .add(edtID1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(jLabel14)
                        .add(18, 18, 18)
                        .add(edtData1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jCheckBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel4)
                                .add(21, 21, 21))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel8)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel3)
                                .add(12, 12, 12)))
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(cbbCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 163, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jLabel9)
                                .add(18, 18, 18)
                                .add(cbbBairro, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(edtEndereco, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 449, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel1)
                                    .add(edtNome1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 212, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(edtRef)))))
                .add(20, 37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(jLabel10))
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(edtID1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel1)
                        .add(edtRef, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(6, 6, 6)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(8, 8, 8)
                        .add(jLabel4))
                    .add(edtNome1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(edtEndereco, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cbbCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel8)
                    .add(jLabel9)
                    .add(cbbBairro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(edtData1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel14)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(29, 29, 29)
                        .add(jCheckBox1)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(31, 31, 31)
                        .add(btnNovo1)
                        .add(18, 18, 18)
                        .add(btnSalvar1)
                        .add(12, 12, 12)
                        .add(btnCancelar1)
                        .add(87, 87, 87)
                        .add(btnSair1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jSeparator3)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 177, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnNovo1)
                    .add(btnSalvar1)
                    .add(btnCancelar1)
                    .add(btnSair1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed

        //sairForm();
        
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed

        //cancelarOperacao();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed

        //salvarCliente();
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo1ActionPerformed

    }//GEN-LAST:event_btnNovo1ActionPerformed

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

        
    }//GEN-LAST:event_edtEnderecoFocusGained

    private void edtEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtEnderecoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbbCidade.requestFocus();
        }
    }//GEN-LAST:event_edtEnderecoKeyPressed

    private void cbbCidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbCidadeItemStateChanged
        // TODO add your handling code here:

       
    }//GEN-LAST:event_cbbCidadeItemStateChanged

    private void cbbCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbbCidadeFocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbbCidadeFocusGained

    private void cbbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbCidadeActionPerformed

    private void cbbCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbbCidadeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            
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
       
    }//GEN-LAST:event_cbbBairroFocusGained

    private void cbbBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbbBairroKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //            edtTelefone.requestFocus();
        }
    }//GEN-LAST:event_cbbBairroKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnNovo1;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JComboBox<String> cbbBairro;
    private javax.swing.JComboBox<String> cbbCidade;
    private javax.swing.JTextField edtData1;
    private javax.swing.JTextField edtEndereco;
    private javax.swing.JTextField edtID1;
    private javax.swing.JTextField edtNome1;
    private javax.swing.JTextField edtRef;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
