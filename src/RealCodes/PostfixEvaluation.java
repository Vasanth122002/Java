package RealCodes;
import java.util.*;

public class PostfixEvaluation {

    public static int evaluatePostfix(String postfixExpression) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < postfixExpression.length(); i++) {
            char current = postfixExpression.charAt(i);
//push() = add element to head,pop() = remove element from head,size() = return size of deque.
            // If current character is an operand (digit), push it onto the stack
            if (Character.isDigit(current)) {
                stack.push(current - '0'); // Convert char to int
            }
            // If current character is an operator
            else {
                // Pop two operands from stack
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                // Perform the operation based on the operator
                switch (current) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + current);
                }
            }
        }

        // The result is the only element left in the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfixExpression = "231*+9-"; // Example postfix expression
        int result = evaluatePostfix(postfixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
        System.out.println("Evaluation Result: " + result);
    }
}


