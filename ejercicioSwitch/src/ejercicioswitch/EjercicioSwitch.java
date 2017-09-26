/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner traerDato=new  Scanner(System.in);
        
        String mesDelAño;
        String vacaciones;
        System.out.println("ingrese un mes del Año");
        mesDelAño=traerDato.next();
        System.out.println("Vas de vacaciones");
        vacaciones=traerDato.next();
        
        if(vacaciones.equals("si"))
        {
        switch(mesDelAño)
        {
            case "enero":
            case "febrero": //mientras no hay break, se pueden poner todos los casos juntos y deps la instruccion   
                  System.out.println("Lindo veranito!!!");
                  break;
            case "julio":
                  System.out.println("Lindo invierno!");
                  break;
            default:
                System.out.println("No es verano!");
                  break;           
            
                  
        }
     }
    }
        
    
}
