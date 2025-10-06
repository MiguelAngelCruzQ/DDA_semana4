package PControlador;

import GUI.vistaForm;
import LogNegocios.*;

public class Controlador {
    private final vistaForm vista;
    private Figura figura;
    public Controlador(vistaForm v) {
        this.vista = v;
        // Listeners de botones y combo
        vista.addCalcularListener(e -> calcular());
        vista.addSalirListener(e -> salir());
        vista.addBorrarListener(e -> limpiar());
        vista.addComboFiguraListener(e -> actualizarCampos());
    }

    // 👉 Manejo del combo para mostrar/ocultar campos
    private void actualizarCampos() {
        String seleccion = vista.getTipoSeleccionada();

        switch (seleccion) {
            case "Cuadrado":
                vista.getLblLado1().setText("Lado:");
                vista.getTxtLado1().setVisible(true);

                vista.getLblLado2().setVisible(false);
                vista.getTxtLado2().setVisible(false);
                vista.getLblLado3().setVisible(false);
                vista.getTxtLado3().setVisible(false);
                break;

            case "Circulo":
                vista.getLblLado1().setText("Radio:");
                vista.getTxtLado1().setVisible(true);

                vista.getLblLado2().setVisible(false);
                vista.getTxtLado2().setVisible(false);

                vista.getLblLado3().setVisible(false);
                vista.getTxtLado3().setVisible(false);
                break;

            case "Triangulo":
                vista.getLblLado1().setVisible(true);
                vista.getLblLado1().setText("Base:");
                vista.getTxtLado1().setVisible(true);
                 vista.getLblLado2().setVisible(true);
                vista.getLblLado2().setText("Lado 2:");
                vista.getTxtLado2().setVisible(true);
                 vista.getLblLado3().setVisible(true);
                vista.getLblLado3().setText("Lado 3:");
                vista.getTxtLado3().setVisible(true);
                break;

            default:
                vista.getLblLado1().setVisible(false);
                vista.getTxtLado1().setVisible(false);
                vista.getLblLado2().setVisible(false);
                vista.getTxtLado2().setVisible(false);
                vista.getLblLado3().setVisible(false);
                vista.getTxtLado3().setVisible(false);
        }

        vista.revalidate();
        vista.repaint();
    }

    // 👉 Lógica de cálculo según la figura
    private void calcular() {
        try {
            String tipo = vista.getTipoSeleccionada();
            Figura figura = null;

            switch (tipo) {
                case "Cuadrado": {
                    double lado = Double.parseDouble(vista.getDato1Text());
                    figura = new Cuadrado(lado, 50, 50); // posición fija (50,50)
                    break;
                }
                case "Circulo": {
                    double radio = Double.parseDouble(vista.getDato1Text());
                    figura = new Circulo(radio, 80, 80); // radio y centro
                    break;
                }
                case "Triangulo": {
                    double base = Double.parseDouble(vista.getDato1Text());
                    double lado2 = Double.parseDouble(vista.getDato2Text());
                    double lado3 = Double.parseDouble(vista.getDato3Text());
                    figura = new Triangulo(base, lado2, lado3, 80, 80); // posición fija (80,80)
                    break;
                }
                default:
                    vista.mostrarMensaje("Seleccione una figura válida");
            }

            if (figura != null) {
                vista.setFigura(figura);
                vista.setResultadoArea(figura.hallarArea());
                vista.setResultadoPerimetro(figura.hallarPerimetro());
                vista.setDatosFigura(figura.getDatos());
                vista.repaint();
            }
        } catch (NumberFormatException ex) {
            vista.mostrarMensaje("Error: ingrese solo números");
        }
    }

    // 👉 Limpieza
    private void limpiar() {
        vista.setFigura(null);
        vista.setResultadoArea(0);
        vista.setResultadoPerimetro(0);
        vista.setDatosFigura("");
         vista.repaint();
    }

    // 👉 Salida
    private void salir() {
        System.exit(0);
    }
}

