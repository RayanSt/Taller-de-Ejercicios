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
public class Pt8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int azar, i, cant = 0;
        System.out.println("ingrese la cantidad de niños");
        int numNin = sc.nextInt();
        String nombres[] = new String[numNin];
        for(int k = 0 ; k < nombres.length; k++){
            System.out.print("Niño #"+(k+1)+": ");
            nombres[k] = sc.nextLine();
            System.out.println(" ");
        }
        
        int numero[] = new int[numNin];
        for (i = 0; i < numero.length; i++) {
            numero[i] = i;
        }
        while (cant < nombres.length-1) {
            System.out.println("Ingrese un numero");
            azar = sc.nextInt();
            for (i = 0; i < nombres.length; i++) {
                if (numero[i] == azar) {
                    numero[i] = -1;
                    cant++;
                }
            }
        }
        for (i = 0; i < nombres.length; i++) {
            if (numero[i] != -1) {
                System.out.println("Lava los platos el niño de la posción " + numero[i]);
            }
        }
    }
}
