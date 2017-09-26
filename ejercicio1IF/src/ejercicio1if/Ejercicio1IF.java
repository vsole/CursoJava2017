/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1if;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1IF {

    /**
     * @param args the command line arguments
     * Se pide una clave  y si coincide de muestra el mensaje “Bienvenido”
     * de lo contrario mostrar el mensaje “clave incorrecta.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato= new Scanner(System.in);
        String clave;
        
        System.out.println("Ingrese su clave:");
        clave= traerDato.next();
        
        if(clave.equals("utn1234"))
        {
            System.out.println("Bienvenido!!");
        }    
        else
        {
            System.out.println("Clave Erronea");
        }    
        
                
                
    }
    
}
