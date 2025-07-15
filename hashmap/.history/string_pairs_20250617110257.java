import java.util.HashSet;

public class string_pairs {
    public static int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < n-1; i++){
            String s = words[i];
            System.out.println(s);
            String rev = new StringBuilder(s).reverse().toString();
            System.out.println(rev);
            for(int j = i+1; j < n; j++){
                if(rev.equals(words[j])) {
                    set.add(s);
                    set.add(rev);
                    break;
                }
            }
        }
        
        System.out.println(set);
        return set.size();
    }
    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};

        System.out.println(maximumNumberOfStringPairs(words));
    }
}
