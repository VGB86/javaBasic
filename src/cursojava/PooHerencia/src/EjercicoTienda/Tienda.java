/*------------------------------------------------------------------------------
 EJERCICIOS HERENCIA  VIRGINIA 
-> CLASE TIENDA - Propiedades: Identificador  Entero  Solo lectura  
                               CodigoPostal  Entero sólo escritura  
                               Ciudad  String sólo lectura,depende de los dos 
                                        primeros dígitos del C.Postal  
                               Dirección  String // Dinerocaja double
                - Métodos :
                        - tienda(identificador, dineroCaja)
                        - tienda(identificador),
                        - identificarCiudad()
                        - cambiarDireccion()
                        - addTarjeta()
                        - mostrarDatos() =!dineno 
                        - mostrarCajaYSaldo()
                        - cargarGasto()
                        - ventaEnEfectivo()
                        - ventaConTarjeta()
 -----------------------------------------------------------------------------*/
package EjercicoTienda;


public class Tienda {
    private int identificador;
    private int codigoPostal;
    private String ciudad;
    private String direccion;
    protected double dineroCaja;
    private String numTarjetaCredito;
    

    public Tienda(int codigoPostal, String direccion, double dineroCaja) {
        this.identificador = identificador;
        this.codigoPostal = codigoPostal;
        this.ciudad = identificarCiudad(codigoPostal);
        this.direccion = direccion;
        this.dineroCaja = dineroCaja;
        this.numTarjetaCredito = numTarjetaCredito;
    }
    
     public Tienda(int codigoPostal, String direccion) {
        this.identificador = identificador;
        this.codigoPostal = codigoPostal;
        this.ciudad = identificarCiudad(codigoPostal);
        this.direccion = direccion;
        this.dineroCaja = 0;
        this.numTarjetaCredito = numTarjetaCredito;
    }
    
    public int getIdentificador( ){
        return this.identificador;
    }
    
    public void setCodigoPostal(int pCodigoPostal ){
        this.codigoPostal = pCodigoPostal;
    }
      
    
    public String identificarCiudad(int codigoPostal){
        
        int num = codigoPostal/1000;
        String prefijo = Integer.toString(num);
                  
        switch(prefijo){
            case "01":
                this.ciudad = "Alava";
                break;
            case "02":
                this.ciudad = "Albacete";
                break;
            case "03":
                this.ciudad = "Alicante";
                break;
            case "04":
                this.ciudad = "Almeria";
                break;
            case "05":
                this.ciudad = "Ávila";
                break;
            case "06":
                this.ciudad = "Badajoz";
                break;
            case "07":
                this.ciudad = "Baleares";
                break;
            case "08":
                this.ciudad = "Barcelona";
                break;
            case "09":
                this.ciudad = "Burgos";
                break;
            case "10":
                this.ciudad = "Cáceres";
                break;
            case "11":
                this.ciudad = "Cádiz";
                break;
            default:
                break;
        }
        return ciudad;
    }
    
    public void cambiarCiudad(int pCodigoPostal){
        this.codigoPostal = pCodigoPostal;
        this.ciudad = identificarCiudad(pCodigoPostal);
    }
    public void cambiarDireccion(String pDireccion){
        this.direccion = pDireccion;
    }
    
    public void addTarjeta(String pNumTarjetaCredito) {
   
        if (pNumTarjetaCredito == this.numTarjetaCredito) {
            System.out.println("Este número de tarjeta ya existe");
        } else {
            this.numTarjetaCredito = pNumTarjetaCredito;
        }
    }
    
    public void mostrarDatos(){
    System.out.println("La tienda tiene el identificador " + this.identificador 
    + " /n dirección : " + this.direccion + "/n codigo postal " + this.codigoPostal + " - " +this.ciudad);

    }
    public void mostrarCajaYSaldo(){
     System.out.println("La tienda tiene el identificador " + this.identificador 
    + " /n y la caja tiene : " + this.dineroCaja);   
    }
            
            
    public void cargarGasto(double pGasto) throws Exception{
        if (dineroCaja > 0) {
            dineroCaja -= pGasto;
        }else{
           throw new Exception("No hay dinero en caja"); 
        } 
       
    }
    
    public void ventaEnEfectivo(double ventaEfectivo){
        dineroCaja += ventaEfectivo;
    }
    
    public void ventaConTarjeta(double ventaTarjeta){
        double comision = (ventaTarjeta /10);
        dineroCaja = ventaTarjeta - comision;
    }
}
       
