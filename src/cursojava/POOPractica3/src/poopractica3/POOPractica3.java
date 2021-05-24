/*------------------------------------------------------------------------------
EJERCICIO 3 DE PROGRAMACIÓN ORIENTADA A OBJETOS // VIRGINIA
->Programa: Clase Cliente
Propiedades  
    o Nombre del cliente propiedad de solo lectura  OK
    o Ciudad cliente  OK
    o Fecha compra  OK
    o Mes compra, propiedad de solo lectura devuelve el mes de la fecha de 
      la compra OK                   
Métodos:  
     Constructor pide nombre del cliente y lo asignamos a propiedad  OK
     Modificar ciudad, pedimos nombre y cambiamos la propiedad ciudad  OK
     Mostrar muestra nombre y provincia (sobrecarga) OK 
     Mostrar: muestra el nombre del cliente y fecha compra  OK 
------------------------------------------------------------------------------*/
package poopractica3;

import java.util.Scanner;

public class POOPractica3 {

    static Cliente clienteUno;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        crearCliente();
        modificarCiudad();
        imprimeNomYProvincia();
        imprimeNomYFecha();
    }

    public static void crearCliente() {
        String nombreCliente = "";

        do {
            try {
                System.out.println("Intriduce nombre del cliente");
                nombreCliente = scan.next();
                if (nombreCliente == null) {
                nombreCliente = "";
            }
            } catch (Exception e) {
                System.err.println("Error: " + e.toString());
            }
            

        } while (nombreCliente.isEmpty() ||  nombreCliente.isBlank());

        clienteUno = new Cliente("nombre");
    }

    public static void modificarCiudad() {
        String ciudadCliente = "";

        do {
            try {
                System.out.println("Dime ciudad la ciudad");
                ciudadCliente = scan.next();  
            } catch (Exception e) {
                System.err.println("Error: " + e.toString());
            }
        } while (ciudadCliente.isEmpty() || ciudadCliente.isBlank());

        clienteUno.modificarCiudad(ciudadCliente);
    }

    public static void imprimeNomYProvincia() {
        System.out.println(clienteUno.mostarNomYProvincia());
    }

    public static void imprimeNomYFecha() {
        System.out.println(clienteUno.mostrarNomYFecha());
    }
}
