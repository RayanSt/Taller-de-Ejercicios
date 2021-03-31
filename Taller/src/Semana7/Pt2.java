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
public class Pt2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, n;
        System.out.println("Ingrese el tamaño del arreglo");
        n = sc.nextInt();

        //double Datos[] = llenar(n);
        double Datos[] = {1,2,3};
        if (EstaOrdenado(Datos)) {
            System.out.println("El arreglo esta ordenado");
        } else {
            System.out.println("El arreglo NO esta ordenado");
        }

        //double menor = MenorDeCuatro(Izq, Dere, Arri, Abaj);
    }

    public static double[] llenar(int tam) {
        double[] arreglo = new double[tam]; // creamos un arreglo para almacenar 20 elementos
        int num = 0;
        System.out.println("los numeros aleatorios son:");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 20 + 1); //generamos un numero aleatorio
            //en el rango buscado y lo almacenamos en el arreglo
            System.out.print(arreglo[i] + ",");
        }
        System.out.println("");
        return arreglo;
    }

    public static boolean EstaOrdenado(double[] arreglo) {
        boolean salida = true;
        for(int i = 0; i < arreglo.length; i++) {
            if(i!=arreglo.length-1)
            if (arreglo[i]>arreglo[i+1]) {
                salida=false;
            }

        }
        return salida;
    }
}