
package com.dio.javabeginners.aula11.iterfacee;

//Criando classe que implementa todos os métodos de OperacaoMatematica

 class Calculadora implements OperacaoMatematica {
    
    @Override // sobrescreve
    public  void somar(double num1, double num2)
    {
        System.out.println("Soma é :" + num1 + num2);
    }
    
    @Override
    public void subtrair(double num1, double num2)
    {
        System.out.println("Subtração é " + (num1 - num2));
    }
    
    @Override
    public void multiplicar(double num1, double num2)
    {
        System.out.println("Multiplicação é " + num1 * num2);
    }
    
    @Override
    public  void dividir(double num1, double num2)
    {
        System.out.println("Divisão é " + num1 / num2);
    }
}
