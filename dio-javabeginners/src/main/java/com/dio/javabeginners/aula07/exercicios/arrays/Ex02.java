
package com.dio.javabeginners.aula07.exercicios.arrays;

import java.util.Random;

/*
Faça um programa que leia 20 números aleátorios (entre 0 e 100) e armazene-os
em um vetor. Mostre seus números e seus sucessores.
*/


public class Ex02 {
    public static void main(String[]args)
    {
    
        Random random = new Random();
        
        int[] numAleatorio = new int[20];
        
        for(int i = 0; i < numAleatorio.length; i++)
        {
            int num = random.nextInt(100);
            numAleatorio[i] = num;
        }
        System.out.println("Numeros aleatorios: ");
        for(int num : numAleatorio)
        {
            System.out.println(num);
        }
        //Sucessores: add mais 1 ao número aleatório
        
        System.out.println("Sucessores: ");
        for(int num : numAleatorio)
        {
            System.out.println((num + 1) + "");
        }
        
        
    }
}
