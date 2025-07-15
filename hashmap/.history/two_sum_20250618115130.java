import java.util.HashMap;

public class two_sum {
    public static int[] twoSum(int nums[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i = 0; i < nums.length; i++){
            int remaining = target - nums[i];
            if(!map.containsKey(remaining)) map.put(nums[i], i);
            else {
                ans[0] = i;
                ans[1] = 
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int target = 9;
        int nums[] = {2, 5, 9, 4};

        int res[] = twoSum(nums, target);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
