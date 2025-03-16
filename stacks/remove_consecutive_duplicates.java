import java.util.Stack;
import java.util.stream.Collectors;

public class remove_consecutive_duplicates {
    public static String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> sh = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(!sh.isEmpty() && sh.peek() == ch) sh.pop();
            else sh.push(ch);
        }

        String result = sh.stream().map(String::valueOf).collect(Collectors.joining());
        return result;
    }
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
}
