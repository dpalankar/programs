package datastructure.programs;

import java.util.Stack;

public class BracketValidator {

    public static void main(String[] args) {
        String str1 = "a[b]bc(}b})";       // Invalid
        String str2 = "a[b]bc(fd){b}";     // Valid

        System.out.println(str1 + " >> " + (isValid(str1) ? "Valid" : "Invalid"));
        System.out.println(str2 + " >> " + (isValid(str2) ? "Valid" : "Invalid"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (!isMatchingPair(top, ch)) return false;
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
