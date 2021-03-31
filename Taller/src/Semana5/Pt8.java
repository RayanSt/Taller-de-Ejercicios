/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana5;

import java.util.Scanner;

/**
 *
 * @author bparr
 */
public class Pt8 {
    public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
      System.out.println("Conjetura de Goldbach. Ingrese numeros mayores que 5");
 
      while ( true )
      {
         long numero = sc.nextInt();
         if ( numero == 0 ) break;
         if ( numero < 4 || numero == 5 ) continue;
 
// Conjetura fuerte para numeros pares, la debil para impares
         if ( numero % 2 == 0 )
         {
            // Conjetura fuerte de Goldbach. Todo numero par >= 4 es la suma de dos primos
            // Ej: 4 == 2 + 2 :: 6 == 3 + 3 :: 10 == 3 + 7 == 5 + 5
            for ( long a = 2; a < numero; ++a )
            {
               if ( ! esPrimo(a) ) continue;
               for ( long b = a; b < numero; ++b )
               {
                  if ( a + b == numero && esPrimo(b) )
                     System.out.printf("%,d == %,d + %,d\n", numero, a, b);
               }
            }
         }
      }
 
   }
 
   public static boolean esPrimo(long numero)
   {
      for ( long i = 2; i < numero; ++i )
         if ( numero % i == 0 )
            return false;
 
      return true;
   }
}
