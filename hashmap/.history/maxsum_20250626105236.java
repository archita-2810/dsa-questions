import java.util.ArrayList;
import java.util.HashSet;

public class maxsum {
    public static int maxOperations(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }

        int count = 0;

        for(int i = 0; i < arr.size(); i++){
            int lefto = k - arr.get(i);
            if(set.contains(lefto)) {
                arr.remove(lefto);
                arr.remove(arr.get(i));
                count++;
            } else set.add(arr.get(i));
            System.out.println(arr);
        }

        return count;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        int k = 5;

        System.out.println(maxOperations(nums, k));
    }
}
