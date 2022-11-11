
package com.dio.javabeginners.aula15.desafiojava;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        String contrario = "";
        
        System.out.println("Digite uma palavra");
        String palavra = input.nextLine();

        
        for (int i = (palavra.length() -1); i >= 0; i--) 
        {
            contrario = contrario + palavra.charAt(i);
        }
        
        
        if (contrario.toLowerCase().equals(palavra.toLowerCase()) && contrario.
              toUpperCase().equals(palavra.toUpperCase()))
        {
            System.out.println("TRUE");
        } else 
        {
            System.out.println("FALSE");
        }
        
    }
}
