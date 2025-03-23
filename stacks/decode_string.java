import java.util.Stack;

public class decode_string {
    public static String decodeString(String s) {
        Stack<Character> sh = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch != ']') sh.push(ch);
            else {
                StringBuilder sb = new StringBuilder();
                while(sh.peek() != '['){
                    char chnew = sh.pop();
                    sb.append(chnew);
                }
                sh.pop();
                // sb.reverse();
    
                int k = 0;
                int base = 1;
                while(!sh.isEmpty() && Character.isDigit(sh.peek())){
                    k = (sh.pop() - '0') * base + k;
                    base = base * 10;
                }

                while(k--> 0){
                    for(int j = sb.length()-1; j >= 0; j--){
                        sh.push(sb.charAt(j));
                    }
                }

                // res += sb.toString();
            }
        }

        char res[] = new char[sh.size()];
        for(int m = sh.size()-1; m >= 0; m--){
            res[m] = sh.pop();
        }

        return new String(res);
    }
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }
}
