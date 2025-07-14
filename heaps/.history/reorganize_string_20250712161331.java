
public class reorganize_string {
    public static String reorganizeString(String s) {
        int val = (s.length() + 1) /2;
        int[] hash = new int[26];
        for(int i = 0; i < s.length(); i++){
            hash[s.charAt(i) - 'a']++;
        }

        int maxval = 0, letter = 0;
        for(int i = 0; i < hash.length; i++){
            if(hash[i] > maxval){
                maxval = hash[i];
                letter = i;
            }
        }

        if(maxval > val) return "";
        char res[] = new char[s.length()];

        int idx = 0;
        while(hash[letter]-- > 0){
            res[idx] = (char) (letter - 'a');
            idx += 2;
        }

        for(int i = 0; i < hash.length; i++){
            while(hash[i]-- > 0) {
                if(idx >= res.length) idx = 1;
                res[idx] = 
            }
        }

        return String.valueOf(res);
    }
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(reorganizeString(s));
    }
}
