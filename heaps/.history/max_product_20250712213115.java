import java.util.Collections;
import java.util.PriorityQueue;

public class max_product {
    public static int maxProduct(int[] nums) {
        int val = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            pq.add(num);
        }

        int k = 2;
        while(k > 0){
            int newval = pq.poll()-1;
            val = val * newval;
            k--;
        }

        return val;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,2};
        System.out.println(maxProduct(arr));
    }
}
