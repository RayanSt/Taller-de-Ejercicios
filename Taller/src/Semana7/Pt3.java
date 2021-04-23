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

public class Pt3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, n;
        System.out.println("Ingrese el tamaño del arreglo");
        n = sc.nextInt();
        int[] arreglo = new int[n]; // creamos un arreglo para almacenar 20 elementos
        int num = 0;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Dato " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt(); //Guardamos los datos en el arreglo uno por uno
            System.out.println("-----------------");//en el rango buscado y lo almacenamos en el arreglo
        }

        System.out.println("Valores diferentes no repetidos x: "+Diferentes(arreglo));
    }

    public static int Diferentes(int[] ar) {
        int resultado = 0;
        int contador = ar.length;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    resultado++;
                    System.out.println("DADO "+ar[i]);
                }
            }
            System.out.println("Tamaño "+ar.length);
            if(resultado != 0){
                contador--;
            }
            resultado = 0;
        }
        return contador;
    }
}
// 1 2 32 3 5 3 1 2 3  