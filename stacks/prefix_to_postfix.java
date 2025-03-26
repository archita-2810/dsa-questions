import java.util.Stack;

public class prefix_to_postfix {
    public static String prefixTopostfix(String pre){
        int n = pre.length();
        Stack<String> sh = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            char ch = pre.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sh.push(ch + "");
            } else {
                if (sh.size() < 2) {
                    return "Invalid Expression";
                }
                String v1 = sh.pop();
                String v2 = sh.pop();
                String s = v1 + v2 + ch;

                sh.push(s);
            }
        }

        return (sh.size() == 1) ? sh.peek() : "Invalid Expression";
    }
    public static void main(String[] args) {
        String pre = "-9/*+5346";
        System.out.println(prefixTopostfix(pre));
    }
}
