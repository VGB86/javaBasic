
package cursojava;

import java.util.Scanner;

public class Condicionales {
    static Scanner scanner = new Scanner(System.in);
    
    public static void condicionalUno(){
    //Pedir un número e indicar si es positivo o negativo  
        System.out.println("Introduce número");
        int v1= scanner.nextInt();
       
        if(v1 >= 0){
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");

        }
    }
    
    public static void condicionalDos(){
        //2. Pedir dos números y decir si uno es múltiplo del otro 
        System.out.println("Introduce dos números");
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
       
        if(v1 % v2 == 0 ) {
            System.out.println("son multiplos");
        } else {
            System.out.println("no son multiplos");
        }
    }
    
    public static void condicionalTres() {
        //3. Pedir dos números y mostrarlos ordenados de mayor a menor 
        System.out.println("Introduce dos números");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if(a < b){
            System.out.println(a + " - " + b);
        }else{
            System.out.println(b + " - " + a);
        }
    }
    
    public static void condicionalCuatro(){
    //4. Ingresar tres números enteros y determinar cuál es el mayor. 
        
        System.out.println("Ingresa tres números");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if(a >= b && a >= c){
          System.out.println("'a' " + a + " Es el MAYOR de los tres " + a + " " + b + " " + c);
        } else if(b>=a && b >= c){
          System.out.println("'b' " + b + " Es el MAYOR de los tres " + a + " " + b + " " + c);
               
        } else{
           System.out.println("'c' " + c + " Es el MAYOR de los tres " + a + " " + b + " " + c); 
        }
    }
    
    public static void condicionalCinco(){
        //5. Escribe un programa que pida un número y nos clasifique éste según sea:
        //- Cero, mayor o  menor que cero. 
        System.out.println("Dame un número");
        int v4 = scanner.nextInt();

        if (v4 <= 0) {
            if (v4 == 0) {
                System.out.println(v4 + " es igual a cero");
            }
            System.out.println(v4 + " es menor a cero");
        } else {
            System.out.println("Es mayor de cero");
        }
        
         //- Par o impar. 
        if(v4 % 2 == 0){
            System.out.println("Es un número par");
        } else{
            System.out.println("Es un número impar");
        }
        
        //- Múltiplo de 5 o no múltiplo de 5.
        if (v4 % 5 == 0) {
            System.out.println("Es multiplo de 5");
        }else{
            System.out.println("No es multiplo de 5");
        }
        
        //- Múltiplo de 10 o no  múltiplo de 10  
        if (v4 % 10 == 0){
            System.out.println("Es multiplo de 10");
        }else{
            System.out.println("No es multiplo de 10");
        }
        
    }
    
     public static void condicionalSeis(){
    /*Construir un programa que calcule el índice de masa corporal de una persona: 
        IMC = peso[kg] /altura2 [m] e indique el estado en el que se encuentra 
         esa persona en función del  valor de IMC. 
        Los operandos (peso y altura) deben ser introducidos por teclado por el usuario*/ 
          
        System.out.println("Ingresa tu peso y luego tu altura");
        double peso = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double imc = peso / altura;

        if(imc >=  16){
            if(imc >=16 && imc < 17){
                System.out.println("Infrapeso");
            }
            if (imc >= 17 && imc < 18) {
                System.out.println("Bajo peso");
            }
            if (imc >= 18 && imc < 25) {
                System.out.println("Peso normal (Saludable)");
            }
            if (imc >= 25 && imc < 30) {
                System.out.println("Sobrepeso (Obesidad de grado I)");
            }
            if (imc >= 30 && imc < 35) {
                System.out.println("Sobrepeso crónico (Obesidad de grado II)");
            }
            if(imc >= 35 && imc < 40)  {
                System.out.println("Obesidad premórbida (Obesidad de grado III)");   
            }
            if (imc >= 40) {
                System.out.println("obesidad mórbida (obesidad de grado IV) ");
            }
        } else {
            System.out.println("Criterio de ingreso en hospital");
        }
     }
    
    public static void condicionalSiete(){
    // 8. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo  todos los meses de 30 días. 
       System.out.println("Ingresa un día (del 1 al 30), un mes (del 1 al 12) y un año formato yyyy");
       int dia = scanner.nextInt();
       int mes = scanner.nextInt();
       int year = scanner.nextInt();
       
       if(dia >= 1 && dia <= 30){
           if (mes >= 1 && mes <=12 ) {
               if (year > 0 && year < 2022){
                   System.out.println("La fecha es correcta");
               }
           }
       }else {
           System.err.println("fecha incorrecta");
       }
    }
    
    public static void condicionalOcho(){
    /* Un obrero necesita calcular su salario semanal, el cual se obtiene de 
    la siguiente  manera:  
       //a. Si trabaja 40 horas o menos se le paga $16 por hora  
       //b. Si trabaja más de 40 horas se le paga $16 por cada una de las primeras
        40  horas y $20 por cada hora extra*/
       System.out.println("Cuantas horas trabajaste esta semana");
       int base = 16, hExtras = 20;
       int sueldo;
       int horasTrabajadas = scanner.nextInt();
       
       
       if(horasTrabajadas <= 40){
           sueldo = horasTrabajadas * base;
           System.out.println("Esta semana cobras " + sueldo);
       } else{
           sueldo = (horasTrabajadas * base) + ((horasTrabajadas - 40)* hExtras);
           System.out.println("Esta semana cobras " + sueldo);
       }
       
    }
    
    public static void condicionalNueve(){
        /*En un casino de juegos se desea mostrar los mensajes respectivos 
        por el puntaje  obtenido en el lanzamiento de tres dados de un cliente,
        de acuerdo a los  siguientes resultados: 
          a. ü Si los tres dados son seis, mostrar el mensaje “Excelente”  
          b. ü Si dos dados se obtiene seis, mostrar el mensaje “Muy bien”  
          c. ü Si un dado se obtienen seis, mostrar el mensaje “Regular”  
          d. ü Si ningún dado se obtiene seis, mostrar el mensaje “Pésimo” */
               
        int dado1 = (int)(Math.random() * 6 + 1);
        int dado2 = (int)(Math.random() * 6 + 1);
        int dado3 = (int)(Math.random() * 6 + 1);

        System.out.println('\n' + "Dado 1: " + dado1 + '\n' + "Dado 2: " + dado2 + '\n' + "Dado 3: " + dado3);
        
        if (dado1 + dado2 + dado3 == 18){
            System.out.println('\n' + "Excelente");            
        }
        else if ((dado1 == 6 && dado2 == 6) || (dado1 == 6 && dado3 == 6) || (dado2 == 6 && dado3 == 6)){
                 System.out.println('\n' + "Muy bien");                        
        }
        else if (dado1 == 6 || dado2 == 6 || dado3 == 6){
            System.out.println('\n' + "Regular");            
        }
        else 
            System.out.println('\n' + "Pésimo");             
    }
    
    public static void condicionalDiez(){
        /* En una tienda de venta de repuestos automotrices se tiene que el
        descuento depende del monto de venta, asi: Se ingresa el monto de venta y 
        el sistema debe  calcular el descuento y restarlo del total según las reglas:  
        a. Si el monto es menor que 500 no hay descuento  
        b. Si el monto está comprendido entre 500 y 1000 inclusive, el descuento es  de 5%  
        c. Si el monto está comprendido entre 1000 y 7000 inclusive, el descuento  es del 11%  
        d. Si el monto está comprendido entre 7000 y 15000 inclusive, el descuento  es del 18%  
        e. Si el monto es mayor de 15000 el desc es del 25%.  
        f. por ejemplo si se ingresa un monto de 5000 el descuento será 550, y por  tanto el
        valor a pagar será 4450.*/
       
        
        System.out.println("Ingresa el monto del artículo");
        double monto = scanner.nextInt();
        double descuento = 0;
        double importe;
        if( monto < 500){
            descuento = 0;
        }
        else if ( monto >= 500 && monto <= 1000) {
            descuento = 0.05 * monto;
        }
        else if (monto >= 1001 && monto <= 7000) {
            descuento = 0.11 * monto;
        }
        else if (monto >= 7001 && monto <= 15000) {
            descuento = 0.18 * monto;
        }
        else if (monto > 15001) {
            descuento = 0.25 * monto;
        }
        
        System.out.println("El descuento aplicado es de: " + descuento + " y el importe a pagar es de: " + (monto - descuento));
    
    }
    
    public static void condicionalOnce(){
        /*Una empresa de teléfonos móviles aplica una tarifa de 0.09 €/minuto (+IVA) 
        a las  llamadas que realizan sus abonados, pero teniendo en cuenta que el primer minuto
        siempre se cobra completo y que a partir del siguiente minuto se tarifa por  segundos. 
        Se pide, escribir un programa que dada como entrada la duración en  segundos de una llamada
        indique el coste final de la misma (Impuestos incluidos). */
        
        System.out.println("Indica minutos de llamada");
        double llamada = scanner.nextInt();
        llamada *= 60;
                
        double tarifa = 0.09;
        double iva = 0.21;
        double coste = 0;
        
        if (llamada < 60) {
            coste = (tarifa * 60) * iva;
        }else{
            coste = (llamada * tarifa) * iva;
        }
                
        System.out.println("El coste de la llamada es de " + coste + " iva incluido.");
    }
    
    public static void condicionalDoce(){
        /*Asistimos a un parque de atracciones que cobra a sus clientes en función del tiempo
        de permanencia en el mismo. Concretamente los precios por minuto según  el tiempo de permanencia son los siguientes:
        a. Tiempo de permanencia Precio:
        en céntimos por minuto Menos de una  hora 8 céntimos 
        Entre una y dos horas 6 céntimos
        Entre  dos de cuatro horas 4 céntimos 
        Más de cuatro horas 12 euros
        b. Haz un programa que realice los siguientes pasos: - Pide la hora de entrada  (hora y minutos)
        y la hora de salida (hora y minutos), - Comprueba que la  hora de salida es superior a la hora de entrada, 
        en caso de no ser así  mostrará un mensaje por pantalla indicando el error en las fechas  introducidas. 
        - Realiza el cálculo del importe a cobrar. - Informa por  pantalla del total de minutos de permanencia 
        en el parque y del importe  total de pago desglosado en euros y céntimos de euro.  
        i. Para la introducción de las horas, utilizaremos el formato 24 h (es  decir de 0 a 24 h.). */
        
        System.out.println("Hora de entrada:");
        double horaEntrada = scanner.nextDouble();
        double horaSalida = 20.50;
        double computoHoras = (horaSalida - horaEntrada)*60;
        double importe2 = 0;
        
        if (horaSalida < horaEntrada) {
            System.err.println("Error en las fechas introducidas");
        }
        else if( computoHoras > 0 && computoHoras <= 60){
            importe2 = computoHoras * 0.08;
        }
        else if (computoHoras > 60 && computoHoras <= 120) {
            importe2 = computoHoras * 0.06;
        }
        else if (computoHoras > 120 && computoHoras <= 240) {
            importe2 = computoHoras * 0.04;
        }
        else if (computoHoras > 240) {
            importe2 = 12;
        }
    
        computoHoras /= 60;
        System.out.println("El total de minutos de permanencia en el parque hasn sido de: " + computoHoras + " y del importe total a pagar son: " + importe2 + "€." );
        }
    
    public static void unoCondicional(){
        //variable int por teclado y calcule si es par o impar
        System.out.println("Ingresa numero");
        int var1 = scanner.nextInt();
        
        if(var1 % 2 == 0){
            System.out.println(var1 + " es par");
        } 
        else System.out.println(var1 + " es impar");
        
    }
    
    public static void dosCondicional(){
        System.out.println("Ingresa dos números");
        int var1 = scanner.nextInt();
        int var2 = scanner.nextInt();
        
        if(var1 < var2){
            System.out.println(var2 + " es mayor que que " + var1);
        } else if(var1 == var2){
            System.out.println(" son iguales");
        } else 
            System.out.println(var1 + " es mayor que " + var2);
        
     }
    

        
        
    public static void cuatroCondicional(){
      //Leer un numero entero 1  a 10
        System.out.println("Dime un número entre el 1 y el 10");
        int numRomano = scanner.nextInt();
        switch (numRomano) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VI");
                break;
            case 8:
                System.out.println("VII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("def");
                break;
        }
    }

    
    public static void ochoCondicional(){
        //Leer un numero entero 1  a 10
        System.out.println("Dime un número entre el 1 y el 10");
        int nota = scanner.nextInt();
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 10:
                System.out.println("Matricula de honor");
                break;
            default:
                System.out.println("def");
                break;
        }
    }
        
    public static void nueveCondicional(){    
       //Escribir hola mundo 10 veces
        int contador = 1;
        while(contador < 11) {
            System.out.println(contador + " -Hola mundo");
            contador++;
        }
    }
    
    public static void diezCondicional(){
        //Multiplo de 5 desde el 0 a 100 
        for (int i = 0; i <= 100; i+=5) {
            System.out.println(i);
        }
        
        System.out.println("----------");
        int contador = 0;
        
        while (contador <= 100) {            
            System.out.println(contador);
            contador+=5;
        }
    }
    
    public static void onceCondicional(){
    //Saber is el número que metemos es mayor que 10
        int numero;
        System.out.println("Dime un numero");
        numero = scanner.nextInt();
        
        if(numero >= 10){
            if (numero > 10) {
                System.out.println(numero + " es mayor que 10");
            }
            if (numero == 10 ) {
                System.out.println( numero +  "es igual a 10");
            }  
        } else System.out.println(numero + " es menor que 10");
        
    }
    
    public static void doceCondicional(){
        /*Saber si un # es dibisible por otro, el resultado de la 
        división es un entero y si es divisible imprimir cociente */
        int x = 10, y = 2;
        int cociente = x / y;
        
        if( x % y == 0){
            System.out.println("Es divisible");
            System.out.println("El cociente es:" + cociente);
        }else{
            System.out.println("No es divisible");
        }
    }
    
    public static void treceCondicional(){
       //Saber is un número es negativo , positivo o cero
       System.out.println("Dime un número");
        int num = scanner.nextInt();
        
        if (num != 0) {
            if (num < 0) {
                 System.out.println( num + " es negativo");
            }
            if (num > 0) {
                System.out.println(num + " es positivo");
            }
           
        } else System.out.println(num + "es igual a cero");
        
    }
    
   
}



        
       