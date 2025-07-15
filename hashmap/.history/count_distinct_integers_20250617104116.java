import java.util.HashSet;

public class count_distinct_integers {
    public static int countDistinctIntegers(int[] nums) {
        // int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }

        return set.size();
    }
    public static int reverse(int n){
        int r = 0;
        while(n!=0){
            r = r*10 + n%10;
        }
    }
    public static void main(String[] args) {
        int[] nums= {1, 13, 10, 12, 31};

        System.out.println(countDistinctIntegers(nums));
    }
}
