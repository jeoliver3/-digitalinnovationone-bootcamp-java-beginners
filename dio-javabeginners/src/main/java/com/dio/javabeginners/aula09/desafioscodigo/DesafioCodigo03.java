
package com.dio.javabeginners.aula09.desafioscodigo;

import java.util.Scanner;

public class DesafioCodigo03 
{
    public static void main(String[]args)
    {
    
       System.out.println(somatorio(4));   
   
    }
    
    static int somatorio(int numero)
    {
        
        
        int soma = 0;
        
        for(int i = numero; i >= 0; i--)
            
           {
                   
               soma = soma+i;
               
           }
          return soma;   
    }
     
}
