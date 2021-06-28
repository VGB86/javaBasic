
package trycatch;

import java.util.Scanner;

public class TryCatch {
    
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Integer min = new Integer('3');
        
        try {
           System.out.println("Intentamos ejecutar bloque"); 
           System.out.println("Instruccion 1");
           int n = Integer.parseInt("hjasvf");
           Scanner scan = new Scanner(System.in);
           System.out.println("Dime unNúmero");
            
           int ma= Integer.parseInt(scan.nextLine());
           System.out.println("Instruccion 2");
           System.out.println("Instruccion 3");
           
        } catch (Exception e) {
            System.err.println("Error" +e.toString());
           
        }  System.out.println("Fin");

    }
    
    public static void tryUno() {

        /*Escribe un programa que cree un array de números, la cantidad de números se lo pediremos al usuario, ok
        lo rellenamos con random, (ok) y luego pedimos posición y devolvemos número del array según posición usando
        try catch y no vale usar ni if ni switch*/
        
        System.out.println("Dime la longitud del array");
        int var = scan.nextInt();
        int array[] = new int[var];

        for (int i = 0; i < array.length; i++) {
            int num = (int) (Math.random() * 1000);
            array[i] += num;
            System.out.println(array[i]);
        }

        System.out.println("");
        try {
            System.out.println("Qué posición del array quieres?");
            int posicion = scan.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array[posicion]) {
                    System.out.println(array[posicion]);
                }
            }

        } catch (Exception e) {
            System.err.println("Error" + e.toString());
        }
    }

    public static void tryDos() throws Exception {
       /* Crear un programa nuevo, en el main llamamos un método (OK) donde se 
        pide un string al usuario comprobar tamaño del string, 
        si es mayor de 4 devolver una excepcion y si es menor devolver el string introducido*/

        System.out.println("Escribe una palabra:");
        String palabra = scan.next();

        if (palabra.length() < 4) {
            System.out.println("La palabra es: " + palabra);
        } else if (palabra.length() > 4) {
            throw new Exception("La para debe ser menor de 4");
        }

    }
        
        
    
}
