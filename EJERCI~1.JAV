/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.de.aprobado.o.reprobado.de.la.nota.de.un.estudiante;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjercicioDeAprobadoOReprobadoDeLaNotaDeUnEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crear un programa que imprima en consola un nombre de estudiante, 
           una nota y una etiqueta que diga Aprobado o Reprobado, 
           dependiendo del valor de la nota que tenga.*/
        
        Scanner scanner = new Scanner(System.in);
        
        // Solisitar el nombre del estudiante
        System.out.println("Ingrese el nombre de un estudiante");
        String nombre = scanner.nextLine();
        
        // solisitar la nota del estudiante
        System.out.println("Ingrese la nota del estudiante");
        double nota = scanner.nextDouble();
        
        // Determinar si el estudiante está aprobado o reprobado
        String resultado = (nota >= 60) ? "Aprobado" : "Reprobado";
        
         // Imprimir el resultado
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Nota: " + nota);
        System.out.println("Resultado: " + resultado);
        
        
        
    }
    
}
