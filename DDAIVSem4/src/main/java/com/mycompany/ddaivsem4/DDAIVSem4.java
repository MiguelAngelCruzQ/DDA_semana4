
package com.mycompany.ddaivsem4;

import GUI.vistaForm;
import PControlador.Controlador;
public class DDAIVSem4 {

    public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(()->{   
          vistaForm jframe = new vistaForm();
          new Controlador(jframe);
          jframe.setVisible(true);
      jframe.setLocationRelativeTo(null);
      });
    }
}
