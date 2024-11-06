/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacion.de.expreciones.de.verdadero.o.falso;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EvaluacionDeExprecionesDeVerdaderoOFalso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner into = new Scanner(System.in);
        int M=6, T=1, K=-10;
        
        boolean exprecion1 = M>T;
        boolean exprecion2 = T/K == -5;
        boolean exprecion3 = ( M+T ==7) || (M-T == 5);
        
        System.out.println(" M > T:" + exprecion1);
        System.out.println("T / K == -5: " + exprecion2);
        System.out.println(" (M + T == 7) || (M - T == 5): " + exprecion3);
        
    }
    
}
