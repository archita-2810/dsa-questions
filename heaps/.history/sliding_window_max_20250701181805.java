import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

class Pair {
    int integer;
    int idx;

    public Pair(int integer, int idx) {
        this.integer = integer;
        this.idx = idx;
    }
}

public class sliding_window_max {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Pair> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Pair> minheap = new PriorityQueue<>();

        
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        int[] ans = maxSlidingWindow(nums, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}