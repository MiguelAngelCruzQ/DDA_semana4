

package com.mycompany.ddaivsem4_2;

import GUI.vistaLogin;
import LogNegocios.Estudiante;
import LogNegocios.Usuario;
import PControlador.ControladorLogin;


/**
 *
 * @author Minec
 */
public class DDAIVSem4_2 {

    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(()->{
          
          vistaLogin jframe = new vistaLogin();
          Usuario u = new Usuario("Alex","1234");
             Estudiante e = new Estudiante("Rodrigo","1234");
          new ControladorLogin(jframe, u, e);
          jframe.setVisible(true);
      jframe.setLocationRelativeTo(null);
      });
    }
}
