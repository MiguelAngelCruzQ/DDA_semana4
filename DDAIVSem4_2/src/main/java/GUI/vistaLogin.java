
package GUI;

import LogNegocios.Estudiante;
import LogNegocios.Usuario;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class vistaLogin extends javax.swing.JFrame {

    public vistaLogin() {
        initComponents();
        
    }

    public String getUsuario() {
    return txtUsuario1.getText().trim();
}

public String getContraseña() {
    return txtContraseña1.getText().trim();
}

public String getRol() {
    return (String) CbxRol1.getSelectedItem();
}

public void mostrarMensaje(String msg) {
    JOptionPane.showMessageDialog(this, msg);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        CbxRol = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContraseña1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        CbxRol1 = new javax.swing.JComboBox<>();
        btnIngresar1 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese su contraseña :");

        CbxRol.setBackground(new java.awt.Color(255, 255, 255));
        CbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Docente", "Estudiante" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Santa Maria Reina");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INICIAR SESION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 230, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("I.E.P Santa Maria Reina");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, 10));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seleccione su rol en la institucion :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Ingrese su Usuario :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        txtUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario1.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario1.setText("Usuario");
        txtUsuario1.setBorder(null);
        txtUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 290, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ingrese su contraseña :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        txtContraseña1.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña1.setForeground(new java.awt.Color(204, 204, 204));
        txtContraseña1.setText("Contraseña");
        txtContraseña1.setBorder(null);
        txtContraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseña1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 290, -1));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 300, 10));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 300, 10));

        CbxRol1.setBackground(new java.awt.Color(255, 255, 255));
        CbxRol1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Docente", "Estudiante" }));
        jPanel1.add(CbxRol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        btnIngresar1.setBackground(new java.awt.Color(153, 153, 255));
        btnIngresar1.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar1.setText("Ingresar");
        btnIngresar1.setBorder(null);
        btnIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 70, 20));

        btnSalir1.setBackground(new java.awt.Color(153, 153, 255));
        btnSalir1.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir1.setText("Salir");
        btnSalir1.setBorder(null);
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 70, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Santa Maria Reina");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Baner.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario1ActionPerformed

    private void txtContraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseña1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseña1ActionPerformed

    private void btnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresar1ActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir1ActionPerformed

//Actual
 public void IngresarListener(ActionListener listener){
     this.btnIngresar1.addActionListener(listener);
 }
public void SalirListener(ActionListener listener){
     this.btnSalir1.addActionListener(listener);
 }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxRol;
    private javax.swing.JComboBox<String> CbxRol1;
    private javax.swing.JButton btnIngresar1;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtContraseña1;
    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables
}
