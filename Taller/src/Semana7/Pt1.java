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

public class Pt1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, n;
        System.out.println("Ingrese el tamaño del arreglo");
        n = sc.nextInt();

        double Datos[] = llenar(n);

        System.out.println("Ingrese el dato a buscar");
        a = sc.nextInt();

        int posicion = Buscar(Datos, a);
        if (posicion == Datos.length) {
            System.out.println("El dato que busca no se encuentra en el arreglo");
        } else {
            System.out.println("El dato se encuentra en la posicion " + (posicion + 1));
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

    public static int Buscar(double[] arreglo, double dato) {
        int i = 0;
        while (i < arreglo.length) {
            if (dato == arreglo[i]) {

                break;
            } else {
                i++;
            }

        }
        return i;
    }

}
