import java.util.Stack;

public class previous_greater_element {
    public static int[] prevGreaterElements(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];

        Stack<Integer> sh = new Stack<>();
        for(int i = 0; i < n; i++){
            answer[i] = -1;
        }

        for(int i = 0; i < n; i++){
            while(!sh.isEmpty() && sh.peek() >= nums[i]) sh.pop();
            if(!sh.isEmpty()) {
                answer[i] = sh.peek();
            }
            sh.push(nums[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        int nums[] = {39, 27, 11, 4, 24, 32, 32, 1};
        int result[] = prevGreaterElements(nums);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
