/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana7;

/**
 *
 * @author bparr
 */
import java.util.Scanner;
public class Pt5 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,a,b;
        do{
            System.out.println("Ingrese la coordenada X del angulo superior del triangulo");
            a=sc.nextInt();
            if(a<0){
                System.out.println("Ingrese una coordenada diferente a 0, que este ubicada en el primer plano"); 
            }
        }while(a<0); 
        
        do{
            System.out.println("Ingrese la coordenada Y del angulo superior del triangulo");
            b=sc.nextInt();
            if(b<0){
                System.out.println("Ingrese una coordenada diferente a 0, que este ubicada en el primer plano"); 
            }
        }while(b<0);
        
        do{
            System.out.println("Ingrese la coordenada X dentro del rectangulo");
            x=sc.nextInt();
            if(x<0 || x>a){
                System.out.println("Ingrese una coordenada que este dentro del rectangulo"); 
            }
        }while(x<0 || x>a);
        
        do{
            System.out.println("Ingrese la coordenada X dentro del rectangulo");
            y=sc.nextInt();
            if(y<0 || y>b){
                System.out.println("Ingrese una coordenada que este dentro del rectangulo"); 
            }
        }while(y<0 || y>b);
        
        double Izq = x; 
        double Dere = a-x; 
        double Arri = b-y; 
        double Abaj = y;
        double Datos[] = {Izq,Dere,Arri,Abaj};
        double Ordenado[] = Ordenar(Datos);
        //double menor = MenorDeCuatro(Izq, Dere, Arri, Abaj);
        
        if(Izq == Ordenado[0]){
            System.out.println("El lado IZQUIERDO es el cammino mas corto para llegar al borde");
            System.out.println("Con una distancia de: "+Ordenado[0]);
        }if(Dere == Ordenado[0]){
            System.out.println("El lado DERECHO es el cammino mas corto para llegar al borde");
            System.out.println("Con una distancia de: "+Ordenado[0]);
        }if(Arri == Ordenado[0]){
            System.out.println("El lado SUPERIOIR es el cammino mas corto para llegar al borde");
            System.out.println("Con una distancia de: "+Ordenado[0]);
        }if(Abaj == Ordenado[0]){
            System.out.println("El lado INFERIOIR es el cammino mas corto para llegar al borde");
            System.out.println("Con una distancia de: "+Ordenado[0]);
        }
     }
     
     
     
     public static double MenorDeCuatro(double A, double B, double C, double D) {
        double menor = 0; 
         if (A > B && B > C && C > D) {
            menor = D;
        } else if (A > B && B < C && C > D) {
            menor = D;
        } else if (A < B && B > C && C < D) {
            menor = D;
        } else if (B > A && A > C && C > D) {
            menor = D;
        } else if (C > A && A > B && B > D) {
            menor = D;
        } else if (B > A && A > C && C > D) {
            menor = D;

        }
         return menor;
    }
     
     public static double[] Ordenar(double[] arreglo)
    {
      double auxiliar;
      for(int i = 2; i < arreglo.length; i++)
      {
        for(int j = 0;j < arreglo.length-i;j++)
        {
          if(arreglo[j] > arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
      return arreglo;
    }
}
