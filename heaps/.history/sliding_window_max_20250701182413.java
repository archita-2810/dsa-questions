import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        PriorityQueue<Pair> maxheap = new PriorityQueue<>((a, b) -> Integer.compare(b.integer, a.integer));
        PriorityQueue<Pair> minheap = new PriorityQueue<>(Comparator.comparingInt(a -> a.idx));

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            while (i < k) {
                if (maxheap.contains(nums[i]))
                    maxheap.add(new Pair(nums[i], i));
                minheap.add(new Pair(nums[i], i));
                res.add(maxheap.peek().integer);
            }
            i++;
            k++;
        }
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