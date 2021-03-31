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
public class Pt4 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        int d;
        do{
        System.out.println("Ingrese el valor A");
        a = sc.nextDouble();
        if(a<0){
            System.out.println("Por favor ingrese un valor entero");
        }
        }while(a<0);
        
        
        do{
        System.out.println("Ingresa el valor B");
        b=sc.nextDouble();
        if(b<0){
            System.out.println("Por favor ingrese un valor entero");
        }
        }while(b<0);
        
        
        do{
        System.out.println("Ingresa el valor C");
        c=sc.nextDouble();
        if(c<0){
            System.out.println("Por favor ingrese un valor entero");
        }
        }while(c<0);
        
        
        do{
        System.out.println("Ingresa el valor D");
        d=sc.nextInt();
        if(d<0 || d>100){
            System.out.println("Por favor ingrese un valor entero");
        }
        }while(d<0 || d>100);
        
        double A = TiendaA(3, a, d);
        double B = TiendaB(b);
        double C = 3*c;
        System.out.println("Valor en tienda A: "+A);
        System.out.println("Valor en tienda B: "+B);
        System.out.println("Valor en tienda C: "+C);
        
        //condicionales para evaluar el menor entre 3 datos
        if(A < B && A < C){
        System.out.println("La tienda A tiene el valor mas economico con: " + A);
        }else{
            if(B < A && B < C){
            System.out.println("La tienda B tiene el valor mas economico con: " + B);
            }else{
            System.out.println("La tienda C tiene el valor mas economico con: " + C);
            }
        }

     }
     
     public static double TiendaA(int unid, double a, double d){
          double valor, valorDes;
          valor = unid * a;
          valorDes = valor - (valor*(d/100));
         return valorDes;
     }
     
     public static double TiendaB(double b){
         double valor;
         valor = 2*b;
         return valor;
     }
     
    
}
