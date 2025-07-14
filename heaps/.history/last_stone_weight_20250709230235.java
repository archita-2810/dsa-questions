import java.util.Collections;
import java.util.PriorityQueue;

public class last_stone_weight {
    public static int lastStoneWeight(int[] arr) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++){
            pq.add(arr[i]);
        }

        while(pq.size() == 1 || pq.size() == 0){
            int x = pq.poll();
            int y = pq.poll();
            if(x != y) pq.add()
        }

        return n;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,4,1,8,1};

        System.out.println(lastStoneWeight(arr));
    }
}