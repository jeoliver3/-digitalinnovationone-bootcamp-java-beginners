
package com.dio.javabeginners.aula06.exercicios.Loops;

import java.util.Scanner;


/*
Faça um programa que peça uma nota entre 0 e 10. Mostre uma mensagem caso o
valor seja inválido e continue pedindo até que o usuário informe o valor válido.
Caso seja valor inválido (numeros menores que 0 ou maiores que 10, mostra
novamente a msg pedidindo nota.
*/
public class Ex02 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
    
        int nota;
        
        System.out.println("Digite uma nota de 0 a 10: ");
        nota = input.nextInt();
    
        while(nota < 0 || nota > 10)
        {
            System.out.println("Nota inválida, digite um núnero de 0 a 10: ");
            nota = input.nextInt();
        }
    
    }
}
