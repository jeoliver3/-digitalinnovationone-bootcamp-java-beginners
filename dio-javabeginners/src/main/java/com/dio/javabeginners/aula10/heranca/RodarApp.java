package com.dio.javabeginners.aula10.heranca;


public class RodarApp {
     public static void main(String[]args)
   {
     
       //Criando vetor da ClasseMae com 3 objetos e um foreach para iterar 
       ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), 
           new ClasseFilha2(), new ClasseMae()};
       
       //chamando o metodo1 de cada objeto
       for (ClasseMae classe : classes)
       {
           classe.metodo1();
       }
       
       for(ClasseMae classe : classes)
       {
           classe.metodo2();
       }
   }
}
