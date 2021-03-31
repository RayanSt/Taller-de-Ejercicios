/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana5;

/**
 *
 * @author bparr
 */
import java.util.Scanner;
public class Pt1 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h;
        
        System.out.println("Ingresa un numero");
        h=sc.nextInt();
        
         System.out.println("Valor ingresado: "+h);
        System.out.println("Valor Absoluto: "+ValorAbsoluto(h));
     }
     
     public static int ValorAbsoluto(int a){
          int valor = a;
          if(a<0){
              valor = a*(-1);
          }
         return valor;
     }
     
}