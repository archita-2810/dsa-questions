import java.util.HashMap;
import java.util.PriorityQueue;

public class sort_arrays {
    public static int[] frequencySort(int[] nums) {
        int[] arr = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<

        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};

        int[] result = frequencySort(nums);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
