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
public class Pt7 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contra = "";
        System.out.print("Ingrese una palabra: ");
        contra = sc.nextLine().trim();
        //es mas facil usar expresiones regulares para contralar, busca regex para que te enteres como es
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{10,}";
        if(contra.matches(pattern)){
            System.out.println("La contraseña es segura");
        }else{
            System.out.println("La contraseña no cumple los estandares");
        }
    }
}
