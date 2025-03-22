import java.util.Stack;

public class sum_of_subarray_minimum {
    public static int sumSubarrayMins(int[] arr) { //brute force
        int sum = 0;
        int min = 0;
        int mod = (int) (1e9 + 7);
        int n = arr.length;
        for(int i = 0; i < n; i++){
            min = arr[i];
            for(int j = i; j < n; j++){
                min = Math.min(min, arr[j]);
                sum = (sum + min) % mod;
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
    public static int sumSubarrayMinsI(int[] arr) { //a bit optimized
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
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4};
        System.out.println(sumSubarrayMinsI(arr));
        // int res[] = prevSmallerElements(arr);
        // for(int i = 0; i < res.length; i++){
        //     System.out.print(res[i] + " ");
        // }
    }
}
