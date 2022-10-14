
package com.dio.javabeginners.aula08.metodos;


/*
Crie um programa que informe  a partir da hora do dia passada por parâmetro 
a seguinte mensagem:
-Bom dia / boa tarde ou boa noite.
*/

public class MensagemDoDia {
    public static void obterMensagem(int hora)
    {
    if(hora >= 5 && hora <= 12)
    {
        bomDia();
    }
    else if(hora >= 13 && hora <= 17)
    {
        boaTarde();
    }
    else if (hora >= 18 && hora <= 24)
    {
        boaNoite();
    }
    else if(hora >= 1 && hora <= 4)
    {
        boaNoite2();
    }
    
    }
            
    
     public static void  bomDia()
     {
         System.out.println("Bom dia");
     }
    public static void  boaTarde()
     {
         System.out.println("Boa Tarde");
     }
    public static void boaNoite()
     {
         System.out.println("Boa Noite");
     }
    public static void  boaNoite2()
     {
         System.out.println("Boa Noite");
     }
    
}
