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
import java.util.Arrays;
import java.util.Scanner;
public class Pt4 {
    
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, n;
        System.out.println("Ingrese el tamaño del arreglo");
        n = sc.nextInt();
        double[] arreglo = new double[n]; // creamos un arreglo para almacenar 20 elementos
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Dato " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt(); //Guardamos los datos en el arreglo uno por uno
            System.out.println("-----------------");//en el rango buscado y lo almacenamos en el arreglo
        }
        Arrays.sort(arreglo);
        System.out.println("--------Datos ordenados---------");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(" "+arreglo[i]);
        }
           System.out.println(" ");
        System.out.println("Mediana: "+Mediana(arreglo));
    }


    
    private static double Mediana(double[] arr){
        double mediana;
        int numElementos = arr.length;
        if(numElementos % 2 == 0){
            double Medios = arr[numElementos/2] + arr[numElementos/2 - 1]; 
            mediana = (double)Medios / 2; 
        } else {
            mediana = arr[numElementos/2];
        }
        return mediana;
    }
}
