import java.util.HashMap;

public class longest_substring {
    public static int lengthOfLongestSubstring(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int maxlen = 0;
        
        int i = 0; int j = i+1;
        while(i > j){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), )
            }
        }
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
