import java.util.HashMap;

public class valid_anagrams {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(Character c : s.toCharArray()){
            if (counts.containsKey(item)) {
           int currentCount = counts.get(item);
           counts.put(item, currentCount + 1);
       } else {
           counts.put(item, 1);
       }
        }
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
