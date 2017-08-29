/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio06;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Creando objeto Scanner 
        Scanner input = new Scanner(System.in);
        
        // Mostrar mensaje al usuario 
        System.out.print("INGRESE LADO DE UN HEXAGONO: ");
        double lado = input.nextDouble();
        
        // Calcular el area del hexagono 
        double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(lado, 2);
        
        // Mostrando el resultado
        System.out.println("El area del hexagono es: " + area);
        
    }
    
}
