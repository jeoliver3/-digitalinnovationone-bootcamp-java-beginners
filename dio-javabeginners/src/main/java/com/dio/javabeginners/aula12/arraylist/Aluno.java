
package com.dio.javabeginners.aula12.arraylist;

import java.util.ArrayList;
import java.util.List;


/*

Exercício Interface List, utilizando métodos dessa interface
Dada uma lista com 7 notas de um aluno {7.0,8.5,9.3,5.0,7.0,0.0,3.6}

*/
public class Aluno {
    public static void main(String[]args)
    {
        
        //Crie uma lista e add as 7 notas 
        
        List<Double> notas = new ArrayList<Double>();
        
        //Usando método add
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas); // executa os valores do array
        
        System.out.println(notas.toString());// ou utilizando método toString
        
        /*Exiba a posição da nota 5.0 utilizando método indexOf, que passa o 
        objeto e retorna um int. Esse int é a posição */
        
        System.out.println("Posição da nota 5.0 é: " + notas.indexOf(5d));
        //poderia ser tb 5.0 no lugar de 5d
        
        /*
        Adicione na lista a nota 8.0 na posiçnao 4
        */
        
        notas.add(4, 8d); // passando na posição 4 do índice, elemento 8.0
        
        System.out.println(notas);
        //na saída a lista na posiçnao 4 vai ter valor 8
        
        /*
        Substituir a nota 5.0 pela nota 6.0. o método de substituição é set
        */
        
        notas.set(notas.indexOf(5d), 6.0); 
       //mostra a posição no índice e add elemento (6.0) que queremos substituir
        System.out.println(notas);
        
        /*
        Confira se a nota 5.0 está na lista
        */
        
     System.out.println("Nota 5.0 está na lista? " + notas.contains(5d));
         /*
        Método contains retorna um boolean. A saída será false porque 5.0 foi
        substituida pela nota 6.0
        */
        
         for(Double nota : notas)
             System.out.println(nota);
         /*
         Exiba todas as notas na ordem em que foram informadas.
         Executabdo com for each para ficar uma debaixo da outra.
         */
                 
    
    }
    
    
}
