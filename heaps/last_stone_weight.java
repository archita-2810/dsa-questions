import java.util.Collections;
import java.util.PriorityQueue;

public class last_stone_weight {
    public static int lastStoneWeight(int[] arr) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }

        System.out.println(pq);
        int x = 0;
        int y = 0;
        while (pq.size() > 1) {
            x = pq.poll();
            y = pq.poll();
            if (x != y)
                pq.add(Math.abs(y - x));
        }

        return (pq.size() == 1) ? pq.poll() : 0;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 4, 1, 8, 1 };

        System.out.println(lastStoneWeight(arr));
    }
}