package com.dio.javabeginners.aula08.metodos;

/*
Crie um programa que calcule o valor final de um empréstimo a partir do valor
solicitado. Add taxas e parcelas.
*/

public class Emprestimo {
    public static int getDuasParcelas()
    {
        return 2;
    }
    public static int getTresParcelas()
    {
        return 3;
    }
 // quando esses métodos forem chamados na calsse Main, devem retornar 
 //int no parametro
    
    public static double getTaxaDuasParcelas()
    {
        return 0.3;// taxa de 30% para parcelar em 2x
    }
    public static double getTaxaTresParcelas()
    {
        return 0.45; //taxa de 45% para parcelar em 3x
    }
    public static void Calcular(double valor, int parcelas)
    {
        if(parcelas == 2)
        {
            double valorFinal= valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final em 2x: " + valorFinal);
        }
        else if (parcelas == 3)
        {
            double valorFinal = valor + (valor *getTaxaTresParcelas());
            System.out.println("Valor final em 3x: " + valorFinal);
        }
        else
        {
            System.out.println("Quantidade de parcelas não aceita");
        }
    }
    
  
    
}
