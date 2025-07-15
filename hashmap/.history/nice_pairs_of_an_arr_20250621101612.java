public class nice_pairs_of_an_arr {
    public static int countNicePairs(int[] nums) {
        int n = nums.length;
        int[] rev = new int[n];
        
        for(int i = 0; i < n; i++){
            rev[i] = reverse(nums[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {42, 11, 1, 97};

        System.out.println(countNicePairs(arr));
    }
}
