
package com.dio.javabeginners.aula15.desafiojava;

import java.util.Scanner;

public class QuadradosPerfeitos {
    
    public static void main(String[] args) {
       
        System.out.println("Digite um numero");
        
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        
        int result, count, total;
        
        int[] d = new int[n + 1];

        for (int i = 1; i < d.length; i++) {
            if (i * i <= n) {
                d[i] = i * i;
            } else {
                i = d.length - 1;
            }
        }
        total = 100;
        for (int i = d.length - 1; i> 0 && i <= n; i--) {

            if (i >0 && d[i] > 0) {

                result = n;
                count = 0;

                for (int j = i; j > 0; j--) {

                    while (result > 0) {
                        if (result >= d[j]) {
                            result = result - d[j];
                            count++;
                        } else {
                            j--;
                        }
                    }
                }
                if (total > count) {
                    total = count;
                }
            }
        }
        System.out.println(total);
    }
}
