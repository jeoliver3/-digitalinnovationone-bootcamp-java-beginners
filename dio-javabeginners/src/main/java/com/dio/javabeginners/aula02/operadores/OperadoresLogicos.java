package com.dio.javabeginners.aula02.operadores;


public class OperadoresLogicos {
   public static void main(String[] args)
   {
//Operadores lógicos: && || - AND , OR.
//&& todas as condições devem ser verdadeiras. || uma sendo verdadeira já valida
       
       boolean condicao1 = true;
       boolean condicao2 = true;
       
       if(condicao1 && condicao2)
       {
           System.out.println("As duas condições são verdadeiras");
       }
        
       boolean condicao3 = false;
       boolean condicao4 = true;
       
       if(condicao1 || condicao2)
       {
           System.out.println("Uma das condições são verdadeiras");
       }
   } 
}
