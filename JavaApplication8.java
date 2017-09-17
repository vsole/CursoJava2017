/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     * Se pide el largo y ancho de un terreno u se pide la superficie del mismo.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1;
        float num2;
        float num3;
        
        Scanner traerDato= new Scanner(System.in);
        
         System.out.println("Si el largo de un terreno es:");
         num1= traerDato.nextFloat();
         System.out.println("Y el ancho es:");
         num2= traerDato.nextFloat();
         num3= num1*num2;
         System.out.println("Su superficie es:"+ num3);    
    }
    
}
