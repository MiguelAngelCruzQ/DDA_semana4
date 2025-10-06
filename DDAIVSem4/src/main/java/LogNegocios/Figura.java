
package LogNegocios;

import java.awt.Graphics;

public abstract class Figura {
    int x;
    int y;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figura() {
    }
    public abstract void dibujar(Graphics g);
    public abstract  double hallarArea();
    public abstract  double hallarPerimetro();
    public abstract String getDatos();
}
