
package LogNegocios;
public class Redimension {
    double numero;

    public Redimension(double numero) {
        this.numero = numero;
    }

    public Redimension() {
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    public double  redimension1(){
    return numero*0.01;
    }
     public double  redimension2(){
    return numero*0.001;
    }
      public double redimension3(){
     return numero*10;
    }
       public double redimension4(){
     return numero*100;
    }
}
