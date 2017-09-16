/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     * Se piden tres números e informar el promedio.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float num1;
        float num2;
        float num3;
        float suma;
        float promedio;
        
        Scanner traerDato= new Scanner (System.in);
        
        System.out.println("Escriba un numero:");
        num1= traerDato.nextFloat();
        System.out.println("Escriba otro numero:");
        num2= traerDato.nextFloat();
        System.out.println("Y.. Escriba un numero mas:");
        num3= traerDato.nextFloat();
        suma= num1+num2+num3;
        System.out.println("El resultado de la suma es.."+suma);

        promedio= suma/3;
        System.out.println("Y el Promedio de dichos Numeros es.."+promedio);
                
         
         
        
        
                
    }
    
}
