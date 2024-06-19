/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pesanhotel;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author ACER
 */
public class SelesaiPesan extends javax.swing.JFrame {

    /**
     * Creates new form SelesaiPesan
     */
    public static String nomorkamar;
    public SelesaiPesan() {
        initComponents();
        
//        switch (Home.no_kamar2){
//            case "101":
//                Home.sdhdipesan101 = true;
//                break;
//            case "102":
//                Home.sdhdipesan102 = true;
//                break;
//            case "103":
//                Home.sdhdipesan103 = true;
//                break;
//            case "201":
//                Home.sdhdipesan201 = true;
//                break;
//            case "202":
//                Home.sdhdipesan202 = true;
//                break;
//            case "203":
//                Home.sdhdipesan203 = true;
//                break;
//            }
        
//        nomorkamar = CheckOut.databaseco.get(Home.namahome);
        Map<String, String> homeDetails = CheckOut.databaseco.get(Home.namahome);
        nomorkamar = homeDetails.get("nokamar");

        switch (nomorkamar){
            case "101":
                jLabel7.setText(CheckOut.nama101);
                jLabel8.setText(CheckOut.notelp101);
                jLabel9.setText(CheckOut.email101);
                jLabel12.setText(CheckOut.tglpesan101);
                jLabel20.setText(CheckOut.tgldipesan101);
                jLabel24.setText(CheckOut.jmlhhari101);
                jLabel10.setText(CheckOut.invoice101);
                jLabel22.setText(CheckOut.totalharga101);
                jLabel16.setText(CheckOut.pajak101);
                jLabel14.setText("Rp."+CheckOut.uang101);
                jLabel18.setText("Rp."+CheckOut.strkembalian101);
                jLabel26.setText(CheckOut.nokamar101);
                break;
            case "102":
                jLabel7.setText(CheckOut.nama102);
                jLabel8.setText(CheckOut.notelp102);
                jLabel9.setText(CheckOut.email102);
                jLabel12.setText(CheckOut.tglpesan102);
                jLabel20.setText(CheckOut.tgldipesan102);
                jLabel24.setText(CheckOut.jmlhhari102);
                jLabel10.setText(CheckOut.invoice102);
                jLabel22.setText(CheckOut.totalharga102);
                jLabel16.setText(CheckOut.pajak102);
                jLabel14.setText("Rp."+CheckOut.uang102);
                jLabel18.setText("Rp."+CheckOut.strkembalian102);
                jLabel26.setText(CheckOut.nokamar102);
                break;
            case "103":
                jLabel7.setText(CheckOut.nama103);
                jLabel8.setText(CheckOut.notelp103);
                jLabel9.setText(CheckOut.email103);
                jLabel12.setText(CheckOut.tglpesan103);
                jLabel20.setText(CheckOut.tgldipesan103);
                jLabel24.setText(CheckOut.jmlhhari103);
                jLabel10.setText(CheckOut.invoice103);
                jLabel22.setText(CheckOut.totalharga103);
                jLabel16.setText(CheckOut.pajak103);
                jLabel14.setText("Rp."+CheckOut.uang103);
                jLabel18.setText("Rp."+CheckOut.strkembalian103);
                jLabel26.setText(CheckOut.nokamar103);
                break;
            case "201":
                jLabel7.setText(CheckOut.nama201);
                jLabel8.setText(CheckOut.notelp201);
                jLabel9.setText(CheckOut.email201);
                jLabel12.setText(CheckOut.tglpesan201);
                jLabel20.setText(CheckOut.tgldipesan201);
                jLabel24.setText(CheckOut.jmlhhari201);
                jLabel10.setText(CheckOut.invoice201);
                jLabel22.setText(CheckOut.totalharga201);
                jLabel16.setText(CheckOut.pajak201);
                jLabel14.setText("Rp."+CheckOut.uang201);
                jLabel18.setText("Rp."+CheckOut.strkembalian201);
                jLabel26.setText(CheckOut.nokamar201);
                break;
            case "202":
                jLabel7.setText(CheckOut.nama202);
                jLabel8.setText(CheckOut.notelp202);
                jLabel9.setText(CheckOut.email202);
                jLabel12.setText(CheckOut.tglpesan202);
                jLabel20.setText(CheckOut.tgldipesan202);
                jLabel24.setText(CheckOut.jmlhhari202);
                jLabel10.setText(CheckOut.invoice202);
                jLabel22.setText(CheckOut.totalharga202);
                jLabel16.setText(CheckOut.pajak202);
                jLabel14.setText("Rp."+CheckOut.uang202);
                jLabel18.setText("Rp."+CheckOut.strkembalian201);
                jLabel26.setText(CheckOut.nokamar202);
                break;
            case "203":
                jLabel7.setText(CheckOut.nama203);
                jLabel8.setText(CheckOut.notelp203);
                jLabel9.setText(CheckOut.email203);
                jLabel12.setText(CheckOut.tglpesan203);
                jLabel20.setText(CheckOut.tgldipesan203);
                jLabel24.setText(CheckOut.jmlhhari203);
                jLabel10.setText(CheckOut.invoice203);
                jLabel22.setText(CheckOut.totalharga203);
                jLabel16.setText(CheckOut.pajak203);
                jLabel14.setText("Rp."+CheckOut.uang203);
                jLabel18.setText("Rp."+CheckOut.strkembalian203);
                jLabel26.setText(CheckOut.nokamar203);
                break;
            }
        
//        jLabel7.setText(Home.namahome);
//        jLabel8.setText(Home.nohp);
//        jLabel9.setText(Home.email);
//        jLabel12.setText(Home.tglpsn + " / " + Home.blnpsn + " / " + Home.thnpsn);
//        jLabel20.setText(Home.tgldpsn + " / " + Home.blndpsn + " / " + Home.thndpsn);
//        jLabel24.setText(Home.psnhari);
//        jLabel10.setText(CheckOut.formatinvoice);
//        jLabel22.setText("Rp."+Home.strtothargaril+" Sdh trmsk pjk");
//        jLabel16.setText("Rp."+Home.strpajak);
//        jLabel14.setText("Rp."+CheckOut.uang);
//        jLabel18.setText("Rp."+(CheckOut.intuang - Home.tothargaril));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Riwayat Pemesanan");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 201, 74));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Terima Kasih");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 6, 266, 43));

        jPanel1.setBackground(new java.awt.Color(0, 103, 105));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 241, 74));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Telah memesan");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 40, 208, 32);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Beige Gold Luxury Home Key Real Estate Logo_20240611_125717_0003.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-40, -55, 230, 110);

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Beige Gold Luxury Home Key Real Estate Logo_20240611_125717_0003.png"))); // NOI18N
        jLabel70.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel70.setMinimumSize(new java.awt.Dimension(291, 300));
        jPanel1.add(jLabel70);
        jLabel70.setBounds(420, -20, 300, 200);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 80));

        jPanel2.setBackground(new java.awt.Color(255, 201, 74));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 103, 105));
        jPanel3.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 103, 105), 2));
        jPanel4.setLayout(null);

        jLabel4.setText("No Hp :");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(20, 7, 67, 16);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 80, 30);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("jLabel8");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(90, 7, 130, 16);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(50, 100, 230, 30);

        jPanel5.setBackground(new java.awt.Color(0, 103, 105));
        jPanel5.setLayout(null);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 103, 105), 2));
        jPanel6.setLayout(null);

        jLabel5.setText("Email :");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(20, 7, 67, 16);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(0, 0, 80, 30);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("jLabel9");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(90, 7, 139, 16);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(50, 150, 230, 30);

        jPanel7.setBackground(new java.awt.Color(0, 103, 105));
        jPanel7.setLayout(null);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 103, 105), 2));
        jPanel8.setLayout(null);

        jLabel17.setText("Kembalian :");
        jPanel8.add(jLabel17);
        jLabel17.setBounds(10, 7, 70, 16);

        jPanel7.add(jPanel8);
        jPanel8.setBounds(0, 0, 80, 30);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("jLabel18");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(90, 7, 130, 16);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(340, 310, 230, 30);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 103, 105)));
        jPanel9.setLayout(null);

        jLabel6.setText("Invoice :");
        jPanel9.add(jLabel6);
        jLabel6.setBounds(20, 15, 67, 16);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("jLabel10");
        jPanel9.add(jLabel10);
        jLabel10.setBounds(70, 15, 130, 16);

        jPanel2.add(jPanel9);
        jPanel9.setBounds(410, -10, 210, 40);

        jPanel10.setBackground(new java.awt.Color(0, 103, 105));
        jPanel10.setLayout(null);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("jLabel7");
        jPanel10.add(jLabel7);
        jLabel7.setBounds(90, 7, 130, 16);

        jLabel32.setText("Nama :");
        jPanel10.add(jLabel32);
        jLabel32.setBounds(20, 7, 50, 16);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 103, 105), 2));
        jPanel11.setLayout(null);
        jPanel10.add(jPanel11);
        jPanel11.setBounds(0, 0, 80, 30);

        jPanel2.add(jPanel10);
        jPanel10.setBounds(50, 50, 230, 30);

        jPanel12.setBackground(new java.awt.Color(0, 103, 105));
        jPanel12.setLayout(null);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 103, 105), 2));
        jPanel13.setLayout(null);

        jLabel27.setText("Tgl pesan :");
        jPanel13.add(jLabel27);
        jLabel27.setBounds(10, 7, 67, 16);

        jPanel12.add(jPanel13);
        jPanel13.setBounds(0, 0, 80, 30);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("jlabel12");
        jPanel12.add(jLabel12);
        jLabel12.setBounds(90, 7, 130, 16);

        jPanel2.add(jPanel12);
        jPanel12.setBounds(340, 50, 230, 30);

        jPanel14.setBackground(new java.awt.Color(0, 103, 105));
        jPanel14.setLayout(null);

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 103, 105), 2));
        jPanel15.setLayout(null);

        jLabel33.setText("No kamar :");
        jPanel15.add(jLabel33);
        jLabel33.setBounds(10, 7, 64, 16);

        jPanel14.add(jPanel15);
        jPanel15.setBounds(0, 0, 80, 30);

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("jLabel26");
        jPanel14.add(jLabel26);
        jLabel26.setBounds(90, 7, 130, 16);

        jPanel2.add(jPanel14);
        jPanel14.setBounds(340, 100, 230, 30);

        jPanel16.setBackground(new java.awt.Color(0, 103, 105));
        jPanel16.setLayout(null);

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 103, 105), 2));
        jPanel17.setLayout(null);

        jLabel35.setText("Jmlh hari :");
        jPanel17.add(jLabel35);
        jLabel35.setBounds(10, 7, 64, 16);

        jPanel16.add(jPanel17);
        jPanel17.setBounds(0, 0, 80, 30);

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("jLabel24");
        jPanel16.add(jLabel24);
        jLabel24.setBounds(90, 7, 130, 20);

        jPanel2.add(jPanel16);
        jPanel16.setBounds(340, 150, 230, 30);

        jPanel18.setBackground(new java.awt.Color(0, 103, 105));
        jPanel18.setLayout(null);

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 103, 105), 2));
        jPanel19.setLayout(null);

        jLabel37.setText("Pajak :");
        jPanel19.add(jLabel37);
        jLabel37.setBounds(10, 7, 64, 16);

        jPanel18.add(jPanel19);
        jPanel19.setBounds(0, 0, 80, 30);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("jLabel16");
        jPanel18.add(jLabel16);
        jLabel16.setBounds(90, 7, 130, 16);

        jPanel2.add(jPanel18);
        jPanel18.setBounds(340, 190, 230, 30);

        jPanel20.setBackground(new java.awt.Color(0, 103, 105));
        jPanel20.setLayout(null);

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 103, 105), 2));
        jPanel21.setLayout(null);

        jLabel39.setText("Total  :");
        jPanel21.add(jLabel39);
        jLabel39.setBounds(10, 7, 60, 16);

        jPanel20.add(jPanel21);
        jPanel21.setBounds(0, 0, 80, 30);

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("jLabel22");
        jPanel20.add(jLabel22);
        jLabel22.setBounds(90, 7, 130, 16);

        jPanel2.add(jPanel20);
        jPanel20.setBounds(340, 230, 230, 30);

        jButton1.setBackground(new java.awt.Color(0, 103, 105));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kembali ke Home");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(60, 320, 160, 23);

        jPanel22.setBackground(new java.awt.Color(0, 103, 105));
        jPanel22.setLayout(null);

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 103, 105), 2));
        jPanel23.setLayout(null);

        jLabel41.setText("Uang :");
        jPanel23.add(jLabel41);
        jLabel41.setBounds(10, 7, 66, 16);

        jPanel22.add(jPanel23);
        jPanel23.setBounds(0, 0, 80, 30);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("jLabel14");
        jPanel22.add(jLabel14);
        jLabel14.setBounds(90, 7, 130, 16);

        jPanel2.add(jPanel22);
        jPanel22.setBounds(340, 270, 230, 30);

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 103, 105)));
        jPanel24.setLayout(null);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("jLabel20");
        jPanel24.add(jLabel20);
        jLabel20.setBounds(110, 15, 100, 16);

        jLabel28.setText("Tanggal dipesan :");
        jPanel24.add(jLabel28);
        jLabel28.setBounds(10, 15, 100, 16);

        jPanel2.add(jPanel24);
        jPanel24.setBounds(50, -10, 220, 40);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 620, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Home hm = new Home();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        hm.setDefaultCloseOperation(Home.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SelesaiPesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelesaiPesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelesaiPesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelesaiPesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelesaiPesan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
