import java.util.Stack;

public class postfix_to_infix {
    public static String postfixToinfix(String post){
        int n = post.length();
        Stack<String> sh = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = post.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sh.push(ch + "");
            } else {
                if (sh.size() < 2) {
                    return "Invalid Expression";
                }

                String v2 = sh.pop();
                String v1 = sh.pop();
                String result = "(" + v1 + ch + v2 + ")";
                sh.push(result);
            }
        }

        return (sh.size() == 1) ? sh.peek() : "Invalid Expression";
    }
    public static void main(String[] args) {
        String post = "953+4*6/-";
        System.out.println(postfixToinfix(post));
    }
}
