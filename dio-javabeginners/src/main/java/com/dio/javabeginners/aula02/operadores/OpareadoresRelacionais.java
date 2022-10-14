package com.dio.javabeginners.aula02.operadores;


public class OpareadoresRelacionais {
    public static void main(String[] args)
    {
        //Operadores Relacionais: == != > < >= <= 
        //igualdade, diferença, maior, menos, maior igual, menor igual
        
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 10;
        
        if(numero1 == numero3)
        {
            System.out.println("Números são iguais");
        }
        else
        {
            System.out.println("Números são diferentes ");
        }
        if(numero2 > numero1)
        {
            System.out.println("Número2 é maior");
        }
        else
        {
            System.out.println("Número1 é maior");
        }
        if(numero3 < numero2)
        {
            System.out.println("Número3 é menor");
        }
        if(numero1 != numero2)
        {
            System.out.println("Números são diferentes");
        }
        else
        {
            System.out.println("Números são iguais");
        }
                    
        
    }
}
