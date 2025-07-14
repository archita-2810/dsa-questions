import java.util.PriorityQueue;

public class minimize_deviation {
    public static int minimumDeviation(int[] nums) {
        int n = nums.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            pq.add(new Pair(nums[i], i));
        }

        nums[pq.poll().]
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(minimumDeviation(arr));
    }
}