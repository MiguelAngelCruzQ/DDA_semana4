
package LogNegocios;

public class Estudiante {
    private String nombreE;
    private String contraseñaE;

    public Estudiante(String nombreE, String contraseñaE) {
        this.nombreE = nombreE;
        this.contraseñaE = contraseñaE;
    }

    public Estudiante() {
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getContraseñaE() {
        return contraseñaE;
    }

    public void setContraseñaE(String contraseñaE) {
        this.contraseñaE = contraseñaE;
    }
    
}
