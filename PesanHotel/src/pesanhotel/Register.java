/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pesanhotel;

/**
 *
 * @author ACER
 */

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public static String ceknama;
    public static String cekusername;
    public static String cekpassword;
//    public static String cekemail;
    public static String nama;
    public static String username;
    public static String password;
    public static Map<String, Map<String, String>> database = new HashMap<>();
//    public static  Map<String, String> userDetails = new HashMap<>();
    
    public Register() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NamaReg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        UsernameReg = new javax.swing.JTextField();
        UlPasswordReg = new javax.swing.JPasswordField();
        PasswordReg = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Regis = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrasi Akun");
        setPreferredSize(new java.awt.Dimension(850, 430));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setText("Nama");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 110, 100, 16);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 103, 105));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRASI");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(180, 20, 170, 32);

        NamaReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaRegActionPerformed(evt);
            }
        });
        NamaReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NamaRegKeyPressed(evt);
            }
        });
        jPanel2.add(NamaReg);
        NamaReg.setBounds(140, 100, 330, 30);

        jLabel3.setText("Username");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 150, 100, 16);

        UsernameReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameRegActionPerformed(evt);
            }
        });
        UsernameReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsernameRegKeyPressed(evt);
            }
        });
        jPanel2.add(UsernameReg);
        UsernameReg.setBounds(140, 140, 330, 30);

        UlPasswordReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UlPasswordRegKeyPressed(evt);
            }
        });
        jPanel2.add(UlPasswordReg);
        UlPasswordReg.setBounds(140, 220, 330, 30);

        PasswordReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordRegKeyPressed(evt);
            }
        });
        jPanel2.add(PasswordReg);
        PasswordReg.setBounds(140, 180, 330, 30);

        jLabel4.setText("Password");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 190, 100, 16);

        jLabel5.setText("Ulangi password");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 230, 100, 16);

        jButton1.setText("Keluar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(400, 360, 72, 23);

        Regis.setBackground(new java.awt.Color(0, 103, 105));
        Regis.setForeground(new java.awt.Color(255, 255, 255));
        Regis.setText("Regist");
        Regis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisActionPerformed(evt);
            }
        });
        jPanel2.add(Regis);
        Regis.setBounds(30, 290, 100, 30);

        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 260, 360, 20);

        jLabel7.setText("Sudah Punya akun?");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 330, 116, 16);

        jButton2.setText("Login");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(150, 330, 72, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(344, 0, 500, 401);

        jPanel3.setBackground(new java.awt.Color(0, 103, 105));
        jPanel3.setLayout(null);

        jLabel8.setBackground(new java.awt.Color(0, 103, 105));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Beige Gold Luxury Home Key Real Estate Logo_20240524_185651_0003.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(-80, 0, 440, 410);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(6, 0, 336, 401);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NamaRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaRegActionPerformed

    private void UsernameRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameRegActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int x;
        x = JOptionPane.showConfirmDialog(null,"Yakin anda mau keluar?","konfirmasi",JOptionPane.YES_NO_OPTION);
        if (x==JOptionPane.YES_OPTION){
            dispose();
        }else{
            return;
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisActionPerformed
        // TODO add your handling code here:
        
        if(PasswordReg.getText().equals(UlPasswordReg.getText())){
            Map<String, String> userDetails = new HashMap<>();
            ceknama = NamaReg.getText();
            cekusername = UsernameReg.getText();
            cekpassword = PasswordReg.getText();
            if (ceknama.isEmpty() || cekusername.isEmpty() || cekpassword.isEmpty()) {
                 jLabel6.setText("Semua harus diisi");
            }else if(cekpassword.length()<8){
                jLabel6.setText("Password harus lebih dari 7");
            }else if (userDetails.containsKey(username)) {
                jLabel6.setText("Username sudah dipakai");
            }
            else{
                nama = NamaReg.getText();
                username = UsernameReg.getText();
                password = PasswordReg.getText();
                
//                addUser(database, username, password, nama);
                
                
                userDetails.put("username", username);
                userDetails.put("password", password);
                userDetails.put("nama", nama);
                database.put(username, userDetails);
                
                this.dispose();
                Login lg = new Login();
                lg.setVisible(true);
                lg.pack();
                lg.setLocationRelativeTo(null);
                lg.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);                
            }
        }
        else{
            jLabel6.setText("Password Tidak Sesuai");
        }
    }//GEN-LAST:event_RegisActionPerformed

    private void NamaRegKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NamaRegKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    UsernameReg.requestFocus();
                }
    }//GEN-LAST:event_NamaRegKeyPressed

    private void UsernameRegKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameRegKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            PasswordReg.requestFocus();
        }
    }//GEN-LAST:event_UsernameRegKeyPressed

    private void PasswordRegKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordRegKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            UlPasswordReg.requestFocus();
        }
    }//GEN-LAST:event_PasswordRegKeyPressed

    private void UlPasswordRegKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UlPasswordRegKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Regis.doClick();
        }
    }//GEN-LAST:event_UlPasswordRegKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login lg = new Login();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NamaReg;
    private javax.swing.JPasswordField PasswordReg;
    private javax.swing.JButton Regis;
    private javax.swing.JPasswordField UlPasswordReg;
    private javax.swing.JTextField UsernameReg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
