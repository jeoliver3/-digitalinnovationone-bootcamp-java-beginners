
package com.dio.javabeginners.aula06.exercicios.Loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo
usuário. Ex: fatoria de 5: 
5! = 120 (5x4x3x2x1)
*/




public class Ex06 {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Digite um número: ");
        int fatorial = input.nextInt();
        int multi = 1;
        
        for(int i = fatorial; i >= 1; i--)
        {
            multi = multi * i;
        }
        System.out.println("Fatorial é: " + multi);
        
    
    }
}
