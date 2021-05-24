/*----------------------------------------------------------------------------
EJERCICIO 1 
EJERCICIOS DE PROGRAMACIoN ORIENTADA A OBJETOS:                               
     -> PERSONA : Propiedades: [nombre, edad]                                  
                  Metodos    : [Persona(), getNombre(), setNombre(), getEdad(),
                               setEdad(), mayorEdad()]                        
------------------------------------------------------------------------------*/
package poopactica1;

/**
 *
 * @author virgi
 */
public class Persona1 {
    private String nombre;
    private int edad;

    public Persona1() {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String mayorEdad(){
        if (this.edad >= 18) {
            return  "es mayor de edad";
        } else{
            return "es menor de edad";
        }
    }
}
