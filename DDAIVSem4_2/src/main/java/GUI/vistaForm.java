package GUI;

import GUI.vistaLogin;
import LogNegocios.Estudiante;
import LogNegocios.Redimension;
import LogNegocios.Usuario;
import PControlador.ControladorLogin;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class vistaForm extends javax.swing.JFrame {
private final ArrayList<Redimension> listaRedimensiones;
private final Usuario user;
private final Estudiante estu;
    public vistaForm(Usuario user, Estudiante estu) {
        initComponents();
        this.user = user;
    this.estu = estu;
        listaRedimensiones = new ArrayList<>();
        
        // Agregar listeners internos
        btnCalcular.addActionListener(evt -> calcularConversion());
        btnGuardar.addActionListener(evt -> guardarRedimension());
        btnSalir.addActionListener(evt -> salir());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbldm = new javax.swing.JLabel();
        lblcm = new javax.swing.JLabel();
        lbldam = new javax.swing.JLabel();
        lblhm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 73, 108));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoRecortado.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sistema de calculo de conversion de numeros longitudinales");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setForeground(new java.awt.Color(51, 51, 255));

        btnCalcular.setText("Calcular");

        btnGuardar.setText("Guardar");

        btnSalir.setText("Salir");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingrese su numero en m :");

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("En cm :");

        jLabel5.setText("En dm:");

        jLabel6.setText("En dam:");

        jLabel7.setText("En hm:");

        lbldm.setText("dm");

        lblcm.setText("cm");

        lbldam.setText("dam");

        lblhm.setText("hm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbldm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbldam, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(lblhm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lbldm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblcm))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lbldam))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblhm))
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

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
public void SalirListener(java.awt.event.ActionListener listener){
    btnSalir.addActionListener(listener);
}

public void CalcularListener(java.awt.event.ActionListener listener){
    btnCalcular.addActionListener(listener);
}

public void GuardarListener(java.awt.event.ActionListener listener){
    btnGuardar.addActionListener(listener);
}
    public void calcularConversion() {
        try {
            double cantidad = Double.parseDouble(txtCantidad.getText().trim());
            Redimension red = new Redimension(cantidad);
            
            lblcm.setText(String.format("%.2f cm", red.redimension1()));
            lbldm.setText(String.format("%.2f dm", red.redimension2()));
            lbldam.setText(String.format("%.2f dam", red.redimension3()));
            lblhm.setText(String.format("%.2f hm", red.redimension4()));
            
        } catch (NumberFormatException ex) {
            mostrarMensaje("Ingrese un número válido en metros.");
        }
    }

    public void guardarRedimension() {
        try {
            double cantidad = Double.parseDouble(txtCantidad.getText().trim());
            Redimension red = new Redimension(cantidad);
            listaRedimensiones.add(red);
            mostrarMensaje("Número guardado correctamente.");
        } catch (NumberFormatException ex) {
            mostrarMensaje("Ingrese un número válido para guardar.");
        }
    }

    public void salir() {
        this.dispose(); // cierra la ventana actual
        // Crear nueva instancia del login y su controlador
    vistaLogin loginView = new vistaLogin();
    ControladorLogin controladorLogin = new ControladorLogin(loginView, user, estu);
    loginView.setVisible(true);
    loginView.setLocationRelativeTo(null);
}
    

    // Método para que otra vista (ej: estudiante) pueda acceder a los datos
    public ArrayList<Redimension> getListaRedimensiones() {
        return listaRedimensiones;
    }

    public void mostrarMensaje(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    // aquí irían todos los initComponents() y demás que ya tenías


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblcm;
    private javax.swing.JLabel lbldam;
    private javax.swing.JLabel lbldm;
    private javax.swing.JLabel lblhm;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
