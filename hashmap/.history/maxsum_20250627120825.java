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

        int count = 0;

        for(int i = 0; i < arr.size(); i++){
            int lefto = k - arr.get(i);
            if(map.containsKey(lefto)){
                map.remove(lefto);
                // int idx = map.get(lefto);
                // arr.remove(idx);
                // arr.remove(i);
                count++;
            } else {
                map.put(arr.get(i), i);
            }
        }

        System.out.println("this is map - ");

        return count;
    }
    public static void main(String[] args) {
        int nums[] = {2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2};
        int k = 3;

        System.out.println(maxOperations(nums, k));
    }
}
