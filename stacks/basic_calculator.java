import java.util.*;

public class basic_calculator {
    public static int getPrecedence(char ch){
        switch (ch) {
            case '+':
            case '-':
                return 0;
            case '*':
            case '/':
                return 1;
            case '^':
                return 2;
            default:
                throw new IllegalArgumentException("Operator unknown: " + ch);
        }
    }
    public static int calculate(String s) { //with brackets
        s = s.replaceAll("\\s+","");
        int n = s.length();
        Stack<Integer> numsh = new Stack<>();
        Stack<Character> opsh = new Stack<>();
    
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int element = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    element = element * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                numsh.push(element);
            } else if (ch == '(') {
                opsh.push(ch);
            } else if (ch == ')') {
                while (!opsh.isEmpty() && opsh.peek() != '(') {
                    int v1 = numsh.pop();
                    int v2 = 0;
                    if(!numsh.isEmpty()) v2 = numsh.pop();
                    char op = opsh.pop();
                    int result;
                    switch (op) {
                        case '+': result = v2 + v1; break;
                        case '-': result = v2 - v1; break;
                        case '*': result = v2 * v1; break;
                        case '/': result = v2 / v1; break;
                        case '^' : result = (int) Math.pow(v2, v1); break;
                        default: throw new IllegalArgumentException("Unknown operator: " + op);
                    }
                    numsh.push(result);
                }
                opsh.pop();
            } else {
                if (ch == '-' && (i == 0 || s.charAt(i - 1) == '(')) {
                    int element = 0;
                    i++;
                    while (i < n && Character.isDigit(s.charAt(i))) {
                        element = element * 10 + (s.charAt(i) - '0');
                        i++;
                    }
                    i--;
                    numsh.push(-element);
                } else {
                    while (!opsh.isEmpty() && opsh.peek() != '(' && getPrecedence(opsh.peek()) >= getPrecedence(ch)) {
                        int v1 = numsh.pop();
                        int v2 = 0;
                        if(!numsh.isEmpty()) v2 = numsh.pop();
                        char op = opsh.pop();
                        int result;
                        switch (op) {
                            case '+': result = v2 + v1; break;
                            case '-': result = v2 - v1; break;
                            case '*': result = v2 * v1; break;
                            case '/': result = v2 / v1; break;
                            case '^' : result = (int) Math.pow(v2, v1); break;
                            default: throw new IllegalArgumentException("Unknown operator: " + op);
                        }
                        numsh.push(result);
                    }
                }
                opsh.push(ch);
            }
        }
    
        while (!opsh.isEmpty()) {
            int v1 = numsh.pop();
            int v2 = 0;
            if(!numsh.isEmpty()) v2 = numsh.pop();
            char op = opsh.pop();
            int result;
            switch (op) {
                case '+': result = v2 + v1; break;
                case '-': result = v2 - v1; break;
                case '*': result = v2 * v1; break;
                case '/': result = v2 / v1; break;
                case '^' : result = (int) Math.pow(v2, v1); break;
                default: throw new IllegalArgumentException("Unknown operator: " + op);
            }
            numsh.push(result);
        }
    
        return numsh.pop();
    } 
    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        // s = s.replaceAll("\\s","");
        // System.out.println(s);
        System.out.println(calculate(s));

        String news = "1-(     -2)";
        System.out.println(calculate(news));
    }
}
