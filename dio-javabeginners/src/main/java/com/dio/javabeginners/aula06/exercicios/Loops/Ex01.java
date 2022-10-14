
package com.dio.javabeginners.aula06.exercicios.Loops;

import java.util.Scanner;

/*
Faça um programa que leia o conjunto de dois valores, o 1º representando nome
do aluno e o 2º a sua idade. Encerre o looping inserindo 0 como parador.
*/

public class Ex01 {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
        String nomeAluno;
        int idadeAluno;
        
        while(true)
        {
        System.out.println("Digite o nome do aluno(a): ");
        nomeAluno = input.next();
        if(nomeAluno.equals("0")) break;
        System.out.println("Digite a idade: ");
        idadeAluno = input.nextInt();
        }
        
         System.out.println( "Usando 0 como parador");
        
    
    
    
    }
}
