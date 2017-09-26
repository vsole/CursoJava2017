/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20if;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio20IF {

    /**
     * @param args the command line arguments
     * Se ingresa un importe del pasaje de avión y el mes de viaje, si el mes 
     * es enero, se les descuenta un 10% por temporada baja.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        int pasaje, pasajefinal,pasajetotal;
        String mes;
        
        System.out.println("Ingrese el valor del pasaje");
        pasaje= traerDato.nextInt();
        System.out.println(" Ingrese el mes de viaje:");
        mes= traerDato.next();
        
        if(mes.equals("enero"))
        {
         pasajefinal=pasaje*10/100;
         pasajetotal=pasaje-pasajefinal;
         System.out.println("su pasaje sale"+pasajetotal);
        }
        else
        {
        System.out.println("su pasaje sale:"+pasaje);
        }
        }

    private static class string {

        public string() {
        }
    }
    
}
