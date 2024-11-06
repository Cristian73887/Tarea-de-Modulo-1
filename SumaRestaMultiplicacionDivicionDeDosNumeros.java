/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma.resta.multiplicacion.divicion.de.dos.numeros;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class SumaRestaMultiplicacionDivicionDeDosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner into = new Scanner(System.in);
        
        System.out.println(" Ingrese dos numeros aleatorios");
        
        // declaracion de las variable que vamos a utilizar
        
        int numero1,numero2,suma,resta,multiplicacion,divicion;
        
        numero1 = into.nextInt();
        numero2 = into.nextInt();
        
      
        // operando con las variables que se declararon 
        
        suma = numero1+numero2;
        resta = numero1-numero2;
        multiplicacion = numero1*numero2;
        divicion = numero1/numero2;
        
        // los resultados de las operaciones
        
        System.out.println(" El resultado de la suma es:" +suma);
        System.out.println("El resultado de la resta es:" +resta);
        System.out.println(" El resultado de la multiplicacion es:" +multiplicacion);
        System.out.println("El resultado de la divicion es:" +divicion);
    }
    
}
