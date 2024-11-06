/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo.que.guarde.pkg10.nombres;

/**
 *
 * @author crist
 */
public class ArregloQueGuarde10Nombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crear un arreglo que guarde e imprima 10 nombre 
           de los compañeros de la clase*/
        
        String[] nombres = new String[10];
        
        // Asignacio de los 10 nombres
        
        nombres[0] = "JAvier";
        nombres[1] = "Eduad";
        nombres[2] = "Oscar";
        nombres[3] = "Daniel";
        nombres[4] = "Daniela";        
        nombres[5] = "Cristian";       
        nombres[6] = "Fernando";      
        nombres[7] = "Danlis";
        nombres[8] = "Angie";       
        nombres[9] = "Mariela";
        
        // Imprimir los nombre almacenados 
        
        for (int i = 0; i<nombres.length; i++){
            
            System.out.println("nombres" + (i+1) + ":" + nombres[i]);
        }
                
    }
    
}
