
package LogNegocios;

import java.awt.Color;
import java.awt.Graphics;

public class Triangulo extends Figura{
private double base ;
private double lado;
private double ladoDos;
    public Triangulo(double base,double lado,double ladoDos,int x, int y) {
        super(x, y);
        this.base = base;
        this.lado=lado;
        this.ladoDos=ladoDos;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLadoDos() {
        return ladoDos;
    }

    public void setLadoDos(double ladoDos) {
        this.ladoDos = ladoDos;
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
    double semi=(base+lado+ladoDos)/2;
return Math.sqrt(semi*(semi-base)*(semi-lado)*(semi-lado));
} 
@Override
public double hallarPerimetro(){
return (base +lado+ladoDos);
}
    @Override
public void dibujar(Graphics g) {
    int a = (int) base; // base
    int b = (int) lado;
    int c = (int) ladoDos;

    int[] xPoints = { x, x + a, x + (int)((b*b - c*c + a*a) / (2.0 * a)) };
    int[] yPoints = { y, y, y - (int)Math.sqrt(b*b - Math.pow((b*b - c*c + a*a)/(2.0*a), 2)) };

    g.setColor(Color.RED);
    g.drawPolygon(xPoints, yPoints, 3);
}
@Override
public String getDatos() {
    return "Base=" + base+
           ", Lado1=" + base + ", Lado2=" + lado + ", Lado3=" + ladoDos +
           " | Posición=(" + x + "," + y + ")";
}

    
}
