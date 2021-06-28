/*------------------------------------------------------------------------------
 EJERCICIOS HERENCIA  VIRGINIA 
-> CLASE TIENDADISCOS - Propiedades: Zona que se encuentra string  
                                     Dinerocaja double
                - Métodos :
                        - cambiarDireccion(direccion, zonaTienda)
                        - mostrarDatos(direccion, direccion, zona,y dineroCaja)
                        - ventaEnEfectivo()
 -----------------------------------------------------------------------------*/
package EjercicoTienda;


public class TeindaDiscos extends Tienda{
    private String zona;
    private double cajaB;

    public TeindaDiscos(String zona){
        super.dineroCaja= dineroCaja;
        this.zona = zona;
        this.cajaB = cajaB;
    }

    
    public void cambiarDireccion(String pDireccion, String pZona) {
        super.cambiarDireccion(pDireccion); 
        this.zona = pZona;
    }

    @Override
    public void ventaEnEfectivo(double ventaEfectivo) {
        cajaB = ventaEfectivo/2;
        dineroCaja += (ventaEfectivo/2);
    }

}
