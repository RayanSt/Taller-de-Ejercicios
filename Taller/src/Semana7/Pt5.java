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
        String palabra;
        System.out.println("Ingresa la palabra");
        palabra = sc.nextLine();
        if (espalindromo(palabra)) {
            System.out.println("Palindromo");
        } else {
            System.out.println("No Palindromo");
        }
    }
     
     
    public static boolean espalindromo(String cadena) {
        boolean valor = true;
        cadena = cadena.toUpperCase();
        int i, ind;
        String cadena2 = "";
        for (int x = 0; x < cadena.length(); x++) {
            if (cadena.charAt(x) != ' ') {
                cadena2 += cadena.charAt(x);
            }
        }
        cadena = cadena2;
        ind = cadena.length();
        for (i = 0; i < (cadena.length()); i++) {
            if (cadena.substring(i, i + 1).equals(cadena.substring(ind - 1, ind)) == false) {
                valor = false;
                break;
            }
            ind = ind - 1;
        }
        return valor;
    }
}
