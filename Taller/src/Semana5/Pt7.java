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
public class Pt7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Ingresa un numero");
        n = sc.nextInt();

        if (esPrimo(n)) {
            System.out.println("El numero " + n + " es primo");
        } else {
            System.out.println("El numero " + n + " NO es primo");
        }

    }

    public static boolean esPrimo(int numero) {
        for ( long i = 2; i < numero; ++i )
         if ( numero % i == 0 )
            return false;
      return true;
    }
}
