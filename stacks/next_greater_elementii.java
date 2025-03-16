import java.util.Stack;

public class next_greater_elementii {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];
        for(int i = 0; i < n; i++){
            answer[i] = -1;
        }

        //brute force
        // for(int i = n-1; i >= 0; i--){
        //     for(int j = i+1; j < n; j++){
        //         if(nums[i] < nums[j]){
        //             answer[i] = nums[j];
        //         }
        //     }
        // }

        //using stacks
        Stack<Integer> sh = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!sh.isEmpty() && sh.peek() <= nums[i]) sh.pop();
            if (!sh.isEmpty()) {
                answer[i] = sh.peek();
            }

            sh.push(nums[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        int nums[] = {6, 8, 0, 1, 3};
        int result[] = nextGreaterElements(nums);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
