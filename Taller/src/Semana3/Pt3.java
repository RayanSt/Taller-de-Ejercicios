/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

/**
 *
 * @author bparr
 */
import java.util.Scanner;
public class Pt3 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m;
        
        System.out.println("Ingrese el valor de temperatura en grados centigrados");
        m=sc.nextInt();
        
        System.out.println("Valor en Fahrenheit: "+Fahrenheit(m));
        System.out.println("Valor en Kelvin: "+Kelvin(m));
        System.out.println("Valor en Rankine: "+Rankine(m));
     }
    
     public static double Fahrenheit(double a){
          double valor;
          valor = (a * 9/5) + 32;
         return valor;
     }
     
     public static double Rankine(double a){
          double valor;
          valor = a * 9/5 + 491.67;
         return valor;
     }
     
     public static double Kelvin(double a){
          double valor;
          valor = a + 273.15;
         return valor;
     }
     
}
