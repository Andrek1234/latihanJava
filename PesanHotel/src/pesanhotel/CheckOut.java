/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pesanhotel;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

import static pesanhotel.Home.tothari;

/**
 *
 * @author ACER
 */
public class CheckOut extends javax.swing.JFrame {
    public static String uang;
    public static int intuang;
    public static int invoice;
    public static String formatinvoice;
    public static boolean sudahco;
    
    public static String nama101;
    public static String nama102;
    public static String nama103;
    public static String nama201;
    public static String nama202;
    public static String nama203;
    
    public static String notelp101;
    public static String notelp102;
    public static String notelp103;
    public static String notelp201;
    public static String notelp202;
    public static String notelp203;
    
    public static String email101;
    public static String email102;
    public static String email103;
    public static String email201;
    public static String email202;
    public static String email203;
    
    public static String invoice101;
    public static String invoice102;
    public static String invoice103;
    public static String invoice201;
    public static String invoice202;
    public static String invoice203;
    
    public static String jmlhhari101;
    public static String jmlhhari102;
    public static String jmlhhari103;
    public static String jmlhhari201;
    public static String jmlhhari202;
    public static String jmlhhari203;
    
    public static String tglpesan101;
    public static String tglpesan102;
    public static String tglpesan103;
    public static String tglpesan201;
    public static String tglpesan202;
    public static String tglpesan203;
    
    public static String tgldipesan101;
    public static String tgldipesan102;
    public static String tgldipesan103;
    public static String tgldipesan201;
    public static String tgldipesan202;
    public static String tgldipesan203;
    
    public static String totalharga101;
    public static String totalharga102;
    public static String totalharga103;
    public static String totalharga201;
    public static String totalharga202;
    public static String totalharga203;
    
    public static String pajak101;
    public static String pajak102;
    public static String pajak103;
    public static String pajak201;
    public static String pajak202;
    public static String pajak203;
    
    public static String uang101;
    public static String uang102;
    public static String uang103;
    public static String uang201;
    public static String uang202;
    public static String uang203;
    
    public static int kembalian101;
    public static int kembalian102;
    public static int kembalian103;
    public static int kembalian201;
    public static int kembalian202;
    public static int kembalian203;
    
    public static String strkembalian101;
    public static String strkembalian102;
    public static String strkembalian103;
    public static String strkembalian201;
    public static String strkembalian202;
    public static String strkembalian203;
    
    public static String nokamar101;
    public static String nokamar102;
    public static String nokamar103;
    public static String nokamar201;
    public static String nokamar202;
    public static String nokamar203;
    
    public static String username101;
    public static String username102;
    public static String username103;
    public static String username201;
    public static String username202;
    public static String username203;
    
    public static String hargaperhari101;
    public static String hargaperhari102;
    public static String hargaperhari103;
    public static String hargaperhari201;
    public static String hargaperhari202;
    public static String hargaperhari203;
    
    public static String totharga101;
    public static String totharga102;
    public static String totharga103;
    public static String totharga201;
    public static String totharga202;
    public static String totharga203;
    
    public static Map<String, Map<String, String>> databaseco = new HashMap<>();
    
    /**
     * Creates new form CheckOut
     */
    public CheckOut() {
        initComponents();
        jLabel11.setText(Home.namahome);
        jLabel12.setText(Home.nohp);
        jLabel20.setText(Home.email);
        jLabel13.setText(Home.tglpsn + " / " + Home.blnpsn + " / " + Home.thnpsn);
        jLabel14.setText(Home.tgldpsn + " / " + Home.blndpsn + " / " + Home.thndpsn);
        jLabel15.setText(Home.psnhari);
        jLabel16.setText("Rp."+Home.lharga);
        jLabel18.setText("Rp."+Home.strtothargaril);
        jLabel17.setText("Rp."+Home.strpajak);
        jLabel26.setText("Rp."+Home.strtotharga);
        jLabel28.setText(Home.no_kamar2);
        
       
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
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Check out pesanan");
        setPreferredSize(new java.awt.Dimension(530, 450));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Check  Out");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 18, 123, 43);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(252, 80, 70, 16);

        jPanel3.setBackground(new java.awt.Color(0, 103, 105));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(178, 22, 165, 37);

        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(170, 15, 180, 50);

        jPanel1.setBackground(new java.awt.Color(255, 201, 74));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 103, 105));
        jPanel4.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel13.setText("jLabel13");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 3, 100, 16);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(80, 0, 120, 25);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tgl pesan : ");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 3, 76, 16);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(45, 78, 200, 25);

        jPanel6.setBackground(new java.awt.Color(0, 103, 105));
        jPanel6.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jLabel14.setText("jLabel14");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(10, 3, 100, 16);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(90, 0, 110, 25);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tgl dipesan :");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(7, 3, 76, 16);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(280, 80, 200, 25);

        jPanel8.setBackground(new java.awt.Color(0, 103, 105));
        jPanel8.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        jLabel28.setText("jLabel28");
        jPanel9.add(jLabel28);
        jLabel28.setBounds(10, 3, 100, 16);

        jPanel8.add(jPanel9);
        jPanel9.setBounds(90, 0, 110, 25);

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("No kamar :");
        jPanel8.add(jLabel27);
        jLabel27.setBounds(7, 3, 70, 16);

        jPanel1.add(jPanel8);
        jPanel8.setBounds(280, 110, 200, 25);

        jPanel10.setBackground(new java.awt.Color(0, 103, 105));
        jPanel10.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(null);

        jLabel15.setText("jLabel15");
        jPanel11.add(jLabel15);
        jLabel15.setBounds(10, 3, 100, 16);

        jPanel10.add(jPanel11);
        jPanel11.setBounds(90, 0, 110, 25);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jumlah hari :");
        jPanel10.add(jLabel7);
        jLabel7.setBounds(7, 3, 76, 16);

        jPanel1.add(jPanel10);
        jPanel10.setBounds(280, 140, 200, 25);

        jPanel12.setBackground(new java.awt.Color(0, 103, 105));
        jPanel12.setLayout(null);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(null);

        jLabel11.setText("jLabel11");
        jPanel13.add(jLabel11);
        jLabel11.setBounds(10, 3, 100, 16);

        jPanel12.add(jPanel13);
        jPanel13.setBounds(80, 0, 120, 25);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama : ");
        jPanel12.add(jLabel2);
        jLabel2.setBounds(10, 3, 76, 16);

        jPanel1.add(jPanel12);
        jPanel12.setBounds(45, 109, 200, 25);

        jPanel14.setBackground(new java.awt.Color(0, 103, 105));
        jPanel14.setLayout(null);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(null);

        jLabel20.setText("jLabel20");
        jPanel15.add(jLabel20);
        jLabel20.setBounds(10, 3, 100, 16);

        jPanel14.add(jPanel15);
        jPanel15.setBounds(80, 0, 120, 25);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Email :");
        jPanel14.add(jLabel19);
        jLabel19.setBounds(10, 3, 68, 16);

        jPanel1.add(jPanel14);
        jPanel14.setBounds(45, 140, 200, 25);

        jPanel16.setBackground(new java.awt.Color(0, 103, 105));
        jPanel16.setLayout(null);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(null);

        jLabel12.setText("jLabel12");
        jPanel17.add(jLabel12);
        jLabel12.setBounds(10, 3, 100, 16);

        jPanel16.add(jPanel17);
        jPanel17.setBounds(80, 0, 120, 25);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No tlp : ");
        jPanel16.add(jLabel4);
        jLabel4.setBounds(10, 3, 76, 16);

        jPanel1.add(jPanel16);
        jPanel16.setBounds(45, 171, 200, 25);

        jPanel18.setBackground(new java.awt.Color(0, 103, 105));
        jPanel18.setLayout(null);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(null);

        jLabel16.setText("jLabel16");
        jPanel19.add(jLabel16);
        jLabel16.setBounds(10, 3, 100, 16);

        jPanel18.add(jPanel19);
        jPanel19.setBounds(90, 0, 110, 25);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Harga / hari :");
        jPanel18.add(jLabel8);
        jLabel8.setBounds(6, 3, 76, 16);

        jPanel1.add(jPanel18);
        jPanel18.setBounds(280, 170, 200, 25);

        jPanel20.setBackground(new java.awt.Color(0, 103, 105));
        jPanel20.setLayout(null);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(null);

        jLabel26.setText("jLabel26");
        jPanel21.add(jLabel26);
        jLabel26.setBounds(10, 3, 100, 16);

        jPanel20.add(jPanel21);
        jPanel21.setBounds(90, 0, 110, 25);

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Harga :");
        jPanel20.add(jLabel25);
        jLabel25.setBounds(8, 3, 76, 16);

        jPanel1.add(jPanel20);
        jPanel20.setBounds(280, 200, 200, 25);

        jPanel22.setBackground(new java.awt.Color(0, 103, 105));
        jPanel22.setLayout(null);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(null);

        jLabel17.setText("jLabel17");
        jPanel23.add(jLabel17);
        jLabel17.setBounds(10, 3, 100, 16);

        jPanel22.add(jPanel23);
        jPanel23.setBounds(90, 0, 110, 25);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pajak 10% :");
        jPanel22.add(jLabel9);
        jLabel9.setBounds(7, 3, 68, 16);

        jPanel1.add(jPanel22);
        jPanel22.setBounds(280, 230, 200, 25);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Bayar Sekarang");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 370, 130, 23);

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Batal");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(50, 370, 92, 23);

        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Setelah melakukan pembayaran, tidak dapat melakukan cancel pemesanan");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(30, 340, 432, 16);

        jLabel21.setText("Nominal Pembayaran");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(50, 310, 140, 16);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(243, 300, 231, 31);

        jLabel22.setText("Rp.");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(210, 310, 30, 16);

        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel23);
        jLabel23.setBounds(50, 270, 200, 20);

        jPanel24.setBackground(new java.awt.Color(0, 165, 163));
        jPanel24.setLayout(null);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setLayout(null);

        jLabel18.setText("jLabel18");
        jPanel25.add(jLabel18);
        jLabel18.setBounds(10, 3, 100, 16);

        jPanel24.add(jPanel25);
        jPanel25.setBounds(90, 0, 110, 25);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total harga : ");
        jPanel24.add(jLabel10);
        jLabel10.setBounds(10, 3, 76, 16);

        jPanel1.add(jPanel24);
        jPanel24.setBounds(280, 260, 200, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 530, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText().isEmpty()){
            jLabel23.setText("Mohon masukan nominal uang");
        } else {
        intuang = Integer.parseInt(jTextField1.getText());
        if (intuang >= Home.tothargaril){
            Random random = new Random();
            while (true) {
                invoice = random.nextInt(10000) + 1;
                formatinvoice = String.format("%05d", invoice);
                List<String> invoiceList = new ArrayList<>();
                if (!invoiceList.contains(formatinvoice)) {
                    invoiceList.add(formatinvoice);
                    break;
                }else{
                    continue;
                }
            }
            uang = jTextField1.getText();
            
            sudahco = true;
            switch (Home.no_kamar2){
            case "101":
                Home.sdhdipesan101 = true;
                nama101 = Home.namahome;
                notelp101 = Home.nohp;
                email101 = Home.email;
                invoice101 = formatinvoice;
                jmlhhari101 = Home.psnhari;
                tglpesan101 = Home.tglpsn + " / " + Home.blnpsn + " / " + Home.thnpsn;
                tgldipesan101 = Home.tgldpsn + " / " + Home.blndpsn + " / " + Home.thndpsn;
                totalharga101 = "Rp."+Home.strtothargaril;
                pajak101 = "Rp."+Home.strpajak;
                uang101 = uang;
                kembalian101 = intuang - Home.tothargaril;
                strkembalian101 = Integer.toString(kembalian101);
                nokamar101 = Home.no_kamar2;
                username101 = Login.ambilusername;
                hargaperhari101 = Home.lharga;
                totharga101 = Home.strtotharga;
                break;
            case "102":
                Home.sdhdipesan102 = true;
                nama102 = Home.namahome;
                notelp102 = Home.nohp;
                email102 = Home.email;
                invoice102 = formatinvoice;
                jmlhhari102 = Home.psnhari;
                tglpesan102 = Home.tglpsn + " / " + Home.blnpsn + " / " + Home.thnpsn;
                tgldipesan102 = Home.tgldpsn + " / " + Home.blndpsn + " / " + Home.thndpsn;
                totalharga102 = "Rp."+Home.strtothargaril;
                pajak102 = "Rp."+Home.strpajak;
                uang102 = uang;
                kembalian102 = intuang - Home.tothargaril;
                strkembalian102 = Integer.toString(kembalian102);
                nokamar102 = Home.no_kamar2;
                username102 = Login.ambilusername;
                hargaperhari102 = Home.lharga;
                totharga102 = Home.strtotharga;
                break;
            case "103":
                Home.sdhdipesan103 = true;
                nama103 = Home.namahome;
                notelp103 = Home.nohp;
                email103 = Home.email;
                invoice103 = formatinvoice;
                jmlhhari103 = Home.psnhari;
                tglpesan103 = Home.tglpsn + " / " + Home.blnpsn + " / " + Home.thnpsn;
                tgldipesan103 = Home.tgldpsn + " / " + Home.blndpsn + " / " + Home.thndpsn;
                totalharga103 = "Rp."+Home.strtothargaril;
                pajak103 = "Rp."+Home.strpajak;
                uang103 = uang;
                kembalian103 = intuang - Home.tothargaril;
                strkembalian103 = Integer.toString(kembalian103);
                nokamar103 = Home.no_kamar2;
                username103 = Login.ambilusername;
                hargaperhari103 = Home.lharga;
                totharga103 = Home.strtotharga;
                break;
            case "201":
                Home.sdhdipesan201 = true;
                nama201 = Home.namahome;
                notelp201 = Home.nohp;
                email201 = Home.email;
                invoice201 = formatinvoice;
                jmlhhari201 = Home.psnhari;
                tglpesan201 = Home.tglpsn + " / " + Home.blnpsn + " / " + Home.thnpsn;
                tgldipesan201 = Home.tgldpsn + " / " + Home.blndpsn + " / " + Home.thndpsn;
                totalharga201 = "Rp."+Home.strtothargaril;
                pajak201 = "Rp."+Home.strpajak;
                uang201 = uang;
                kembalian201 = intuang - Home.tothargaril;
                strkembalian201 = Integer.toString(kembalian201);
                nokamar201 = Home.no_kamar2;
                username201 = Login.ambilusername;
                hargaperhari201 = Home.lharga;
                totharga201 = Home.strtotharga;
                break;
            case "202":
                Home.sdhdipesan202 = true;
                nama202 = Home.namahome;
                notelp202 = Home.nohp;
                email202 = Home.email;
                invoice202 = formatinvoice;
                jmlhhari202 = Home.psnhari;
                tglpesan202 = Home.tglpsn + " / " + Home.blnpsn + " / " + Home.thnpsn;
                tgldipesan202 = Home.tgldpsn + " / " + Home.blndpsn + " / " + Home.thndpsn;
                totalharga202 = "Rp."+Home.strtothargaril;
                pajak202 = "Rp."+Home.strpajak;
                uang202 = uang;
                kembalian202 = intuang - Home.tothargaril;
                strkembalian202 = Integer.toString(kembalian202);
                nokamar202 = Home.no_kamar2;
                username202 = Login.ambilusername;
                hargaperhari202 = Home.lharga;
                totharga202 = Home.strtotharga;
                break;
            case "203":
                Home.sdhdipesan203 = true;
                nama203 = Home.namahome;
                notelp203 = Home.nohp;
                email203 = Home.email;
                invoice203 = formatinvoice;
                jmlhhari203 = Home.psnhari;
                tglpesan203 = Home.tglpsn + " / " + Home.blnpsn + " / " + Home.thnpsn;
                tgldipesan203 = Home.tgldpsn + " / " + Home.blndpsn + " / " + Home.thndpsn;
                totalharga203 = "Rp."+Home.strtothargaril;
                pajak203 = "Rp."+Home.strpajak;
                uang203 = uang;
                kembalian203 = intuang - Home.tothargaril;
                strkembalian203 = Integer.toString(kembalian203);
                nokamar203 = Home.no_kamar2;
                username203 = Login.ambilusername;
                hargaperhari203 = Home.lharga;
                totharga203 = Home.strtotharga;
                break;
            }
            
            Map<String, String> homeDetails = new HashMap<>();
            homeDetails.put("namahome", Home.namahome);
            homeDetails.put("nokamar", Home.no_kamar2);
            databaseco.put(Home.namahome, homeDetails);

            this.dispose();
            SelesaiPesan sp = new SelesaiPesan();
            sp.setVisible(true);
            sp.pack();
            sp.setLocationRelativeTo(null);
            sp.setDefaultCloseOperation(SelesaiPesan.EXIT_ON_CLOSE);
        }else{
            jLabel23.setText("Uang anda Kurang");
        }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Home hm = new Home();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        hm.setDefaultCloseOperation(Home.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton1.doClick();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
