import java.util.HashMap;

public class valid_anagrams {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (String c : s) {
            if (map1.containsKey(c)) {
                int count = map1.get(c);
                map1.put(c, count + 1);
            } else {
                map1.put(c, 1);
            }
        }

        for (int c = 0; c < t.length(); c++) {
            if (map1.containsKey(t.charAt(c))) {
                int count = map2.get(t.charAt(c));
                map2.put(t.charAt(c), count + 1);
            } else {
                map2.put(s.charAt(c), 1);
            }
        }

        return map1.equals(map2);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
