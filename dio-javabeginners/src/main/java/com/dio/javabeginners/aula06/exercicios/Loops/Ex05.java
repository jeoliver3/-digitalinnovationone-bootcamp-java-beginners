
package com.dio.javabeginners.aula06.exercicios.Loops;


import java.util.Scanner;

/*
Desenvolva um gerador de tabuada capaz de gerar a tabuada de qq número inteiro
entre 1 a 10. O usuário deve informar de qual ele deseja ver a tabuada. A saída 
deve ser como no exemplo:

Tabuada de 5

5x1 = 5;
5x2 = 10;
5x10 = 50;

Utilizando laço for .

*/


public class Ex05 {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.println("Digite um núnero de 1 a 10 para a tabuada: ");
        int tabuada = input.nextInt();
    
        for(int i = 1; i <= 10; i++ )
        {
            System.out.println(tabuada + "x" + i + "=" +(tabuada*i));
        
        }
    
    
    }
}
