/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo.multidimensional.de.nombre.y.apellidos;

/**
 *
 * @author crist
 */
public class ArregloMultidimensionalDeNombreYApellidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Crear un arreglo multidimensional para almacenar los datos
        String[][] compañeros = {
            {"Daniel", "Medina", "Electronica", "TEST"},
            {"Monica", "Jiz", "Computacion", "IMSA"},
            {"Carlos", "Perez", "Mecanica", "ABC Corp"},
            {"Laura", "Gomez", "Quimica", "XYZ Labs"},
            {"Juan", "Lopez", "Informatica", "Tech Solutions"}
        };

        // Imprimir los datos
        for (String[] compañero : compañeros) {
            System.out.println("Nombre: " + compañero[0]);
            System.out.println("Apellido: " + compañero[1]);
            System.out.println("Carrera: " + compañero[2]);
            System.out.println("Lugar de Trabajo: " + compañero[3]);
            System.out.println();
        }
    }
    
}
