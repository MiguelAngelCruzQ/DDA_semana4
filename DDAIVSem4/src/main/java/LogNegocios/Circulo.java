
package LogNegocios;

import java.awt.Graphics;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio,int x,int y) {
        super(x, y);
        this.radio=radio;
    }
    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
   

    @Override
    public void dibujar(Graphics g) {
       int diametro = (int) (radio * 2);
     g.setColor(java.awt.Color.RED);  // Color visible
       g.drawOval(x, y, diametro, diametro);
   
    }

    @Override
    public double hallarPerimetro() {
       return (radio*3.14*2);
    }
  @Override
    public double hallarArea() {
       return (radio*3.14*2);
    }
@Override
public String getDatos() {
    return "Radio=" + radio + " | Posición=(" + x + "," + y + ")";
}
   
}
