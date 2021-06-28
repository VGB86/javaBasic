/*------------------------------------------------------------------------------
 EJERCICIOS HERENCIA  VIRGINIA 
-> CLASE PRODUCTOS - Propiedades: String Nombre, double Precio.  
                   - Super Clase de: Perecedero y No Perecedero.
                   - Métodos : Get()Set()de todos y calcular(int cantidad) 
 -----------------------------------------------------------------------------*/
package Productos;

public class Productos {

    private String nombre;
    protected double precio;

    public Productos() {
    }

    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double calcular(int cantidad){
        double total = cantidad * precio;
        return total;
    }
}
