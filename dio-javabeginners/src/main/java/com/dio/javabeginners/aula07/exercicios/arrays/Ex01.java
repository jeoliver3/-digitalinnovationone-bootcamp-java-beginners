
package com.dio.javabeginners.aula07.exercicios.arrays;


/*
Crie um vetor de 6 números inteiros e mostre-os na ordem inversa das posições
*/
public class Ex01 {
    public static void main(String[]args)
    {
    
    int[] num = {-5, -6, 15, 50, 8, 4};// 6 elementos no array. 
    
    int count = 0;
    while(count < num.length)
    {
        System.out.println(num[count]);

        count++;
    }

        for(int i = (num.length -1); i >= 0; i--) // decrementando. i recebe
            //o array menos 1, enquanto i for igual a 0
        {
            System.out.println(num[i]);
        }
    
    
    
    
    }
}
