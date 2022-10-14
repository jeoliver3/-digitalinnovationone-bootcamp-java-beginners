package com.dio.javabeginners.aula02.operadores;


public class OperadoresUnarios {
    public static void main(String[] args)
    {
 /*Operadores Unários: incremento, decremento, inversão de valores numéricos, 
   booleanos*/
   
//Operador unário valor positivo (+) são positivos sem esse operador explicito.
//operador unário de valor negativo(-) nega um número ou expressão aritmetica
        int num = 5;
        num = -num;
        System.out.println("" + num);
     
// Operador unário de incremento (++)
        int numero = 5;
        numero++;
        System.out.println("" + numero); // numero = numero + 1
               
// Operador unário de decremento
        int numero2 = 5;
        numero2--;
        System.out.println("" + numero2); // numero2 = numero2 - 1
        
//Operador lógico de negação (!) - nega o valor de uma expressão booleana
// Inverte o valor  de uma expressão booleana

        boolean maiorIdade = true;
        
        maiorIdade = !maiorIdade;
        System.out.println(maiorIdade);
    
    
    }
}
