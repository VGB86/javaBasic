/*----------------------------------------------------------------------------
 EJERCICIOS DE PROGRAMACION ORIENTADA A OBJETOS:                               
    -> CUENTA  : Propiedades: [titular, cantidad]                             
                 Metodos    : [Cuenta(String titular)]                        
                              [Cuenta(String titular, double cantidad)]       
                              [getTitular()]  [setTitular(String titular)]    
                              [getCantidad()] [setCantidad(double cantidad)]  
                              [mostrarTitularYCuenta()]                       
                              [ingresar(double cantidad) throws Exception]    
                              [retirar(double cantidad)]                      
------------------------------------------------------------------------------*/
package poopractica2;


public class Cuenta {
    String titular;
    double cantidad;

    public Cuenta(String cTitular){
        titular = cTitular;
        cantidad = 0;
    }
    
    public Cuenta(String cTitular, double cCantidad){
        titular = cTitular;
        cantidad = cCantidad;
    }

    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
        
    }
    
    public void mostrarTitularYCuenta(){
        System.out.println("El titular de la cuenta es " + this.titular + " y el saldo es " + this.cantidad);
    }
    
      public void ingresar(double pCantidad) throws Exception{
        if (pCantidad < 0) {
            throw new Exception("Error número negativo");
        } else{
            this.cantidad += pCantidad;
        } 
    }

    public void retirar(double pCantidad){
        this.cantidad -= pCantidad;
        
        if (cantidad < 0) {
            setCantidad(0);
        }
    }

}
