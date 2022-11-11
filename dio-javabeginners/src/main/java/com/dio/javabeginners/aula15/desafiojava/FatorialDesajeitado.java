
package com.dio.javabeginners.aula15.desafiojava;

import java.util.*;

public class FatorialDesajeitado {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um nunero inteiro: ");
        int n = Integer.parseInt(new Scanner(System.in).nextLine()); 
        

        if (n <= 2) {
            n = n * 1;
            System.out.println(n);

        } else {
            int res = 0;
            int cnt = 1;
            int tmp = n;
            n--;
            while (n > 0) {
                tmp *= n;
                n--;
                if (n != 0) {
                    tmp /= n;
                    n--;
                }
                tmp += n;
                n--;

                res += tmp;

                tmp = -n;
                if (n == 1) {
                    res += tmp;
                }

                n--;

            }
            System.out.println(res);
        }
    
    
    
    }
}
