/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     * Se pide el valor de la hora de trabajo de un empleado y la cantidad de 
     * horas trabajadas, informar cuanto le corresponde de sueldo, restándole
     * el 15% de aportes.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float valorHora;
        float cantidadHoras;
        float sueldo;
        float desc;
        float totalCobrar;

        Scanner traerDato= new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la hora laboral:"); 
        valorHora= traerDato.nextFloat();
        System.out.println("Ahora Ingrese las horas trabajadas:");
        cantidadHoras= traerDato.nextFloat();
        sueldo= valorHora*cantidadHoras;
        System.out.println("Su sueldo seria:"+sueldo);
        desc= sueldo*15/100;
        System.out.println("El descuento del 15% es:"+desc);
        totalCobrar= sueldo-desc;
        System.out.println("Usted va a cobrar con el descuento:"+totalCobrar); 
        
        
                
                
    }
    
}
