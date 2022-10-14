
package com.dio.javabeginners.aula08.metodos;


public class Main {
    public static void main(String[]args)
    {
      /*Chamando o método somar/subtrair/multiplicar e dividir
       atraves da classe Calculadora e atribuindo valores nos parâmetros*/
      
        Calculadora.somar(10.5, 20.5);
        Calculadora.subtrair(40,20 );
        Calculadora.multiplicar(10, 15);
        Calculadora.dividir(45, 15);
    
    
      /* Chamando o método bomDia/boaTrade/boaNoite atraves da classe 
          MensagemDodia e atribuindo valor hora no parâmetro*/
   
    
        MensagemDoDia.obterMensagem(23);
     
        
        /*
        Na chamada do método é muito comum passar outro método como parâmetro.
        O retorno desse método na chamada será o num de parcelas setado na 
        classe Emprestimo.
        
        */
        Emprestimo.Calcular(500, Emprestimo.getDuasParcelas());
        Emprestimo.Calcular(500, Emprestimo.getTresParcelas());
       
        
        //CalcularArea usando sobrecarga
        
        SobrecargaQuadrilatero.calcularArea(3);
        SobrecargaQuadrilatero.calcularArea(4,6);
        SobrecargaQuadrilatero.calcularArea(4,4,2);
        SobrecargaQuadrilatero.calcularArea(2f,2f);
        
        
        //Retornos - criou novas variáveis para chamar o método
        
        double areaQuadrado = Return.calcularArea(2);
        System.out.println("Area do quadrado é: " + areaQuadrado);
        double areaRetangulo = Return.calcularArea(2,6);
        System.out.println("Area do retangulo é: " + areaRetangulo);
        double areaTrapezio = Return.calcularArea(2,6,3);
        System.out.println("Area do trapézio é: " + areaTrapezio);
         double areaLosango = Return.calcularArea(2f,6f);
        System.out.println("Area do losango é: " + areaLosango);
        
        
        
        
        
    }
}
