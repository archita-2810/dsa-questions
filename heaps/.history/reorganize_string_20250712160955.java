
public class reorganize_string {
    public static String reorganizeString(String s) {
        int val = (s.length() + 1) /2;
        int[] hash = new int[26];
        for(int i = 0; i < s.length(); i++){
            hash[s.charAt(i) - 'a']++;
        }

        int maxval = 0, letter = i0;
    }
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(reorganizeString(s));
    }
}
