import java.util.HashMap;

public class three_length_palindrome {
    public static int countPalindromicSubsequence(String s) {
        int n = s.length();
        HashMap<Character, Integer> fmap = new HashMap<>();
        HashMap<Character, Integer> lmap = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(!fmap.containsKey(s.charAt(i))) {
                fmap.put(s.charAt(i), i);
            }
            lmap.put(s.charAt(i), i);
        }

        int count = 0;
        
    }
    public static void main(String[] args) {
        String s = "aabca";

        System.out.println(countPalindromicSubsequence(s));
    }
}
