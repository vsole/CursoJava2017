/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     * Se ingresa la cantidad y precio de un producto y se informa el total a
     * pagar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cantidad;
        float precio;
        float total;
        
        Scanner traerDato= new Scanner (System.in);
        
        System.out.println("Cantidad del preducto:");
        cantidad= traerDato.nextInt();
        System.out.println("Precio del Producto:");
        precio= traerDato.nextFloat();
        total= cantidad*precio;
        System.out.println("El total a pagar es:"+total);
        
    }
    
}
