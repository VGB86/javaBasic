/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author virgi
 */
public class Arrays {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static void array1() {
        // crea un array numerico de 3 elemntos. Los números deben ser valores pedidos por teclado. 
        //Muestra por consola el índice el indice y el valor al que corresponde. 
        //Debes utilizar bucles tanto para pedir los valores de los elementos del array como para mostrar su contenido por pantalla

        int array[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Dime un numero");
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("El indice es" + i + " y el valor es " + array[i]);
        }

        System.out.println("Ingresa número por consola");
    }

    public static void array2() {
        /*Crear una matriz de 3 filas de tipo int, ingresar sus posiciones 
        y luego  imprimirlas con for each.*/
        int[][] matriz = {{1, 2, 3}, {2, 2, 3}, {4, 2, 1}};

        for (int[] i : matriz) {
            System.out.println(java.util.Arrays.toString(i));
        }

    }

   public static void array3()  {
        /*1. Realizar un programa que sirva para guardar los sueldos de 5 operarios en un array
        En un método pedimos sueldo  
        En otro método los mostramos  
        Termina mostrando la suma de los sueldos*/

        double sueldos[] = new double[5];
        double sumatoria = 0;

        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Ingresa sueldo de operario: ");
            sueldos[i] = scan.nextDouble();//almacenamos
        }

        for (int x = 0; x < sueldos.length; x++) {
            System.out.println("El " + (x + 1) + " sueldo es de: " + sueldos[x]);
            sumatoria += sueldos[x];// almacenamos totales
        }

        System.out.println("El total de los sueldos es de: " + sumatoria);

    }

    public static void array4() {
        /*
        2. Una empresa tiene dos turnos (mañana y tarde) en los que trabajan 8 
        (4 por  la mañana y 4 por la tarde)  
        Desarrollar un programa que permita almacenar los sueldos de los  empleados agrupados por turno.  
        Imprimir los gastos en sueldos de cada turno.*/

        double turnoManana[] = new double[4];
        double turnoTarde[] = new double[4];
        double sueldoManana = 0, sueldoTarde = 0;

        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("Ingresa el sueldo del empleado " + (j + 1) + " del turno de la tarde");
                    turnoTarde[j] = scan.nextDouble();
                    sueldoTarde += turnoTarde[j];
                }
            }

            System.out.println("Ingresa el sueldo del empleado " + (i + 1) + " del turno de la mañana");
            turnoManana[i] = scan.nextDouble();
            sueldoManana += turnoManana[i];
        }

        System.out.println("El total del sueldo de la mañana es de: " + sueldoManana + " y el de la tarde es de: " + sueldoTarde);

    }

     public static void array5(){
        //3. Se tienen las notas del primer parcial de los alumnos de dos cursos,Matemática y el Física, cada curso cuenta con 5 alumnos.  
        //Realizar un programa que muestre el curso que obtuvo el mayor general.  

        int mat[] = {5, 10, 7, 9, 6};
        int fisica[] = {8, 7, 7, 9, 6};
        int mayorM = 0, mayorF = 0;

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                for (int j = 0; j < 5; j++) {
                    mayorM += mat[j];
                }
            }
            mayorF += fisica[i];
        }

        if (mayorM < mayorF) {
            System.out.println("El myor general de fisica es mejor quu el de matemática");
        } else {
            System.out.println("El myor general de Matemáticas es mejor quu el de física");
        }
    }

     public static void array6() {
        /*4. Realizar un programa que defina un array de 5 componentes de tipo float 
        que representen las alturas de 5 personas.  
        Obtener el promedio de las mismas. Contar cuántas personas son más  altas 
        que el promedio y cuántas más bajas  */

        float altura[] = {1.53f, 1.68f, 1.82f, 1.79f, 1.56f};
        double promedio = 0;

        for (int i = 0; i < altura.length; i++) {
            promedio += altura[i];
        }

        promedio /= altura.length;

        int altas = 0;
        int bajas = 0;

        for (int j = 0; j < altura.length; j++) {
            if (altura[j] > promedio) {
                altas++;
            } else {
                bajas++;
            }
        }
        System.out.println("El promedio es de " + promedio + " personas con altura superior al promedio "
                + "hay " + altas + " y por debajo " + bajas);

    }
    
    public static String[] array7(){
        /*5. Definir un array donde almacenar los nombres de 5 personas, pedirlos los  
        nombres en una función que devuelva el nombre insertado al procedimiento  principal  */

        String persona[] = new String[5];

        for (int i = 0; i < persona.length; i++) {
            System.out.println("Introduce nombre");
            persona[i] = scan.next();
        }
        return persona;
    }

    public static void array8(){
        //Crear una matriz de 3 filas de tipo int, ingresar sus posiciones y luego  imprimirlas con for each.
        int[][] matriz = {{1, 2, 3}, {2, 2, 3}, {4, 2, 1}};

        for (int[] i : matriz) {
            System.out.println(java.util.Arrays.toString(i));
        }
    }

    public static void array9() {
        /*
        Confeccionaremos un programa que permita crear una matriz irregular 
        y luego imprimir la matriz en forma completa multidimensional
         */

        System.out.println("Dime qué número de final quiere");
        int var = scan.nextInt();
        int array[][] = new int[var][];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime qué números de columnas quieres que tenga la fila " + i);
            int var2 = scan.nextInt();
            array[i] = new int[var2];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }

}
