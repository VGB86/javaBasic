/*-----------------------------------------------------------------------------
 EJERCICIO 1 (Virgina 06-04-2021)                                             
EJERCICIOS DE PROGRAMACION ORIENTADA A OBJETOS:                              
-> PROGRAMA: Confeccionar una clase que permita carga el nombre y la edad 
             de una  persona. Mostrar los datos cargados. Crear un método 
             que imprime un  mensaje si es mayor de edad (edad>=18)       
------------------------------------------------------------------------------*/
package poopactica1;

import javax.swing.JOptionPane;

public class POOPactica1 {

    static Persona1 persona = new Persona1();

    public static void main(String[] args) {
        
        boolean error = true;

        do {
            try {
                persona.setNombre(JOptionPane.showInputDialog("Introduce el nombre"));
                persona.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Intruduce Edad")));
                imprirPersona();
                error = false;
            } catch (NumberFormatException e) {
                System.err.println("Error" + e.toString());
            }
        } while (error);

    }

    private static void imprirPersona() {
        System.out.println("La persona se llama " + persona.getNombre() + " ,su edad es de " + persona.getEdad() + " y  " + persona.mayorEdad());
    }

}
