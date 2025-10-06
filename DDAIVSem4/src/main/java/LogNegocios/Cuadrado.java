
package LogNegocios;

import java.awt.Graphics;

public class Cuadrado extends Figura {
    private  double lado;

    public Cuadrado(double lado, int x, int y) {
        super(x, y);
        this.lado = lado;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
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
public double hallarArea(){
return (lado*lado);
}

    @Override
    public void dibujar(Graphics g) {
        int ladoInt = (int) lado;
    g.setColor(java.awt.Color.RED);  // Color visible
        g.drawRect(x, y, ladoInt, ladoInt);
     
   
    }

    @Override
    public double hallarPerimetro() {
     return (lado*4);
    }

    @Override
public String getDatos() {
    return "Lado=" + lado + " | Posición=(" + x + "," + y + ")";
}
    
}
