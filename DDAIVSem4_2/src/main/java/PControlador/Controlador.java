package PControlador;

import GUI.vistaObs;
import LogNegocios.Redimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Controlador {
    private vistaObs vista;
    private ArrayList<Redimension> listaDatos;
    private DefaultListModel<String> modeloLista;

    public Controlador(vistaObs vista) {
        this.vista = vista;
        this.listaDatos = new ArrayList<>();
        this.modeloLista = new DefaultListModel<>();

        // Llenar la lista inicial (puedes agregar objetos reales)
        inicializarDatos();

        // Llenar la JList de la vista
        llenarJList();

        // Agregar listeners
        vista.addSeleccionarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionarElemento();
            }
        });

        vista.addSalirListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        vista.addLoginListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Volver al login (oculta esta ventana)
                vista.setVisible(false);
            }
        });
    }

    // Método para agregar algunos datos de ejemplo
    private void inicializarDatos() {
        listaDatos.add(new Redimension(10));
        listaDatos.add(new Redimension(25.5));
        listaDatos.add(new Redimension(7.2));
        listaDatos.add(new Redimension(100));

        // Llenar modeloLista con identificadores (por ejemplo el valor en metros)
        for (Redimension r : listaDatos) {
            modeloLista.addElement("Valor m: " + r.getNumero());
        }
    }

    // Llenar la JList de la vista
    private void llenarJList() {
        vista.llenarLista(modeloLista);
    }

    // Acción al seleccionar un elemento
    private void seleccionarElemento() {
        int indice = vista.getIndiceSeleccionado();
        if (indice >= 0 && indice < listaDatos.size()) {
            Redimension seleccionado = listaDatos.get(indice);
            vista.mostrarDatos(seleccionado);
        } else {
            System.out.println("No hay elemento seleccionado.");
        }
    }

    // Método para agregar un nuevo objeto Redimension desde otra parte
    public void agregarRedimension(Redimension r) {
        listaDatos.add(r);
        modeloLista.addElement("Valor m: " + r.getNumero());
        vista.llenarLista(modeloLista);
    }
}