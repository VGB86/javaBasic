/*------------------------------------------------------------------------------
 EJERCICIOS HERENCIA  VIRGINIA 
-> CLASE PERECEDERO  - extends de: Productos. 
                     - Atributos: super productos + String tipo
                     -  Métodos : @override calcular()
 -----------------------------------------------------------------------------*/
package Productos;


public class NoPerecedero extends Productos{
    
    private String tipo;

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public double calcular(int cantidad) {
        cantidad = (int) ((super.precio * cantidad)/2);
        return super.calcular(cantidad); 
    }
    
    
}
