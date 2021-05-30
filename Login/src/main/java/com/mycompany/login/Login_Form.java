/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

/**
 *
 * @author user
 */
public class Login_Form extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login_Form() {
        initComponents();
        
        /* CONECT JAVA & MYSQL --> THIS IS NHAT PART :))  */
        
        //set center form
        this.setLocationRelativeTo(null);
        
        //create border for global panel
        Border glo_panel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow);
        jPanel1.setBorder(glo_panel_border);
        
        //create border for label minimize & close
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        label_mini.setBorder(label_border);
        label_close.setBorder(label_border);
        
        //create border for the username and password field
        Border field_border = BorderFactory.createMatteBorder(1, 5, 1, 1, Color.white);
        jTextField_user.setBorder(field_border);
        jPasswordField_pass.setBorder(field_border);
        
        /* --DO NOT LINEAR COLOR LAYOUT-- I DON'T KNOW WHY =)) */
        //Change Color with LINEAR layout
//        class jPanelGradient extends jPanel1{
//            protected void paintComponent(Graphics g)
//            {
//                Graphics2D g2d = (Graphics2D) g;
//                int width = getWidth();
//                int height = getHeight();
//                
//                Color color1 = new Color(240, 52, 52);
//                Color color2 = new Color(27, 163, 156);
//                GradientPaint gp = new GradientPaint(0, 0, color1, 45, height, color2);
//                g2d.setPaint(gp);
//                g2d.fillRect(0, 0, width, height);
//            }
//        }
        
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
        jPanel2 = new javax.swing.JPanel();
        label_user = new javax.swing.JLabel();
        label_pass = new javax.swing.JLabel();
        jTextField_user = new javax.swing.JTextField();
        jPasswordField_pass = new javax.swing.JPasswordField();
        jButton_login = new javax.swing.JButton();
        label_close = new javax.swing.JLabel();
        label_mini = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jPanel2.setBackground(new java.awt.Color(41, 241, 195));

        label_user.setBackground(new java.awt.Color(0, 204, 204));
        label_user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_user.setForeground(new java.awt.Color(0, 102, 102));
        label_user.setText("Username:");
        label_user.setOpaque(true);

        label_pass.setBackground(new java.awt.Color(0, 204, 204));
        label_pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_pass.setForeground(new java.awt.Color(0, 102, 102));
        label_pass.setText("Password:");
        label_pass.setOpaque(true);

        jTextField_user.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jTextField_user.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_user.setText("username");
        jTextField_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_userFocusLost(evt);
            }
        });
        jTextField_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_userActionPerformed(evt);
            }
        });

        jPasswordField_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_pass.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_pass.setText("password");
        jPasswordField_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_passFocusLost(evt);
            }
        });
        jPasswordField_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_passActionPerformed(evt);
            }
        });

        jButton_login.setBackground(new java.awt.Color(0, 102, 102));
        jButton_login.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Login");
        jButton_login.setBorder(new javax.swing.border.MatteBorder(null));
        jButton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_loginMouseExited(evt);
            }
        });
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_user, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_user, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_user, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        label_close.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label_close.setText("  X");
        label_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_closeMouseExited(evt);
            }
        });

        label_mini.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_mini.setText("  -");
        label_mini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_miniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_miniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_miniMouseExited(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 120, 131));
        jLabel3.setText("LOGIN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addComponent(label_mini, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_close, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_mini, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_miniMouseExited

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        label_mini.setBorder(label_border);
        label_mini.setForeground(Color.black);
    }//GEN-LAST:event_label_miniMouseExited

    private void label_miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_miniMouseEntered

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        label_mini.setBorder(label_border);
        label_mini.setForeground(Color.red);
    }//GEN-LAST:event_label_miniMouseEntered

    private void label_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_closeMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        label_close.setBorder(label_border);
        label_close.setForeground(Color.black);
    }//GEN-LAST:event_label_closeMouseExited

    private void label_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_closeMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        label_close.setBorder(label_border);
        label_close.setForeground(Color.red);
    }//GEN-LAST:event_label_closeMouseEntered

    private void jPasswordField_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_passActionPerformed

    private void jTextField_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_userActionPerformed

    private void jTextField_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_userFocusGained
        
        //clear "username" on the textfield
        if(jTextField_user.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_user.setText("");
            jTextField_user.setForeground(Color.black);
        }
        
        //set boder for label_user
        Border label_boder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        label_user.setBorder(label_boder);
    }//GEN-LAST:event_jTextField_userFocusGained

    private void jTextField_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_userFocusLost
        
        //if the text is "username" or empty
        //set the text is "username
        
        if(jTextField_user.getText().trim().equals("")||jTextField_user.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_user.setText("username");
            jTextField_user.setForeground(new Color(153,153,153));
        }
         //remove border from label_user
         label_user.setBorder(null);
    }//GEN-LAST:event_jTextField_userFocusLost

    private void jPasswordField_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_passFocusGained
        
        //clear .... in the passwordfield
        
        //get the password text
        String pass = String.valueOf(jPasswordField_pass.getPassword());
        
        if(pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField_pass.setText("");
            jPasswordField_pass.setForeground(Color.black);
        }
        
        //set boder for label_user
        Border label_boder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        label_pass.setBorder(label_boder);
    }//GEN-LAST:event_jPasswordField_passFocusGained

    private void jPasswordField_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_passFocusLost
        
        //if the text is "password" or empty
        //set the text is "password"
        
        //get the password text
        String pass = String.valueOf(jPasswordField_pass.getPassword());
        
        if(pass.trim().equals("")||pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField_pass.setText("password");
            jPasswordField_pass.setForeground(new Color(153,153,153));
        }
         //remove border from label_user
         label_pass.setBorder(null);
        
    }//GEN-LAST:event_jPasswordField_passFocusLost

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jButton_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginMouseEntered
        
        //set jButton_login background
        jButton_login.setBackground(new Color(0,101,183));
        
    }//GEN-LAST:event_jButton_loginMouseEntered

    private void jButton_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginMouseExited
        
        //set jButton_login background
        jButton_login.setBackground(new Color(0,84,104));
        
    }//GEN-LAST:event_jButton_loginMouseExited

    private void label_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_miniMouseClicked
        
        this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_label_miniMouseClicked

    private void label_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_closeMouseClicked

        System.exit(0);

    }//GEN-LAST:event_label_closeMouseClicked

    private void jButton_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginMouseClicked
        Menu_Form menu = new Menu_Form();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton_loginMouseClicked

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
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JTextField jTextField_user;
    private javax.swing.JLabel label_close;
    private javax.swing.JLabel label_mini;
    private javax.swing.JLabel label_pass;
    private javax.swing.JLabel label_user;
    // End of variables declaration//GEN-END:variables

    private Color Color(int par, int par1, int par2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class jPanel1 {

        public jPanel1() {   
        }
    }
}
