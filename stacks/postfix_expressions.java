import java.util.Stack;

public class postfix_expressions {
    public static int postfixEval(String s){
        int n = s.length();
        Stack<Integer> sh = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            int ascii = (int) ch;
            if(ascii >= 48 && ascii <= 57){
                sh.push(ascii-48);
            } else {
                int v2 = sh.pop();
                int v1 = sh.pop();
                if(ch == '+') sh.push(v1+v2);
                if(ch == '-') sh.push(v1-v2);
                if(ch == '*') sh.push(v1*v2);
                if(ch == '/') sh.push(v1/v2);
            }
        }

        return sh.peek();
    }
    public static String postfixExp(String str){
        int n = str.length();
        Stack<String> sh = new Stack<>();
        Stack<Character> opsh = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if(ascii >= 48 && ascii <= 57){
                String s = "" + ch;
                sh.push(s);
            } else if(opsh.size() == 0 || ch == '(' || opsh.peek() == '('){
                opsh.push(ch);
            } else if(ch == ')'){
                while(opsh.peek() != '('){
                    String v2 = sh.pop();
                    String v1 = sh.pop();
                    char o = opsh.pop();
                    String t = v1 + v2 + o;
                    sh.push(t);
                }
                opsh.pop(); //popping (
            } else {
                if(ch == '+' || ch == '-'){
                    String v2 = sh.pop();
                    String v1 = sh.pop();
                    char o = opsh.pop();
                    String t = v1 + v2 + o;
                    sh.push(t);
                    opsh.push(ch);
                } else if(ch == '*' || ch == '/'){
                    if(opsh.peek() == '*' || opsh.peek() == '/'){
                        String v2 = sh.pop();
                        String v1 = sh.pop();
                        char o = opsh.pop();
                        String t = v1 + v2 + o;
                        sh.push(t);
                        opsh.push(ch);
                    } else {
                        opsh.push(ch);
                    }
                }
            }
        }

        while(!opsh.isEmpty()){
            String v2 = sh.pop();
            String v1 = sh.pop();
            char o = opsh.pop();
            String t = v1 + v2 + o;
            sh.push(t);
        }

        return sh.peek();
    }
    public static void main(String[] args) {
        // String s = "953+4*6/-"; //for eval
        // System.out.println(postfixEval(s));

        String str = "9-(5+3)*4/6";
        System.out.println(postfixExp(str));
    }
}
