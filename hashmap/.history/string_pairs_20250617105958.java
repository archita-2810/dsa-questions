public class string_pairs {
    public static int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;

        for(int i = 0; i < n; i++){
            String s = words[i];
            String rev = new StringBuilder(s).reverse().toString();
            for(int j = i+1; j < n; j++){
                
            }
        }
    }
    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};

        System.out.println(maximumNumberOfStringPairs(words));
    }
}
