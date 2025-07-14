import java.util.Collections;
import java.util.PriorityQueue;

public class third_max {
    public static int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : nums){
            if(!pq.contains(num)) pq.add(num);
        }

        int maxele = pq.peek();
        if(pq.size() >= 3) {
            for(int i = 1; i < 3; i++){
                pq.remove();
            }

            return pq.peek();
        }

        return maxele;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        System.out.println(thirdMax(nums));
    }
}
