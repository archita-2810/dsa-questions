import java.util.Collections;
import java.util.PriorityQueue;

public class third_max {
    public static int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < nums.length; i++){
            if(pqpq.add(nums[i]);
        }

        if(nums.length >= 3) {
            while(pq.size() > 1) pq.remove();
        }

        return pq.peek();
    }
    public static void main(String[] args) {
        
    }
}
