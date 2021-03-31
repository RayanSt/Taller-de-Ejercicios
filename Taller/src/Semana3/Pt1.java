/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

import java.util.Scanner;

/**
 *
 * @author bparr
 */

public class Pt1 {
    
     public static void main(String[] args) {
        //entrada por teclado
         Scanner sc = new Scanner(System.in);
        //declaracion de variables
        int h,m,s,hh,mm,t;
        //ciclo
        do{
        System.out.println("Ingresa hora");
        //entrada de datos
        h=sc.nextInt();
        //condicional
        if(h<0 || h>24){
            //salida por pantalla
            System.out.println("Por favor ingrese una hora entre 0 y 24");
        }
        }while(h<0 || h>24);
        
        do{
        System.out.println("Ingresa minuto");
        m=sc.nextInt();
        if(m<0 || m>60){
            System.out.println("Por favor ingrese un minuto entre 0 y 60");
        }
        }while(m<0 || m>60);
        
        do{
            
        System.out.println("Ingresa segundo");
        s=sc.nextInt();
        if(s<0 || s>60){
            System.out.println("Por favor ingrese un segundo entre 0 y 60");
        }
        }while(s<0 || s>60);
        
        hh = HoraSegundos(h);
        mm = MinutosSegundos(m);
        t = hh+mm+s;
        System.out.println("Hora ingresada: "+h+":"+m+":"+s);
        System.out.println(t + " segundos");
     }
     
     //metodo que pasa de hora a segundos
     public static int HoraSegundos(int a){
          int valor;
          valor = a*3600;
         return valor;
     }
     //metodo que pasa de minutos a segundos
     public static int MinutosSegundos(int a){
          int valor;
          valor = a*60;
         return valor;
     }
}