/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     * Se pide la base de un cuadrado y se informa el perímetro
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float base;
        float perimetro;
        
        Scanner traerDato= new Scanner (System.in);
        
        System.out.println("Escribir la Base de un Cuadrado:");
        base= traerDato.nextFloat();
        perimetro= base+ base+ base+ base;
        System.out.println("El Perimetro de dicho cuadrado es:"+perimetro);
        perimetro= traerDato.nextFloat();
    }
    
}
