/*------------------------------------------------------------------------------ 
EJERCICIO 4 POO: Virginia                 
-> PROGRAMA: Haz una clase llamada Persona con estas condiciones:         
             Sus atributos son:                                            
             - nombre, edad, sexo (H hombre, M mujer) comprobar y si no es H o 
              M lanzar excepciión, peso y altura;                  
             - Crear get y set, excepto y DNI nombre, que son de solo lectura                                                    *
             - Se implantarán dos constructores:                            
                 - Un constructor por defecto, vací­o;                        
                 - Un constructor que pida el nombre;                         
            Los métodos que se implementaran son:                    
             - calcularIMC(): calculara si la persona esta en su peso ideal 
             (peso en kg/(altura^2 en m)), si esta fórmula devuelve un valor 
             menor que 20, la función devuelve un -1, si devuelve un número
             entre 20 y 25 (incluidos), significa que esta por debajo de su 
             peso ideal la función devuelve un 0 y si devuelve un valor mayor
             que 25 significa que tiene sobrepeso, la función devuelve un 1; 
             Te recomiendo que uses constantes para devolver estos valores;          
            - esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano;                                                  *
            - toString(): devuelve toda la información del objeto;       
            - generaDNI(): genera un nÃºmero aleatorio de 8 cifras,genera a 
            partir de este su número su letra correspondiente (no hace falta 
            nada raro como buscar la letra, solo crear un numero de 8 cifras);
            Este método será privado e invocado cuando se construya el objeto;                    *
            Ahora, en el main que haga lo siguiente;                      
                - Crea 3 objetos de la clase anterior, para cada objeto,      
                  deberá comprobar si esta en su peso ideal, tiene sobrepeso  
                  o por debajo de su peso ideal con un mensaje;               
                - Indicar para cada objeto si es mayor de edad;               
                - Por último, mostrar la información de cada objeto;          
                - Si os atrevéis crear un array de personas de 4 objetos y    
                  recorrerlos con un for each                                 
-------------------------------------------------------------------------------*/
package poopractica4;

import java.util.Scanner;

public class POOPractica4 {

    static Scanner scan = new Scanner(System.in);
    static String nombrePersona = "";
    static String personaGenero = "";
    static double alturaPersona = 0;
    static double pesoPersona = 0;
    static int edadPersona = 0;
    static Persona4 arrayPersonas[]= new Persona4[4];

    public static void main(String[] args) {

        crearPersona();
        mostrarDatos();
    }

    public static void crearPersona() {

        nombrePersona = comprobarNombre();
        edadPersona = comprobarEdad();
        alturaPersona = comprobarAltura();
        pesoPersona = comprobarPeso();
        personaGenero = comprobarGenero();
        
        /*Como solo podemos meter el nombre por parámetro el resto de las 
        propiedades las metemos por set. */     
        for (int i = 0; i < arrayPersonas.length; i++) {
            arrayPersonas[i]= new Persona4(nombrePersona);
            arrayPersonas[i].setAltura(alturaPersona);
            arrayPersonas[i].setEdad(edadPersona);
            arrayPersonas[i].setGenero(personaGenero);
            arrayPersonas[i].setEdad(edadPersona);
        }
    }

    public static String comprobarNombre() {
        do {
            try {
                System.out.println("Dime tu nombre");
                nombrePersona = scan.next();
            } catch (Exception e) {
                System.err.println("Error" + e.toString());
            }
        } while (nombrePersona.isEmpty() || nombrePersona.isBlank());

        return nombrePersona;
    }

    public static int comprobarEdad() {
        do {
            try {
                System.out.println("Dime tu edad");
                edadPersona = scan.nextInt();
            } catch (NumberFormatException e) {
            } catch (NullPointerException e) {
                edadPersona = 0;
                System.err.println("Error" + e.toString());
            }
        } while (edadPersona == 0);

        return edadPersona;
    }

    public static double comprobarAltura() {
        do {
            try {
                System.out.println("Dime tu altura");
                alturaPersona = scan.nextInt();
            } catch (NumberFormatException e) {
            } catch (NullPointerException e) {
                alturaPersona = 0;
                System.err.println("Error" + e.toString());
            }
        } while (alturaPersona == 0);

        return alturaPersona;
    }

    public static double comprobarPeso() {
        do {
            try {
                System.out.println("Dime tu peso");
                pesoPersona = scan.nextInt();
            } catch (NumberFormatException e) {
            } catch (NullPointerException e) {
                pesoPersona = 0;
                System.err.println("Error" + e.toString());
            }
        } while (pesoPersona == 0);

        return pesoPersona;
    }

    public static String comprobarGenero() {
        
        boolean error = true;
        do {
            try {
                System.out.println("Dime tu genero");
                personaGenero = scan.next();
                if (personaGenero != "hombre" && personaGenero != "mujer") {
                    throw new Exception("Genero debe ser hombre o mujer");
                } else{
                    error = false;
                    return personaGenero;
                }
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        } while (true);
       
    }

    public static void mostrarDatos() {
        for (Persona4 i : arrayPersonas) {
                 System.out.println("==========");
                //Booleado mayor edad
                    System.out.println(i + " es mayor de edad? " + i.esMayorDeEdad());
                //IMC
                    i.calcularIMC();                  
                //Muestra el objeto
                   i.toString();
        }
    }

}
