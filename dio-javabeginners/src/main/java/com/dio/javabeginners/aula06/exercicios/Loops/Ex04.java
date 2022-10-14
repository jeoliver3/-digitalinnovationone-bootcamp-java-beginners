
package com.dio.javabeginners.aula06.exercicios.Loops;

import java.util.Scanner;


/*
Faça um programa que peça N números inteiros, calcule e mostre a qtdade de 
números ímpares.

*/
public class Ex04 {
     public static void main(String[]args)
    {
    
        Scanner input = new Scanner(System.in);
        
        int num;
        int count = 0;
        int par = 0;
        int impar = 0;
        
        
        
        do
        {
            System.out.println("Digite um número: ");
            num = input.nextInt();
            
            if(num % 2 == 0)
                par++;
            else
                impar++;
            
            
            count++;
        }
        while(count < 3);
        
        System.out.println("Numeros pares: " +par);
        System.out.println("Numeros impares: " +impar);

        
    }
}
