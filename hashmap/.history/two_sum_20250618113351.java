import java.util.ArrayList;
import java.util.HashMap;

public class two_sum {
    public static int[] twoSum(int nums[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    map.put(nums[i], i);
                    map.put(nums[j], j);
                }
            }
        }

        an

        return ans.toArray();
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
