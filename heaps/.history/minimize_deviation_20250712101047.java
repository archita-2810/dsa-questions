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
        PriorityQueue<Pair1> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            pq.add(new Pair1(nums[i], i));
        }

        nums[pq.poll().idx] = (nums[pq.poll().num] % 2 != 0) ? nums[pq.poll().num] * 2 : nums[pq.poll().num];

        while(pq.size() > 1){
            pq.poll();
        }

        nums[pq.poll().idx] = (nums[pq.poll().num] % 2 == 0) ? nums[pq.poll().num] / 2 : nums[pq.poll().num];

        int diff = 0;

        return diff;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(minimumDeviation(arr));
    }
}