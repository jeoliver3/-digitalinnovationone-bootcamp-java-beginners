package com.dio.javabeginners.aula08.metodos;

/*
Crie um programaque resolva as seguintes situações:
- Calcule 4 operações básica de soma, subtração, multiplicação e divisão
- Sempre passando dois valores nos parâmetros

*/

public class Calculadora {
  
    public static void somar(double num1, double num2)
  {   
      
      double resultado = num1 + num2;
      System.out.println("Resultado da soma é : " + resultado);
  } 
    
    public static void subtrair(int num1, int num2)
    {
        int resultado = num1 - num2;
        System.out.println("Resultado da subtracao é: " + resultado);
        
    }
    public static void multiplicar(int num1, int num2)
    {
        int resultado = num1 * num2;
        System.out.println("Resultado da multiplicação é: " + resultado);
    }
    
    public static void dividir(int num1, int num2)
    {
        int resultado =  num1 / num2;
        System.out.println("Resultado da divisão é: " + resultado);
        
    }
    
}
