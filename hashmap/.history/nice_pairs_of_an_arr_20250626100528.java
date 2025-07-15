

public class nice_pairs_of_an_arr {
    public static int countNicePairs(int[] nums) {
        int count = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int ele = nums[i] - reverse(nums[i]);

            if(map.containsKey(ele)){
                int freq = map.get(ele);
                count += freq;
                count %= 1000000007;
                map.put(ele, freq+1);
            } else map.put(ele, 1);
        }
        return count;
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
        int[] arr = {13, 10, 35, 24, 76};

        System.out.println(countNicePairs(arr));
    }
}
