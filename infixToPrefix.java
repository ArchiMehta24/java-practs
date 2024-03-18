import java.util.Scanner;
import java.util.Stack;

class infixToPrefix {
    static int precedence(char ch) {
        switch(ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPrefix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        // Reverse the infix expression
        exp = new StringBuilder(exp).reverse().toString();

        for(int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if(Character.isLetterOrDigit(c))
                result.append(c);
            else if(c == ')')
                stack.push(c);
            else if(c == '(') {
                while(!stack.isEmpty() && stack.peek() != ')')
                    result.append(stack.pop());
                if(!stack.isEmpty() && stack.peek() != ')')
                    return "Invalid Expression";
                else
                    stack.pop();
            } else {
                while(!stack.isEmpty() && precedence(c) < precedence(stack.peek())) {
                    if(stack.peek() == ')')
                        return "Invalid Expression";
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty())
            result.append(stack.pop());

        return result.reverse().toString();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the infix expression:");
        String exp = scanner.nextLine();
        System.out.println("Prefix expression: " + infixToPrefix(exp));
        scanner.close();
    }
}
