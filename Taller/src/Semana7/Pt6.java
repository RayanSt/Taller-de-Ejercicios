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

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String palabra1 = "";
        String palabra2 = "";
        
        System.out.print("Ingrese una palabra: ");
        palabra1 = sc.nextLine().trim();
        do {
            System.out.print("Ingrese una segunda palabra: ");
            palabra2 = sc.nextLine().trim();
            if (!(palabra1.length() == palabra2.length())) {
                System.out.println("las palabras deben tener la misma longitud");
            }
        } while (!(palabra1.length() == palabra2.length()));
        
        if (esAnagrama(palabra1, palabra2) == palabra1.length()) {
            System.out.println("Es un anagrama");
        } else {
            System.out.println("No es un anagrama");
        }
        
    }

    public static int esAnagrama(String palabra1, String palabra2) {
        int contador2 = 0;
        for (int contador = 0; contador < palabra1.length(); contador++) {
            for (int contador1 = 0; contador1 < palabra1.length(); contador1++) {
                if (palabra1.charAt(contador) == palabra2.charAt(contador1)) {
                    ++contador2;
                    
                }
                
            }
        }
        return contador2;
    }

}
