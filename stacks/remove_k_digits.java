import java.util.Stack;

public class remove_k_digits {
    public static String removeKdigits(String num, int k) {
        int n = num.length();
        if(k == n) return "0";
        Stack<Character> sh = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            char ch = num.charAt(i);
            int number = ch - '0';
            // if(sh.isEmpty()) sh.push(ch);
            while(!sh.isEmpty() && sh.peek()-'0' > number && k > 0){
                sh.pop();
                k--;
            }
            sh.push(ch);
        }

        while(k > 0){
            sh.pop();
            k--;
        }

        while(!sh.isEmpty()){
            sb.append(sh.pop());
        }

        String news = sb.reverse().toString();
        news = news.replaceFirst("^0+(?!$)", "");
        return news;
    }
    public static void main(String[] args) {
        String num = "112";
        System.out.println(removeKdigits(num, 1));
    }
}
