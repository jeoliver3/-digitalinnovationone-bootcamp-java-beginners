
package com.dio.javabeginners.aula01;


public class ConcatenandoMetodo {
    public static void main(String[] args)
    {
    
     //Concatenando método
    String primeiroNome = "Jessy";
    String segundoNome = "Oliver";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    //Chamada da função com seus parâmetros, recebendo as duas variáveis.
    //Variável nomeCompleto recebe a função nomeCompleto.
    
       System.out.println(nomeCompleto);    
       
   
   }
   
   public static String nomeCompleto(String primeiroNome, String segundoNome)
   {
    return"Resultado do método "+  primeiroNome.concat(" ").concat(segundoNome);
          
    }

}
