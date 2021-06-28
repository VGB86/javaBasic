
package arrays;

import java.util.Scanner;

/**
 *
 * @author virginia
 */
public class Arrays2 {
      ////// VARIABLES /////
    public static Scanner scan = new Scanner(System.in);
    
    //ejercicio 1
    public static int array1[][]= new int[4][5];
    public static int sumaParcial = 0;
    public static int sumaTotal = 0; 
    
    //Ejercicio 3
    public static int faltasJose = 0, faltasAna = 0, faltasSol = 0;
    public static String empleados[]= {"Jose", "Ana", "Sol"};
    public static int[][] faltas= new int[3][];
    
    //Ejercicio 5
    public static String alumnos[];
    
    
     
    public static void main(String[] args) {
        //Ejercicio1
        //unoCreaArray();
        
        //Ejercicio2
        //dosMatrizMarco();
        
        //Ejercicio3
        //tresMatrizEmpleados();
        
        //Ejercicio4
        //cuatroCalles();
        
        //Ejercicio5
        cincoAlumnos();
    }
    
    public static void unoCreaArray() {
        //1.Escribe un programa que tenga 20 números enteros. Estos números se deben introducir en un array
        //de 4 filas por 5 columnas, de tal forma que los números que se introducen en el array se generen 
        //de forma aleatoria (valores entre 0 y  1000) Math.random. El programa mostrara las sumas parciales 
        //de filas y la  suma total y el programa deberá dar la posición tanto del máximo como del  mínimo 
        
             
        //Introducimos valores en los indices
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                double n = Math.random()*(1 + 1000);
                array1[i][j]+=n;
                sumaParcial += n;
                sumaTotal += sumaParcial;
                if (j == 4) {
                    System.out.println("La suma paracial de fila " + ( i + 1) + " es: " + sumaParcial);
                   sumaParcial+=0;
                }
            }
        } 
        
        unoImprimeArray();
    }
    
    public static void unoImprimeArray(){
       System.out.println("");  
        
        for(int k = 0; k < 4; k++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array1[k][j]);
                System.out.print("-");
            }
            System.out.println("");  
        }
        System.out.println("");  
        System.out.println("Suma total = " + sumaTotal);
    }
    
    
     public static void dosMatrizMarco() {
        //2. Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben 
        //ser 0  salvo los de los bordes que deben ser 1.
        
        int array[][] = new int[8][6];
        
         for (int i = 0; i < 8; i++) {
             for (int j = 0; j < 6; j++) {
                 if (i == 0 || i == 7 || j == 0 || j ==5) {
                     array[i][j] += 1;
                     
                } else {
                    array[i][j] +=0;     
                }
            }
        }
         //IMPRIME
         for (int i = 0; i < 8; i++) {
             for (int j = 0; j < 6; j++) {
                 System.out.print(array[i][j]);
             }
             System.out.println("");
         }
     }
     
     public static void tresMatrizEmpleados() {
        //3. Crear un programa para saber los días que han faltado los 3 empleados de  una empresa.  
        //Definir un vector de 3 elementos de tipo String para cargar los nombres OK
        //y una  matriz irregular para cargar los días que han faltado cada empleado (cargar el  número de día que faltó)  OK
        //Cada columna de la matriz representan los días de cada empleado. OK
        //Mostrar los empleados con la cantidad de inasistencias.  OK
        //Cuál empleado que faltó menos días. OK
     
        Scanner teclado;
        String[] nombres;
        int[][] dias;

        teclado = new Scanner(System.in);
        nombres = new String[3];
        dias = new int[3][];
        for (int f = 0; f < nombres.length; f++) {
            System.out.print("Ingrese el nombre del empleado:");
            nombres[f] = teclado.next();
            System.out.print("Cuantas días faltó el empleado:");
            int faltas = teclado.nextInt();
            dias[f] = new int[faltas];
            for (int c = 0; c < dias[f].length; c++) {
                System.out.print("Ingrese nro de día:");
                dias[f][c] = teclado.nextInt();
            }
        }
        // inasistencias
        for (int f = 0; f < nombres.length; f++) {
            System.out.println(nombres[f] + " faltó " + dias[f].length + " días");
        }

        // empleadoMensosFaltas
        int faltas = dias[0].length;

        String nom = nombres[0];
        for (int f = 1; f < dias.length; f++) {
            if (dias[f].length < faltas) {
                faltas = dias[f].length;
                nom = nombres[f];
            }

        }
        System.out.println("El empleado que faltó menos es " + nom + " con " + faltas + " faltas.");
     }
        
    
     
     public static void cuatroCalles(){
        //4. Hacer un programa para controlar las calles y portales que tiene un pueblo  de tal forma que al usuario le preguntamos para cada calle el nombre
        //de la  misma y el número de portales y para cada portal el número de habitantes que  vive en él, sacando un resumen de las calles 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el número de calles:");
        int calles = sc.nextInt();
        
        int callejero[][]= new int[calles][];
        int portales;
        
        for(int i = 0 ; i < callejero.length; i++)
        {
            System.out.print("Introduce el número de portales de la calle " +(i+1)+ ":");
            portales = sc.nextInt();
            callejero[i] = new int[portales];
        }
        
        for(int i = 0 ; i < callejero.length; i++)
        {
            for(int j = 0 ; j < callejero[i].length; j++)
            {
                System.out.print("Introduce el número de personas del portal " + (j+1) + " de la calle " + (i+1) + " :");
                callejero[i][j] = sc.nextInt();
            }
        }
        
        String nombreCalles[] = new String[calles];
        Scanner sc1 = new Scanner(System.in);
        for(int i = 0 ; i < nombreCalles.length; i++)
        {
            System.out.print("Introduce el nombre de la calle " + (i+1) + " :");
            nombreCalles[i] = sc1.nextLine();
        }
        
        for(int i = 0 ; i < callejero.length ; i++)    
        {
            int totalCalle = 0;
            
            for(int j = 0 ; j < callejero[i].length ; j++)
            {
                totalCalle+= callejero[i][j];
                
            }
            
        System.out.println("La calle " + nombreCalles[i] + " tiene " + totalCalle + " personas");        
        }
     }
     
     
      public static void cincoAlumnos(){
        //5. Hacer un programa tipo consola, para la gestión de alumnos(String)tendrá un menú:  
        //a. Crear Matriz: pedir el número de elementos   OK
        //b. Rellenar los datos   OK
        //c. Saber tamaño del array  ok
        //d. Clonar el array en otro y mostrar el clonado  OK
        //e. Copiar una parte del array en otro, preguntando cuantos elementos y  desde donde empieza a copiar f. Ordenar el array  
        //g. Buscar un elemento
        
        
        System.out.println("Dime el número de alumnos");
        int alumnosNum = scan.nextInt();
        String alumnos[]= new String[alumnosNum];
        
            for (int i = 0; i < alumnosNum; i++) {
                System.out.println("Dime nombre de un alumnos");
                String nombre = scan.next();
                alumnos[i]= nombre;
            }
          
        ////// MÉTODOS ///////
        
        //cincoAlumnosLength();
        //cincoAlumnosClone();
        //cincoAlumnosCopyOfRange();
        //cincoAlumnosBinarySearch();
        
      }
      
      
      public static void cincoAlumnosLength(){
      
        System.out.println("El tamaño del array es de: " + alumnos.length); 
      }
      
      public static void cincoAlumnosClone(){
          
        String alumnosClon[] = alumnos.clone();
        System.out.print("Array Clon = "+ java.util.Arrays.toString(alumnosClon)); 
        
      }
        
      public static void cincoAlumnosCopyOfRange(){
          
        System.out.println("Cuántos elementos del array quieres copiar");
        int cantidadCopia = scan.nextInt();
          
        System.out.println("Desde dónde quieres empezar a copiar?");
        int inicioCopia = scan.nextInt();
        
        String alumnosRecorte[] = java.util.Arrays.copyOfRange(alumnos,  inicioCopia, cantidadCopia);
        System.out.println(java.util.Arrays.toString(alumnosRecorte));
        
        
      }
              
      public static void cincoAlumnosBinarySearch(){
        
        java.util.Arrays.sort(alumnos);
        
        System.out.println("Qué nombre quieres buscar?");
        String nombreBusqueda = scan.next();
        
        System.out.println(java.util.Arrays.binarySearch(alumnos, nombreBusqueda));
        
      }
}


