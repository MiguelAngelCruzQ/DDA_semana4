package GUI;

import LogNegocios.Redimension;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class vistaObs extends javax.swing.JFrame {
private DefaultListModel<String> modeloLista;
private JList<String> listaDatos;
private ArrayList<Redimension> datos;  // Lista de objetos
private JPanel panelMostrar;
    public vistaObs() {
        initComponents();
        modeloLista = new DefaultListModel<>();
        listaDatos = new JList<>(modeloLista);
        JScrollPane scroll = new JScrollPane(listaDatos);
        jpanelJlist.setLayout(new GridLayout(1, 1));
        jpanelJlist.add(scroll);

        panelMostrar = new JPanel();
        panelMostrar.setLayout(new GridLayout(0, 1));
        JpanelMostrarDatos.setLayout(new GridLayout(1,1));
        JpanelMostrarDatos.add(panelMostrar);
    }
// Llena la JList visual con el modelo pasado desde el controlador
public void llenarLista(DefaultListModel<String> modelo) {
    modeloLista = modelo;
    listaDatos.setModel(modeloLista);
}

// Muestra los datos de un objeto Redimension en el panel de mostrarDatos
public void mostrarDatos(Redimension r) {
    panelMostrar.removeAll(); // Limpiar panel antes de mostrar
    panelMostrar.add(new JLabel("Valor original (m): " + r.getNumero()));
    panelMostrar.add(new JLabel("En cm: " + r.redimension1()));
    panelMostrar.add(new JLabel("En dm: " + r.redimension2()));
    panelMostrar.add(new JLabel("En dam: " + r.redimension3()));
    panelMostrar.add(new JLabel("En hm: " + r.redimension4()));
    panelMostrar.revalidate();
    panelMostrar.repaint();
}

// Permite obtener el índice seleccionado en la lista
public int getIndiceSeleccionado() {
    return listaDatos.getSelectedIndex();
}

// Permite obtener el valor seleccionado
public String getValorSeleccionado() {
    return listaDatos.getSelectedValue();
}

// Agregar listeners a los botones
public void addSeleccionarListener(java.awt.event.ActionListener al) {
    btnSeleccionar.addActionListener(al);
}

public void addSalirListener(java.awt.event.ActionListener al) {
    btnSalir.addActionListener(al);
}

public void addLoginListener(java.awt.event.ActionListener al) {
    btnLogin.addActionListener(al);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        JpanelMostrarDatos = new javax.swing.JPanel();
        jpanelJlist = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 73, 108));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoRecortado.png"))); // NOI18N

        btnSalir.setText("Salir");

        btnSeleccionar.setText("Seleccionar");

        btnLogin.setText("LogIn");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSeleccionar)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel1))))))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSeleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JpanelMostrarDatosLayout = new javax.swing.GroupLayout(JpanelMostrarDatos);
        JpanelMostrarDatos.setLayout(JpanelMostrarDatosLayout);
        JpanelMostrarDatosLayout.setHorizontalGroup(
            JpanelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        JpanelMostrarDatosLayout.setVerticalGroup(
            JpanelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpanelJlistLayout = new javax.swing.GroupLayout(jpanelJlist);
        jpanelJlist.setLayout(jpanelJlistLayout);
        jpanelJlistLayout.setHorizontalGroup(
            jpanelJlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        jpanelJlistLayout.setVerticalGroup(
            jpanelJlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpanelJlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JpanelMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpanelJlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpanelMostrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelMostrarDatos;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpanelJlist;
    // End of variables declaration//GEN-END:variables
}
