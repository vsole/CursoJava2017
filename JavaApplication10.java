/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     * Se ingresa la cantidad de ganadores da la lotería nacional y el monto
     * total del premio, informar cuánto dinero le corresponde a cada uno.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cantidadGanadores;
        float montoPremio;
        float premioParaCada1;
        
        Scanner traerDato= new Scanner(System.in);
        
      
        System.out.println("Ingresar el monto total del premio :");
        montoPremio= traerDato.nextInt();
        System.out.println("Ingresar la cantidad de ganadores:");
        cantidadGanadores= traerDato.nextInt();
        premioParaCada1= montoPremio/cantidadGanadores;
        System.out.println("A cada gGanador le coorresponde:"+ premioParaCada1);
                
        
        
    }
    
}
