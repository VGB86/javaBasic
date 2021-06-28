/* EJERCICIOS HERENCIA  VIRGINIA */
package Productos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Oficina.Administrativo;
import Oficina.Empleado;

public class PooHerencia {
    static Scanner scan = new Scanner(System.in);
    
    //PRODUCTOS:
    public static NoPerecedero panio;
    public static NoPerecedero gel;
    public static Perecedero apio;
    public static Perecedero queso;
    public static Perecedero tomate;
    
    //EMPLEADOS
    public static Empleado ana;
    public static Administrativo sol;
    
    
    public static void main(String[] args) {
        //***PRODUCTOS:
        //ejeProductos();
        
        //***EMPLEADOS
        //ejeEmpleado();
        
        
    }
    
    
    /**********************************UNO ************************************/
    
    
    
    public static void ejeProductos() {
    /*--------------------------------------------------------------------------
    Nos piden hacer que gestionemos una serie de productos.Los productos tienen
    Aributos:  
        o Nombre  
        o Precio  
    Tenemos dos tipos de productos:  
        o Perecedero: tiene un atributo llamado días a caducar  
        o No perecedero: tiene un atributo llamado tipo  
    Crea sus constructores, getters, setters.  
    Tendremos una función llamada calcular, que según cada clase hará una cosa
    u otra, a esta función le pasaremos un parámetro: la cantidad de  productos  
     En Producto, simplemente seria multiplicar el precio por la cantidad
        de productos pasados.  
     En Perecedero, aparte de lo que hace producto, el precio se reducirá
    según los días a caducar:  
        - Si le queda 1 día para caducar, se reducirá 4 veces el  
    precio final.  
        - Si le quedan 2 días para caducar, se reducirá 3 veces el  
    precio final.  
        - Si le quedan 3 días para caducar, se reducirá a la mitad de  
    su precio final.  
    En NoPerecedero, multiplicar el precio por la cantidad de  
    productos pasados y se divide por dos  
    En el main crear un array de productos y muestra el precio total de vender 
    5 productos de cada uno. Crea tú mismo los elementos del array.
    o Herencia:  
        o Clase Administrativo:  
        Herencia y sobrecarga:  
        Calcularincentivos sin embargo, los incentivos para el administrativo se
        calculan en base a un número de horas(nº horas por 15), se las paso en 
        la  firma del procedimiento  
        Herencia y sobreescritura de métodos: sobrescribimos el  método 
        VerDatos( ), devuelve Nombre y sueldo.
    --------------------------------------------------------------------------*/
   
    
        apio = new Perecedero("Apio Huelva", 1, 8);
        queso = new Perecedero("Cabra", 7.90, 3);
        tomate = new Perecedero("Cherry", 2.90, 2);
        gel = new NoPerecedero("Todo Limpio", 3.99, "higiene");
        panio = new NoPerecedero("Panio", 1.50, "limpieza");
    
        Productos misProductos[] = new Productos[4];
        misProductos[0]= apio;
        misProductos[1]= queso;
        misProductos[2]= tomate;
        misProductos[3]= gel;
        misProductos[4]= panio;
        
        
    }
    
    
    
    
    /**********************************DOS ************************************/
    
    
    
    public static void ejeEmpleado() {
//      crearEmpleado();
//      ana.mostrarEmpleado();
//      ana.verDatos();
      
      crearAdministrativo();
      sol.verDatos();
      sol.mostrarEmpleado();
    
    }
    
    public static void crearEmpleado(){
        Date miFecha = solicitarFecha();
        double sueldo = 1500.80;
        ana = new Empleado("Ana Gomez", "Contable", miFecha, sueldo, "0049529612345678");
    }
    
    
    public static Date solicitarFecha(){
        
        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
        String fecha = scan.next();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        Date fechaDate = null;
        
        try{
            //Al objeto DATE parseamos con el formato la fecha ingresada
            fechaDate = formato.parse(fecha);
            System.out.println("La fecha introducida es "+ fechaDate);
        } catch (Exception e){
            System.out.println("Formato invalido");
        }
         return fechaDate;
    }
    
    public static void crearAdministrativo(){
        Date miFecha = solicitarFecha();
        double sueldo = 2000.00;
        sol = new Administrativo("Sol Gomez", "Administrativo", miFecha, sueldo, "0049529612345698");
    }
    
    
    /**********************************TRES ***********************************/
    
    
     public static void ejeTienda(){
    /*--------------------------------------------------------------------------
    Nos creamos una clase Tienda que tenga como propiedades:  
    o Propiedades  
         Identificador  Entero  Solo lectura  
         CodigoPostal  Entero sólo escritura  
         Ciudad  String sólo lectura,depende de los dos primeros dígitos 
        del C.Postal  
         Dirección  String  
         Dinerocaja double  
    o Constructor  Creamos la propiedad identificador, en el constructor 
    tenemos que asignar un número a cada tienda , dinerocaja lo pongo a 0  
    o Constructor  asigno propiedad identificador igual que el anterior y 
    dinerocaja según me pasen 
    o Métodos:  
         Cambiar dirección  
         Añadir una tarjeta de crédito, comprobar que no existe, si existe 
        crear evento, con parámetro string  
         Mostrar Datos, muestro todos los datos de la tienda exceptodinero caja  
         Mostrar Datos muestro identificador y dinerocaja  
         Comprar pido dinero gastado en compras y lo resto a dinerocaja, si 
        dinero caja es 0 o menor que 0 excepcion  
         Vender añado el dinero ganado en la venta dinerocaja  
         Vender añado el dinero ganado en dinerocaja menos un 10% por la 
        venta por tarjeta  
    Clase hija: Tienda discos  
    o Propiedades  
         Zona que se encuentra string  
         Dinerocajab  double  
    o Métodos  
         Cambiar dirección sobrescribe el de la clase padre y cambia la 
        dirección y la zona de la tienda  
         Mostrar datos sobrecarga el anterior y muestra la dirección, zona y 
        dinerocaja 
         Vender sobrescribe los de la clase superior de tal manera que al 
        vender  añado la mitad a dinerocaja y la otra mitad a dinerocajab   
    --------------------------------------------------------------------------*/    
     }
}
