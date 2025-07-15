public class nice_pairs_of_an_arr {
    public static int countNicePairs(int[] nums) {
        int n = nums.length;
        int[] rev = new int[n];
        
        for(int i = 0; i < n; i++){
            rev[i] = reverse(nums[i]);
        }
    }
    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;        // Get last digit
            rev = rev * 10 + digit;      // Add digit to reversed number
            num = num / 10;              // Remove last digit
        }
        return rev;
    }
    public static void main(String[] args) {
        int[] arr = {42, 11, 1, 97};

        System.out.println(countNicePairs(arr));
    }
}
