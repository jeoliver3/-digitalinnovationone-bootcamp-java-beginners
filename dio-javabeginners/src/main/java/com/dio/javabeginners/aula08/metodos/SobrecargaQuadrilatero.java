
package com.dio.javabeginners.aula08.metodos;

/*
Crie uma aplicação que calcule a área dos 3 quadriláteros notáveis: quadrado,
retângulo, trapézio. Use sobrecarga! Método mantém o mesmo nome mas altera a 
lista de parâmetros.
*/


public class SobrecargaQuadrilatero {
    
    public static void calcularArea(double lado) //quadrado
    {
        System.out.println("Area do quadrado é : " + lado * lado);
    }
    public static void calcularArea(double lado1, double lado2)//retangulo
    {
        System.out.println("Area do retangulo é " + lado1 *lado2);
    }
   //trapézio
    public static void calcularArea(double base1, double base2, double altura )
   {
   System.out.println("Area do trapézio é : " + (base1 + base2) + altura / 2 );
   }
    public static void calcularArea(float lado1, float lado2)
   {
   System.out.println("Area do losângo é : " + (lado1 + lado2)  / 2 );//losango
   }
    
}
