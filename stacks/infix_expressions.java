import java.util.Stack;

public class infix_expressions {
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
    public static int solvingInfixexp(String str){ //without brackets
        int n = str.length();
        Stack<Integer> numsh = new Stack<>();
        Stack<Character> opsh = new Stack<>();
        int res = 0;

        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                int element = ch - '0';
                numsh.push(element);
            } else if(opsh.isEmpty() || getPrecedence(opsh.peek()) < getPrecedence(ch)) {
                opsh.push(ch);
            } else {
                while (!opsh.isEmpty() && getPrecedence(opsh.peek()) >= getPrecedence(ch)) {
                    int v1 = numsh.pop();
                    int v2 = numsh.pop();
                    char op = opsh.pop();
                    int result;
                    switch (op) {
                        case '+': result = v2 + v1; break;
                        case '-': result = v2 - v1; break;
                        case '*': result = v2 * v1; break;
                        case '/': result = v2 / v1; break;
                        default: throw new IllegalArgumentException("Unknown operator: " + op);
                    }
                    numsh.push(result);
                }
                opsh.push(ch);
            }
        }

        res = numsh.pop();
        return res;
    }
    public static int solvingInfixexpwithbrackets(String s) { //with brackets
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
        String str = "9-5+3*4/6";
        System.out.println(solvingInfixexp(str));

        String s = "1-(     -2)";
        System.out.println(solvingInfixexpwithbrackets(s));
        // System.out.println(s);
    }
}
