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
public class Pt4 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Ingrese la coordenada X");
        x=sc.nextInt();
        System.out.println("Ingresa la coordenada Y");
        y=sc.nextInt();
        
         System.out.println("Puntaje: "+Lanzamiento(x, y));
       

     }
 
    static String Lanzamiento(int x, int y) {

        double dist = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        String resultado = "";
        if (dist < 1) {
            resultado = "15 puntos";
        } else {
            if (1 < dist && dist <= 2) {
                resultado = "9 puntos";
            } else {
                if (2 < dist && dist <= 3) {
                    resultado = "5 puntos";
                } else {
                    if (3 < dist && dist <= 4) {
                        resultado = "2 puntos";
                    } else {
                        if (4 < dist && dist <= 5) {
                            resultado = "1 punto";
                        } else {
                            resultado = "0 puntos, cayó fuera del tablero";

                        }
                    }
                }
            }
        }
        return resultado;
    }

}
