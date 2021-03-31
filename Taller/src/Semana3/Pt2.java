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
public class Pt2 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        do{
        System.out.println("Ingresa La logitud en metros");
        m=sc.nextInt();
        if(m<0){
            System.out.println("Por favor ingrese un valor entero");
        }
        }while(m<0);
        //impresion por pantalla
        System.out.println("Valor en centimentros: "+MetrosCentimetros(m));
        System.out.println("Valor en milimetros: "+MetrosMilimetros(m));
        System.out.println("Valor en pies: "+MetrosPies(m));
        System.out.println("Valor en pulgadas: "+MetrosPulgadas(m));
        System.out.println("Valor en yardas: "+MetrosYargas(m));
        System.out.println("Valor en años Luz: "+MetrosALuz(m));
        System.out.println("Valor en angstrom: "+MetrosAngstrom(m));
     }
     
     public static int MetrosCentimetros(int a){
          int valor;
          valor = a*100;
         return valor;
     }
     
     public static int MetrosMilimetros(int a){
          int valor;
          valor = a*1000;
         return valor;
     }
     
     public static double MetrosPies(int a){
          double valor;
          valor = a * 3.28084;
         return valor;
     }
     
     public static double MetrosPulgadas(int a){
          double valor;
          valor = a * 39.3701;
         return valor;
     }
     
     public static double MetrosYargas(int a){
          double valor;
          valor = a*1.09361;
         return valor;
     }
     
     public static double MetrosALuz(int a){
          double valor;
          valor = a*1.057*Math.pow(10, -16);
         return valor;
     }
     
     public static double MetrosAngstrom(int a){
          double valor;
          //uso de libreria Math
          valor = a*Math.pow(10, 10);
         return valor;
     }
}
