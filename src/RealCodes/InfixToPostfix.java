package RealCodes;

import java.util.*;

public class InfixToPostfix {

    // Operator precedence mapping
    private static final Map<Character, Integer> precedence = Map.of(
        '+', 1,
        '-', 1,
        '*', 2,
        '/', 2,
        '^', 3 // ^ denotes exponentiation (highest precedence)
    );

    public static String infixToPostfix(String infixExpression) {
        StringBuilder postfix = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < infixExpression.length(); i++) {
            char current = infixExpression.charAt(i);

            // If current character is an operand (letter or digit), append it to the output
            if (Character.isLetterOrDigit(current)) {
                postfix.append(current);
            }
            // If current character is '(', push it to stack
            else if (current == '(') {
                stack.push(current);
            }
            // If current character is ')', pop and append all operators from the stack until '(' is encountered
            else if (current == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                // Remove '(' from the stack
                stack.pop();
            }
            // If an operator is encountered
            else {
                while (!stack.isEmpty() && precedence.getOrDefault(stack.peek(), 0) >= precedence.get(current)) {
                    postfix.append(stack.pop());
                }
                stack.push(current);
            }
        }

        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        String infixExpression = "a+b*(c^d-e)^(f+g*h)-i";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}