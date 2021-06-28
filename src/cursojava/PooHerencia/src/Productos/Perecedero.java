/*------------------------------------------------------------------------------
 EJERCICIOS HERENCIA  VIRGINIA 
-> CLASE PERECEDERO  - extends de: Productos. 
                     - Atributos: super productos + int diasACaducar
                     -  Métodos : @override calcular() 
 -----------------------------------------------------------------------------*/
package Productos;


public class Perecedero extends Productos{
    private int diasACaducar;

    public Perecedero(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }

    @Override
    public double calcular(int cantidad) {
        switch (diasACaducar){
            case 1 :
                super.precio /= 4;
                System.out.println("El producto tiene un descuento del 75%"); 
                break;
            case 2 :
                super.precio /= 3;
                System.out.println("El producto tiene un descuento del 67%"); 
                break;
            case 3 :
                super.precio /= 2;
                System.out.println("El producto tiene un descuento del 50%"); 
                break;
            default:
               break;
        }
        return super.calcular(cantidad);  
    }
    
    
}
