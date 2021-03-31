/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana7;

import java.util.Scanner;

/**
 *
 * @author bparr
 */
public class Pt6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        do{
            System.out.println("Ingrese el dato A");
            a=sc.nextInt();
            if(a<0){
                System.out.println("EL NUMERO NO PUEDE SER NAGATIVO!!!"); 
            }
        }while(a<0); 
        
        do{
            System.out.println("Ingrese el dato B");
            b=sc.nextInt();
            if(b<0){
                System.out.println("EL NUMERO NO PUEDE SER NAGATIVO!!!"); 
            }
        }while(b<0);
        
        do{
            System.out.println("Ingrese el dato C");
            c=sc.nextInt();
            if(c<0){
                System.out.println("EL NUMERO NO PUEDE SER NAGATIVO!!!"); 
            }
        }while(c<0);
        
        System.out.println("Los tres se van a encontrar en "+MCM(a,b,c)+" dias");
    }
    public static int MCM(int A, int B, int C) {
        int numMax = A;
        if (B > numMax) {
            numMax = B;
        }
        if (C > numMax) {
            numMax = C;
        }
        int i = numMax;
        while ((i % A != 0) || (i % B != 0) || (i % C != 0)) {
            i++;
        }
        return i;
    }
}
