package com.dio.javabeginners.aula08.metodos;


/*
Recrie o programa de cálculo dos quadriláteros, agora com retorno correspondente
aos tipos do método. Não são mais void.
*/


public class Return {
   
    public static double calcularArea(double lado) //quadrado
    {
        return lado * lado;
    }
    public static double calcularArea(double lado1, double lado2)//retangulo
    {
        return lado1 * lado2;
    }
   //trapézio
   public static double calcularArea(double base1, double base2, double altura)
   {
        return (base1 + base2) + altura / 2;
   }
    public static float calcularArea(float lado1, float lado2)//losango
   {
        return lado1 + lado2 / 2;
   }
    
    
}
