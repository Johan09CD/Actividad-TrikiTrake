package TrikiTrake;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;


public class TableroFRM5x5 extends javax.swing.JFrame {
    DefaultTableModel modelo;
     private String nombreJugador1;
    private String nombreJugador2;
    private Color colorJugador1;
    private Color colorJugador2;

    public TableroFRM5x5(String nombreJugador1, Color colorJugador1, String nombreJugador2, Color colorJugador2) {
        initComponents();
        this.nombreJugador1 = nombreJugador1;
        this.colorJugador1 = colorJugador1;
        this.nombreJugador2 = nombreJugador2;
        this.colorJugador2 = colorJugador2;
        jlbJugador1.setText(nombreJugador1);
        jlbJugador2.setText(nombreJugador2);
        jlbJugador1.setForeground(colorJugador1);
        jlbJugador2.setForeground(colorJugador2);
   
   
        Llenar();
        jpX.setBackground(Color.pink);
        jpO.setBackground(Color.cyan);
        diagonal1.setVisible(false);
        diagonal2.setVisible(false);
        izquierdaVertical.setVisible(false);
        medioIzquierdaVertical.setVisible(false);
        medioVertical.setVisible(false);
        medioDerechaVertical.setVisible(false);
        derechaVertical.setVisible(false);
        arribaHorizontal.setVisible(false);
        medioHorizontal.setVisible(false);
        medioArribaHorizontal.setVisible(false); 
        medioAbajoHorizontal.setVisible(false);
        abajoHorizontal.setVisible(false);
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        izquierdaVertical = new javax.swing.JPanel();
        medioIzquierdaVertical = new javax.swing.JPanel();
        medioVertical = new javax.swing.JPanel();
        medioDerechaVertical = new javax.swing.JPanel();
        derechaVertical = new javax.swing.JPanel();
        arribaHorizontal = new javax.swing.JPanel();
        medioArribaHorizontal = new javax.swing.JPanel();
        medioHorizontal = new javax.swing.JPanel();
        medioAbajoHorizontal = new javax.swing.JPanel();
        abajoHorizontal = new javax.swing.JPanel();
        diagonal1 = new javax.swing.JLabel();
        diagonal2 = new javax.swing.JLabel();
        btn02 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn04 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jpX = new javax.swing.JPanel();
        jlbJugador1 = new javax.swing.JLabel();
        jX = new javax.swing.JLabel();
        jpO = new javax.swing.JPanel();
        jO = new javax.swing.JLabel();
        jlbJugador2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        izquierdaVertical.setBackground(new java.awt.Color(102, 255, 102));
        izquierdaVertical.setForeground(new java.awt.Color(102, 255, 102));
        izquierdaVertical.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(izquierdaVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 10, 350));

        medioIzquierdaVertical.setBackground(new java.awt.Color(102, 255, 102));
        medioIzquierdaVertical.setForeground(new java.awt.Color(102, 255, 102));
        medioIzquierdaVertical.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(medioIzquierdaVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 10, 350));

        medioVertical.setBackground(new java.awt.Color(102, 255, 102));
        medioVertical.setForeground(new java.awt.Color(102, 255, 102));
        medioVertical.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(medioVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 10, 350));

        medioDerechaVertical.setBackground(new java.awt.Color(102, 255, 102));
        medioDerechaVertical.setForeground(new java.awt.Color(102, 255, 102));
        medioDerechaVertical.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(medioDerechaVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 10, 350));

        derechaVertical.setBackground(new java.awt.Color(102, 255, 102));
        derechaVertical.setForeground(new java.awt.Color(102, 255, 102));
        derechaVertical.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(derechaVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 10, 350));

        arribaHorizontal.setBackground(new java.awt.Color(102, 255, 102));
        arribaHorizontal.setForeground(new java.awt.Color(102, 255, 102));
        arribaHorizontal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(arribaHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 330, 10));

        medioArribaHorizontal.setBackground(new java.awt.Color(102, 255, 102));
        medioArribaHorizontal.setForeground(new java.awt.Color(102, 255, 102));
        medioArribaHorizontal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(medioArribaHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 330, 10));

        medioHorizontal.setBackground(new java.awt.Color(102, 255, 102));
        medioHorizontal.setForeground(new java.awt.Color(102, 255, 102));
        medioHorizontal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(medioHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 330, 10));

        medioAbajoHorizontal.setBackground(new java.awt.Color(102, 255, 102));
        medioAbajoHorizontal.setForeground(new java.awt.Color(102, 255, 102));
        medioAbajoHorizontal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(medioAbajoHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 330, 10));

        abajoHorizontal.setBackground(new java.awt.Color(102, 255, 102));
        abajoHorizontal.setForeground(new java.awt.Color(102, 255, 102));
        abajoHorizontal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(abajoHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 330, 10));

        diagonal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTrikiTrake/Diagonal2.png"))); // NOI18N
        jPanel1.add(diagonal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 260, 330));

        diagonal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTrikiTrake/Captura de pantalla 2024-05-08 192157.png"))); // NOI18N
        jPanel1.add(diagonal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, 350, 440));

        btn02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn02, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 21, -1, 70));

        btn12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        jPanel1.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 97, -1, 70));

        btn01.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });
        jPanel1.add(btn01, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 21, -1, 70));

        btn20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        jPanel1.add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 173, -1, 70));

        btn10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel1.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 97, -1, 70));

        btn11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        jPanel1.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 97, -1, 70));

        btn40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn40ActionPerformed(evt);
            }
        });
        jPanel1.add(btn40, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 325, -1, 70));

        btn41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn41ActionPerformed(evt);
            }
        });
        jPanel1.add(btn41, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 325, -1, 70));

        btn42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn42ActionPerformed(evt);
            }
        });
        jPanel1.add(btn42, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 325, -1, 70));

        btn31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });
        jPanel1.add(btn31, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 249, -1, 70));

        btn21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        jPanel1.add(btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 173, -1, 70));

        btn32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });
        jPanel1.add(btn32, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 249, -1, 70));

        btn03.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn03ActionPerformed(evt);
            }
        });
        jPanel1.add(btn03, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 21, -1, 70));

        btn24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });
        jPanel1.add(btn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 173, -1, 70));

        btn23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });
        jPanel1.add(btn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 173, -1, 70));

        btn13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        jPanel1.add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 97, -1, 70));

        btn04.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn04ActionPerformed(evt);
            }
        });
        jPanel1.add(btn04, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 21, -1, 70));

        btn34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn34ActionPerformed(evt);
            }
        });
        jPanel1.add(btn34, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 249, -1, 70));

        btn33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });
        jPanel1.add(btn33, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 249, -1, 70));

        btn22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        jPanel1.add(btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 173, -1, 70));

        btn00.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });
        jPanel1.add(btn00, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 21, -1, 70));

        btn30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });
        jPanel1.add(btn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 249, -1, 70));

        btn43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn43ActionPerformed(evt);
            }
        });
        jPanel1.add(btn43, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 325, -1, 70));

        btn14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        jPanel1.add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 97, -1, 70));

        btn44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn44ActionPerformed(evt);
            }
        });
        jPanel1.add(btn44, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 325, -1, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jlbJugador1.setBackground(new java.awt.Color(255, 255, 255));
        jlbJugador1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlbJugador1.setForeground(new java.awt.Color(255, 51, 51));
        jlbJugador1.setText("Jugador X");

        jX.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jX.setText("0");

        javax.swing.GroupLayout jpXLayout = new javax.swing.GroupLayout(jpX);
        jpX.setLayout(jpXLayout);
        jpXLayout.setHorizontalGroup(
            jpXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpXLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlbJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpXLayout.setVerticalGroup(
            jpXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpXLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jX, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbJugador1))
                .addContainerGap())
        );

        jO.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jO.setText("0");

        jlbJugador2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlbJugador2.setForeground(new java.awt.Color(51, 51, 255));
        jlbJugador2.setText("Jugador O");

        javax.swing.GroupLayout jpOLayout = new javax.swing.GroupLayout(jpO);
        jpO.setLayout(jpOLayout);
        jpOLayout.setHorizontalGroup(
            jpOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlbJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpOLayout.setVerticalGroup(
            jpOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbJugador2))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnVolver.setBackground(new java.awt.Color(153, 255, 153));
        btnVolver.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        btnVolver.setText("Volver al inicio");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jpX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jpX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jpO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver)
                .addGap(17, 17, 17))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 29, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel2.setText("Nota: El sombreado rosa significa el jugador que tiene la oportunidad de marcar una casilla.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setText("¡BUENA SUERTE!");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(169, 169, 169))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, arribaHorizontal, 1, 0, 0);
        a.Rayar5x5(Matriz, izquierdaVertical, 6, 0, 0);
        a.Rayar5x5(Matriz, diagonal1, 11, 0, 0);
        
        if(a.Ejecutar5x5(btn00, 0, 0, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, arribaHorizontal, 1, 0, 1);
        a.Rayar5x5(Matriz, medioIzquierdaVertical, 7, 0, 1);
        
        if(a.Ejecutar5x5(btn01, 0, 1, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, arribaHorizontal, 1, 0, 2);
        a.Rayar5x5(Matriz, medioVertical, 8, 0, 2);
        
        if(a.Ejecutar5x5(btn02, 0, 2, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn03ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, arribaHorizontal, 1, 0, 3);
        a.Rayar5x5(Matriz, medioDerechaVertical, 9, 0, 3);
        
        if(a.Ejecutar5x5(btn03, 0, 3, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn03ActionPerformed

    private void btn04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn04ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, arribaHorizontal, 1, 0, 4);
        a.Rayar5x5(Matriz, derechaVertical, 10, 0, 4);
        a.Rayar5x5(Matriz, diagonal2, 12, 0, 4);
        
        if(a.Ejecutar5x5(btn04, 0, 4, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn04ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, medioArribaHorizontal, 2, 1, 0);
        a.Rayar5x5(Matriz, izquierdaVertical, 6, 1, 0);
        
        if(a.Ejecutar5x5(btn10, 1, 0, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, medioArribaHorizontal, 2, 1, 1);
        a.Rayar5x5(Matriz, medioIzquierdaVertical, 7, 1, 1);
        a.Rayar5x5(Matriz, diagonal1, 11, 1, 1);
        
        if(a.Ejecutar5x5(btn11, 1, 1, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, medioArribaHorizontal, 2, 1, 2);
        a.Rayar5x5(Matriz, medioVertical, 8, 1, 2);
        
        if(a.Ejecutar5x5(btn12, 1, 2, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, medioArribaHorizontal, 2, 1, 3);
        a.Rayar5x5(Matriz, medioDerechaVertical, 9,1, 3);
        a.Rayar5x5(Matriz, diagonal2, 12, 1, 3);
        
        if(a.Ejecutar5x5(btn13, 1, 3, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, medioArribaHorizontal, 2, 1, 4);
        a.Rayar5x5(Matriz, derechaVertical, 10, 1, 4);
        
        if(a.Ejecutar5x5(btn14, 1, 4, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, medioHorizontal, 3, 2, 0);
        a.Rayar5x5(Matriz, izquierdaVertical, 6, 2, 0);
        
         if(a.Ejecutar5x5(btn20, 2, 0, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, medioHorizontal, 3, 2, 1);
        a.Rayar5x5(Matriz, medioIzquierdaVertical, 7, 2, 1);
        
         if(a.Ejecutar5x5(btn21, 2, 1, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, medioHorizontal, 3, 2, 2);
        a.Rayar5x5(Matriz, medioVertical, 8, 2, 2);
        a.Rayar5x5(Matriz, diagonal1, 11, 2, 2);
        a.Rayar5x5(Matriz, diagonal2, 12, 2, 2);
        
         if(a.Ejecutar5x5(btn22, 2, 2, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, medioHorizontal, 3, 2, 3);
        a.Rayar5x5(Matriz, medioDerechaVertical, 9, 2, 3);
        
         if(a.Ejecutar5x5(btn23, 2, 3, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, medioHorizontal, 3, 2, 4);
        a.Rayar5x5(Matriz, derechaVertical, 10, 2, 4);
        
         if(a.Ejecutar5x5(btn24, 2, 4, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, medioAbajoHorizontal, 4, 3, 0);
        a.Rayar5x5(Matriz, izquierdaVertical, 6, 3, 0);
        
        if(a.Ejecutar5x5(btn30, 3, 0, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, medioAbajoHorizontal, 4, 3, 1);
        a.Rayar5x5(Matriz, medioIzquierdaVertical, 7, 3, 1);
        a.Rayar5x5(Matriz, diagonal2, 12, 3, 1);
        
        if(a.Ejecutar5x5(btn31, 3, 1, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, medioAbajoHorizontal, 4, 3, 2);
        a.Rayar5x5(Matriz, medioVertical, 8, 3, 2);
        
        if(a.Ejecutar5x5(btn32, 3, 2, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, medioAbajoHorizontal, 4, 3, 3);
        a.Rayar5x5(Matriz, medioDerechaVertical, 9, 3, 3);
        a.Rayar5x5(Matriz, diagonal1, 11, 3, 3);
        
        if(a.Ejecutar5x5(btn33, 3, 3, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, medioAbajoHorizontal, 4, 3, 4);
        a.Rayar5x5(Matriz, derechaVertical, 10, 3, 4);
        
        if(a.Ejecutar5x5(btn34, 3, 4, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn34ActionPerformed

    private void btn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn40ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, abajoHorizontal, 5, 4, 0);
        a.Rayar5x5(Matriz, izquierdaVertical, 6, 4, 0);
        a.Rayar5x5(Matriz, diagonal2, 12, 4, 0);
        
        if(a.Ejecutar5x5(btn40, 4, 0, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn40ActionPerformed

    private void btn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn41ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, abajoHorizontal, 5, 4, 1);
        a.Rayar5x5(Matriz, medioIzquierdaVertical, 7, 4, 1);
        
        if(a.Ejecutar5x5(btn41, 4, 1, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn41ActionPerformed

    private void btn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn42ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, abajoHorizontal, 5, 4, 2);
        a.Rayar5x5(Matriz, medioVertical, 8, 4, 2);
        
        if(a.Ejecutar5x5(btn42, 4, 2, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn42ActionPerformed

    private void btn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn43ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, abajoHorizontal, 5, 4, 3);
        a.Rayar5x5(Matriz, medioDerechaVertical, 9, 4, 3);
        
        if(a.Ejecutar5x5(btn43, 4, 3, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn43ActionPerformed

    private void btn44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn44ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar5x5(Matriz, abajoHorizontal, 5, 4, 4);
        a.Rayar5x5(Matriz, derechaVertical, 10, 4, 4);
        a.Rayar5x5(Matriz, diagonal1, 11, 4, 4);
        
        if(a.Ejecutar5x5(btn44, 4, 4, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn44ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Inicio login = new Inicio();
        login.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    int Matriz[][]= new int[5][5];
    public void Llenar(){
        for(int i = 0; i < 5; i++){
            for (int j = 0; j< 5; j++){
                Matriz[i][j]=(j+10)*(i+10);
            }
        }
    }
  Juego a = new Juego(0, 0, 0);
   
  public void Turnar(){
      if(a.getTurno()==1){
          jpX.setBackground(Color.pink);
          jpO.setBackground(Color.cyan);
      }
      if(a.getTurno()==0){
          jpX.setBackground(Color.cyan);
          jpO.setBackground(Color.pink);
      }
  }
  
  public void Reiniciar(){
      Llenar();
      btn00.setText("");
      btn00.setEnabled(true);
      btn01.setText("");
      btn01.setEnabled(true);
      btn02.setText("");
      btn02.setEnabled(true);
      btn03.setText("");
      btn03.setEnabled(true);
      btn04.setText("");
      btn04.setEnabled(true);
      btn10.setText("");
      btn10.setEnabled(true);
      btn11.setText("");
      btn11.setEnabled(true);
      btn12.setText("");
      btn12.setEnabled(true);
      btn13.setText("");
      btn13.setEnabled(true);
      btn14.setText("");
      btn14.setEnabled(true);
      btn20.setText("");
      btn20.setEnabled(true);
      btn21.setText("");
      btn21.setEnabled(true);
      btn22.setText("");
      btn22.setEnabled(true);
      btn23.setText("");
      btn23.setEnabled(true);
      btn24.setText("");
      btn24.setEnabled(true);
      btn30.setText("");
      btn30.setEnabled(true);
      btn31.setText("");
      btn31.setEnabled(true);
      btn32.setText("");
      btn32.setEnabled(true);
      btn33.setText("");
      btn33.setEnabled(true);
      btn34.setText("");
      btn34.setEnabled(true);
      btn40.setText("");
      btn40.setEnabled(true);
      btn41.setText("");
      btn41.setEnabled(true);
      btn42.setText("");
      btn42.setEnabled(true);
      btn43.setText("");
      btn43.setEnabled(true);
      btn44.setText("");
      btn44.setEnabled(true);
      
      
       diagonal1.setVisible(false);
       diagonal2.setVisible(false);
       izquierdaVertical.setVisible(false);
       medioIzquierdaVertical.setVisible(false);
       medioVertical.setVisible(false);
       medioDerechaVertical.setVisible(false);
       derechaVertical.setVisible(false);
       arribaHorizontal.setVisible(false);
       medioHorizontal.setVisible(false);
       medioArribaHorizontal.setVisible(false); 
       medioAbajoHorizontal.setVisible(false);
       abajoHorizontal.setVisible(false);
     }   
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TableroFRM5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroFRM5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroFRM5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroFRM5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
          
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abajoHorizontal;
    private javax.swing.JPanel arribaHorizontal;
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn03;
    private javax.swing.JButton btn04;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel derechaVertical;
    private javax.swing.JLabel diagonal1;
    private javax.swing.JLabel diagonal2;
    private javax.swing.JPanel izquierdaVertical;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jO;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jX;
    private javax.swing.JLabel jlbJugador1;
    private javax.swing.JLabel jlbJugador2;
    private javax.swing.JPanel jpO;
    private javax.swing.JPanel jpX;
    private javax.swing.JPanel medioAbajoHorizontal;
    private javax.swing.JPanel medioArribaHorizontal;
    private javax.swing.JPanel medioDerechaVertical;
    private javax.swing.JPanel medioHorizontal;
    private javax.swing.JPanel medioIzquierdaVertical;
    private javax.swing.JPanel medioVertical;
    // End of variables declaration//GEN-END:variables
}
