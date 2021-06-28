
package pooherencia;


public abstract class Circulo extends Figura{
    
    private double radio;
    
    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }
    
    @Override
    double dovolverArea() {
        double area = this.radio * this.radio;
        area*=3.14;
        return area;
    }
    
}
