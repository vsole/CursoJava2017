/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author Valeria
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     * Al ingresar la edad y el nombre mostrar el siguiente mensaje: “ Usted se 
     * llama “ XXXXXX y tiene XX años de edad”.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entradaPorTeclado= new Scanner(System.in);
        String nombre;
        int edad;
                
        System.out.println("Ingrese su Nombre");
        nombre = entradaPorTeclado.nextLine();
        System.out.println("Ingrese su Edad:");
        edad = entradaPorTeclado.nextInt();
        System.out.println("Usted se llama"+ nombre);
        System.out.println("Y tiene"+"-"+ edad +"-"+"años de edad");
     
        
        
        


//nombre =miscanner.nextLine();
        
     
    }
    
}
