/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     * Se necesita pedir 2 numeros y sumarlos, mostrar el resultado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        int suma;
        
        Scanner entradaPorTeclado= new Scanner (System.in);
        System.out.println("ingrese el ´primer numero");
        num1= entradaPorTeclado.nextInt();
        System.out.println("ingrese el ´segundo numero");
        num2= entradaPorTeclado.nextInt();
        System.out.println("Los numeros son:" + num1+"-----"+num2);
        suma=num1+num2;
        System.out.println("El Resultado de la Suma es:"+ suma);
    }
    
}
