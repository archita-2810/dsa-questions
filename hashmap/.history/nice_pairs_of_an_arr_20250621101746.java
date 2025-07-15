public class nice_pairs_of_an_arr {
    public static int countNicePairs(int[] nums) {
        int n = nums.length;
        int[] rev = new int[n];
        
        for(int i = 0; i < n; i++){
            rev[i] = reverse(nums[i]);
        }

        for(int i = 0; i < n; i++){
            int j = i+1;
            while(j < n) {
                
            }
        }
    }
    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int[] arr = {42, 11, 1, 97};

        System.out.println(countNicePairs(arr));
    }
}
