/*----------------------------------------------------------------------------*
EJERCICIOS DE POO:                               
    -> PERSONA  : Propiedades: [nombre, dni, edad, sexo, peso, altura]         
                 Metodos    : [Persona()]                                     
                              [Persona(String nombre)]                        
                              [getNombre()],[setNombre]                                    
                              [getDni()],[setDni]                                      
                              [getEdad()],[setEdad]                                                              
                              [getSexo()],[setSexo]           
                              [getPeso()],[setPeso(]                          
                              [getAltura()],[setAltura(double altura)]                      
                              [calcularImc()]                                  
                              [esMayorDeEdad()]                               
                              [toString()]                                    
                              [generaDni()]                                   
------------------------------------------------------------------------------*/
package poopractica4;

public class Persona4 {

    private String nombre;
    private String DNI;
    private int edad;
    private String genero;
    private double peso;
    private double altura;

    public Persona4(String pNombre){
        nombre = pNombre;
        DNI = generaDNI();
        peso = 0;
        altura =0;
        edad = 0;
        genero = "";
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC() {
        double pIdeal = peso / (altura * altura);
        if (pIdeal < 20) {
            System.out.println("Por debajo del peso ideal");
            return -1;
        } else if (pIdeal >= 20 && pIdeal <= 25) {
            System.out.println("Tu peso es idoneo");
            return 0;
        } else {
            System.out.println("Tienes sobrepeso");
            return 1;
        }
    }

    private String generaDNI() {
        int num = (int) (Math.random() * (100000000));
        String generaDNI = String.valueOf(num);
        generaDNI += "-p";
        return generaDNI;
    }

    public String toString() {
        return "Nombre:" + nombre + " - DNI: " + DNI + " - Edad: " + edad + " - Género: " + genero + " - Peso: " + peso + " - Altura: " + altura;

    }

    public  void comprobarGenero() {
        
    }
    public boolean esMayorDeEdad() {
        boolean mayorEdad = true;
        if (edad < 18) {
            mayorEdad = false;
        }
        return mayorEdad;
    }

}
