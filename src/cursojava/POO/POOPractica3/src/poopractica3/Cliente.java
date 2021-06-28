/*------------------------------------------------------------------------------
EJERCICIO 3 POO
-> CUENTA  : Propiedades: [nombre, ciudad, fechaCompra, mesCompra]                           
             Métodos    : [Cliente]                                       
                          [Cliente(String nombre)]                         
                          [mostrar(String nombre, LocalDate fechaCompra)] 
                          [mostrar(String nombre, String ciudad)]   
------------------------------------------------------------------------------*/
package poopractica3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Cliente {
    private String nombreCliente;
    public String ciudadCliente;
    public Date fechaCompra;
    private String mesCompra;  
    
    Cliente(String pNombreCliente){
        nombreCliente = pNombreCliente;
        ciudadCliente = ""; //Ponemos una por defecto para poder modificar
        fechaCompra = Calendar.getInstance().getTime();
        mesCompra = parseMes();  
    }
    
    public void modificarCiudad(String pCiudadCliente){
        this.ciudadCliente = pCiudadCliente;
        System.out.println("Ciudad se modificó a " + ciudadCliente);
    }
    
    public String mostarNomYProvincia(){
        return "Cliente: "+ nombreCliente + ". Ciudad: " + ciudadCliente;
    }

    public String parseMes(){
        SimpleDateFormat formato = new SimpleDateFormat("MMMM");
        mesCompra= formato.format(fechaCompra); 
        //System.out.println(mesCompra);
        return mesCompra; 
    }
    
    public String mostrarNomYFecha(){
        return "Cliente: "+ nombreCliente + ". Fecha: " + fechaCompra;
    }
}
