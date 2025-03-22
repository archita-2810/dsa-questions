import java.util.Stack;

public class sum_of_subarray_ranges {
    public static long subArrayRanges(int[] nums) { //brute force
        long sum = 0;
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int max = nums[i];
            int min = nums[i];
            for(int j = i; j < n; j++){
                min = Math.min(nums[j], min);
                max = Math.max(nums[j], max);
                sum = sum + (max-min);
            }
        }

        return sum;
    }
    public static int[] prevSmallerElements(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];
        Stack<Integer> sh = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!sh.isEmpty() && nums[sh.peek()] >= nums[i]) sh.pop();
            answer[i] = sh.isEmpty() ? -1 : sh.peek();
            sh.push(i);
        }
        return answer;
    }

    public static int[] nextSmallerElements(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];
        Stack<Integer> sh = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!sh.isEmpty() && nums[sh.peek()] > nums[i]) sh.pop();
            answer[i] = sh.isEmpty() ? n : sh.peek();
            sh.push(i);
        }
        return answer;
    }
    public static int sumSubarrayMins(int[] arr) { //a bit optimized
        long sum = 0;
        int mod = (int) (1e9 + 7);
        int n = arr.length;
        int pse[] = prevSmallerElements(arr);
        int nse[] = nextSmallerElements(arr);
        
        for(int i = 0; i < n; i++){
            int psele = i - pse[i];
            int nsele = nse[i] - i;
            sum = (sum + (long)psele * nsele * arr[i]) % mod;
        }

        return (int)sum;
    }
    public static int[] nextGreaterElements(int[] nums){
        int n = nums.length;
        int[] answer = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n-1; i>=0; i--) {
            while (!st.empty() && nums[st.peek()] < nums[i])
                st.pop();
            answer[i] = st.empty() ? n : st.peek();
            st.push(i);
        }
        return answer;
    }
    public static int[] prevGreaterElements(int[] nums){
        int n = nums.length;
        int[] answer = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i=0; i<n; i++) {
            while (!st.empty() && nums[st.peek()] <= nums[i])
                st.pop();
            answer[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }
        return answer;
    }
    public static long sumSubarrayMaxs(int[] nums){
        long total = 0;
        int mod = (int) (1e9 + 7);
        int[] ngee = nextGreaterElements(nums);
        int[] pge = prevGreaterElements(nums);

        for (int i = 0; i < nums.length; i++) {
            int left = i - pge[i];
            int right = ngee[i] - i;
            total = (total + (long) right * left * nums[i]) % mod;
        }
        return total;
    }
    public static long subArrayRangesI(int[] nums) { //a bit optimized one
        long maxSum = sumSubarrayMaxs(nums);
        long minSum = sumSubarrayMins(nums);

        return maxSum-minSum;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        System.out.println(subArrayRanges(nums));
    }
}
