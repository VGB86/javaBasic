/*------------------------------------------------------------------------------
 EJERCICIOS HERENCIA  VIRGINIA 
-> CLASE AMINISTRATIVO EXTENDS DE EMPLEADO
                       - Métodos :  
                              - calcularincentivo(); verDatos(Nombre y sueldo)
 -----------------------------------------------------------------------------*/
package Oficina;

import java.util.Date;

public class Administrativo extends Empleado{
    
    private String numBanco;
    private String nombreBanco;
    
    public Administrativo() {
        
    }
    
    public Administrativo(String nombre, String categoria, Date fechaAlta, double sueldo, String numCuenta) {
        super(nombre, categoria, fechaAlta, sueldo, numCuenta);
        this.numBanco = getnumBanco();
        this.nombreBanco = getNombreBanco();
    }
    public double calcularincentivo(int numHoras) {
        double incentivo = numHoras *15;  
        return incentivo;
    }

    @Override
    public String getnumBanco() {
        return super.getnumBanco(); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public String getNombreBanco() {
        return super.getNombreBanco(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void verDatos() {
        System.out.println("El empleado " + super.nombre + " tiene un sueldo de " + super.sueldo);
    }

    @Override
    public void mostrarEmpleado() {
        super.mostrarEmpleado(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
}
