/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author muham
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EmailText = new javax.swing.JTextField();
        LabelEmail = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        PasswordBox = new javax.swing.JPasswordField();
        SeparatorEmail = new javax.swing.JSeparator();
        SeparatorPassword = new javax.swing.JSeparator();
        ButtonLogin = new javax.swing.JButton();
        LabeBelumPunyaAkun = new javax.swing.JLabel();
        ButtonDaftar = new javax.swing.JToggleButton();
        LoginLabel = new javax.swing.JLabel();
        LoginWrongLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        minimizeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(22, 160, 133));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setPreferredSize(new java.awt.Dimension(635, 470));

        EmailText.setBackground(new java.awt.Color(22, 160, 133));
        EmailText.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        EmailText.setForeground(new java.awt.Color(255, 255, 255));
        EmailText.setToolTipText("");
        EmailText.setBorder(null);
        EmailText.setCaretColor(new java.awt.Color(240, 240, 240));
        EmailText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EmailText.setMargin(new java.awt.Insets(0, 0, 0, 0));
        EmailText.setName(""); // NOI18N
        EmailText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailTextFocusGained(evt);
            }
        });
        EmailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextActionPerformed(evt);
            }
        });

        LabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        LabelEmail.setText("Email/Phone Number :");

        LabelPassword.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        LabelPassword.setText("Password :");

        PasswordBox.setBackground(new java.awt.Color(22, 160, 133));
        PasswordBox.setForeground(new java.awt.Color(255, 255, 255));
        PasswordBox.setBorder(null);
        PasswordBox.setCaretColor(new java.awt.Color(255, 255, 255));

        ButtonLogin.setBackground(new java.awt.Color(255, 255, 255));
        ButtonLogin.setText("Login");
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });
        ButtonLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonLoginKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ButtonLoginKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ButtonLoginKeyTyped(evt);
            }
        });

        LabeBelumPunyaAkun.setBackground(new java.awt.Color(22, 160, 133));
        LabeBelumPunyaAkun.setForeground(new java.awt.Color(255, 255, 255));
        LabeBelumPunyaAkun.setText("Belum punya akun?");

        ButtonDaftar.setBackground(new java.awt.Color(22, 160, 133));
        ButtonDaftar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDaftar.setText("Register!");
        ButtonDaftar.setBorder(null);
        ButtonDaftar.setDoubleBuffered(true);
        ButtonDaftar.setFocusPainted(false);
        ButtonDaftar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ButtonDaftar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        ButtonDaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonDaftarMouseClicked(evt);
            }
        });
        ButtonDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDaftarActionPerformed(evt);
            }
        });

        LoginLabel.setBackground(new java.awt.Color(22, 160, 133));
        LoginLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginLabel.setText("Login");

        LoginWrongLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LoginWrongLabel.setForeground(new java.awt.Color(204, 204, 204));
        LoginWrongLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        exitLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        exitLabel.setText("X");
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });

        minimizeLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        minimizeLabel.setForeground(new java.awt.Color(255, 255, 255));
        minimizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeLabel.setText("-");
        minimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SeparatorPassword)
                            .addComponent(LabelPassword)
                            .addComponent(PasswordBox)
                            .addComponent(SeparatorEmail)
                            .addComponent(EmailText)
                            .addComponent(LabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LoginWrongLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                                .addGap(77, 77, 77)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabeBelumPunyaAkun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minimizeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitLabel)
                    .addComponent(minimizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(LabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparatorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(LabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(SeparatorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginWrongLabel)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabeBelumPunyaAkun)
                            .addComponent(ButtonDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(140, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonLogin)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        EmailText.getAccessibleContext().setAccessibleName("");
        EmailText.getAccessibleContext().setAccessibleDescription("email/phonenumber");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextActionPerformed
       
    }//GEN-LAST:event_EmailTextActionPerformed

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        landingPage landing = new landingPage();
        if(EmailText.getText().equals("Admin") && PasswordBox.getText().equals("admin")){
            landing.setVisible(true);
            this.setVisible(false);
        }else{
            LoginWrongLabel.setText("Email or password wrong!!");
        }
        
        
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void minimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseClicked
        this.setState(1);
    }//GEN-LAST:event_minimizeLabelMouseClicked

    private void ButtonLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonLoginKeyPressed
        landingPage landing = new landingPage();
        
        
        if(EmailText.getText().equals("qwert") && PasswordBox.getText().equals("123")){
            landing.setVisible(true);
            this.setVisible(false);
        }else{
            LoginWrongLabel.setText("Email or password wrong!!");
        }
    }//GEN-LAST:event_ButtonLoginKeyPressed

    private void ButtonLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonLoginKeyReleased
    
    }//GEN-LAST:event_ButtonLoginKeyReleased

    private void EmailTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFocusGained

    private void ButtonLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonLoginKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLoginKeyTyped

    private void ButtonDaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDaftarMouseClicked
        RegisterPage daftarAkun = new RegisterPage();
        daftarAkun.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonDaftarMouseClicked

    private void ButtonDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDaftarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDaftarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ButtonDaftar;
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JTextField EmailText;
    private javax.swing.JLabel LabeBelumPunyaAkun;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JLabel LoginWrongLabel;
    private javax.swing.JPasswordField PasswordBox;
    private javax.swing.JSeparator SeparatorEmail;
    private javax.swing.JSeparator SeparatorPassword;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimizeLabel;
    // End of variables declaration//GEN-END:variables
}