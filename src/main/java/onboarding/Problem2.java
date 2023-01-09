package onboarding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Problem2 {
    public static String solution(String cryptogram) {

        Stack<String> stack = new Stack<>(); //char형 스택 선언

        char[] arrCrypto = new char[cryptogram.length()];
        for(int i = 0; i < cryptogram.length(); i++)
            arrCrypto[i] = cryptogram.charAt(i);

        System.out.println(arrCrypto);

        for( int i = 0; i < cryptogram.length(); i++){
            if(stack.empty())
                stack.push(String.valueOf(arrCrypto[i]));
            else{
                if(stack.peek() == String.valueOf(arrCrypto[i])){
                    System.out.println(stack.peek());
                    System.out.println(arrCrypto[i] + " pop");
                    stack.pop();
                }
                if(stack.peek() != String.valueOf(arrCrypto[i])){
                    System.out.println(stack.peek());
                    System.out.println(arrCrypto[i] + " push");
                    stack.push(String.valueOf(arrCrypto[i]));
                }
            }
            System.out.println(stack);
        }
        return stack.toString();
    }

}
