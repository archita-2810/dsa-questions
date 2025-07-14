import java.util.Collections;
import java.util.PriorityQueue;

class Pair1 implements Comparable<Pair1> {
    int num;
    int idx;

    public Pair1(int num, int idx) {
        this.num = num;
        this.idx = idx;
    }

    public int compareTo(Pair1 p){
        return this.num - p.num;
    }
}

public class minimize_deviation {
    public static int minimumDeviation(int[] nums) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int m = Integer.MAX_VALUE; int diff = Integer.MAX_VALUE;
        for(int )

        return Math.min(diff, pq.peek()-m);
    }
    public static void main(String[] args) {
        int[] arr = {2, 10, 8};

        System.out.println(minimumDeviation(arr));
    }
}