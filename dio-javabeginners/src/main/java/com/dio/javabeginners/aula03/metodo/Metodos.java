package com.dio.javabeginners.aula03.metodo;


public class Metodos {
    
 
    /*
        Conceito de métodos.
    
-Parâmetros e visibilidade
-Uma classe é definida por atributos e métodos
- Por uma convenção Java, deve ser definido como verbo
- Segue o padrão camelcase
- Qual a proposta do método? Tem uma finalidade?
- Qual o tipo de retorno esperado após executá-lo? Retorna algum valor? Caso
    contrario deve ser indicado com a palavra void - de vazio.
- Quais parâmetros serão necessários? Em uma soma por exemplo, necessito de dois
    argumentos pasados no parâmetro, dois valores.
- Método possui risco de apresentar alguma exceção? 


*Parametros    

    somar(int n1, int n2){};
    abrirConexao(){};
    findById(int id){};
    
    
 *Visibilidade
  
- Será  necessário todo método ficar visível para a aplicação?
    
    public class MyClass
    {
        public double somar(int num1, int num2)
    {
        return ...
    }
    
    
-   Método público do tipo double, vai somar e retornar um double.Tem um parâ
    metro que recebe 2 argumentos.
    
    public void imprimir(String texto)
    {
        nao retona nada
    }
- Método público que não retorna nada, vai imprimir, tem um parãmetro que recebe
    um argumento do tipo String.
    
    public double dividir(  int dividendo, int divisor)throwsException{}
- Indica que o método a ser utilizado poderá gerar uma exceção.
    
    private void metodoPrivado(){}
- Não pode ser visto por outras partes do programa
  
    }
    
  
* Em Java não existe o conceito de método global Todos os métodos devem 
    SEMPRE ser definidos dentro de uma classe.
    
    */
    
 
}
