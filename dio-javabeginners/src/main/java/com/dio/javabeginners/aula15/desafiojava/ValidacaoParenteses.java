
package com.dio.javabeginners.aula15.desafiojava;

import java.util.*;

public class ValidacaoParenteses 
{
     public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    
       System.out.println("digite algo");
       boolean caracter = ehValido(input.nextLine());
       System.out.println(caracter);
        
}

      public static boolean ehValido(String s) {
        
        if (s == null || s.length() == 0) {
            return true;
        }
        char[] c_arr = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (Character c : c_arr) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (c == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty() ? true : false;
        }
}
