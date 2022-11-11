
package com.dio.javabeginners.aula13.ordenarlista;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

        /*
        Crie uma lista e ordene esta lista exibindo, nome, idade e cor dos
        meus cachorros. Criando uma classe Cachorros e uma lista do tipo Cacho
        rro. Com o construtor, crio os atributos.Como está private, vou chamar
        o get.
        */  

public class OrdenarList  {
    public static void main(String[]args)
    {
      List<Cachorro> dog = new ArrayList<Cachorro>();
        
           
        
        
        
       
        
     
    }

class Cachorro extends OrdenarList {
      
     
    private String nome;
    private Integer idade;
    private String cor;
    
    public Cachorro (String nome, Integer idade, String cor)
    {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
      
    }
    
    public String getNome()
    {
        return nome;
    }

    public Integer getIdade()
    {
        return idade;
    }
    
    public String getCor()
    {
        return cor;
    }
    
    //insert toString em Source insert code
    @Override
    public String toString() {
     return "{" + "nome=" + nome + ", idade=" + idade + ", cor=" + 
             cor + '}';
    }
    
}



}




