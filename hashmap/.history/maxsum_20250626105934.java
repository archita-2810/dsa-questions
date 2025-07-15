import java.util.ArrayList;
import java.util.HashSet;

public class maxsum {
    public static int maxOperations(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }

        // ArrayList<Integer> cloned = new ArrayList<>(arr);

        int count = 0;

        int i = 0;
        while (i < arr.size()) {
            int current = arr.get(i);
            int complement = k - current;

            if (set.contains(complement)) {
                arr.remove(Integer.valueOf(current));
                arr.remove(Integer.valueOf(complement));
                set.remove(complement);
                count++;
                i = 0;
            } else {
                set.add(current);
                i++;
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
