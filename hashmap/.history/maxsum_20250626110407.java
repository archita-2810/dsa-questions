import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class maxsum {
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }

        // ArrayList<Integer> cloned = new ArrayList<>(arr);

        int count = 0;

        for(int i = 0; i < arr.size(); i++){
            int lefto = k - arr.get(i);
            if(map.containsKey(lefto)){
                
            } else {
                map.put(arr.get(i), i);
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        int k = 5;

        System.out.println(maxOperations(nums, k));
    }
}
