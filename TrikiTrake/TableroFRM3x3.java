package TrikiTrake;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;


public class TableroFRM3x3 extends javax.swing.JFrame {
    DefaultTableModel modelo;
    private String nombreJugador1;
    private String nombreJugador2;
    private Color colorJugador1;
    private Color colorJugador2;

    public TableroFRM3x3(String nombreJugador1, Color colorJugador1, String nombreJugador2, Color colorJugador2) {
        initComponents();
        this.nombreJugador1 = nombreJugador1;
        this.colorJugador1 = colorJugador1;
        this.nombreJugador2 = nombreJugador2;
        this.colorJugador2 = colorJugador2;
        jlbJugador1.setText(nombreJugador1);
        jlbJugador2.setText(nombreJugador2);
        jlbJugador1.setForeground(colorJugador1);
        jlbJugador2.setForeground(colorJugador2);
        
        Jugador jugador1 = new Jugador("", "", Color.black);
        Jugador jugador2 = new Jugador("", "", Color.black);
        Llenar();
        jpX.setBackground(Color.pink);
        jpO.setBackground(Color.cyan);
        diagonal1.setVisible(false);
        diagonal2.setVisible(false);
        izquierdaVertical.setVisible(false);
        medioVertical.setVisible(false);
        derechaVertical.setVisible(false);
        arribaHorizontal.setVisible(false);
        medioHorizontal.setVisible(false);
        abajoHorizontal.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        izquierdaVertical = new javax.swing.JPanel();
        medioVertical = new javax.swing.JPanel();
        derechaVertical = new javax.swing.JPanel();
        arribaHorizontal = new javax.swing.JPanel();
        medioHorizontal = new javax.swing.JPanel();
        abajoHorizontal = new javax.swing.JPanel();
        diagonal1 = new javax.swing.JLabel();
        diagonal2 = new javax.swing.JLabel();
        btn01 = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jpX = new javax.swing.JPanel();
        jlbJugador1 = new javax.swing.JLabel();
        jX = new javax.swing.JLabel();
        jpO = new javax.swing.JPanel();
        jO = new javax.swing.JLabel();
        jlbJugador2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        izquierdaVertical.setBackground(new java.awt.Color(102, 255, 102));
        izquierdaVertical.setForeground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout izquierdaVerticalLayout = new javax.swing.GroupLayout(izquierdaVertical);
        izquierdaVertical.setLayout(izquierdaVerticalLayout);
        izquierdaVerticalLayout.setHorizontalGroup(
            izquierdaVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        izquierdaVerticalLayout.setVerticalGroup(
            izquierdaVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel1.add(izquierdaVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 10, 220));

        medioVertical.setBackground(new java.awt.Color(102, 255, 102));
        medioVertical.setForeground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout medioVerticalLayout = new javax.swing.GroupLayout(medioVertical);
        medioVertical.setLayout(medioVerticalLayout);
        medioVerticalLayout.setHorizontalGroup(
            medioVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        medioVerticalLayout.setVerticalGroup(
            medioVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jPanel1.add(medioVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 10, 210));

        derechaVertical.setBackground(new java.awt.Color(102, 255, 102));
        derechaVertical.setForeground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout derechaVerticalLayout = new javax.swing.GroupLayout(derechaVertical);
        derechaVertical.setLayout(derechaVerticalLayout);
        derechaVerticalLayout.setHorizontalGroup(
            derechaVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        derechaVerticalLayout.setVerticalGroup(
            derechaVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jPanel1.add(derechaVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 52, 10, 210));

        arribaHorizontal.setBackground(new java.awt.Color(102, 255, 102));
        arribaHorizontal.setForeground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout arribaHorizontalLayout = new javax.swing.GroupLayout(arribaHorizontal);
        arribaHorizontal.setLayout(arribaHorizontalLayout);
        arribaHorizontalLayout.setHorizontalGroup(
            arribaHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        arribaHorizontalLayout.setVerticalGroup(
            arribaHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(arribaHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 270, 10));

        medioHorizontal.setBackground(new java.awt.Color(102, 255, 102));
        medioHorizontal.setForeground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout medioHorizontalLayout = new javax.swing.GroupLayout(medioHorizontal);
        medioHorizontal.setLayout(medioHorizontalLayout);
        medioHorizontalLayout.setHorizontalGroup(
            medioHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        medioHorizontalLayout.setVerticalGroup(
            medioHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(medioHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 270, 10));

        abajoHorizontal.setBackground(new java.awt.Color(102, 255, 102));
        abajoHorizontal.setForeground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout abajoHorizontalLayout = new javax.swing.GroupLayout(abajoHorizontal);
        abajoHorizontal.setLayout(abajoHorizontalLayout);
        abajoHorizontalLayout.setHorizontalGroup(
            abajoHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        abajoHorizontalLayout.setVerticalGroup(
            abajoHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(abajoHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 270, 10));

        diagonal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTrikiTrake/Diagonal2.png"))); // NOI18N
        jPanel1.add(diagonal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 270, 210));

        diagonal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTrikiTrake/Captura de pantalla 2024-05-08 192157.png"))); // NOI18N
        jPanel1.add(diagonal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, 240));

        btn01.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });
        jPanel1.add(btn01, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 29, 92, 82));

        btn00.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });
        jPanel1.add(btn00, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 29, 92, 82));

        btn02.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn02, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 29, 92, 82));

        btn12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        jPanel1.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 123, 92, 82));

        btn11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        jPanel1.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 123, 92, 82));

        btn22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        jPanel1.add(btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 211, 92, 82));

        btn21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        jPanel1.add(btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 211, 92, 82));

        btn10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel1.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 123, 92, 82));

        btn20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        jPanel1.add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 211, 92, 82));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setText("¡BUENA SUERTE!");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel5)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel2.setText("Nota: El sombreado rosado significa el jugador que tiene la oportunidad de marcar una casilla.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar3x3(Matriz, arribaHorizontal, 1, 0, 0);
        a.Rayar3x3(Matriz, izquierdaVertical, 4, 0, 0);
        a.Rayar3x3(Matriz, diagonal1, 7, 0, 0);
       
        
        if(a.Ejecutar3x3(btn00, 0, 0, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar3x3(Matriz, arribaHorizontal, 1, 0, 1);
        a.Rayar3x3(Matriz, medioVertical, 5, 0, 1);
        
        if(a.Ejecutar3x3(btn01, 0, 1, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        // TODO add your handling code here:
         Turnar();
        a.Rayar3x3(Matriz, arribaHorizontal, 1, 0, 2);
        a.Rayar3x3(Matriz, derechaVertical, 6, 0, 2);
        a.Rayar3x3(Matriz, diagonal2, 8, 0, 2);
        
        if(a.Ejecutar3x3(btn02, 0, 2, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
         Turnar();
        a.Rayar3x3(Matriz, medioHorizontal, 2, 1, 0); 
        a.Rayar3x3(Matriz, izquierdaVertical, 4, 1, 0);
        
        if(a.Ejecutar3x3(btn10, 1, 0, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar3x3(Matriz, medioHorizontal, 2, 1, 1);
        a.Rayar3x3(Matriz, medioVertical, 5, 1, 1);
        a.Rayar3x3(Matriz, diagonal1, 7, 1, 1);
        a.Rayar3x3(Matriz, diagonal1, 8, 1, 1);
        
        if(a.Ejecutar3x3(btn11, 1, 1, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar3x3(Matriz, medioHorizontal, 2, 1, 2);
        a.Rayar3x3(Matriz, derechaVertical, 6, 1, 2);
        
        if(a.Ejecutar3x3(btn12, 1, 2, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar3x3(Matriz, abajoHorizontal, 3, 2, 0);
        a.Rayar3x3(Matriz, izquierdaVertical, 4, 2, 0);
        a.Rayar3x3(Matriz, diagonal2, 8, 2, 0);
        
        if(a.Ejecutar3x3(btn20, 2, 0, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar3x3(Matriz, abajoHorizontal, 3, 2, 1);
        a.Rayar3x3(Matriz, medioVertical, 5, 2, 1);
        
        if(a.Ejecutar3x3(btn21, 2, 1, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // TODO add your handling code here:
        Turnar();
        a.Rayar3x3(Matriz, abajoHorizontal, 3, 2, 2);
        a.Rayar3x3(Matriz, derechaVertical, 6, 2, 2);
        a.Rayar3x3(Matriz, diagonal1, 7, 2, 2);
        
        if(a.Ejecutar3x3(btn22, 2, 2, Matriz, jX, jO)==1){
            Reiniciar();
        }
    }//GEN-LAST:event_btn22ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
       setVisible(false);
       Inicio login = new Inicio();
       login.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    
    int Matriz[][]= new int[3][3];
    public void Llenar(){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j< 3; j++){
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
      btn10.setText("");
      btn10.setEnabled(true);
      btn11.setText("");
      btn11.setEnabled(true);
      btn12.setText("");
      btn12.setEnabled(true);
      btn20.setText("");
      btn20.setEnabled(true);
      btn21.setText("");
      btn21.setEnabled(true);
      btn22.setText("");
      btn22.setEnabled(true);
      
       diagonal1.setVisible(false);
       diagonal2.setVisible(false);
       izquierdaVertical.setVisible(false);
       medioVertical.setVisible(false);
       derechaVertical.setVisible(false);
       arribaHorizontal.setVisible(false);
       medioHorizontal.setVisible(false);
       abajoHorizontal.setVisible(false);
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
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel derechaVertical;
    private javax.swing.JLabel diagonal1;
    private javax.swing.JLabel diagonal2;
    private javax.swing.JPanel izquierdaVertical;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jO;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jX;
    private javax.swing.JLabel jlbJugador1;
    private javax.swing.JLabel jlbJugador2;
    private javax.swing.JPanel jpO;
    private javax.swing.JPanel jpX;
    private javax.swing.JPanel medioHorizontal;
    private javax.swing.JPanel medioVertical;
    // End of variables declaration//GEN-END:variables
}
