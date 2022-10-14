package com.dio.javabeginners.aula03.metodo;

public class Usuario {
    public static void main(String[]args)
    {
        SmartTv smartTv = new SmartTv();
    
        System.out.println("TV ligada? " +smartTv.ligada);
        System.out.println("Canal atual? " +smartTv.canal);
        System.out.println("Volume " +smartTv.volume); 
        //Definindo se smartv está ligada, em qual canal está e qual volume
        
        smartTv.ligar(); //chamando método - validando
        System.out.println("TV ligada? " +smartTv.ligada);
        
        smartTv.desligar();// chamando método - validando
        System.out.println("TV ligada? " +smartTv.ligada);
        
        /*
            Volume - que começa com 25. Com o incremento, vai aumentar duas vezes
        ou seja, somar mais 2 e depois vai decrementar uma vez, ou seja, 
        diminuir um.    */
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("" +smartTv.volume);
        
        //Canal
        
        System.out.println("Canal atual " + smartTv.canal);
        
        smartTv.mudarCanal(13);
        System.out.println("Novo Canal "+smartTv.canal);
        
         
    }
}
