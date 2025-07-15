import java.util.HashMap;

public class longest_substring {
    public static int lengthOfLongestSubstring(String s){
        if(s.length() == 1 || s.length() == 0) return s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int maxlen = 0;
        
        int i = 0; int j = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch) >= i){
                int len = j-i;
                maxlen = Math.max(len, maxlen);
                i++;
                map.remove(ch);
                map.put(ch, j);
            } else {
                
            }
            j++;
        }

        return maxlen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
