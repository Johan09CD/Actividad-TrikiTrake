package TrikiTrake;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;


public class TableroFRM4x4 extends javax.swing.JFrame {
    DefaultTableModel modelo;
    private String nombreJugador1;
    private String nombreJugador2;
    private Color colorJugador1;
    private Color colorJugador2;

    public TableroFRM4x4(String nombreJugador1, Color colorJugador1, String nombreJugador2, Color colorJugador2) {
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
        derechaVertical.setVisible(false);
        medioIzquierdaVertical.setVisible(false);
        medioDerechaVertical.setVisible(false);
        abajoHorizontal.setVisible(false);
        arribaHorizontal.setVisible(false);
        medioArribaHorizontal.setVisible(false);
        medioAbajoHorizontal.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        izquierdaVertical = new javax.swing.JPanel();
        derechaVertical = new javax.swing.JPanel();
        medioIzquierdaVertical = new javax.swing.JPanel();
        medioDerechaVertical = new javax.swing.JPanel();
        abajoHorizontal = new javax.swing.JPanel();
        arribaHorizontal = new javax.swing.JPanel();
        medioArribaHorizontal = new javax.swing.JPanel();
        medioAbajoHorizontal = new javax.swing.JPanel();
        diagonal1 = new javax.swing.JLabel();
        diagonal2 = new javax.swing.JLabel();
        btn00 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jpX = new javax.swing.JPanel();
        jlbJugador1 = new javax.swing.JLabel();
        jX = new javax.swing.JLabel();
        jpO = new javax.swing.JPanel();
        jO = new javax.swing.JLabel();
        jlbJugador2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setText("¡BUENA SUERTE!");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        izquierdaVertical.setBackground(new java.awt.Color(102, 255, 102));
        izquierdaVertical.setForeground(new java.awt.Color(102, 255, 102));
        izquierdaVertical.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(izquierdaVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 10, 350));

        derechaVertical.setBackground(new java.awt.Color(102, 255, 102));
        derechaVertical.setForeground(new java.awt.Color(102, 255, 102));
        derechaVertical.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(derechaVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 10, 350));

        medioIzquierdaVertical.setBackground(new java.awt.Color(102, 255, 102));
        medioIzquierdaVertical.setForeground(new java.awt.Color(102, 255, 102));
        medioIzquierdaVertical.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(medioIzquierdaVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 10, 350));

        medioDerechaVertical.setBackground(new java.awt.Color(102, 255, 102));
        medioDerechaVertical.setForeground(new java.awt.Color(102, 255, 102));
        medioDerechaVertical.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(medioDerechaVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 10, 350));

        abajoHorizontal.setBackground(new java.awt.Color(102, 255, 102));
        abajoHorizontal.setForeground(new java.awt.Color(102, 255, 102));
        abajoHorizontal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(abajoHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 330, 10));

        arribaHorizontal.setBackground(new java.awt.Color(102, 255, 102));
        arribaHorizontal.setForeground(new java.awt.Color(102, 255, 102));
        arribaHorizontal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(arribaHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 330, 10));

        medioArribaHorizontal.setBackground(new java.awt.Color(102, 255, 102));
        medioArribaHorizontal.setForeground(new java.awt.Color(102, 255, 102));
        medioArribaHorizontal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(medioArribaHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 330, 10));

        medioAbajoHorizontal.setBackground(new java.awt.Color(102, 255, 102));
        medioAbajoHorizontal.setForeground(new java.awt.Color(102, 255, 102));
        medioAbajoHorizontal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(medioAbajoHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 330, 10));

        diagonal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTrikiTrake/Diagonal2.png"))); // NOI18N
        jPanel1.add(diagonal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        diagonal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTrikiTrake/Captura de pantalla 2024-05-08 192157.png"))); // NOI18N
        jPanel1.add(diagonal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -30, 610, 470));

        btn00.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });
        jPanel1.add(btn00, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, 92, 92));

        btn10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel1.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 113, 92, 92));

        btn23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });
        jPanel1.add(btn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 211, 92, 92));

        btn22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        jPanel1.add(btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 211, 92, 92));

        btn21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        jPanel1.add(btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 211, 92, 92));

        btn20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        jPanel1.add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 211, 92, 92));

        btn33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });
        jPanel1.add(btn33, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 309, 92, 92));

        btn32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });
        jPanel1.add(btn32, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 309, 92, 92));

        btn30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });
        jPanel1.add(btn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 309, 92, 92));

        btn31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });
        jPanel1.add(btn31, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 309, 92, 92));

        btn13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        jPanel1.add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 113, 92, 92));

        btn12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        jPanel1.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 113, 92, 92));

        btn11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        jPanel1.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 113, 92, 92));

        btn03.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn03ActionPerformed(evt);
            }
        });
        jPanel1.add(btn03, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 15, 92, 92));

        btn01.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });
        jPanel1.add(btn01, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 15, 92, 92));

        btn02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn02, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 15, 92, 92));

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
                        .addGap(18, 18, 18))))
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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(169, 169, 169))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar4x4(Matriz, arribaHorizontal, 1, 0, 0);
        a.Rayar4x4(Matriz, izquierdaVertical, 5, 0, 0);
        a.Rayar4x4(Matriz, diagonal1, 9, 0, 0);
       
        if(a.Ejecutar4x4(btn00, 0, 0, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar4x4(Matriz, arribaHorizontal, 1, 0, 1);
        a.Rayar4x4(Matriz, medioIzquierdaVertical, 6, 0, 1);
        
        if(a.Ejecutar4x4(btn01, 0, 1, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        // TODO add your handling code here:
         Turnar();
        a.Rayar4x4(Matriz, arribaHorizontal, 1, 0, 2);
        a.Rayar4x4(Matriz, medioDerechaVertical, 7, 0, 2);
        
        if(a.Ejecutar4x4(btn02, 0, 2, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn03ActionPerformed
        // TODO add your handling code here: 
         Turnar();
        a.Rayar4x4(Matriz, arribaHorizontal, 1, 0, 3);
        a.Rayar4x4(Matriz, derechaVertical, 8, 0, 3);
        a.Rayar4x4(Matriz, diagonal2, 10, 0, 3);
        
        if(a.Ejecutar4x4(btn03, 0, 3, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn03ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
         Turnar();
         a.Rayar4x4(Matriz, medioArribaHorizontal, 2, 1, 0);
         a.Rayar4x4(Matriz, izquierdaVertical, 5, 1, 0);
         
         if(a.Ejecutar4x4(btn10, 1, 0, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
         Turnar();
         a.Rayar4x4(Matriz, medioArribaHorizontal, 2, 1, 1);
         a.Rayar4x4(Matriz, medioIzquierdaVertical, 6, 1, 1);
         a.Rayar4x4(Matriz, diagonal1, 9, 1, 1);
         
         if(a.Ejecutar4x4(btn11, 1, 1, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here: 
         Turnar();
         a.Rayar4x4(Matriz, medioArribaHorizontal, 2, 1, 2);
         a.Rayar4x4(Matriz, medioDerechaVertical, 7, 1, 2);
         a.Rayar4x4(Matriz, diagonal2, 10, 1, 2);
         
         if(a.Ejecutar4x4(btn12, 1, 2, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
         Turnar();
         a.Rayar4x4(Matriz, medioArribaHorizontal, 2, 1, 3);
         a.Rayar4x4(Matriz, derechaVertical, 8, 1, 3);
         
         if(a.Ejecutar4x4(btn13, 1, 3, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // TODO add your handling code here:
         Turnar();
         a.Rayar4x4(Matriz, medioAbajoHorizontal, 3, 2, 0);
         a.Rayar4x4(Matriz, izquierdaVertical, 5, 2, 0);
         
         if(a.Ejecutar4x4(btn20, 2, 0, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
         Turnar();
          a.Rayar4x4(Matriz, medioAbajoHorizontal, 3, 2, 1);
          a.Rayar4x4(Matriz, medioIzquierdaVertical, 6, 2, 1);
          a.Rayar4x4(Matriz, diagonal2, 10, 2, 1);
         
         if(a.Ejecutar4x4(btn21, 2, 1, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // TODO add your handling code here:
         a.Rayar4x4(Matriz, medioAbajoHorizontal, 3, 2, 2);
         a.Rayar4x4(Matriz, medioDerechaVertical, 7, 2, 2);
         a.Rayar4x4(Matriz, diagonal1, 9, 2, 2);
         
         if(a.Ejecutar4x4(btn22, 2, 2, Matriz, jX, jO)==1){
            Reiniciar();
        }
         Turnar();
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        // TODO add your handling code here:
         Turnar();
          a.Rayar4x4(Matriz, medioAbajoHorizontal, 3, 2, 3);
          a.Rayar4x4(Matriz, derechaVertical, 8, 2, 3);
         
         if(a.Ejecutar4x4(btn23, 2, 3, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        // TODO add your handling code here:
         Turnar();
         a.Rayar4x4(Matriz, abajoHorizontal, 4, 3, 0);
         a.Rayar4x4(Matriz, izquierdaVertical, 5, 3, 0);
         a.Rayar4x4(Matriz, diagonal2, 10, 3, 0);
         
         if(a.Ejecutar4x4(btn30, 3, 0, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        // TODO add your handling code here:
         Turnar();
         a.Rayar4x4(Matriz, abajoHorizontal, 4, 3, 1);
         a.Rayar4x4(Matriz, medioIzquierdaVertical, 6, 3, 1);
         
         if(a.Ejecutar4x4(btn31, 3, 1, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        // TODO add your handling code here:
        a.Rayar4x4(Matriz, abajoHorizontal, 4, 3, 2);
        a.Rayar4x4(Matriz, medioDerechaVertical, 7, 3, 2);
         
         if(a.Ejecutar4x4(btn32, 3, 2, Matriz, jX, jO)==1){
            Reiniciar();
        }
         Turnar();
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        // TODO add your handling code here:
         Turnar();
         a.Rayar4x4(Matriz, abajoHorizontal, 4, 3, 3);
         a.Rayar4x4(Matriz, derechaVertical, 8, 3, 3);
         a.Rayar4x4(Matriz, diagonal1, 9, 3, 3);
         
         if(a.Ejecutar4x4(btn33, 3, 3, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn33ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Inicio login = new Inicio();
        login.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

   int Matriz[][]= new int[4][4];
    public void Llenar(){
        for(int i = 0; i < 4; i++){
            for (int j = 0; j< 4; j++){
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
      btn10.setText("");
      btn10.setEnabled(true);
      btn11.setText("");
      btn11.setEnabled(true);
      btn12.setText("");
      btn12.setEnabled(true);
      btn13.setText("");
      btn13.setEnabled(true);
      btn20.setText("");
      btn20.setEnabled(true);
      btn21.setText("");
      btn21.setEnabled(true);
      btn22.setText("");
      btn22.setEnabled(true);
      btn23.setText("");
      btn23.setEnabled(true);
      btn30.setText("");
      btn30.setEnabled(true);
      btn31.setText("");
      btn31.setEnabled(true);
      btn32.setText("");
      btn32.setEnabled(true);
      btn33.setText("");
      btn33.setEnabled(true);
      
       diagonal1.setVisible(false);
       diagonal2.setVisible(false);
       izquierdaVertical.setVisible(false);
       derechaVertical.setVisible(false);
       medioIzquierdaVertical.setVisible(false);
       medioDerechaVertical.setVisible(false);
       abajoHorizontal.setVisible(false);
       arribaHorizontal.setVisible(false);
       medioArribaHorizontal.setVisible(false);
       medioAbajoHorizontal.setVisible(false);
     }   
  
    public static void main(String args[]) {
     
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
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
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
    private javax.swing.JPanel medioIzquierdaVertical;
    // End of variables declaration//GEN-END:variables
}
