/*------------------------------------------------------------------------------
 EJERCICIOS HERENCIA  VIRGINIA 
-> CLASE EMPLEADO - Propiedades: String Nombre, String Categoría, 
                                 Date fechaAlta, double Sueldo,
                                 int numCuenta, int numBanco,String nombreBanco
                  - Métodos :
                        - empleado()
                        - empleado(fechaDeAlta),
                        - get y set de: Nombre, categoria, fecha y suelgo
                        - set : cuenta y almacena contructor.
                        - get : nombreBanco y almacena 
                        - comprubeaNumBanco()
                        - sueldo(); sueldo(int bono); sueldo(double impuestos)
                        - calcularincentivo()
                        - verDatos(nombre, categoria)
 -----------------------------------------------------------------------------*/
package Oficina;

import java.util.Calendar;
import java.util.Date;

public class Empleado {

    protected String nombre;
    private String categoria;
    private String nombreBanco;
    private Date fechaAlta;
    protected double sueldo;
    private String numCuenta;
    private String numBanco;

    //--------------------- CONTRUCTORES ------------------------------------//
    
    public Empleado() {
    	asignarFechaActua();
    }

    public Empleado(String nombre, String categoria, Date fechaAlta, double sueldo, String numCuenta) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.fechaAlta = fechaAlta;
        this.numCuenta = numCuenta;
        this.numBanco = getnumBanco();
        this.nombreBanco = getNombreBanco();
        
    }

    //------------GET y SET -----------------//
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    //--------------- CONTRUCTOR CON FECHA ASIGNADA AUTOMATICAMENTE-----------//
    
    private Date asignarFechaActua() {
        return Calendar.getInstance().getTime();
    }
    
    //--------------- CONTRUCTOR CON FECHA ASIGNADA AUTOM�TICAMENTE-----------//
    
    public String getnumCuenta(){
        return numCuenta;
    }
    
    //--------------- CONTRUCTOR NOMBRE DEL BANCO AUTOMATICOTICO-----------------//
    public String getnumBanco(){
        numBanco ="";
        String split[]= numCuenta.split("");
       
        for (int i = 0; i < split.length; i++) {
            if (i <= 3) {
                numBanco += split[i]; 
            }
        }
        
        return numBanco;
    }
    
    public String getNombreBanco(){
              
        switch (numBanco){
            case "0081" :
               nombreBanco = "Banco Sabadell";
               break;
            case "0049" :
                nombreBanco = "Banco Santander";
                break;
             case "0152": 
                nombreBanco = "Barclays";
                break;
            case "2100":
                nombreBanco = "Caixa Bank";
                break;
            case  "1465":
                nombreBanco = "Ing Direct";
            case  "0239":
                nombreBanco = "Evo Banco";
            default:
                System.err.println("Tu banco no est� en sistema");
                break;
               
        }
        return nombreBanco;
    }

    //------------------------- POLIMORFIMOS SUELDO()-------------------------//
    
    public void sueldo(){
        System.out.println("El sueldo de " + this.getNombre() + " es de " + this.getSueldo());
    }

    public void sueldo(int bono) {
        this.setSueldo(this.getSueldo() + bono);
        System.out.println("Tu sueldo con el bono ha quedado en " + this.getSueldo());
    }

    public double sueldo(double impuestos) {
        impuestos /= this.getSueldo();
        return impuestos;
    }

    //----------------------------- SOBRECARGA--------------------------------//
    
    public double calcularincentivo() {
        double incentivo = (this.getSueldo() / 10) + this.getSueldo();;
        return incentivo;
    }

    public void verDatos() {
        System.out.println("El nombre del empleado es " + getNombre() + " y su categor�a es " + getCategoria());
    }
    
     //-----------------------------MOSTRAR EMPLEADO--------------------------------//
    
    public void mostrarEmpleado(){
        System.out.print("*** EMPLEADO*****\nun Nombre: "+ this.nombre +"\nun Categoria:" + this.categoria +"\nun Banco:" + this.nombreBanco+"\nun Fecha de Alta:" + this.fechaAlta);
        System.out.println("\nun Sueldo: " + this.sueldo+"\nun Num de Cuenta " + this.numCuenta + "\n nombre Banco: " + this.nombreBanco);
    }
    
}
