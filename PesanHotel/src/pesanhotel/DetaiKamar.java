/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pesanhotel;

/**
 *
 * @author ACER
 */
public class DetaiKamar extends javax.swing.JFrame {

    /**
     * Creates new form DetaiKamar
     */
    public DetaiKamar() {
        initComponents();
        if (AdminHome.detailkamar101 == true){
            setTitle("Detail Kamar 101");
            jLabel1.setText("Detail Kamar "+CheckOut.nokamar101);
            jLabel15.setText("Di pesan");
            jLabel16.setText(CheckOut.nama101);
            jLabel17.setText(CheckOut.username101);
            jLabel18.setText(CheckOut.notelp101);
            jLabel19.setText(CheckOut.email101);
            jLabel20.setText(CheckOut.tglpesan101);
            jLabel21.setText(CheckOut.tgldipesan101);
            jLabel22.setText(CheckOut.jmlhhari101);
            jLabel23.setText(CheckOut.hargaperhari101);
            jLabel24.setText(CheckOut.totharga101);
            jLabel30.setText(CheckOut.invoice101);
            jLabel26.setText(CheckOut.totalharga101);
            jLabel25.setText(CheckOut.pajak101);
            jLabel27.setText(CheckOut.uang101);
            jLabel31.setText("Rp."+CheckOut.strkembalian101);            
        }else if(AdminHome.detailkamar102  == true){
            setTitle("Detail Kamar 102");
            jLabel1.setText("Detail Kamar " + CheckOut.nokamar102);
            jLabel15.setText("Di pesan");
            jLabel16.setText(CheckOut.nama102);
            jLabel17.setText(CheckOut.username102);
            jLabel18.setText(CheckOut.notelp102);
            jLabel19.setText(CheckOut.email102);
            jLabel20.setText(CheckOut.tglpesan102);
            jLabel21.setText(CheckOut.tgldipesan102);
            jLabel22.setText(CheckOut.jmlhhari102);
            jLabel23.setText(CheckOut.hargaperhari102);
            jLabel24.setText(CheckOut.totharga102);
            jLabel30.setText(CheckOut.invoice102);
            jLabel26.setText(CheckOut.totalharga102);
            jLabel25.setText(CheckOut.pajak102);
            jLabel27.setText(CheckOut.uang102);
            jLabel31.setText("Rp." + CheckOut.strkembalian102);
        }else if(AdminHome.detailkamar103  == true){
            setTitle("Detail Kamar 103");
            jLabel1.setText("Detail Kamar " + CheckOut.nokamar103);
            jLabel15.setText("Di pesan");
            jLabel16.setText(CheckOut.nama103);
            jLabel17.setText(CheckOut.username103);
            jLabel18.setText(CheckOut.notelp103);
            jLabel19.setText(CheckOut.email103);
            jLabel20.setText(CheckOut.tglpesan103);
            jLabel21.setText(CheckOut.tgldipesan103);
            jLabel22.setText(CheckOut.jmlhhari103);
            jLabel23.setText(CheckOut.hargaperhari103);
            jLabel24.setText(CheckOut.totharga103);
            jLabel30.setText(CheckOut.invoice103);
            jLabel26.setText(CheckOut.totalharga103);
            jLabel25.setText(CheckOut.pajak103);
            jLabel27.setText(CheckOut.uang103);
            jLabel31.setText("Rp." + CheckOut.strkembalian103);
        }else if(AdminHome.detailkamar201  == true){
            setTitle("Detail Kamar 201");
            jLabel1.setText("Detail Kamar " + CheckOut.nokamar201);
            jLabel15.setText("Di pesan");
            jLabel16.setText(CheckOut.nama201);
            jLabel17.setText(CheckOut.username201);
            jLabel18.setText(CheckOut.notelp201);
            jLabel19.setText(CheckOut.email201);
            jLabel20.setText(CheckOut.tglpesan201);
            jLabel21.setText(CheckOut.tgldipesan201);
            jLabel22.setText(CheckOut.jmlhhari201);
            jLabel23.setText(CheckOut.hargaperhari201);
            jLabel24.setText(CheckOut.totharga201);
            jLabel30.setText(CheckOut.invoice201);
            jLabel26.setText(CheckOut.totalharga201);
            jLabel25.setText(CheckOut.pajak201);
            jLabel27.setText(CheckOut.uang201);
            jLabel31.setText("Rp." + CheckOut.strkembalian201);

        }else if(AdminHome.detailkamar202  == true){
            setTitle("Detail Kamar 202");
            jLabel1.setText("Detail Kamar " + CheckOut.nokamar202);
            jLabel15.setText("Di pesan");
            jLabel16.setText(CheckOut.nama202);
            jLabel17.setText(CheckOut.username202);
            jLabel18.setText(CheckOut.notelp202);
            jLabel19.setText(CheckOut.email202);
            jLabel20.setText(CheckOut.tglpesan202);
            jLabel21.setText(CheckOut.tgldipesan202);
            jLabel22.setText(CheckOut.jmlhhari202);
            jLabel23.setText(CheckOut.hargaperhari202);
            jLabel24.setText(CheckOut.totharga202);
            jLabel30.setText(CheckOut.invoice202);
            jLabel26.setText(CheckOut.totalharga202);
            jLabel25.setText(CheckOut.pajak202);
            jLabel27.setText(CheckOut.uang202);
            jLabel31.setText("Rp." + CheckOut.strkembalian202);

        }else if(AdminHome.detailkamar203  == true){
            setTitle("Detail Kamar 203");
            jLabel1.setText("Detail Kamar " + CheckOut.nokamar203);
            jLabel15.setText("Di pesan");
            jLabel16.setText(CheckOut.nama203);
            jLabel17.setText(CheckOut.username203);
            jLabel18.setText(CheckOut.notelp203);
            jLabel19.setText(CheckOut.email203);
            jLabel20.setText(CheckOut.tglpesan203);
            jLabel21.setText(CheckOut.tgldipesan203);
            jLabel22.setText(CheckOut.jmlhhari203);
            jLabel23.setText(CheckOut.hargaperhari203);
            jLabel24.setText(CheckOut.totharga203);
            jLabel30.setText(CheckOut.invoice203);
            jLabel26.setText(CheckOut.totalharga203);
            jLabel25.setText(CheckOut.pajak203);
            jLabel27.setText(CheckOut.uang203);
            jLabel31.setText("Rp." + CheckOut.strkembalian203);
        }
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
        jLabel28 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jPanel75 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel77 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 103, 105));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 10, true));
        jPanel2.setLayout(null);

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Invoice :");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(404, 370, 50, 16);

        jButton1.setText("Kembali");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(50, 365, 80, 23);

        jPanel5.setBackground(new java.awt.Color(255, 201, 74));
        jPanel5.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Detail Kamar");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(15, 5, 190, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(220, 0, 220, 42);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(210, 0, 240, 50);

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 201, 74));
        jPanel3.setLayout(null);

        jLabel2.setText("Status :");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(15, 7, 60, 16);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(-1, 0, 90, 30);

        jLabel15.setForeground(new java.awt.Color(0, 255, 0));
        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(100, 7, 100, 16);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(50, 80, 220, 30);

        jPanel8.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 201, 74));
        jPanel9.setLayout(null);

        jLabel34.setText("Nama :");
        jPanel9.add(jLabel34);
        jLabel34.setBounds(15, 7, 60, 16);

        jPanel8.add(jPanel9);
        jPanel9.setBounds(-1, 0, 90, 30);

        jLabel16.setText("jLabel16");
        jPanel8.add(jLabel16);
        jLabel16.setBounds(100, 7, 110, 16);

        jPanel2.add(jPanel8);
        jPanel8.setBounds(50, 120, 220, 30);

        jPanel10.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(255, 201, 74));
        jPanel11.setLayout(null);

        jLabel36.setText("Username :");
        jPanel11.add(jLabel36);
        jLabel36.setBounds(10, 7, 70, 16);

        jPanel10.add(jPanel11);
        jPanel11.setBounds(-1, 0, 90, 30);

        jLabel17.setText("jLabel17");
        jPanel10.add(jLabel17);
        jLabel17.setBounds(100, 7, 100, 16);

        jPanel2.add(jPanel10);
        jPanel10.setBounds(50, 160, 220, 30);

        jPanel12.setLayout(null);

        jPanel13.setBackground(new java.awt.Color(255, 201, 74));
        jPanel13.setLayout(null);

        jLabel5.setText("No hp :");
        jPanel13.add(jLabel5);
        jLabel5.setBounds(15, 7, 60, 16);

        jPanel12.add(jPanel13);
        jPanel13.setBounds(-1, 0, 90, 30);

        jLabel18.setText("jLabel18");
        jPanel12.add(jLabel18);
        jLabel18.setBounds(100, 7, 110, 16);

        jPanel2.add(jPanel12);
        jPanel12.setBounds(50, 200, 220, 30);

        jPanel16.setLayout(null);

        jPanel17.setBackground(new java.awt.Color(255, 201, 74));
        jPanel17.setLayout(null);

        jLabel40.setText("Tanggal pesan :");
        jPanel17.add(jLabel40);
        jLabel40.setBounds(10, 7, 90, 16);

        jPanel16.add(jPanel17);
        jPanel17.setBounds(-1, 0, 110, 30);

        jLabel20.setText("jLabel20");
        jPanel16.add(jLabel20);
        jLabel20.setBounds(120, 7, 90, 16);

        jPanel18.setLayout(null);

        jPanel19.setBackground(new java.awt.Color(255, 201, 74));
        jPanel19.setLayout(null);

        jLabel42.setText("tgl pesan :");
        jPanel19.add(jLabel42);
        jLabel42.setBounds(15, 7, 54, 16);

        jPanel18.add(jPanel19);
        jPanel19.setBounds(-1, 0, 80, 30);

        jLabel43.setText("jLabel20");
        jPanel18.add(jLabel43);
        jLabel43.setBounds(90, 7, 43, 16);

        jPanel16.add(jPanel18);
        jPanel18.setBounds(50, 240, 190, 30);

        jPanel2.add(jPanel16);
        jPanel16.setBounds(50, 280, 220, 30);

        jPanel20.setLayout(null);

        jPanel21.setBackground(new java.awt.Color(255, 201, 74));
        jPanel21.setLayout(null);

        jLabel8.setText("Tanggal dipesan :");
        jPanel21.add(jLabel8);
        jLabel8.setBounds(10, 7, 100, 16);

        jPanel20.add(jPanel21);
        jPanel21.setBounds(-1, 0, 110, 30);

        jPanel22.setLayout(null);

        jPanel23.setBackground(new java.awt.Color(255, 201, 74));
        jPanel23.setLayout(null);

        jLabel44.setText("tgl pesan :");
        jPanel23.add(jLabel44);
        jLabel44.setBounds(15, 7, 54, 16);

        jPanel22.add(jPanel23);
        jPanel23.setBounds(-1, 0, 80, 30);

        jLabel45.setText("jLabel20");
        jPanel22.add(jLabel45);
        jLabel45.setBounds(90, 7, 43, 16);

        jPanel20.add(jPanel22);
        jPanel22.setBounds(50, 240, 190, 30);

        jLabel21.setText("jLabel21");
        jPanel20.add(jLabel21);
        jLabel21.setBounds(120, 7, 90, 16);

        jPanel2.add(jPanel20);
        jPanel20.setBounds(50, 320, 220, 30);

        jPanel24.setLayout(null);

        jPanel25.setBackground(new java.awt.Color(255, 201, 74));
        jPanel25.setLayout(null);

        jLabel46.setText("Email :");
        jPanel25.add(jLabel46);
        jLabel46.setBounds(15, 7, 60, 16);

        jPanel24.add(jPanel25);
        jPanel25.setBounds(-1, 0, 90, 30);

        jLabel19.setText("jLabel19");
        jPanel24.add(jLabel19);
        jLabel19.setBounds(100, 7, 110, 16);

        jPanel2.add(jPanel24);
        jPanel24.setBounds(50, 240, 220, 30);

        jPanel26.setLayout(null);

        jPanel27.setBackground(new java.awt.Color(255, 201, 74));
        jPanel27.setLayout(null);

        jLabel32.setText("Jumlah  hari :");
        jPanel27.add(jLabel32);
        jLabel32.setBounds(12, 7, 80, 16);

        jPanel26.add(jPanel27);
        jPanel27.setBounds(-1, 0, 90, 30);

        jPanel28.setLayout(null);

        jPanel29.setBackground(new java.awt.Color(255, 201, 74));
        jPanel29.setLayout(null);

        jLabel48.setText("tgl pesan :");
        jPanel29.add(jLabel48);
        jLabel48.setBounds(15, 7, 54, 16);

        jPanel28.add(jPanel29);
        jPanel29.setBounds(-1, 0, 80, 30);

        jLabel49.setText("jLabel20");
        jPanel28.add(jLabel49);
        jLabel49.setBounds(90, 7, 43, 16);

        jPanel26.add(jPanel28);
        jPanel28.setBounds(50, 240, 190, 30);

        jLabel22.setText("jLabel22");
        jPanel26.add(jLabel22);
        jLabel22.setBounds(100, 7, 110, 16);

        jPanel2.add(jPanel26);
        jPanel26.setBounds(350, 80, 230, 30);

        jPanel30.setLayout(null);

        jPanel31.setBackground(new java.awt.Color(255, 201, 74));
        jPanel31.setLayout(null);

        jLabel10.setText("Harga /hari :");
        jPanel31.add(jLabel10);
        jLabel10.setBounds(11, 7, 70, 16);

        jPanel30.add(jPanel31);
        jPanel31.setBounds(-1, 0, 90, 30);

        jPanel32.setLayout(null);

        jPanel33.setBackground(new java.awt.Color(255, 201, 74));
        jPanel33.setLayout(null);

        jLabel51.setText("tgl pesan :");
        jPanel33.add(jLabel51);
        jLabel51.setBounds(15, 7, 54, 16);

        jPanel32.add(jPanel33);
        jPanel33.setBounds(-1, 0, 80, 30);

        jLabel52.setText("jLabel20");
        jPanel32.add(jLabel52);
        jLabel52.setBounds(90, 7, 43, 16);

        jPanel30.add(jPanel32);
        jPanel32.setBounds(50, 240, 190, 30);

        jLabel23.setText("jLabel23");
        jPanel30.add(jLabel23);
        jLabel23.setBounds(100, 7, 120, 16);

        jPanel2.add(jPanel30);
        jPanel30.setBounds(350, 120, 230, 30);

        jPanel38.setLayout(null);

        jPanel39.setBackground(new java.awt.Color(255, 201, 74));
        jPanel39.setLayout(null);

        jLabel11.setText("Harga :");
        jPanel39.add(jLabel11);
        jLabel11.setBounds(15, 7, 60, 16);

        jPanel38.add(jPanel39);
        jPanel39.setBounds(-1, 0, 90, 30);

        jPanel40.setLayout(null);

        jPanel41.setBackground(new java.awt.Color(255, 201, 74));
        jPanel41.setLayout(null);

        jLabel59.setText("tgl pesan :");
        jPanel41.add(jLabel59);
        jLabel59.setBounds(15, 7, 54, 16);

        jPanel40.add(jPanel41);
        jPanel41.setBounds(-1, 0, 80, 30);

        jLabel60.setText("jLabel20");
        jPanel40.add(jLabel60);
        jLabel60.setBounds(90, 7, 43, 16);

        jPanel38.add(jPanel40);
        jPanel40.setBounds(50, 240, 190, 30);

        jPanel42.setLayout(null);

        jPanel43.setBackground(new java.awt.Color(255, 201, 74));
        jPanel43.setLayout(null);

        jLabel62.setText("Jmlh hari :");
        jPanel43.add(jLabel62);
        jLabel62.setBounds(20, 7, 54, 16);

        jPanel42.add(jPanel43);
        jPanel43.setBounds(-1, 0, 80, 30);

        jPanel44.setLayout(null);

        jPanel45.setBackground(new java.awt.Color(255, 201, 74));
        jPanel45.setLayout(null);

        jLabel63.setText("tgl pesan :");
        jPanel45.add(jLabel63);
        jLabel63.setBounds(15, 7, 54, 16);

        jPanel44.add(jPanel45);
        jPanel45.setBounds(-1, 0, 80, 30);

        jLabel64.setText("jLabel20");
        jPanel44.add(jLabel64);
        jLabel64.setBounds(90, 7, 43, 16);

        jPanel42.add(jPanel44);
        jPanel44.setBounds(50, 240, 190, 30);

        jLabel65.setText("jLabel22");
        jPanel42.add(jLabel65);
        jLabel65.setBounds(90, 7, 43, 16);

        jPanel38.add(jPanel42);
        jPanel42.setBounds(260, 160, 190, 30);

        jLabel24.setText("jLabel24");
        jPanel38.add(jLabel24);
        jLabel24.setBounds(100, 7, 120, 16);

        jPanel2.add(jPanel38);
        jPanel38.setBounds(350, 160, 230, 30);

        jPanel46.setLayout(null);

        jPanel47.setBackground(new java.awt.Color(255, 201, 74));
        jPanel47.setLayout(null);

        jLabel50.setText("Pajak :");
        jPanel47.add(jLabel50);
        jLabel50.setBounds(15, 7, 60, 16);

        jPanel46.add(jPanel47);
        jPanel47.setBounds(-1, 0, 90, 30);

        jPanel48.setLayout(null);

        jPanel49.setBackground(new java.awt.Color(255, 201, 74));
        jPanel49.setLayout(null);

        jLabel53.setText("tgl pesan :");
        jPanel49.add(jLabel53);
        jLabel53.setBounds(15, 7, 54, 16);

        jPanel48.add(jPanel49);
        jPanel49.setBounds(-1, 0, 80, 30);

        jLabel58.setText("jLabel20");
        jPanel48.add(jLabel58);
        jLabel58.setBounds(90, 7, 43, 16);

        jPanel46.add(jPanel48);
        jPanel48.setBounds(50, 240, 190, 30);

        jPanel50.setLayout(null);

        jPanel51.setBackground(new java.awt.Color(255, 201, 74));
        jPanel51.setLayout(null);

        jLabel67.setText("Jmlh hari :");
        jPanel51.add(jLabel67);
        jLabel67.setBounds(20, 7, 54, 16);

        jPanel50.add(jPanel51);
        jPanel51.setBounds(-1, 0, 80, 30);

        jPanel52.setLayout(null);

        jPanel53.setBackground(new java.awt.Color(255, 201, 74));
        jPanel53.setLayout(null);

        jLabel68.setText("tgl pesan :");
        jPanel53.add(jLabel68);
        jLabel68.setBounds(15, 7, 54, 16);

        jPanel52.add(jPanel53);
        jPanel53.setBounds(-1, 0, 80, 30);

        jLabel69.setText("jLabel20");
        jPanel52.add(jLabel69);
        jLabel69.setBounds(90, 7, 43, 16);

        jPanel50.add(jPanel52);
        jPanel52.setBounds(50, 240, 190, 30);

        jLabel70.setText("jLabel22");
        jPanel50.add(jLabel70);
        jLabel70.setBounds(90, 7, 43, 16);

        jPanel46.add(jPanel50);
        jPanel50.setBounds(260, 160, 190, 30);

        jLabel25.setText("jLabel25");
        jPanel46.add(jLabel25);
        jLabel25.setBounds(100, 7, 110, 16);

        jPanel2.add(jPanel46);
        jPanel46.setBounds(350, 200, 230, 30);

        jPanel54.setLayout(null);

        jPanel55.setBackground(new java.awt.Color(255, 201, 74));
        jPanel55.setLayout(null);

        jLabel13.setText("Total harga :");
        jPanel55.add(jLabel13);
        jLabel13.setBounds(10, 7, 80, 16);

        jPanel54.add(jPanel55);
        jPanel55.setBounds(-1, 0, 90, 30);

        jPanel56.setLayout(null);

        jPanel57.setBackground(new java.awt.Color(255, 201, 74));
        jPanel57.setLayout(null);

        jLabel72.setText("tgl pesan :");
        jPanel57.add(jLabel72);
        jLabel72.setBounds(15, 7, 54, 16);

        jPanel56.add(jPanel57);
        jPanel57.setBounds(-1, 0, 80, 30);

        jLabel73.setText("jLabel20");
        jPanel56.add(jLabel73);
        jLabel73.setBounds(90, 7, 43, 16);

        jPanel54.add(jPanel56);
        jPanel56.setBounds(50, 240, 190, 30);

        jPanel58.setLayout(null);

        jPanel59.setBackground(new java.awt.Color(255, 201, 74));
        jPanel59.setLayout(null);

        jLabel75.setText("Jmlh hari :");
        jPanel59.add(jLabel75);
        jLabel75.setBounds(20, 7, 54, 16);

        jPanel58.add(jPanel59);
        jPanel59.setBounds(-1, 0, 80, 30);

        jPanel60.setLayout(null);

        jPanel61.setBackground(new java.awt.Color(255, 201, 74));
        jPanel61.setLayout(null);

        jLabel76.setText("tgl pesan :");
        jPanel61.add(jLabel76);
        jLabel76.setBounds(15, 7, 54, 16);

        jPanel60.add(jPanel61);
        jPanel61.setBounds(-1, 0, 80, 30);

        jLabel77.setText("jLabel20");
        jPanel60.add(jLabel77);
        jLabel77.setBounds(90, 7, 43, 16);

        jPanel58.add(jPanel60);
        jPanel60.setBounds(50, 240, 190, 30);

        jLabel78.setText("jLabel22");
        jPanel58.add(jLabel78);
        jLabel78.setBounds(90, 7, 43, 16);

        jPanel54.add(jPanel58);
        jPanel58.setBounds(260, 160, 190, 30);

        jLabel26.setText("jLabel26");
        jPanel54.add(jLabel26);
        jLabel26.setBounds(100, 7, 120, 16);

        jPanel2.add(jPanel54);
        jPanel54.setBounds(350, 240, 230, 30);

        jPanel62.setLayout(null);

        jPanel64.setLayout(null);

        jPanel65.setBackground(new java.awt.Color(255, 201, 74));
        jPanel65.setLayout(null);

        jLabel66.setText("tgl pesan :");
        jPanel65.add(jLabel66);
        jLabel66.setBounds(15, 7, 54, 16);

        jPanel64.add(jPanel65);
        jPanel65.setBounds(-1, 0, 80, 30);

        jLabel71.setText("jLabel20");
        jPanel64.add(jLabel71);
        jLabel71.setBounds(90, 7, 43, 16);

        jPanel62.add(jPanel64);
        jPanel64.setBounds(50, 240, 190, 30);

        jPanel66.setLayout(null);

        jPanel67.setBackground(new java.awt.Color(255, 201, 74));
        jPanel67.setLayout(null);

        jLabel74.setText("Jmlh hari :");
        jPanel67.add(jLabel74);
        jLabel74.setBounds(20, 7, 54, 16);

        jPanel66.add(jPanel67);
        jPanel67.setBounds(-1, 0, 80, 30);

        jPanel68.setLayout(null);

        jPanel69.setBackground(new java.awt.Color(255, 201, 74));
        jPanel69.setLayout(null);

        jLabel79.setText("tgl pesan :");
        jPanel69.add(jLabel79);
        jLabel79.setBounds(15, 7, 54, 16);

        jPanel68.add(jPanel69);
        jPanel69.setBounds(-1, 0, 80, 30);

        jLabel80.setText("jLabel20");
        jPanel68.add(jLabel80);
        jLabel80.setBounds(90, 7, 43, 16);

        jPanel66.add(jPanel68);
        jPanel68.setBounds(50, 240, 190, 30);

        jLabel81.setText("jLabel22");
        jPanel66.add(jLabel81);
        jLabel81.setBounds(90, 7, 43, 16);

        jPanel62.add(jPanel66);
        jPanel66.setBounds(260, 160, 190, 30);

        jPanel63.setBackground(new java.awt.Color(0, 102, 102));
        jPanel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 201, 74)));
        jPanel63.setLayout(null);

        jLabel29.setText("Kembalian :");
        jPanel63.add(jLabel29);
        jLabel29.setBounds(10, 7, 70, 16);

        jPanel62.add(jPanel63);
        jPanel63.setBounds(0, 0, 90, 30);

        jLabel31.setText("jLabel31");
        jPanel62.add(jLabel31);
        jLabel31.setBounds(100, 7, 120, 16);

        jPanel2.add(jPanel62);
        jPanel62.setBounds(350, 320, 230, 30);

        jPanel70.setLayout(null);

        jPanel71.setLayout(null);

        jPanel72.setBackground(new java.awt.Color(255, 201, 74));
        jPanel72.setLayout(null);

        jLabel83.setText("tgl pesan :");
        jPanel72.add(jLabel83);
        jLabel83.setBounds(15, 7, 54, 16);

        jPanel71.add(jPanel72);
        jPanel72.setBounds(-1, 0, 80, 30);

        jLabel84.setText("jLabel20");
        jPanel71.add(jLabel84);
        jLabel84.setBounds(90, 7, 43, 16);

        jPanel70.add(jPanel71);
        jPanel71.setBounds(50, 240, 190, 30);

        jPanel73.setLayout(null);

        jPanel74.setBackground(new java.awt.Color(255, 201, 74));
        jPanel74.setLayout(null);

        jLabel85.setText("Jmlh hari :");
        jPanel74.add(jLabel85);
        jLabel85.setBounds(20, 7, 54, 16);

        jPanel73.add(jPanel74);
        jPanel74.setBounds(-1, 0, 80, 30);

        jPanel75.setLayout(null);

        jPanel76.setBackground(new java.awt.Color(255, 201, 74));
        jPanel76.setLayout(null);

        jLabel86.setText("tgl pesan :");
        jPanel76.add(jLabel86);
        jLabel86.setBounds(15, 7, 54, 16);

        jPanel75.add(jPanel76);
        jPanel76.setBounds(-1, 0, 80, 30);

        jLabel87.setText("jLabel20");
        jPanel75.add(jLabel87);
        jLabel87.setBounds(90, 7, 43, 16);

        jPanel73.add(jPanel75);
        jPanel75.setBounds(50, 240, 190, 30);

        jLabel88.setText("jLabel22");
        jPanel73.add(jLabel88);
        jLabel88.setBounds(90, 7, 43, 16);

        jPanel70.add(jPanel73);
        jPanel73.setBounds(260, 160, 190, 30);

        jLabel27.setText("jLabel27");
        jPanel70.add(jLabel27);
        jLabel27.setBounds(100, 7, 120, 16);

        jPanel77.setBackground(new java.awt.Color(0, 102, 102));
        jPanel77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 201, 74)));
        jPanel77.setLayout(null);

        jLabel90.setText("Uang :");
        jPanel77.add(jLabel90);
        jLabel90.setBounds(15, 7, 60, 16);

        jPanel70.add(jPanel77);
        jPanel77.setBounds(0, 0, 90, 30);

        jPanel2.add(jPanel70);
        jPanel70.setBounds(350, 280, 230, 30);

        jPanel4.setLayout(null);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("jLabel30");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(jLabel30);
        jLabel30.setBounds(15, 7, 80, 16);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(469, 360, 110, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AdminHome ah = new AdminHome();
        ah.setVisible(true);
        ah.pack();
        ah.setLocationRelativeTo(null);
        ah.setDefaultCloseOperation(AdminHome.EXIT_ON_CLOSE);
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
            java.util.logging.Logger.getLogger(DetaiKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetaiKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetaiKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetaiKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetaiKamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
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
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
