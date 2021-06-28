
package cursojava;

import java.util.Scanner;


public class Bucles {
    static Scanner scan = new Scanner(System.in);
    
     public static void buclesUno(){
       //1.Se trata de mostrar los números desde el 1 hasta el 100
       
       //Opcion 1
       int contador = 1;
        while ( contador <= 100) {            
            System.out.println(contador);
            contador++;
        }
       
        contador = 1;
        
        //Opcion 2
        do {            
            System.out.println(contador);
            contador++;
        } while (contador <= 100);
        
        //Opcion 3
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
       
     }
     
     public static void buclesDos(){
         //4. Escribir un programa que solicite ingresar 10 notas de alumnos y nos  informe 
       //cuántos tienen notas mayores o iguales a 7 y cuántos menores.
       int contador = 0;
       double mayorSiete = 0;
       double menorSiete = 0;
             
        
         do { 
            System.out.println("Ingresa la nota del alumno");
            int nota = scan.nextInt();
            if (nota >= 7) {
                mayorSiete++;
            } else {
                menorSiete++;
            }
            contador++;
             
         } while (contador > 10);
        
        System.out.println("Los alumnos con notas mayor o igual a 7 hay: " + mayorSiete + " y con menos " + menorSiete);
       
     }
     
     public static void buclesTres() {
        //5.Escribe un programa que lea una lista de diez números y determine cuántos son  positivos, y cuántos son negativos  
       
       
       int array [] = {1 ,2, 4, -5, -10, 8, 7, -12, 9, -40};
       
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 0) {
                System.out.println( array[i] + "  - Es positivo");
            }else {
                System.out.println( array[i] + "  - Es negativo");
            }
        }
        
    }
     
     public static void buclesCuatro() {
      //6. Realizar un programa que imprima 25 términos de la serie 
      //11 - 22 - 33 - 44,  etc. (No se ingresan valores por teclado)
       int contador = 1;
       int multiplo = 1;
       
        do {
            multiplo = contador * 11;   
            System.out.println(contador + ") " + multiplo);
            contador++;
        } while (contador <= 25); 
    }
     
     public static void buclesCinco(){
      //5. Crea una aplicación que dibuje una escalera de asteriscos. Nosotros le pasamos  
       //la altura de la escalera por teclado. Este es un ejemplo si insertaras un 5 de  altura: 
       
       System.out.println("Qué altura quieres que tenga la escalera?"); 
       int altura = scan.nextInt();
       String asterisco = "*";
       
       for (int i = 0; i < altura; i++) {
           System.out.print(asterisco);
           System.out.println("");
           asterisco+= "*";
       }
    }
     
    public static void buclesSeis(){
       /*6. Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los
       números  del 0-0-0-0-0 al 9-9-9-9-9, con la particularidad que cada vez que 
       aparezca un 3 lo  sustituya por una E.*/  
       
      for (int i = 0; i < 10; i++) {
            if (i == 3) {
              System.out.println( "E-E-E-E-E");
           } else {
           System.out.println(i + "-" + i + "-" +i + "-" + i + "-" + i);
           }
        } 
    }
    
    public static void buclesSiete() {
       /*Crear y cargar una tabla tamaño 2*3, el programa debe realizar lo siguiente:
        - solicitar al usuario por consola los datos de la tabla
        - imprimir por consola los datos de la tabla
        -sumar todas las filas y mostrar el resultado*/
       
        int[][] array = new int[2][3];
        int fila = 2;
        int columna = 3;
        int suma_parcial = 0, sumaTotal =0;
       
        //Ingresamos datos tabla
        for (int i = 0; i < fila; i++) {        
            for (int j = 0; j < columna; j++) {              
                System.out.println(" Ingresa valor el valor de Fila " + (i+1) + " Columna " + (j+1));
                array[i][j]= scan.nextInt();              
                //almacena
                suma_parcial += array[i][j];
               
                System.out.println("**** Suma parcial: " + suma_parcial);
            }
           
            sumaTotal = suma_parcial;
            System.out.println("");
            System.out.println("Suma total: " + sumaTotal);
        }
       
        //imprimir matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void buclesOcho() {
        for (int i = 0; i < 10; i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                System.out.print(c);
            }
            System.out.println("");
        }
    }
    
    public static void buclesNueve(){
          
        /*Realiza el control de acceso a una caja fuerte, la combinación será un número de cuatro cifras. El programa nos pedirá
        la combinación para abrirla. Si no acertamos, se nos muestra el mensaje "lo sineto, esa no es la combinacion "y si acertamos nos dice 
        nos dice "la caja fuerte se ha abierto satisfactoriamente". Tendremos 4 oportunidades para abrir la caja fuerte*/
       Scanner scan = new Scanner(System.in);
        int contador = 0;
        do {
            System.out.println("Ingresa la clave");
            int clave = scan.nextInt();

            if (clave / 10000 == 0) {
                System.out.println("la caja fuerte se ha abierto satisfactoriamente");
                contador = 4;
            } else {
                System.out.println("lo siento, esa no es la combinacion ");
                contador++;
            }

        } while (contador < 4);
    }
    
    public static void buclesDiez() {
        //Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 
        //(no sumar dicho valor, indica que ha finalizado la carga). 
        //Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero
        Scanner scan = new Scanner(System.in);
        int sumatoria = 0;
        int num = 0;
        
        do {            
            System.out.println("Ingresa un número");
            num = scan.nextInt();
            if (num == 0 || num > 0 || num < 0) {
                sumatoria += num;
                System.out.println("El numero acumulado es: " + sumatoria + " y el valor ingresado fue: " + num);
            }
            
        } while (num != 9999);
    }
    
    public void buclesOnce() {
         //escribe un "cuadro" de números usando un bucle while, dentro de un bucle for   
         
        for(int i = 0; i < 10; i++) {
            int contador2 = 0;
            while (contador2 < 10) {                
                System.out.print(i);
                contador2++;
            }
            System.out.println("");
        }
    }
}
