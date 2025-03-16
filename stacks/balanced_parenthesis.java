import java.util.Stack;

public class balanced_parenthesis {
    public static boolean isValid(String s){
        int n = s.length();
        Stack<Character> sh = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                sh.push(ch);
            } else {
                if(ch == ')' && sh.peek() == '(') sh.pop();
                else if(ch == ']' && sh.peek() == '[') sh.pop();
                else if(ch == '}' && sh.peek() == '{') sh.pop();
            }
        }
        return sh.isEmpty();
    }
    public static void main(String[] args) {
        String s = "([])";
        System.out.println(isValid(s));
    }
}
