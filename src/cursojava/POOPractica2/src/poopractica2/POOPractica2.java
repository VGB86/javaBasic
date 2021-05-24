/*-----------------------------------------------------------------------------
EJERCICIO 2 (Virgina 06-04-2021)                                           
EJERCICIOS DE PROGRAMACION ORIENTADA A OBJETOS:                           
-> PROGRAMA:                                                              
    Tenemos una clase Cuenta que tendrá las siguientes propiedades: titular y 
    cantidad  (OK) El titular será obligatorio y la cantidad es opcional.     
    Crea dos constructores que  cumpla lo anterior. (ok)                      
    Crea sus métodos get, set y mostrar(titular y cantidad)  (OK)             
    Tendrá dos métodos especiales:                                            
    ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la     
    cantidad  introducida es negativa, lanzar una excepción y controlarla en  
    el objeto con try  catch retirar(double cantidad): se retira una cantidad 
    a la cuenta, si restando la  cantidad actual a la que nos pasan es        
    negativa, la cantidad de la cuenta pasa a  ser 0.                            
------------------------------------------------------------------------------*/
package poopractica2;

import javax.swing.JOptionPane;

public class POOPractica2 {

    static Cuenta cuentaUno;

    public static void main(String[] args) {

        crearCuenta();
        obtenerDatosCuenta();
        ingresarEfectivo();
        retirarEfectivo();    
    }

    public static void crearCuenta() {
        String titular = "";
        double saldo = 0;
        boolean error = true;

        //El titular es obligatorio. Leo hasta que se introduzca algo en titular
        //Pregunto por null para saber si se ha pulsado "cancelar"
        do {
            titular = JOptionPane.showInputDialog("Por favor ingresa el titular de la cuenta");
            if (titular == null) {
                titular = "";
            }
        } while (titular.isEmpty() || titular.equals(" "));

        //-------INGRESO DEL SALDO
        
        do {
            try {
                saldo = Double.parseDouble(JOptionPane.showInputDialog("Porfavor ingrese el saldo inicial de la cuenta"));
                error = false;
            } catch (NumberFormatException e) {//ingresa formato no valido
            } catch (NullPointerException e) {//Ingresa un contenido null
                saldo = 0;
                error = false;
            }
        } while (error);

        cuentaUno = new Cuenta(titular, saldo);
    }

    public static void obtenerDatosCuenta() {
        cuentaUno.mostrarTitularYCuenta();
    }

    public static void ingresarEfectivo() {
        boolean error = true;
        double monto = 0;

        do {
            try {
                monto = Double.parseDouble(JOptionPane.showInputDialog("Porfavor introduce la cantidad que desea ingresar en cuenta"));
                cuentaUno.ingresar(monto);
                error = false;
            } catch (Exception e) {
                System.err.println("Error: ingrese otro monto" );
            }
        } while (error);
        
        System.out.println("Se ha ingresado " + monto);
        cuentaUno.mostrarTitularYCuenta();
    }

    public static void retirarEfectivo() {
        boolean error = true;
        double monto = 0;
        
        do {            
            try {
                monto = Double.parseDouble(JOptionPane.showInputDialog("Indica cuánto dinero quieres retirar de la cuenta"));
                cuentaUno.retirar(monto);
                error = false;
            } catch (Exception e) {
                System.err.println("Error: ingrese otro monto" );
            }
        } while (error);
        
        System.out.println("Se ha retirado " + monto);
        cuentaUno.mostrarTitularYCuenta();
    }

}
