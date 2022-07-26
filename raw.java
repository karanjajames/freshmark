
package fs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class raw extends javax.swing.JFrame {

    /**
     * Creates new form raw
     */
    public raw() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        raw1 = new javax.swing.JPanel();
        freshmark3 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        e = new javax.swing.JTextField();
        n = new javax.swing.JTextField();
        m = new javax.swing.JTextField();
        NEWF2 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        ct = new javax.swing.JButton();
        cp = new javax.swing.JButton();
        ctd = new javax.swing.JTextField();
        db = new javax.swing.JButton();
        dbd = new javax.swing.JTextField();
        up2 = new javax.swing.JTextField();
        cpd = new javax.swing.JTextField();
        date2 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tfresh2 = new javax.swing.JTable();
        td = new javax.swing.JTextField();
        SAVEF = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        tld = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        t = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        raw2 = new javax.swing.JPanel();
        freshmark2 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        fre1 = new javax.swing.JTextField();
        frn1 = new javax.swing.JTextField();
        frm1 = new javax.swing.JTextField();
        NEWF1 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        ctt15 = new javax.swing.JButton();
        ctt16 = new javax.swing.JButton();
        ct16 = new javax.swing.JTextField();
        ctt17 = new javax.swing.JButton();
        ct17 = new javax.swing.JTextField();
        up1 = new javax.swing.JTextField();
        ct18 = new javax.swing.JTextField();
        date1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tfresh1 = new javax.swing.JTable();
        frtt1 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        tll1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        frt2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        raw4 = new javax.swing.JPanel();
        freshmark1 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        ef = new javax.swing.JTextField();
        nf = new javax.swing.JTextField();
        mf = new javax.swing.JTextField();
        NEWF = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        ctt12 = new javax.swing.JButton();
        ctt13 = new javax.swing.JButton();
        ct13 = new javax.swing.JTextField();
        ctt14 = new javax.swing.JButton();
        dbf = new javax.swing.JTextField();
        up = new javax.swing.JTextField();
        ct15 = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfresh = new javax.swing.JTable();
        tfd = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        lff = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        tf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("FRESHMARK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("LIMURU DAIRY");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 204, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 51));
        jButton3.setText("FARMERS");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 204, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 51));
        jButton4.setText("KIRIITA DAIRY");

        jButton5.setBackground(new java.awt.Color(102, 204, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 51));
        jButton5.setText("jButton1");

        jButton7.setBackground(new java.awt.Color(102, 204, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 0, 51));
        jButton7.setText("jButton1");

        jButton8.setBackground(new java.awt.Color(102, 204, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 0, 51));
        jButton8.setText("jButton1");

        jButton9.setBackground(new java.awt.Color(102, 204, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 0, 51));
        jButton9.setText("WAKULIMA BIASHARA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 0, 1100, 140));

        jPanel5.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 0, 4, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new java.awt.CardLayout());

        raw1.setBackground(new java.awt.Color(204, 0, 204));

        freshmark3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel44.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel44.setText("Morning");

        jLabel45.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel45.setText("Noon");

        jLabel46.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel46.setText("Evening");

        e.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N

        n.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });

        m.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });

        NEWF2.setBackground(new java.awt.Color(0, 102, 153));
        NEWF2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        NEWF2.setText("NEW FARMER");
        NEWF2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NEWF2MouseClicked(evt);
            }
        });
        NEWF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEWF2ActionPerformed(evt);
            }
        });

        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel47.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel47.setText("Unit Price");

        ct.setBackground(new java.awt.Color(0, 102, 153));
        ct.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        ct.setText("Cash Total");
        ct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctMouseClicked(evt);
            }
        });
        ct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctActionPerformed(evt);
            }
        });

        cp.setBackground(new java.awt.Color(0, 102, 153));
        cp.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        cp.setText("Cash Paid");
        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });

        ctd.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        ctd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctdMouseClicked(evt);
            }
        });
        ctd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctdActionPerformed(evt);
            }
        });

        db.setBackground(new java.awt.Color(0, 102, 153));
        db.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        db.setText("Debt Bal");
        db.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dbMouseClicked(evt);
            }
        });
        db.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbActionPerformed(evt);
            }
        });

        dbd.setEditable(false);
        dbd.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        dbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbdActionPerformed(evt);
            }
        });

        up2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N

        cpd.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        cpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel47)
                        .addGap(43, 43, 43)
                        .addComponent(up2))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addComponent(ct)
                            .addGap(18, 18, 18)
                            .addComponent(ctd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cpd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addComponent(db, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dbd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(up2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ct)
                    .addComponent(ctd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cp)
                    .addComponent(cpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(db)
                    .addComponent(dbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        date2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N

        jLabel48.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel48.setText("Date");

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tfresh2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "morning", "noon", "evening", "total", "total cost", "cash paid", "debt bal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tfresh2);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        td.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        td.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdActionPerformed(evt);
            }
        });

        SAVEF.setBackground(new java.awt.Color(0, 102, 153));
        SAVEF.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        SAVEF.setText("Save");
        SAVEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEFActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(0, 102, 153));
        jButton17.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jButton17.setText("Clear");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        tld.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        tld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tldActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel23.setText("Total (L)");

        t.setBackground(new java.awt.Color(0, 102, 153));
        t.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        t.setText("Total");
        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMouseClicked(evt);
            }
        });
        t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("FRESHMARK");

        javax.swing.GroupLayout freshmark3Layout = new javax.swing.GroupLayout(freshmark3);
        freshmark3.setLayout(freshmark3Layout);
        freshmark3Layout.setHorizontalGroup(
            freshmark3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(freshmark3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(freshmark3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NEWF2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(freshmark3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(freshmark3Layout.createSequentialGroup()
                        .addGroup(freshmark3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(freshmark3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(freshmark3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(freshmark3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(freshmark3Layout.createSequentialGroup()
                                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(freshmark3Layout.createSequentialGroup()
                                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addGroup(freshmark3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(date2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                                .addComponent(m))))
                                    .addGroup(freshmark3Layout.createSequentialGroup()
                                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(freshmark3Layout.createSequentialGroup()
                                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(td, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(freshmark3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(freshmark3Layout.createSequentialGroup()
                                .addComponent(SAVEF)
                                .addGap(40, 40, 40)
                                .addComponent(jButton17)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, freshmark3Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tld, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(freshmark3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        freshmark3Layout.setVerticalGroup(
            freshmark3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(freshmark3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(freshmark3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(freshmark3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(freshmark3Layout.createSequentialGroup()
                        .addGroup(freshmark3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(freshmark3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(freshmark3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(freshmark3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(td, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SAVEF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NEWF2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(364, 364, 364))
        );

        javax.swing.GroupLayout raw1Layout = new javax.swing.GroupLayout(raw1);
        raw1.setLayout(raw1Layout);
        raw1Layout.setHorizontalGroup(
            raw1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(freshmark3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        raw1Layout.setVerticalGroup(
            raw1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(freshmark3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 536, Short.MAX_VALUE)
        );

        jPanel3.add(raw1, "card2");

        raw2.setBackground(new java.awt.Color(0, 255, 102));

        freshmark2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel39.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel39.setText("Morning");

        jLabel40.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel40.setText("Noon");

        jLabel41.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel41.setText("Evening");

        fre1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N

        frn1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N

        frm1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        frm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frm1ActionPerformed(evt);
            }
        });

        NEWF1.setBackground(new java.awt.Color(0, 102, 153));
        NEWF1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        NEWF1.setText("NEW FARMER");
        NEWF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NEWF1MouseClicked(evt);
            }
        });
        NEWF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEWF1ActionPerformed(evt);
            }
        });

        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel42.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel42.setText("Unit Price");

        ctt15.setBackground(new java.awt.Color(0, 102, 153));
        ctt15.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        ctt15.setText("Cash Total");
        ctt15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctt15MouseClicked(evt);
            }
        });
        ctt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctt15ActionPerformed(evt);
            }
        });

        ctt16.setBackground(new java.awt.Color(0, 102, 153));
        ctt16.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        ctt16.setText("Cash Paid");
        ctt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctt16ActionPerformed(evt);
            }
        });

        ct16.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        ct16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ct16MouseClicked(evt);
            }
        });
        ct16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct16ActionPerformed(evt);
            }
        });

        ctt17.setBackground(new java.awt.Color(0, 102, 153));
        ctt17.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        ctt17.setText("Debt Bal");
        ctt17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctt17MouseClicked(evt);
            }
        });
        ctt17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctt17ActionPerformed(evt);
            }
        });

        ct17.setEditable(false);
        ct17.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        ct17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct17ActionPerformed(evt);
            }
        });

        up1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N

        ct18.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel42)
                        .addGap(43, 43, 43)
                        .addComponent(up1))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(ctt15)
                            .addGap(18, 18, 18)
                            .addComponent(ct16, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(ctt16, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ct18, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(ctt17, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ct17, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(up1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctt15)
                    .addComponent(ct16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctt16)
                    .addComponent(ct18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctt17)
                    .addComponent(ct17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        date1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel43.setText("Date");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tfresh1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "morning", "noon", "evening", "total", "total cost", "cash paid", "debt bal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tfresh1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        frtt1.setEditable(false);
        frtt1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        frtt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frtt1ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 102, 153));
        jButton14.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jButton14.setText("Save");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 102, 153));
        jButton15.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jButton15.setText("Clear");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        tll1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        tll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tll1ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel22.setText("Total (L)");

        frt2.setBackground(new java.awt.Color(0, 102, 153));
        frt2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        frt2.setText("Total");
        frt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frt2ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 51, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("LIMURU DAIRY");

        javax.swing.GroupLayout freshmark2Layout = new javax.swing.GroupLayout(freshmark2);
        freshmark2.setLayout(freshmark2Layout);
        freshmark2Layout.setHorizontalGroup(
            freshmark2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(freshmark2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(freshmark2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NEWF1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(freshmark2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(freshmark2Layout.createSequentialGroup()
                        .addGroup(freshmark2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(freshmark2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(freshmark2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(freshmark2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(freshmark2Layout.createSequentialGroup()
                                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(frn1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(freshmark2Layout.createSequentialGroup()
                                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addGroup(freshmark2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(date1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                                .addComponent(frm1))))
                                    .addGroup(freshmark2Layout.createSequentialGroup()
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(fre1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(freshmark2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(frt2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(frtt1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(freshmark2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(freshmark2Layout.createSequentialGroup()
                                .addComponent(jButton14)
                                .addGap(40, 40, 40)
                                .addComponent(jButton15)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, freshmark2Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tll1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(freshmark2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        freshmark2Layout.setVerticalGroup(
            freshmark2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(freshmark2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(freshmark2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(freshmark2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(freshmark2Layout.createSequentialGroup()
                        .addGroup(freshmark2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(frm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tll1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(freshmark2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(frn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(freshmark2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(fre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(freshmark2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frtt1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frt2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NEWF1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(364, 364, 364))
        );

        javax.swing.GroupLayout raw2Layout = new javax.swing.GroupLayout(raw2);
        raw2.setLayout(raw2Layout);
        raw2Layout.setHorizontalGroup(
            raw2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(freshmark2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        raw2Layout.setVerticalGroup(
            raw2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(freshmark2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        jPanel3.add(raw2, "card2");

        raw4.setBackground(new java.awt.Color(204, 204, 0));

        freshmark1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel34.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel34.setText("Morning");

        jLabel35.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel35.setText("Noon");

        jLabel36.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel36.setText("Evening");

        ef.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N

        nf.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N

        mf.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        mf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mfActionPerformed(evt);
            }
        });

        NEWF.setBackground(new java.awt.Color(0, 102, 153));
        NEWF.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        NEWF.setText("NEW FARMER");
        NEWF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NEWFMouseClicked(evt);
            }
        });
        NEWF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEWFActionPerformed(evt);
            }
        });

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel37.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel37.setText("Unit Price");

        ctt12.setBackground(new java.awt.Color(0, 102, 153));
        ctt12.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        ctt12.setText("Cash Total");
        ctt12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctt12MouseClicked(evt);
            }
        });
        ctt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctt12ActionPerformed(evt);
            }
        });

        ctt13.setBackground(new java.awt.Color(0, 102, 153));
        ctt13.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        ctt13.setText("Cash Paid");
        ctt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctt13ActionPerformed(evt);
            }
        });

        ct13.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        ct13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ct13MouseClicked(evt);
            }
        });
        ct13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct13ActionPerformed(evt);
            }
        });

        ctt14.setBackground(new java.awt.Color(0, 102, 153));
        ctt14.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        ctt14.setText("Debt Bal");
        ctt14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctt14MouseClicked(evt);
            }
        });
        ctt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctt14ActionPerformed(evt);
            }
        });

        dbf.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        dbf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbfActionPerformed(evt);
            }
        });

        up.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N

        ct15.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel37)
                        .addGap(43, 43, 43)
                        .addComponent(up))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(ctt12)
                            .addGap(18, 18, 18)
                            .addComponent(ct13, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(ctt13, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ct15, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(ctt14, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dbf, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctt12)
                    .addComponent(ct13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctt13)
                    .addComponent(ct15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctt14)
                    .addComponent(dbf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        date.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel38.setText("Date");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tfresh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "morning", "noon", "evening", "total", "total cost", "cash paid", "debt bal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tfresh);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        tfd.setEditable(false);
        tfd.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        tfd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 102, 153));
        jButton12.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jButton12.setText("Save");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 102, 153));
        jButton13.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jButton13.setText("Clear");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        lff.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        lff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lffActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel21.setText("Total (L)");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tf.setBackground(new java.awt.Color(0, 102, 153));
        tf.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        tf.setText("Total");
        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout freshmark1Layout = new javax.swing.GroupLayout(freshmark1);
        freshmark1.setLayout(freshmark1Layout);
        freshmark1Layout.setHorizontalGroup(
            freshmark1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(freshmark1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(freshmark1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NEWF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(freshmark1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(freshmark1Layout.createSequentialGroup()
                        .addGroup(freshmark1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(freshmark1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(freshmark1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(freshmark1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(freshmark1Layout.createSequentialGroup()
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(nf, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(freshmark1Layout.createSequentialGroup()
                                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addGroup(freshmark1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                                .addComponent(mf))))
                                    .addGroup(freshmark1Layout.createSequentialGroup()
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(ef, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(freshmark1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(tfd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(freshmark1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(freshmark1Layout.createSequentialGroup()
                                .addComponent(jButton12)
                                .addGap(40, 40, 40)
                                .addComponent(jButton13)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, freshmark1Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lff, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(freshmark1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        freshmark1Layout.setVerticalGroup(
            freshmark1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(freshmark1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(freshmark1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(freshmark1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(freshmark1Layout.createSequentialGroup()
                        .addGroup(freshmark1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(mf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(freshmark1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(nf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(freshmark1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(ef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(freshmark1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NEWF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(364, 364, 364))
        );

        javax.swing.GroupLayout raw4Layout = new javax.swing.GroupLayout(raw4);
        raw4.setLayout(raw4Layout);
        raw4Layout.setHorizontalGroup(
            raw4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(freshmark1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        raw4Layout.setVerticalGroup(
            raw4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(freshmark1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        jPanel3.add(raw4, "card2");

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 1070, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       raw1.setVisible(true);
       raw2.setVisible(false);
       raw4.setVisible(false);
      
      
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        raw1.setVisible(false);
       raw2.setVisible(true);
       raw4.setVisible(false);
     
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       raw1.setVisible(false);
       raw2.setVisible(false);
       raw4.setVisible(true);
      
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void mfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mfActionPerformed

    private void NEWFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEWFActionPerformed

        double f1,f2, f3;
        f1=Double.valueOf(mf.getText());
        f2=Double.valueOf(nf.getText());
        f3=Double.valueOf(ef.getText());
        double s;
        s=f1+f2+f3;

        tfd.setText("" + s);
        lff.setText("" + (s)*0.968);
    }//GEN-LAST:event_NEWFActionPerformed

    private void ctt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctt12ActionPerformed
        double k1,l2;

        k1= Double.valueOf(tfd.getText());
        l2= Double.valueOf(up.getText());

        double h;
        h=k1*l2;

        ctt12.setText("" + h);
    }//GEN-LAST:event_ctt12ActionPerformed

    private void ctt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctt13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctt13ActionPerformed

    private void ctt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctt14ActionPerformed
     
          double f1;
           int  f2;
        f1=Double.valueOf(ct13.getText());
        f2=Integer.valueOf(ct15.getText());
       
        double s;
        s=f1+f2;
dbd.setText("" + s);
       
        
    }//GEN-LAST:event_ctt14ActionPerformed

    private void dbfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbfActionPerformed

    }//GEN-LAST:event_dbfActionPerformed

    private void tfdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdActionPerformed
      
    }//GEN-LAST:event_tfdActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/freshmark farm","root","");
            PreparedStatement ps= con.prepareStatement("insert into farmers(DATE,FNAME,LNAME,FNO,ACC,MORNING,NOON,EVN,TOTAL,PAID,BALANCE) values(?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1,mf.getText());
            ps.setString(2,nf.getText());
            ps.setString(3,ef.getText());
            ps.setString(4,tfd.getText());
            ps.setString(5,up.getText());
            ps.setString(6,ctt12.getText());
            ps.setString(7,ct13.getText());
            ps.setString(8,dbf.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "SAVED SUCCESFULLY");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(raw.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

    }//GEN-LAST:event_jButton13ActionPerformed

    private void lffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lffActionPerformed

    private void ctt12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctt12MouseClicked
    double k1, l2;
       
        k1= Double.valueOf(tfd.getText());
        l2= Double.valueOf(up.getText());

       double h;
        h=k1*l2;

        ct13.setText("" + h);
    }//GEN-LAST:event_ctt12MouseClicked

    private void ct13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ct13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ct13MouseClicked

    private void ct13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ct13ActionPerformed

    private void ctt14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctt14MouseClicked
     double k1,l2;
       
        k1= Double.valueOf(ct13.getText());
        l2= Double.valueOf(ct15.getText());

       double h;
        h=k1-l2;

       dbf .setText("" + h);
    }//GEN-LAST:event_ctt14MouseClicked

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfActionPerformed
        double f1,f2, f3;
        f1=Double.valueOf(mf.getText());
        f2=Double.valueOf(nf.getText());
        f3=Double.valueOf(ef.getText());
        double s;
        s=f1+f2+f3;
tf.setText("" + s);
        tfd.setText("" + s);
        lff.setText("" + (s)*0.968);
    }//GEN-LAST:event_tfActionPerformed

    private void NEWFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NEWFMouseClicked
         NEWFARMERS s = new NEWFARMERS();
        s.setVisible(true);
        
        
    }//GEN-LAST:event_NEWFMouseClicked

    private void frm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frm1ActionPerformed

    private void NEWF1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NEWF1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NEWF1MouseClicked

    private void NEWF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEWF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NEWF1ActionPerformed

    private void ctt15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctt15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ctt15MouseClicked

    private void ctt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctt15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctt15ActionPerformed

    private void ctt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctt16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctt16ActionPerformed

    private void ct16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ct16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ct16MouseClicked

    private void ct16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ct16ActionPerformed

    private void ctt17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctt17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ctt17MouseClicked

    private void ctt17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctt17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctt17ActionPerformed

    private void ct17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ct17ActionPerformed

    private void frtt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frtt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frtt1ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void tll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tll1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tll1ActionPerformed

    private void frt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frt2ActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mActionPerformed

    private void NEWF2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NEWF2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NEWF2MouseClicked

    private void NEWF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEWF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NEWF2ActionPerformed

    private void ctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctMouseClicked
         double c1;
        double c2;
        c1= Double.valueOf(td.getText());
        c2= Double.valueOf(up2.getText());

        double cash;
        cash=c1*c2;

        ctd.setText("" + cash);
    }//GEN-LAST:event_ctMouseClicked

    private void ctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctActionPerformed

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed
       
    }//GEN-LAST:event_cpActionPerformed

    private void ctdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ctdMouseClicked

    private void ctdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctdActionPerformed

    private void dbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dbMouseClicked

    private void dbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbActionPerformed
      
          double f1;
           int  f2;
        f1=Double.valueOf(ctd.getText());
        f2=Integer.valueOf(cpd.getText());
       
        double s;
        s=f1-f2;
dbd.setText("" + s);
    }//GEN-LAST:event_dbActionPerformed

    private void dbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbdActionPerformed
           double l,l2;
                   
        l= Double.valueOf(ctd.getText());
        l2=Double.valueOf(cpd.getText());
       
        double k;
        k=l2-l;

        dbd.setText("" + k);
    }//GEN-LAST:event_dbdActionPerformed

    private void tdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdActionPerformed
      double k1,l2;
       
        k1= Double.valueOf(m.getText());
        l2= Double.valueOf(n.getText());
       
        double h;
        h=k1+l2;

        tfd.setText("" + h);
    }//GEN-LAST:event_tdActionPerformed

    private void SAVEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEFActionPerformed
  try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/freshmark farm","root","");
            PreparedStatement ps= con.prepareStatement("insert into freshmark (DATE,FNAME,LNAME,FNO,ACC,MORNING,NOON,EVN,TOTAL,PAID,BALANCE) values(?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1,date2.getText());
            ps.setString(2,m.getText());
            ps.setString(3,n.getText());
            ps.setString(4,e.getText());
            ps.setString(5,td.getText());
            ps.setString(6,ctd.getText());
            ps.setString(7,cpd.getText());
            ps.setString(8,dbd.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "SAVED SUCCESFULLY");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(raw.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_SAVEFActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
      
    }//GEN-LAST:event_jButton17ActionPerformed

    private void tldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tldActionPerformed

    private void tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tActionPerformed
        double f1,f2, f3;
        f1=Double.valueOf(m.getText());
        f2=Double.valueOf(n.getText());
        f3=Double.valueOf(e.getText());
        double s;
        s=f1+f2+f3;

        td.setText("" + s);
        tld.setText("" + (s)*0.968);
    }//GEN-LAST:event_tActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    private void tMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMouseClicked
     double f1,f2, f3;
        f1=Double.valueOf(mf.getText());
        f2=Double.valueOf(nf.getText());
        f3=Double.valueOf(ef.getText());
        double s;
        s=f1+f2+f3;
t.setText("" + s);
        tfd.setText("" + s);
        lff.setText("" + (s)*0.968);
    }//GEN-LAST:event_tMouseClicked

    private void cpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpdActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new raw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NEWF;
    private javax.swing.JButton NEWF1;
    private javax.swing.JButton NEWF2;
    private javax.swing.JButton SAVEF;
    private javax.swing.JButton cp;
    private javax.swing.JTextField cpd;
    private javax.swing.JButton ct;
    private javax.swing.JTextField ct13;
    private javax.swing.JTextField ct15;
    private javax.swing.JTextField ct16;
    private javax.swing.JTextField ct17;
    private javax.swing.JTextField ct18;
    private javax.swing.JTextField ctd;
    private javax.swing.JButton ctt12;
    private javax.swing.JButton ctt13;
    private javax.swing.JButton ctt14;
    private javax.swing.JButton ctt15;
    private javax.swing.JButton ctt16;
    private javax.swing.JButton ctt17;
    private javax.swing.JTextField date;
    private javax.swing.JTextField date1;
    private javax.swing.JTextField date2;
    private javax.swing.JButton db;
    private javax.swing.JTextField dbd;
    private javax.swing.JTextField dbf;
    private javax.swing.JTextField e;
    private javax.swing.JTextField ef;
    private javax.swing.JTextField fre1;
    private javax.swing.JPanel freshmark1;
    private javax.swing.JPanel freshmark2;
    private javax.swing.JPanel freshmark3;
    private javax.swing.JTextField frm1;
    private javax.swing.JTextField frn1;
    private javax.swing.JButton frt2;
    private javax.swing.JTextField frtt1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField lff;
    private javax.swing.JTextField m;
    private javax.swing.JTextField mf;
    private javax.swing.JTextField n;
    private javax.swing.JTextField nf;
    private javax.swing.JPanel raw1;
    private javax.swing.JPanel raw2;
    private javax.swing.JPanel raw4;
    private javax.swing.JButton t;
    private javax.swing.JTextField td;
    private javax.swing.JButton tf;
    private javax.swing.JTextField tfd;
    private javax.swing.JTable tfresh;
    private javax.swing.JTable tfresh1;
    private javax.swing.JTable tfresh2;
    private javax.swing.JTextField tld;
    private javax.swing.JTextField tll1;
    private javax.swing.JTextField up;
    private javax.swing.JTextField up1;
    private javax.swing.JTextField up2;
    // End of variables declaration//GEN-END:variables
}
