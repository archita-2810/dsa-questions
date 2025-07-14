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
        p.add(10);
        p.add(2);
        p.add(3);
        // pq.remove();
        System.out.println(pq);
    }
}