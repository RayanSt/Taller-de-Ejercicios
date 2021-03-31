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
import java.io.*;
import java.util.Scanner;

public class Pt3 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        double A, B, C;
        System.out.print("Ingrese logitud del lado A:");
        A = lector.nextDouble();
        System.out.print("Ingrese logitud del lado B:");
        B = lector.nextDouble();
        System.out.print("Ingrese logitud del lado C:");
        C = lector.nextDouble();
        TipoDeTriangulo(A, B, C);
    }

    public static void TipoDeTriangulo(double a, double b, double c) {
        if (a == b && b == c) {
            System.out.println("El Triangulo es Equilatero");
        } else {
            if (a == b || a == c || b == c) {
                System.out.println("El Triangulo es Isoceles");
            } else {
                if (a != b || a != c || c != b) {
                    System.out.println("El Triangulo es Escaleno");
                }
            }
        }
    }
}