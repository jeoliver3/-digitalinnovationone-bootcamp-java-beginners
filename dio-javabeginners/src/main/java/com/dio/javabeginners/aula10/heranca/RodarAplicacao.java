
package com.dio.javabeginners.aula10.heranca;


public class RodarAplicacao {
  public static void main(String[]args)
    {
        Funcionario funcionario = new Funcionario();
        
        //Criando upcast
        
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();
        
        
    }  
}
