/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     * Se debe pedir el nombre y el apellido, luego mostrarlo en el siguiente 
     * mensaje “su nombre es XXXXX y XXXXXX es su apellido”.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        String apellido;
        
        Scanner tomarDato= new Scanner (System.in);
        
         System.out.println("Escriba su Nombre:");
         nombre= tomarDato.nextLine();
         System.out.println("Escriba su Apellido:");
         apellido= tomarDato.nextLine();
         System.out.println("Su Nombre es"+"-"+ nombre+"-"+"y"+"-"+ apellido+"-"+"es su apellido ");
                 
         
         
        
        
    }
    
}
