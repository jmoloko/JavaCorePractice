package com.moloko.javapractice.TextBracketsAnalyzer;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author Jack Milk
 */
public class TextBracketsAnalyzer {
    public static String checkBrackets(String s){
        HashMap<Character,Character> brackets = new HashMap<>();

        brackets.put(')', '(');
        brackets.put('}','{');
        brackets.put(']','[');

        Stack<Character> stack = new Stack<>();
        char temp;
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if(brackets.containsValue(temp)){
                stack.push(temp);
            } else if (!brackets.containsKey(temp)){
                continue;
            } else {
                if(stack.isEmpty() || stack.peek() != brackets.get(temp)) return s + " -> не корректно";
                stack.pop();
            }
        }
        if (stack.isEmpty()) return s + " -> корректно";
        else return s + " -> не корректно";
    }
}
