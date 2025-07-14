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

        nums[pq.poll().idx] = (pq.poll().num % 2 != 0) ? pq.poll().num * 2 : pq.poll().num;

        while(pq.size() > 1){
            pq.poll();
            // System.out.println(pq);
        }

        Pair1 p = pq.poll();
        nums[pq.poll().idx] = (pq.poll().num % 2 == 0) ? pq.poll().num / 2 : pq.poll().num;

        int diff = 0;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                diff = Math.max(diff, nums[i] - nums[j]);
            }
        }

        return diff;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(minimumDeviation(arr));
    }
}