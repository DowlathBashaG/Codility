package io.dowlath.codility.stacksandqueues;

import java.util.Stack;

/**
 * @Author Dowlath
 * @create 6/16/2020 12:41 AM
 */

/*
     Note :

           push -> leftBrackets , like ( { , [ , (  )

           pop  -> rightBrackets , like ( } , ] , ) );

           if stack is empty return 1 ( true )

           else return 0 ( false )

 */
public class Brackets {
    public static void main(String[] args) {
       System.out.println(new Brackets().solution("[](){}"));
       System.out.println(new Brackets().solution("[(){}"));
    }

    private int solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for(Character character : ch){
            if( character == '{' || character == '[' || character == '(' ){
                stack.push(character);
            }else if (character == '}' ){
                if(stack.isEmpty() || stack.pop() != '{') return 0;
            }else if (character == ']' ){
                if(stack.isEmpty() || stack.pop() != '[') return 0;
            }else if (character == ')' ){
                if(stack.isEmpty() || stack.pop() != '(') return 0;
            }
        }
     return stack.isEmpty() ? 1 : 0;
    }

}
