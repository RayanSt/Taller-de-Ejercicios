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
public class Pt2 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h;
        
        System.out.println("Ingresa un numero");
        h=sc.nextInt();
        
        System.out.println("Valor ingresado: "+h);
        if(EsPar(h)){
            System.out.println("Es Par");
        }else{
            System.out.println("Es Impar");
        }
        
     }
     
     public static boolean EsPar(int a){
          boolean valor = false;
          if(a%2==0){
              valor = true;
          }
         return valor;
     }
     
}