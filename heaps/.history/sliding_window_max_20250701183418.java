import java.util.ArrayList;
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
            while (i < k && k < nums.length) {
                Pair p = new Pair(nums[i], i);
                if (!maxheap.contains(p)) maxheap.add(new Pair(nums[i], i));
                if (!minheap.contains(p)) minheap.add(new Pair(nums[i], i));
                i++;
            }
            res.add(maxheap.peek().integer);
            Pair newp = minheap.poll();
            int idxtoberemoved = newp.idx; // remove this index pair from maxheap
            maxheap.removeIf(pair -> pair.idx == idxtoberemoved);
            // i++;
            k++;
        // }

        int[] res2 = new int[res.size()];
        for(int num = 0; num < res.size(); num++){
            res2[num] = res.get(num);
        }

        return res2;
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