
package com.dio.javabeginners.aula09.desafioscodigo;

import java.util.Scanner;

/*
Desafio de Código

Dado um número A e o seu limite N, encontre a soma de todos os múltiplos 
A até o seu limite N.

*/


public class DesafioCodigo01 {
  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um  num");
        int A = input.nextInt();
        int N = 20;
        int soma = 0;
        
       
        for(int i = 0; i <= N; i++)
        {
            if(i % A == 0)
            
            {
                 //soma =  soma +=i; 
                soma = soma+i; //incrementa com i
                
            }   
               
        }
            System.out.println(soma); 
    }
}
    

