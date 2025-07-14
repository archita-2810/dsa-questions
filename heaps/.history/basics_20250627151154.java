import java.util.Collections;
import java.util.PriorityQueue;

public class basics {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(2);
        pq.add(3);
        // pq.remove();
        System.out.println(pq);

        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(2);
        pq.add(3);
        // pq.remove();
        System.out.println(pq);
    }
}