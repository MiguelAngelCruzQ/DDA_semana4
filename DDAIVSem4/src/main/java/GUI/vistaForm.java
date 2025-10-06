package GUI;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
public class vistaForm extends javax.swing.JFrame {
    private javax.swing.JPanel JpanelDibujo; 
    public vistaForm() {
        initComponents();
        // Creamos el panel de dibujo personalizado
         JpanelDibujo = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                if (figura != null) {
                    figura.dibujar(g);  // 👈 aquí dibuja la figura
                }
            }
            
        };
     JpanelDibujo.setBackground(java.awt.Color.WHITE);
        JpanelDibujo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        // Agregamos al jPanel1 usando AbsoluteConstraints
        jPanel1.add(JpanelDibujo, new AbsoluteConstraints(490, 60, 210, 210));

            }
public javax.swing.JPanel getPanelDibujo() { 
    return JpanelDibujo;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLado1 = new javax.swing.JLabel();
        LblLado2 = new javax.swing.JLabel();
        lblLado3 = new javax.swing.JLabel();
        txtLado1 = new javax.swing.JTextField();
        txtLado2 = new javax.swing.JTextField();
        txtLado3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbxFigura = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        lblLado1.setText("Ingrese lado 1 :");

        LblLado2.setText("Ingrese el lado 2:");

        lblLado3.setText("Ingrese el lado 3:");

        txtLado1.setBackground(new java.awt.Color(255, 255, 255));

        txtLado2.setBackground(new java.awt.Color(255, 255, 255));

        txtLado3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLado3)
                    .addComponent(LblLado2)
                    .addComponent(lblLado1))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLado1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(txtLado2)
                    .addComponent(txtLado3))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLado1)
                    .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblLado2)
                    .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLado3)
                    .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 290, 230));

        jPanel3.setBackground(new java.awt.Color(0, 73, 108));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoRecortado.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("I.E.P Santa Maria Reina");

        btnLimpiar.setBackground(new java.awt.Color(153, 153, 255));
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("limpiar campos");

        btnSalir.setBackground(new java.awt.Color(153, 153, 255));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");

        btnCalcular.setBackground(new java.awt.Color(153, 153, 255));
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular ");
        btnCalcular.setBorder(null);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 370));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Crear una nueva figura en px :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sistema calculador de perimetro y area de tres figuras:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 73, 108));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Resultados");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(66, 66, 66))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 230, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 10, 320));

        jLabel11.setText("Area:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 80, -1));

        jLabel12.setText("Perimetro:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 90, -1));

        jLabel13.setText("Datos:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 190, -1));

        jLabel14.setText("Imagen =1px/1 cm.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        cbxFigura.setBackground(new java.awt.Color(255, 255, 255));
        cbxFigura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Triangulo", "Cuadrado", "Circulo" }));
        jPanel1.add(cbxFigura, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularActionPerformed
    DecimalFormat cd = new DecimalFormat("0.00");
 
  public String getTipoSeleccionada() {
    return (String) cbxFigura.getSelectedItem();
}
public String getDato1Text() { return txtLado1.getText().trim(); }
public String getDato2Text() { return txtLado2.getText().trim(); }
public String getDato3Text() { return txtLado3.getText().trim(); }
public javax.swing.JLabel getLblLado1() { return lblLado1; }
public javax.swing.JLabel getLblLado2() { return LblLado2; }
public javax.swing.JLabel getLblLado3() { return lblLado3; }

public javax.swing.JTextField getTxtLado1() { return txtLado1; }
public javax.swing.JTextField getTxtLado2() { return txtLado2; }
public javax.swing.JTextField getTxtLado3() { return txtLado3; }

// listeners públicos (corrige los que tenías mal)
public void addCalcularListener(ActionListener l){ this.btnCalcular.addActionListener(l); }
public void addBorrarListener(ActionListener l){ this.btnLimpiar.addActionListener(l); } // jButton1 = limpiar
public void addSalirListener(ActionListener l){ this.btnSalir.addActionListener(l); }
public void addComboFiguraListener(ActionListener l){ this.cbxFigura.addActionListener(l); }
private LogNegocios.Figura figura;

public void setFigura(LogNegocios.Figura f) {
    this.figura = f;
    JpanelDibujo.repaint();  // dispara el repintado
}
// mostrar mensajes y resultados
public void mostrarMensaje(String msg){ javax.swing.JOptionPane.showMessageDialog(this, msg); }
public void setResultadoArea(double area) {
    jLabel11.setText("Área: " +cd.format(area) );
}

public void setResultadoPerimetro(double perimetro) {
    jLabel12.setText("Perímetro: " + cd.format(perimetro));
}

public void setDatosFigura(String datos) {
    jLabel13.setText("Datos: " + datos);
}
// 👉 Permiten que el controlador asocie un listener a los JTextField
public void addCampoLado1Listener(ActionListener l) { 
    this.txtLado1.addActionListener(l); 
}

public void addCampoLado2Listener(ActionListener l) { 
    this.txtLado2.addActionListener(l); 
}

public void addCampoLado3Listener(ActionListener l) { 
    this.txtLado3.addActionListener(l); 
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblLado2;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxFigura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblLado1;
    private javax.swing.JLabel lblLado3;
    private javax.swing.JTextField txtLado1;
    private javax.swing.JTextField txtLado2;
    private javax.swing.JTextField txtLado3;
    // End of variables declaration//GEN-END:variables
}
