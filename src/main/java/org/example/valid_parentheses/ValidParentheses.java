package org.example.valid_parentheses;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args){
//        String s = "(]";
//        String s = "([)]";
//        String s = "()[]{}";
        String s = "([}}])";
//        String s = "()";

        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> openToClose = new HashMap<>();
        openToClose.put('(',')');
        openToClose.put('[',']');
        openToClose.put('{','}');

        if(s.length()% 2 == 1) return  false;
        else {
        for(char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{' && openToClose.containsKey(c)) stack.push(c);
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(' && openToClose.get(stack.peek()) == c)
                stack.pop();
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{' && openToClose.get(stack.peek()) == c)
                stack.pop();
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[' && openToClose.get(stack.peek()) == c)
                stack.pop();
            else  return false;
            }
        }
        return stack.isEmpty();
        }
}
