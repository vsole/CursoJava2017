/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     * Se ingresa el importe de un producto importado y se le debe agregar el
     * 35 % de impuestos internos.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float importe;
        float impuesto;
        float impTotal;
        
        Scanner traerDato= new Scanner(System.in);
        
        System.out.println("Importe Producto:");
        importe= traerDato.nextFloat();
        impuesto= importe*35/100;
        impTotal=importe+impuesto;
        System.out.println("El Importe mas el 35% de impuestos es de:"+impTotal);
        
        
        //impInternos= traerDato.nextFloat();
        
        
        
        
        
        
               
    }
    
}
