
package com.dio.javabeginners.aula09.desafioscodigo;

import java.util.Scanner;

/*
Nesse desafio, dados dois números, verifique se eles são iguais. 
Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” 
sem as aspas. 
*/

public class DesafioCodigo02 {
    public static void main(String[]args){
        
     Scanner input = new Scanner(System.in);
     
     int A, B;
     
     System.out.println("Digite o primeiro numero: ");
     A = input.nextInt();
     System.out.println("Digite o segundo numero: ");
     B = input.nextInt();
    
    
    
    if(A == B)
    
    {
      System.out.println("Sao iguais!");
    }
    else
    {
      System.out.println("Nao sao iguais!");
    }
    
}
}
