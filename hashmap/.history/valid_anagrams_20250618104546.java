import java.util.HashMap;

public class valid_anagrams {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (map1.containsKey(c)) {
                int count = map1.get(c);
                map1.put(c, count + 1);
            } else {
                map1.put(c, 1);
            }
        }
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
