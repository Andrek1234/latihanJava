/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.barangp8;

import com.mycompany.barangp8.BarangP8;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class FormBarang extends javax.swing.JFrame {
    BarangP8 brg = new BarangP8();
    /**
     * Creates new form FormBarang
     */
    public FormBarang() {
        initComponents();
        cbkode.addItem("PILIH");
        cbkode.addItem("B001");
        cbkode.addItem("B002");
        cbkode.addItem("B003");

        aktif();
        bersih();
    }
    
    void aktif() {
        cbkode.setEnabled(true);
        tjml.setEnabled(true);
        tubyr.setEnabled(true);
    }

    void nonaktif() {
        cbkode.setEnabled(false);
        nb.setEnabled(false);
        thrg.setEnabled(false);
        tjml.setEnabled(false);
        ttot.setEnabled(false);
        tubyr.setEnabled(false);
        tukemb.setEnabled(false);
    }
    
    void bersih() {
        nb.setText("");
        thrg.setText("");
        tjml.setText("");
        ttot.setText("");
        tubyr.setText("");
        tukemb.setText("");
        cbkode.setSelectedItem("PILIH");
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbkode = new javax.swing.JComboBox<>();
        nb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        thrg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tjml = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ttot = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bnew = new javax.swing.JButton();
        bclose = new javax.swing.JButton();
        tubyr = new javax.swing.JTextField();
        tukemb = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROGRAM PENJUALAN");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TorSerbA Van Java");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(120, 10, 200, 30);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("==============================================");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 40, 370, 20);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kode Barang:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 70, 70, 16);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Barang:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 100, 80, 16);

        cbkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkodeActionPerformed(evt);
            }
        });
        jPanel1.add(cbkode);
        cbkode.setBounds(120, 70, 80, 22);
        jPanel1.add(nb);
        nb.setBounds(120, 100, 80, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga Barang:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 70, 80, 16);
        jPanel1.add(thrg);
        thrg.setBounds(310, 70, 85, 22);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jumlah Beli:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 100, 70, 16);

        tjml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tjmlActionPerformed(evt);
            }
        });
        tjml.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tjmlKeyPressed(evt);
            }
        });
        jPanel1.add(tjml);
        tjml.setBounds(310, 100, 85, 22);

        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("Total Bayar:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 140, 70, 16);
        jPanel1.add(ttot);
        ttot.setBounds(310, 140, 85, 22);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("========================");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(210, 170, 200, 16);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Uang Bayar:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 200, 70, 16);

        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setText("Uang Kembali:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 230, 100, 16);

        bnew.setText("Bersih");
        bnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnewActionPerformed(evt);
            }
        });
        jPanel1.add(bnew);
        bnew.setBounds(20, 200, 72, 50);

        bclose.setText("Keluar");
        bclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcloseActionPerformed(evt);
            }
        });
        jPanel1.add(bclose);
        bclose.setBounds(110, 200, 72, 50);

        tubyr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tubyrActionPerformed(evt);
            }
        });
        tubyr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tubyrKeyPressed(evt);
            }
        });
        jPanel1.add(tubyr);
        tubyr.setBounds(310, 200, 85, 22);

        tukemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tukembActionPerformed(evt);
            }
        });
        jPanel1.add(tukemb);
        tukemb.setBounds(310, 230, 85, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    private void cbkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkodeActionPerformed
        // TODO add your handling code here:
        brg.setKd(cbkode.getSelectedItem().toString());
        brg.setSeleksiKd();
        nb.setText(brg.getNm());
        thrg.setText(Double.toString(brg.getHrg()));
        tjml.requestFocus();
    }//GEN-LAST:event_cbkodeActionPerformed

    private void bcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcloseActionPerformed
        // TODO add your handling code here:
    int x;
        x = JOptionPane.showConfirmDialog(null, "Yakin mau keluar?", "Konfirm", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            dispose();
        } else {
            return;
        }
    }//GEN-LAST:event_bcloseActionPerformed

    private void tjmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tjmlActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tjmlActionPerformed

    private void tjmlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tjmlKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){
             brg.setJml(Integer.parseInt(tjml.getText()));
             ttot.setText(Double.toString(brg.getTot()));
             tubyr.grabFocus();
         }
    }//GEN-LAST:event_tjmlKeyPressed

    private void tubyrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tubyrKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
             brg.setUb(Double.parseDouble(tubyr.getText()));
             tukemb.setText(Double.toString(brg.getUk()));
             if (brg.getUb()<brg.getTot()){
                 JOptionPane.showMessageDialog(null, "Pembayaran kurang!!","Warning",JOptionPane.OK_OPTION);
                 tukemb.setText("");
                 tubyr.setText("");
             }else{
                 return;
             }
         }
    }//GEN-LAST:event_tubyrKeyPressed

    private void tukembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tukembActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tukembActionPerformed

    private void bnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnewActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_bnewActionPerformed

    private void tubyrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tubyrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tubyrActionPerformed

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
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bclose;
    private javax.swing.JButton bnew;
    private javax.swing.JComboBox<String> cbkode;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nb;
    private javax.swing.JTextField thrg;
    private javax.swing.JTextField tjml;
    private javax.swing.JTextField ttot;
    private javax.swing.JTextField tubyr;
    private javax.swing.JTextField tukemb;
    // End of variables declaration//GEN-END:variables
}
