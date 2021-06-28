
package arrays;

import java.util.Scanner;

public class Arrays3 {
     
    public static Scanner scan = new Scanner(System.in);
    
    protected void unoArray() {
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

    protected void dosArray() {
        /*2. Una empresa tiene dos turnos (mañana y tarde) en los que trabajan 8 (4 por  la mañana y 4 por la tarde)  
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

    protected void tresArray() {
        /*3. Se tienen las notas del primer parcial de los alumnos de dos cursos,Matemática y el Física, cada curso cuenta con 5 alumnos.  
        Realizar un programa que muestre el curso que obtuvo el mayor general.*/  

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
    
    
    protected  void cuatroArray(){
        /*4. Realizar un programa que defina un array de 5 componentes de tipo float  que representen las alturas de 5 personas.  
        Obtener el promedio de las mismas. Contar cuántas personas son más  altas que el promedio y cuántas más bajas*/  
        
        float altura[] = {1.53f, 1.68f, 1.82f, 1.79f, 1.56f};
        double promedio = 0;
        
        for (int i = 0; i < altura.length; i++) {
            promedio += altura[i];
        }
        
        promedio /= altura.length;
        
        int altas = 0;
        int bajas = 0;
        
        for (int j = 0; j < altura.length; j++) {
            if(altura[j] > promedio){
                altas++;
            }else{
                bajas++;
            }
        }
        System.out.println("El promedio es de " + promedio + " personas con altura superior al promedio hay " + altas + " y por debajo " + bajas); 
               
    }
    
    protected static String[] cincoArray(){
        /*5. Definir un array donde almacenar los nombres de 5 personas, pedirlos los  
        nombres en una función que devuelva el nombre insertado al procedimiento  principal*/  
        String persona[] = new String[5];
        
        for (int i = 0; i < persona.length; i++) {
            System.out.println("Introduce nombre");      
            persona[i]= scan.next();
        }
        return persona;
    }
    
    protected void seisArray(){
        //Crear una matriz de 3 filas de tipo int, ingresar sus posiciones y luego  imprimirlas con for each.
        int[][] matriz = {{1,2,3},{2,2,3},{4,2,1}};
        for(int[]i:matriz){
           System.out.println(java.util.Arrays.toString(i)); 
        }
    }
    
    protected void sieteArray(){
     /*Hacer un programa para controlar las calles y portales que tiene un pueblo, 
       de tal forma que al usuario le preguntamos para cada calle el nombre de la 
       misma y el número de portales y para cada portal el numero de habitantes 
       que vive en él, sacando un resumen de las calles*/
       
        System.out.print("Introduce el número de calles:");
        int calles = scan.nextInt();
        
        int callejero[][]= new int[calles][];
        int portales;
        
        for(int i = 0 ; i < callejero.length; i++){
            System.out.print("Introduce el número de portales de la calle " +(i+1)+ ":");
            portales = scan.nextInt();
            callejero[i] = new int[portales];
        }
        
        for(int i = 0 ; i < callejero.length; i++){
            for(int j = 0 ; j < callejero[i].length; j++){
                System.out.print("Introduce el número de personas del portal " + (j+1) + " de la calle " + (i+1) + " :");
                callejero[i][j] = scan.nextInt();
            }
        }
        
        String nombreCalles[] = new String[calles];
        Scanner sc1 = new Scanner(System.in);
        for(int i = 0 ; i < nombreCalles.length; i++){
            System.out.print("Introduce el nombre de la calle " + (i+1) + " :");
            nombreCalles[i] = sc1.nextLine();
        }
        
        for(int i = 0 ; i < callejero.length ; i++)    {
            int totalCalle = 0;
            for(int j = 0 ; j < callejero[i].length ; j++){
                totalCalle+= callejero[i][j];  
            }
            
            System.out.println("La calle " + nombreCalles[i] + " tiene " + totalCalle + " personas");        
        }
    }
}
