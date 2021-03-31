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
public class Pt5 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        do{
        System.out.println("Ingrese el valor A");
        a=sc.nextInt();
        if(a<0){
            System.out.println("Por favor ingrese un valor entero");
        }
        }while(a<0);
        
        
        do{
        System.out.println("Ingresa el valor B");
        b=sc.nextInt();
        if(b<0){
            System.out.println("Por favor ingrese un valor entero");
        }
        }while(b<0);
        
        System.out.println("Cantidad de cuadritos: "+Cuadritos(a, b));
        

     }
     
     public static double Cuadritos(int a, int b){
          double valor;
          //calculo de cuadritos (total de cuadritos a lo ancho) * (total de cuadritos a lo largo)
          valor = ((b - 1)/0.5)*((a - 2)/0.5);
         return valor;
     } 
    
}
