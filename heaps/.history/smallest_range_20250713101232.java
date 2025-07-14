import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class smallest_range {
    public static int[] smallestRange(List<List<Integer>> nums) {
        
    }
    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(new ArrayList<>(Arrays.asList(4, 10, 15, 24, 26)));
        nums.add(new ArrayList<>(Arrays.asList(0, 7, 12, 21)));
        nums.add(new ArrayList<>(Arrays.asList(5, 18, 22, 30)));

        int[] arr = smallestRange(nums);
        for(int i = 0; i < arr.length; i++)
    }
}
