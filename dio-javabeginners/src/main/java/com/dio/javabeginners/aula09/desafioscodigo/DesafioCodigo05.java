package com.dio.javabeginners.aula09.desafioscodigo;

import java.util.Scanner;

public class DesafioCodigo05 
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("digite um numero");
        int num = input.nextInt();
        
        
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        
        System.out.println(achar(num, elementos));
        
    }
            
           public static String achar(int num, int[] elementos)
           {
            for(int i = 0; i < elementos.length; i++ )
            {
                if(elementos[i] == num)
                {
                    return "Achei " + elementos[i] + " na posicao " + i;
                }
                
            }
                return "Numero " + num + " nao encontrado!";
            }
       
    
}  
