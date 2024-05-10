package TrikiTrake;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Inicio extends javax.swing.JFrame {
    DefaultTableModel modelo;
    Jugador jugador1 = new Jugador("", "", Color.black);
    Jugador jugador2 = new Jugador("", "", Color.black);

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_botones = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbColor1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rbt3x3 = new javax.swing.JRadioButton();
        rbt4x4 = new javax.swing.JRadioButton();
        rbt5x5 = new javax.swing.JRadioButton();
        btnEmpezar = new javax.swing.JButton();
        cmbColor2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtJugador2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtJugador1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Datos Jugador 2");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Datos Jugador 1");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Elija su color ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Elija su color ");

        cmbColor1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbColor1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Rojo", "Verde", "Naranja" }));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Elije tu tablero");

        grupo_botones.add(rbt3x3);
        rbt3x3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbt3x3.setText("Tablero 3 X 3");

        grupo_botones.add(rbt4x4);
        rbt4x4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbt4x4.setText("Tablero 4 X 4");

        grupo_botones.add(rbt5x5);
        rbt5x5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbt5x5.setText("Tablero 5 X 5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbt4x4)
                            .addComponent(rbt3x3)
                            .addComponent(rbt5x5)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel6)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbt3x3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbt4x4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbt5x5)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnEmpezar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEmpezar.setText("Empezar juego");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });

        cmbColor2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbColor2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Rojo", "Verde", "Naranja" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Su ficha será X");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Su ficha será O");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Digite su nombre:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Digite su nombre:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbColor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(50, 50, 50)
                                .addComponent(cmbColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEmpezar)
                .addGap(92, 92, 92))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbColor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnEmpezar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Georgia", 2, 36)); // NOI18N
        jLabel1.setText("Bienvenido al Triki Trake savoir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        // TODO add your handling code here:
        if (txtJugador1.getText().isEmpty() || txtJugador2.getText().isEmpty() || grupo_botones.getSelection() == null) {
        JOptionPane.showMessageDialog(null, "Cuidado rey/reina, te faltan cositas");
    } else {
        if (rbt3x3.isSelected()) {
            String nombreJugador1 = txtJugador1.getText();
            Color colorJugador1 = obtenerColor((String) cmbColor1.getSelectedItem());
            String nombreJugador2 = txtJugador2.getText();
            Color colorJugador2 = obtenerColor((String) cmbColor2.getSelectedItem());
            jugador1.configurarJugador(jugador1, nombreJugador1, (String) cmbColor1.getSelectedItem(), jLabel2, jLabel9);
            jugador2.configurarJugador(jugador2, nombreJugador2, (String) cmbColor2.getSelectedItem(), jLabel4, jLabel10);
            TableroFRM3x3 tablero3x3 = new TableroFRM3x3(nombreJugador1, colorJugador1, nombreJugador2, colorJugador2);
            tablero3x3.setVisible(true);
            } else if (rbt4x4.isSelected()) {
            String nombreJugador1 = txtJugador1.getText();
            Color colorJugador1 = obtenerColor((String) cmbColor1.getSelectedItem());
            String nombreJugador2 = txtJugador2.getText();
            Color colorJugador2 = obtenerColor((String) cmbColor2.getSelectedItem());
            jugador1.configurarJugador(jugador1, nombreJugador1, (String) cmbColor1.getSelectedItem(), jLabel2, jLabel9);
            jugador2.configurarJugador(jugador2, nombreJugador2, (String) cmbColor2.getSelectedItem(), jLabel4, jLabel10);
            TableroFRM4x4 tablero4x4 = new TableroFRM4x4(nombreJugador1, colorJugador1, nombreJugador2, colorJugador2);
            tablero4x4.setVisible(true);
            } else if (rbt5x5.isSelected()) {
            String nombreJugador1 = txtJugador1.getText();
            Color colorJugador1 = obtenerColor((String) cmbColor2.getSelectedItem());
            String nombreJugador2 = txtJugador2.getText();
            Color colorJugador2 = obtenerColor((String) cmbColor2.getSelectedItem());
            jugador1.configurarJugador(jugador1, nombreJugador1, (String) cmbColor1.getSelectedItem(), jLabel2, jLabel9);
            jugador2.configurarJugador(jugador2, nombreJugador2, (String) cmbColor2.getSelectedItem(), jLabel4, jLabel10);
            TableroFRM5x5 tablero5x5 = new TableroFRM5x5(nombreJugador1, colorJugador1, nombreJugador2, colorJugador2);
            tablero5x5.setVisible(true); 
            }
        }
    }//GEN-LAST:event_btnEmpezarActionPerformed

    private Color obtenerColor(String colorSeleccionado) {
    switch (colorSeleccionado) {
        case "Azul":
            return Color.BLUE;
        case "Rojo":
            return Color.RED;
        case "Verde":
            return Color.GREEN;
        case "Naranja":
            return Color.ORANGE;
        default:
            return Color.BLACK;
    }
}
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JComboBox<String> cmbColor1;
    private javax.swing.JComboBox<String> cmbColor2;
    private javax.swing.ButtonGroup grupo_botones;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rbt3x3;
    private javax.swing.JRadioButton rbt4x4;
    private javax.swing.JRadioButton rbt5x5;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    // End of variables declaration//GEN-END:variables
}
