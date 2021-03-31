/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

import java.util.Scanner;

/**
 *
 * @author bparr
 */
public class Pt6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        do{
        System.out.println("Ingrese un valor entre 1 y 255");
        a=sc.nextInt();
        if(a<1 || a>255){
            System.out.println("Por favor ingrese un valor dentro de los parametros");
        }
        }while(a<1 || a>255);
        Conversor(a);
    }
    public static void Conversor(int a){
        char c = (char)a;  //defines la variable "c" como char, luego la inicializas con "(char) a" 
        System.out.println("Caracter especial: "+ c); // muestras la variable char "c" y muestra por pantalla " "
    }
}
