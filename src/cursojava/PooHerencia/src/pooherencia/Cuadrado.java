
package pooherencia;


public abstract class Cuadrado extends Figura{

    private double lado;
    
    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }
    @Override
    double dovolverArea() {
        double area = this.lado * this.lado;
        return area;
    }
    
}
