import java.util.HashMap;

public class two_sum {
    public static int[] twoSum(int nums[], int target){
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int k = 0, m = 0;
        int[] ans = new int[2];

        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    // map.put(nums[i], i);
                    // map.put(nums[j], j);
                    ans[0] = i;
                    ans[1] = j;
                }
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
