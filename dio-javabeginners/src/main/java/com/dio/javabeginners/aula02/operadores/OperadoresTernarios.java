package com.dio.javabeginners.aula02.operadores;


public class OperadoresTernarios {
    public static void main(String[]args)
    {
        int a = 5;
        int b = 6;
        String resultado = "";
        
        if(a == b)
        {
            resultado = "truthy";
        }
        else
        {
            resultado = "false";
        }
        System.out.println(resultado);
        
        // Modo abreviado com o uso do operador ternário
        
        int x = 5;
        int y = 6;
        String resultado1 = x==y ? "truthy" : "false"; // com string
        System.out.println(resultado1);
        
        int v = 5;
        int c = 4;
        int resultado3 = v==c ? 1 : 0; //com inteiro
        System.out.println(resultado3);
        
        
   // Interpreta: string resultado recebe a condição  se a é igual a b se for
  // true ?, imprime truthy, senão : imprime false.
        
        
    
    }
}
