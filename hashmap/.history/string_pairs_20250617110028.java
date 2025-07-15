import java.util.HashSet;

public class string_pairs {
    public static int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;
        HashSet<Inte

        for(int i = 0; i < n; i++){
            String s = words[i];
            String rev = new StringBuilder(s).reverse().toString();
            for(int j = i+1; j < n; j++){
                if(rev == words[j]) 
            }
        }

        return set.size();
    }
    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};

        System.out.println(maximumNumberOfStringPairs(words));
    }
}
