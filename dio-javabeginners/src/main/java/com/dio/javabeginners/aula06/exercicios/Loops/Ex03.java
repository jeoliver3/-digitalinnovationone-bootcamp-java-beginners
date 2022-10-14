
package com.dio.javabeginners.aula06.exercicios.Loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe o maior número e a média deles.
int count vai ser uma variável contadora.
*/

public class Ex03 {
    public static void main(String[]args)
    {
    
        Scanner input = new Scanner(System.in);
        
        int num;
        int count = 0;
        int maior = 0;
        int soma = 0;
        
        do
        {
        System.out.println("Digite um número: ");
        num = input.nextInt(); 
        
        soma = soma + num;
        
        if(num > maior)
            maior = num;
        
        count++;
        }
       while(count < 5);
        
        System.out.println("Maor número é : " +maior);
                System.out.println("Média " + (soma / 5));

    }
}
