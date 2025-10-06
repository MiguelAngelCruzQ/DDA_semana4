package PControlador;

import GUI.vistaForm;
import GUI.vistaLogin;
import GUI.vistaObs;
import LogNegocios.Estudiante;
import LogNegocios.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorLogin {
    private   final vistaLogin vista ;
    private final Usuario user;
    private final Estudiante estu;
    
    public ControladorLogin(vistaLogin vista, Usuario user, Estudiante estu) {
        this.vista = vista;
        this.user = user;
        this.estu = estu;
    this.vista.IngresarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            validarLogin();
            }
    });
     this.vista.SalirListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              salir();
            }
    });
    }
    private void validarLogin() {
    String usuario = vista.getUsuario().trim();
    String contra = vista.getContraseña().trim();
    String rol = vista.getRol().trim(); // Elimina espacios

    if (rol.equalsIgnoreCase("Docente")) { // Ignora mayúsculas/minúsculas
        if (usuario.equals(user.getNombre()) && contra.equals(user.getContraseña())) {
            vistaForm vist = new vistaForm(user, estu); // <-- pasamos los objetos
vist.setVisible(true);
vist.setLocationRelativeTo(null);
vista.dispose(); // cierra login
        } else {
            vista.mostrarMensaje("Usuario o contraseña del docente incorrectos");
        }
    } else if (rol.equalsIgnoreCase("Estudiante")) {
        if (usuario.equals(estu.getNombreE()) && contra.equals(estu.getContraseñaE())) {
            vistaObs vistaObs = new vistaObs();
            vistaObs.setVisible(true);
            vistaObs.setLocationRelativeTo(null);
            vista.dispose(); // Cierra el login
        } else {
            vista.mostrarMensaje("Usuario o contraseña del estudiante incorrectos");
        }
    } else {
        vista.mostrarMensaje("Seleccione un rol válido.");
    }
}
    private void salir() {
        System.exit(0);
    }
}

