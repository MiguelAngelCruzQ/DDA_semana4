package PControlador;

import GUI.vistaForm;
import GUI.vistaLogin;
import LogNegocios.Estudiante;
import LogNegocios.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorForm {
    private final vistaForm vista;
    private final Usuario user;
    private final Estudiante estu;
    public ControladorForm(vistaForm vista,Usuario user, Estudiante estu) {
        this.vista = vista;
        this.user = user;
        this.estu = estu;
        // Listener para el botón Salir
        this.vista.SalirListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volverALogin();
            }
        });

        // Listener para Calcular
        this.vista.CalcularListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.calcularConversion(); // Llama al método interno de la vista
            }
        });

        // Listener para Guardar
        this.vista.GuardarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.guardarRedimension(); // Llama al método interno de la vista
            }
        });
    }

    // Método que cierra esta ventana y abre el login
    private void volverALogin() {
        vista.dispose(); // cierra la ventana actual
      // Crear nueva instancia del login y su controlador
    vistaLogin loginView = new vistaLogin();
    ControladorLogin controladorLogin = new ControladorLogin(loginView, user, estu);
    loginView.setVisible(true);
    loginView.setLocationRelativeTo(null);
    }
}